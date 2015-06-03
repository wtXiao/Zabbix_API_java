package com.zabbix.api.domain.host;
import java.util.*;

import com.zabbix.api.domain.base.Host;
import com.zabbix.api.domain.base.RequestBase;
public class HostGetobjectsRequest extends RequestBase{
	public HostGetobjectsRequest() {
		super("host.getobjects");
	}
	private HostGetobjectsParams params = new HostGetobjectsParams();
	public void setParams(HostGetobjectsParams params) {
		this.params = params;
	}
	public HostGetobjectsParams getParams() {
		return params;
	}
	public static class HostGetobjectsParams extends Host{
		private String node;
		private List<String> nodeids;
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
