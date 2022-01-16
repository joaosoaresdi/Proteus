package agen.responses;

import java.util.logging.Level;
import java.util.logging.Logger;

import agen.obj.Node;
import agen.obj.SyncpointObj;
import agen.server.serverMain;
import io.grpc.stub.StreamObserver;
import agen.proto.ProtoRuntime.ConnectionReply;
import agen.proto.ProtoRuntime.ConnectionRequest;
import agen.proto.ProtoRuntime.Log;
import agen.proto.ProtoRuntime.StatusQuestion;
import agen.proto.ProtoRuntime.Syncpoint;

import agen.proto.ProteusServicesGrpc.ProteusServicesImplBase;

public class agenResponses extends ProteusServicesImplBase{
	
	@Override
	public void firstConnection(ConnectionRequest request, StreamObserver<ConnectionReply> responseObserver) {
		Logger.getLogger(agenResponses.class.getName()).log(Level.INFO, "Received firstConnection request from " + request.getNodeLocation());
		String[] nodeLocation = request.getNodeLocation().split(":");
		Node newNode = new Node(request.getReplicaID(), nodeLocation[0], Integer.parseInt(nodeLocation[1]), request.getFaulty());
		for(Syncpoint syncs : request.getSyncpointList()) {
			SyncpointObj syncObj = serverMain.syncpointList.get(syncs.getName());
			if(syncObj==null){
				Logger.getLogger(agenResponses.class.getName()).log(Level.INFO, "Registering new syncpoint " + syncs.getName());
				serverMain.syncpointList.put(syncs.getName(), new SyncpointObj(newNode.getNodeName(), syncs));
			} else {
				syncObj.registerSyncpoint(newNode.getNodeName(), syncs);
			}
		}
		serverMain.nodeList.put(newNode.getNodeName(), newNode);
		ConnectionReply connReply = ConnectionReply.newBuilder().setMessageAcknowlegement(true).build();
		responseObserver.onNext(connReply);
		responseObserver.onCompleted();
	}
	
	@Override
	public void logging(Log logInfo, StreamObserver<ConnectionReply> responseObserver) {
		Logger.getLogger(agenResponses.class.getName()).log(Level.INFO, "Received logging information from " + logInfo.getNodeName());
		Node logNode = serverMain.nodeList.get(logInfo.getNodeName());
		if(logNode == null) {
			System.out.println("Received log from unknown node");
			Logger.getLogger(agenResponses.class.getName()).log(Level.WARNING, "Received log from unknown node");
		} else {
			logNode.addFaultLog(logInfo);
		}
		ConnectionReply connReply = ConnectionReply.newBuilder().setMessageAcknowlegement(true).build();
		responseObserver.onNext(connReply);
		responseObserver.onCompleted();
	}
	
	@Override
	public void syncPoint(StatusQuestion statusQuestion, StreamObserver<ConnectionReply> responseObserver) {
		Logger.getLogger(agenResponses.class.getName()).log(Level.INFO, "Received synpoint " + statusQuestion.getSyncpointName() + " status request from " + statusQuestion.getNodeName());
		SyncpointObj sync = serverMain.syncpointList.get(statusQuestion.getSyncpointName());
		Boolean answer = sync.getSyncpointStatus(statusQuestion.getNodeName());
		Logger.getLogger(agenResponses.class.getName()).log(Level.INFO, "Syncpoint " + statusQuestion.getSyncpointName() + " status is: " + answer);
		ConnectionReply connReply = ConnectionReply.newBuilder().setMessageAcknowlegement(answer).build();
		responseObserver.onNext(connReply);
		responseObserver.onCompleted();
	}
}