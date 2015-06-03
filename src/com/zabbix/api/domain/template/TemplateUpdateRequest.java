package com.zabbix.api.domain.template;
import java.util.*;

import com.zabbix.api.domain.base.Host;
import com.zabbix.api.domain.base.HostGroup;
import com.zabbix.api.domain.base.Macro;
import com.zabbix.api.domain.base.RequestBase;
import com.zabbix.api.domain.base.Template;
public class TemplateUpdateRequest extends RequestBase{
	public TemplateUpdateRequest() {
		super("template.update");
	}
	private TemplateUpdateParams params = new TemplateUpdateParams();
	public void setParams(TemplateUpdateParams params) {
		this.params = params;
	}
	public TemplateUpdateParams getParams() {
		return params;
	}
	public static class TemplateUpdateParams extends Template{
		private List<HostGroup> groups;
		private List<Host> hosts;
		private List<Macro> macros;
		private List<Template> templates;
		private List<Template> templates_clear;
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
		public void setHosts(List<Host> hosts) {
			this.hosts = hosts;
		}
		public List<Host> getHosts() {
			 if(hosts==null){
				hosts   = new ArrayList<Host>();
				return hosts;
			}
			 return hosts;
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
		public void setTemplates_clear(List<Template> templates_clear) {
			this.templates_clear = templates_clear;
		}
		public List<Template> getTemplates_clear() {
			 if(templates_clear==null){
				templates_clear   = new ArrayList<Template>();
				return templates_clear;
			}
			 return templates_clear;
		}
	}
}
