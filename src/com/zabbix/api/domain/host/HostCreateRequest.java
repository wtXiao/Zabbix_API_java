package com.zabbix.api.domain.host;
import java.util.*;

import com.zabbix.api.domain.base.Host;
import com.zabbix.api.domain.base.HostGroup;
import com.zabbix.api.domain.base.HostInterface;
import com.zabbix.api.domain.base.HostInventory;
import com.zabbix.api.domain.base.Macro;
import com.zabbix.api.domain.base.RequestBase;
import com.zabbix.api.domain.base.Template;
public class HostCreateRequest extends RequestBase{
	public HostCreateRequest() {
		super("host.create");
	}
	private HostCreateParams params = new HostCreateParams();
	public void setParams(HostCreateParams params) {
		this.params = params;
	}
	public HostCreateParams getParams() {
		return params;
	}
	public static class HostCreateParams extends Host{
		private List<HostGroup> groups;
		private List<HostInterface> interfaces;
		private List<Template> templates;
		private List<Macro> macros;
		private HostInventory inventory;
		public void setGroups(List<HostGroup> groups) {
			this.groups = groups;
		}
		public List<HostGroup> getGroups() {
			 if(groups==null){
				groups   = new ArrayList<HostGroup>();
				return groups;
			}
			 return groups;
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
		public void setTemplates(List<Template> templates) {
			this.templates = templates;
		}
		public List<Template> getTemplates() {
			 if(templates==null){
				templates   = new ArrayList<Template>();
				return templates;
			}
			 return templates;
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
		public void setInventory(HostInventory inventory) {
			this.inventory = inventory;
		}
		public HostInventory getInventory() {
			return inventory;
		}
	}
}
