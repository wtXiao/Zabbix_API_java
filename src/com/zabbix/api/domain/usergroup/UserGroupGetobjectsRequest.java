package com.zabbix.api.domain.usergroup;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
import com.zabbix.api.domain.base.UserGroup;
public class UserGroupGetobjectsRequest extends RequestBase{
	public UserGroupGetobjectsRequest() {
		super("usergroup.getobjects");
	}
	private UserGroupGetobjectsParams params = new UserGroupGetobjectsParams();
	public void setParams(UserGroupGetobjectsParams params) {
		this.params = params;
	}
	public UserGroupGetobjectsParams getParams() {
		return params;
	}
	public static class UserGroupGetobjectsParams extends UserGroup{
		private String name;
		private String node;
		private List<String> nodeids;
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
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
