package client.runtime;
import java.util.ArrayList;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import zermia.proto.ProtoRuntime.ConnectionReply;
import zermia.proto.ProtoRuntime.ConnectionRequest;
import zermia.proto.ProtoRuntime.ConnectionRequest.Builder;
import zermia.proto.ProtoRuntime.ExecInfo;
import zermia.proto.ProtoRuntime.Log;
import zermia.proto.ProtoRuntime.StatusQuestion;
import zermia.proto.ProtoRuntime.Syncpoint;
import zermia.proto.ProtoRuntime.Syncpoint.nodetype;
import zermia.proto.ProtoRuntime.Syncpoint.synctype;
import zermia.proto.ZermiaServicesGrpc;

public class ProteusRuntime {
	static ManagedChannel mgChannel;
	static ZermiaServicesGrpc.ZermiaServicesBlockingStub runtimeBlockStub;
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
		String[] coordinatorLocations = coordinatorLocation.split(":");
		ChannelCreation(coordinatorLocations[0], Integer.parseInt(coordinatorLocations[1]));
		runtimeBlockStub = ZermiaServicesGrpc.newBlockingStub(mgChannel);
		
		Builder reqBuilder = ConnectionRequest.newBuilder()
				.setReplicaID(nodeName)
				.setNodeLocation(nodeLocation)
				.setFaulty(faulty);
		
		int syncsI = 0;
		for(int i=0; i<=syncpointsDependant.length;i+=2) {
			zermia.proto.ProtoRuntime.Syncpoint.Builder syncsBuilder = Syncpoint.newBuilder()
				.setName(syncpointsDependant[i])
				.setFaultCondName(syncpointsDependant[i+1]);
		
			if (syncpointsDependant[i+2].equals("onetime")) {
				syncsBuilder.setSyncType(synctype.onetime);
			} else {
				syncsBuilder.setSyncType(synctype.recurrent);
			}
			syncsBuilder.setNodeType(nodetype.dependant);
			Syncpoint syncs = syncsBuilder.build();
			reqBuilder.setSyncpoint(syncsI, syncs);
			syncsI++;
		}
		
		for(int i=0; i<=syncpointsTrigger.length;i+=3) {
			zermia.proto.ProtoRuntime.Syncpoint.Builder syncsBuilder = Syncpoint.newBuilder()
				.setName(syncpointsTrigger[i])
				.setFaultCondName(syncpointsDependant[i+1]);
		
			if (syncpointsTrigger[i+2].equals("onetime")) {
				syncsBuilder.setSyncType(synctype.onetime);
			} else {
				syncsBuilder.setSyncType(synctype.recurrent);
			}
			syncsBuilder.setNodeType(nodetype.trigger);
			Syncpoint syncs = syncsBuilder.build();
			reqBuilder.setSyncpoint(syncsI, syncs);
			syncsI++;
		}
		
		ConnectionRequest req = reqBuilder.build();
		
		ConnectionReply rep = runtimeBlockStub.firstConnection(req);
	}
	
	public static void addLogExecInfo(String execName, String whenType, String whenValue){
		ExecInfo execInfo = ExecInfo.newBuilder()
				.setExecName(execName)
				.setWhenValue(whenType)
				.setWhenValue(whenValue)
				.build();
		execInfos.add(execInfo);
	}
	
	public static void sendLogs(String nodeName, String faultName, long timestamp, String randomLogData) {
		runtimeBlockStub = ZermiaServicesGrpc.newBlockingStub(mgChannel);
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
		StatusQuestion sQuest = StatusQuestion.newBuilder()
				.setNodeName(nodeName)
				.setSyncpointName(syncpointName)
				.build();
		ConnectionReply rep = runtimeBlockStub.syncPoint(sQuest);
		return rep.getMessageAcknowlegement();
	}
}