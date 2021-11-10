package agen.obj;

import java.util.HashMap;

import agen.server.serverMain;
import zermia.proto.ProtoRuntime.ExecInfo;
import zermia.proto.ProtoRuntime.Log;

public class Fault {
	String faultName;
	HashMap<String, ExecInfo> execList;
	Long startTimestamp;
	String randomLogInfo;
	
	public Fault(String faultName, Long startTimeStamp, String randomLogInfo) {
		this.faultName = faultName;
		this.startTimestamp = startTimeStamp;
		this.execList = new HashMap<String, ExecInfo>();
		this.randomLogInfo = randomLogInfo;
	}

	public Fault(Log logInfo) {
		this.faultName = logInfo.getFaultName();
		this.startTimestamp = logInfo.getTimestamp();
		this.randomLogInfo = logInfo.getRandomLogInfo();
		if(execList != null) {
			for(String syncpoint : serverMain.faultCondToSyncpoint.get(logInfo.getFaultName())) {
				serverMain.syncpointList.get(syncpoint).registerTrigger(logInfo.getNodeName());
			}
		}
		for( ExecInfo execInfo : logInfo.getExecInfoList()) {
			execList.put(execInfo.getExecName(), execInfo);
		}
	}
}