package com.zabbix.api.domain.trigger;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
import com.zabbix.api.domain.base.Trigger;
public class TriggerGetobjectsRequest extends RequestBase{
	public TriggerGetobjectsRequest() {
		super("trigger.getobjects");
	}
	private TriggerGetobjectsParams params = new TriggerGetobjectsParams();
	public void setParams(TriggerGetobjectsParams params) {
		this.params = params;
	}
	public TriggerGetobjectsParams getParams() {
		return params;
	}
	public static class TriggerGetobjectsParams extends Trigger{
		private List<String> host;
		private List<String> hostid;
		private String node;
		private List<String> nodeids;
		public void setHost(List<String> host) {
			this.host = host;
		}
		public List<String> getHost() {
			 if(host==null){
				host   = new ArrayList<String>();
				return host;
			}
			 return host;
		}
		public void setHostid(List<String> hostid) {
			this.hostid = hostid;
		}
		public List<String> getHostid() {
			 if(hostid==null){
				hostid   = new ArrayList<String>();
				return hostid;
			}
			 return hostid;
		}
		public void setNode(String node) {
			this.node = node;
		}
		public String getNode() {
			return node;
		}
		public void setNodeids(List<String> nodeids) {
			this.nodeids = nodeids;
		}
		public List<String> getNodeids() {
			 if(nodeids==null){
				nodeids   = new ArrayList<String>();
				return nodeids;
			}
			 return nodeids;
		}
	}
}
