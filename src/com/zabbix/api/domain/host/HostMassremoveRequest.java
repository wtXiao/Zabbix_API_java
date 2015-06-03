package com.zabbix.api.domain.host;
import java.util.*;

import com.zabbix.api.domain.base.HostInterface;
import com.zabbix.api.domain.base.Macro;
import com.zabbix.api.domain.base.RequestBase;
public class HostMassremoveRequest extends RequestBase{
	public HostMassremoveRequest() {
		super("host.massremove");
	}
	private HostMassremoveParams params = new HostMassremoveParams();
	public void setParams(HostMassremoveParams params) {
		this.params = params;
	}
	public HostMassremoveParams getParams() {
		return params;
	}
	public static class HostMassremoveParams{
		private List<String> hostids;
		private List<String> groupids;
		private List<HostInterface> interfaces;
		private List<Macro> macros;
		private List<String> templateids;
		private List<String> templateids_clear;
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
		public void setInterfaces(List<HostInterface> interfaces) {
			this.interfaces = interfaces;
		}
		public List<HostInterface> getInterfaces() {
			 if(interfaces==null){
				interfaces   = new ArrayList<HostInterface>();
				return interfaces;
			}
			 return interfaces;
		}
		public void setMacros(List<Macro> macros) {
			this.macros = macros;
		}
		public List<Macro> getMacros() {
			 if(macros==null){
				macros   = new ArrayList<Macro>();
				return macros;
			}
			 return macros;
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
		public void setTemplateids_clear(List<String> templateids_clear) {
			this.templateids_clear = templateids_clear;
		}
		public List<String> getTemplateids_clear() {
			 if(templateids_clear==null){
				templateids_clear   = new ArrayList<String>();
				return templateids_clear;
			}
			 return templateids_clear;
		}
	}
}
