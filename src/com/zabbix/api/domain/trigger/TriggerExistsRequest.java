package com.zabbix.api.domain.trigger;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
public class TriggerExistsRequest extends RequestBase{
	public TriggerExistsRequest() {
		super("trigger.exists");
	}
	private TriggerExistsParams params = new TriggerExistsParams();
	public void setParams(TriggerExistsParams params) {
		this.params = params;
	}
	public TriggerExistsParams getParams() {
		return params;
	}
	public static class TriggerExistsParams{
		private String expression;
		private List<String> host;
		private List<String> hostid;
		private List<String> description;
		private String node;
		private List<String> nodeids;
		public void setExpression(String expression) {
			this.expression = expression;
		}
		public String getExpression() {
			return expression;
		}
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
		public void setDescription(List<String> description) {
			this.description = description;
		}
		public List<String> getDescription() {
			 if(description==null){
				description   = new ArrayList<String>();
				return description;
			}
			 return description;
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
