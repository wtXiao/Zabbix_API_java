package com.zabbix.api.domain.hostgroup;
import java.util.*;

import com.zabbix.api.domain.base.HostGroup;
import com.zabbix.api.domain.base.RequestBase;
public class HostGroupMassremoveRequest extends RequestBase{
	public HostGroupMassremoveRequest() {
		super("hostgroup.massremove");
	}
	private HostGroupMassremoveParams params = new HostGroupMassremoveParams();
	public void setParams(HostGroupMassremoveParams params) {
		this.params = params;
	}
	public HostGroupMassremoveParams getParams() {
		return params;
	}
	public static class HostGroupMassremoveParams extends HostGroup{
		private List<String> groupids;
		private List<String> hostids;
		private List<String> templateids;
		public void setGroupids(List<String> groupids) {
			this.groupids = groupids;
		}
		public List<String> getGroupids() {
			 if(groupids==null){
				groupids   = new ArrayList<String>();
				return groupids;
			}
			 return groupids;
		}
		public void setHostids(List<String> hostids) {
			this.hostids = hostids;
		}
		public List<String> getHostids() {
			 if(hostids==null){
				hostids   = new ArrayList<String>();
				return hostids;
			}
			 return hostids;
		}
		public void setTemplateids(List<String> templateids) {
			this.templateids = templateids;
		}
		public List<String> getTemplateids() {
			 if(templateids==null){
				templateids   = new ArrayList<String>();
				return templateids;
			}
			 return templateids;
		}
	}
}
