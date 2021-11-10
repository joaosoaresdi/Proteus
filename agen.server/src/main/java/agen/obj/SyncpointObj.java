package agen.obj;

import java.util.ArrayList;
import java.util.HashMap;

import agen.server.serverMain;
import zermia.proto.ProtoRuntime.Syncpoint;

public class SyncpointObj {
	String syncpointName;
	String faultCondName;
	String type;
	HashMap<String, Integer> triggers;
	Integer triggerMinValue;
	HashMap<String, Integer> dependants;

	
	public SyncpointObj(String nodeName, Syncpoint syncpoint) {
		this.syncpointName = syncpoint.getName();
		this.faultCondName = syncpoint.getFaultCondName();
		this.type = syncpoint.getSyncType().toString();
		this.triggerMinValue = 0;
		this.triggers = new HashMap<String, Integer>();
		this.dependants = new HashMap<String, Integer>();
		this.registerSyncpoint(nodeName, syncpoint);
		serverMain.faultCondToSyncpoint.put(syncpoint.getFaultCondName(), new ArrayList<String>());
		serverMain.faultCondToSyncpoint.get(syncpoint.getFaultCondName()).add(syncpoint.getName());
	}
	
	public void registerSyncpoint(String nodeName, zermia.proto.ProtoRuntime.Syncpoint syncpoint) {
		if(syncpoint.getNodeType().equals(zermia.proto.ProtoRuntime.Syncpoint.nodetype.trigger)) {
			triggers.put(nodeName, 0);
			serverMain.faultCondToSyncpoint.get(syncpoint.getFaultCondName()).add(syncpoint.getName());
		} else {
			dependants.put(nodeName, 0);
		}
	}
	
	public void registerTrigger(String nodeName) {
		int curTriggerValue = triggers.get(nodeName);
		triggers.put(nodeName, curTriggerValue+1);
		int min = curTriggerValue;
		for(int n : triggers.values()) {
			min = Math.min(n, min);
		}
		triggerMinValue = min;
	}
	
	public Boolean getSyncpointStatus(String nodeName) {
		if(type.equals("onetime")) {
			if(triggerMinValue>0) {
				return true;
			}
		}
		//since there are only two types from here is the else
		int dependantsValue = dependants.get(nodeName);
		if(dependantsValue<=triggerMinValue) {
			dependants.replace(nodeName, dependantsValue+1);
			return true;
		} else {
			return false;
		}
	}
}