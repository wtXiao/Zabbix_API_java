package com.zabbix.api.domain.usergroup;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
public class UserGroupExistsRequest extends RequestBase{
	public UserGroupExistsRequest() {
		super("usergroup.exists");
	}
	private UserGroupExistsParams params = new UserGroupExistsParams();
	public void setParams(UserGroupExistsParams params) {
		this.params = params;
	}
	public UserGroupExistsParams getParams() {
		return params;
	}
	public static class UserGroupExistsParams{
		private List<String> name;
		private String node;
		private List<String> nodeids;
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
