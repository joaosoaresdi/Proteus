package agen.server;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import agen.obj.Node;
import agen.obj.SyncpointObj;
import agen.responses.agenResponses;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class serverMain {
	
	static Integer closeServer;
	
	public static HashMap<String, Node> nodeList = new HashMap<String, Node>();
	//HashMap to facilitate access to syncpoints
	public static HashMap<String, SyncpointObj> syncpointList = new HashMap<String, SyncpointObj>();
	//HashMap with a correspondence between FaultConditions and their corresponding syncpoints
	public static HashMap<String, List<String>> faultCondToSyncpoint = new HashMap<String, List<String>>();
	
	public void startServer() {
		Server proteusServer = ServerBuilder.forPort(8081)
				.addService(new agenResponses())
				.build();
		try {
			proteusServer.start();
			Logger.getLogger(serverMain.class.getName()).log(Level.INFO, "Server initialized");

			proteusServer.awaitTermination(100000 ,TimeUnit.SECONDS);
        } catch (IOException e) {
        	e.printStackTrace();
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
	}
	
	public static void main(String[] args) throws Exception {
		final serverMain server = new serverMain();
		new Thread() {
			public void run(){
				server.startServer();				//zermia server start
			}
		}.start();
	}
}