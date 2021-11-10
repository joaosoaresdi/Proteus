package agen.server;

import java.util.HashMap;
import java.util.List;

import agen.obj.Node;
import agen.obj.SyncpointObj;

public class serverMain {
	
	public static HashMap<String, Node> nodeList = new HashMap<String, Node>();
	//HashMap to facilitate access to syncpoints
	public static HashMap<String, SyncpointObj> syncpointList = new HashMap<String, SyncpointObj>();
	//HashMap with a correspondence between FaultConditions and their corresponding syncpoints
	public static HashMap<String, List<String>> faultCondToSyncpoint = new HashMap<String, List<String>>();
	
	public void startServer() {
		
	}
	
	public static void main(String[] args) throws Exception {
		serverMain server = new serverMain();
		new Thread() {
			public void run(){
				server.startServer();				//zermia server start
			}
		}.start();
	}
}