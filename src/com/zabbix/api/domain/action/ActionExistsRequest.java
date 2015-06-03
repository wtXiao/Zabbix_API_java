package com.zabbix.api.domain.action;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
public class ActionExistsRequest extends RequestBase{
	public ActionExistsRequest() {
		super("action.exists");
	}
	private ActionExistsParams params = new ActionExistsParams();
	public void setParams(ActionExistsParams params) {
		this.params = params;
	}
	public ActionExistsParams getParams() {
		return params;
	}
	public static class ActionExistsParams{
		private List<String> actionid;
		private List<String> name;
		private String node;
		private List<String> nodeids;
		public void setActionid(List<String> actionid) {
			this.actionid = actionid;
		}
		public List<String> getActionid() {
			 if(actionid==null){
				actionid   = new ArrayList<String>();
				return actionid;
			}
			 return actionid;
		}
		public void setName(List<String> name) {
			this.name = name;
		}
		public List<String> getName() {
			 if(name==null){
				name   = new ArrayList<String>();
				return name;
			}
			 return name;
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
