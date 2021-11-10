package agen.obj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import zermia.proto.ProtoRuntime.Log;
import zermia.proto.ProtoRuntime.Syncpoint;

public class Node {
	String nodeName;
	String nodeIP;
	Integer nodePort;
	List<Fault> faultLogs;
	Boolean faultyNode;
	
	public Node(String nodeName, String nodeIP, Integer nodePort, Boolean faultyNode){
		this.nodeName = nodeName;
		this.nodeIP = nodeIP;
		this.nodePort = nodePort;
		this.faultyNode = faultyNode;
		faultLogs =	new ArrayList<Fault>();
	}

	public void addFaultLog(Log logInfo) {
		faultLogs.add(new Fault(logInfo));
	}
	
	public String getNodeName(){
		return this.nodeName;
	}


}