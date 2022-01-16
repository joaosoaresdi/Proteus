package agen.obj;

import java.util.HashMap;
import java.util.List;

import agen.server.serverMain;
import agen.proto.ProtoRuntime.ExecInfo;
import agen.proto.ProtoRuntime.Log;

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
		if(logInfo.getExecInfoCount() > 0) {
			if (!serverMain.faultCondToSyncpoint.isEmpty()) {
				List<String> faultIterator = serverMain.faultCondToSyncpoint.get(logInfo.getFaultName());
				if(faultIterator != null) {
					for(String syncpoint : faultIterator) {
						serverMain.syncpointList.get(syncpoint).registerTrigger(logInfo.getNodeName());
					}
				}
			}
			this.execList = new HashMap<String, ExecInfo>();
			for( ExecInfo execInfo : logInfo.getExecInfoList()) {
				execList.put(execInfo.getExecName(), execInfo);
			}
		}
	}
}