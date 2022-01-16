package client.runtime;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proteus.proto.ProtoRuntime.ConnectionReply;
import proteus.proto.ProtoRuntime.ConnectionRequest;
import proteus.proto.ProtoRuntime.ConnectionRequest.Builder;
import proteus.proto.ProtoRuntime.ExecInfo;
import proteus.proto.ProtoRuntime.Log;
import proteus.proto.ProtoRuntime.StatusQuestion;
import proteus.proto.ProtoRuntime.Syncpoint;
import proteus.proto.ProtoRuntime.Syncpoint.nodetype;
import proteus.proto.ProtoRuntime.Syncpoint.synctype;
import proteus.proto.ProteusServicesGrpc;

public class ProteusRuntime {
	static ManagedChannel mgChannel;
	static ProteusServicesGrpc.ProteusServicesBlockingStub runtimeBlockStub;
	static ArrayList<ExecInfo> execInfos = new ArrayList<ExecInfo>();
	
	public static void ChannelCreation(String coordinatorIP, int coordinatorPort) {
		mgChannel = ManagedChannelBuilder.forAddress(coordinatorIP, coordinatorPort)
				 .usePlaintext()
				 .build(); 		
	}
	
	public static void ChannelClose(ManagedChannel channelShutDown) {
		mgChannel.shutdown();
	}
	
	public static void makeInitialConnection(String nodeName, String nodeLocation, String coordinatorLocation, Boolean faulty, String[] syncpointsDependant, String[] syncpointsTrigger) {
		Logger.getLogger(ProteusRuntime.class.getName()).log(Level.INFO, "Node " + nodeName + " is making an initial connection");
		String[] coordinatorLocations = coordinatorLocation.split(":");
		ChannelCreation(coordinatorLocations[0], Integer.parseInt(coordinatorLocations[1]));
		runtimeBlockStub = ProteusServicesGrpc.newBlockingStub(mgChannel);
		
		Builder reqBuilder = ConnectionRequest.newBuilder()
				.setReplicaID(nodeName)
				.setNodeLocation(nodeLocation)
				.setFaulty(faulty);
		System.out.println(coordinatorLocations[0] + " " + Integer.parseInt(coordinatorLocations[1]));

		int syncsI = 0;
		for(int i=0; i<syncpointsDependant.length;i+=3) {
			System.out.println(syncpointsDependant[0] + ' ' + syncpointsDependant[1] + ' ' + syncpointsDependant[2]);
			proteus.proto.ProtoRuntime.Syncpoint.Builder syncsBuilder = Syncpoint.newBuilder()
				.setName(syncpointsDependant[i])
				.setFaultCondName(syncpointsDependant[i+1]);
		
			if (syncpointsDependant[i+2].equals("onetime")) {
				syncsBuilder.setSyncType(synctype.onetime);
			} else {
				syncsBuilder.setSyncType(synctype.recurrent);
			}
			syncsBuilder.setNodeType(nodetype.dependant);
			Syncpoint syncs = syncsBuilder.build();
			reqBuilder.addSyncpoint(syncsI, syncs);
			syncsI++;
		}
		
		for(int i=0; i<syncpointsTrigger.length;i+=3) {
			proteus.proto.ProtoRuntime.Syncpoint.Builder syncsBuilder = Syncpoint.newBuilder()
				.setName(syncpointsTrigger[i])
				.setFaultCondName(syncpointsDependant[i+1]);
		
			if (syncpointsTrigger[i+2].equals("onetime")) {
				syncsBuilder.setSyncType(synctype.onetime);
			} else {
				syncsBuilder.setSyncType(synctype.recurrent);
			}
			syncsBuilder.setNodeType(nodetype.trigger);
			Syncpoint syncs = syncsBuilder.build();
			reqBuilder.addSyncpoint(syncsI, syncs);
			syncsI++;
		}
		
		ConnectionRequest req = reqBuilder.build();
		try {
		ConnectionReply rep = runtimeBlockStub.firstConnection(req);
		} catch (RuntimeException e) {
			Logger.getLogger(ProteusRuntime.class.getName()).log(Level.SEVERE, "Cant connect to server");

		}
	}
	
	public static void addLogExecInfo(String execName, String whenType, String whenValue){
		Logger.getLogger(ProteusRuntime.class.getName()).log(Level.INFO, "Logging " + execName + " execution data");
		ExecInfo execInfo = ExecInfo.newBuilder()
				.setExecName(execName)
				.setWhenValue(whenType)
				.setWhenValue(whenValue)
				.build();
		execInfos.add(execInfo);
	}
	
	public static void sendLogs(String nodeName, String faultName, long timestamp, String randomLogData) {
		Logger.getLogger(ProteusRuntime.class.getName()).log(Level.INFO, "Sending " + nodeName + " logging data");
		runtimeBlockStub = ProteusServicesGrpc.newBlockingStub(mgChannel);
		Log logData = Log.newBuilder()
				.setNodeName(nodeName)
				.setFaultName(faultName)
				.setTimestamp(timestamp)
				.addAllExecInfo(execInfos)
				.setRandomLogInfo(randomLogData)
				.build();
		ConnectionReply rep = runtimeBlockStub.logging(logData);
		execInfos.clear();
	}
	
	public static Boolean askSyncpointStatus(String nodeName, String syncpointName) {
		Logger.getLogger(ProteusRuntime.class.getName()).log(Level.INFO, nodeName + " is requesting " + syncpointName + "sync status");
		StatusQuestion sQuest = StatusQuestion.newBuilder()
				.setNodeName(nodeName)
				.setSyncpointName(syncpointName)
				.build();
		ConnectionReply rep = runtimeBlockStub.syncPoint(sQuest);
		return rep.getMessageAcknowlegement();
	}
}