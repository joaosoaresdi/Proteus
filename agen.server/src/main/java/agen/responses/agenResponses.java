package agen.responses;

import java.util.ArrayList;

import agen.obj.Node;
import agen.obj.SyncpointObj;
import agen.server.serverMain;
import io.grpc.stub.StreamObserver;
import zermia.proto.ProtoRuntime.ConnectionReply;
import zermia.proto.ProtoRuntime.ConnectionRequest;
import zermia.proto.ProtoRuntime.Log;
import zermia.proto.ProtoRuntime.StatusQuestion;
import zermia.proto.ProtoRuntime.Syncpoint;
import zermia.proto.ZermiaServicesGrpc.ZermiaServicesImplBase;

public class agenResponses extends ZermiaServicesImplBase{
	
	@Override
	public void firstConnection(ConnectionRequest request, StreamObserver<ConnectionReply> responseObserver) {
		String[] nodeLocation = request.getNodeLocation().split(":");
		Node newNode = new Node(request.getReplicaID(), nodeLocation[0], Integer.parseInt(nodeLocation[1]), request.getFaulty());
		for(Syncpoint syncs : request.getSyncpointList()) {
			SyncpointObj syncObj = serverMain.syncpointList.get(syncs.getName());
			if(syncObj==null){
				serverMain.syncpointList.put(newNode.getNodeName(), new SyncpointObj(newNode.getNodeName(), syncs));
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
		Node logNode = serverMain.nodeList.get(logInfo.getNodeName());
		if(logNode == null) {
			System.out.println("Received log from unknown node");
		} else {
			logNode.addFaultLog(logInfo);
		}
	}
	
	@Override
	public void syncPoint(StatusQuestion statusQuestion, StreamObserver<ConnectionReply> responseObserver) {
		Boolean answer = serverMain.syncpointList.get(statusQuestion.getSyncpointName()).getSyncpointStatus(statusQuestion.getNodeName());
		ConnectionReply connReply = ConnectionReply.newBuilder().setMessageAcknowlegement(answer).build();
		responseObserver.onNext(connReply);
		responseObserver.onCompleted();
	}
}