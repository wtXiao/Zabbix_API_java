package com.zabbix.api.domain.template;
import java.util.*;

import com.zabbix.api.domain.base.Host;
import com.zabbix.api.domain.base.HostGroup;
import com.zabbix.api.domain.base.Macro;
import com.zabbix.api.domain.base.RequestBase;
import com.zabbix.api.domain.base.Template;
public class TemplateMassaddRequest extends RequestBase{
	public TemplateMassaddRequest() {
		super("template.massadd");
	}
	private TemplateMassaddParams params = new TemplateMassaddParams();
	public void setParams(TemplateMassaddParams params) {
		this.params = params;
	}
	public TemplateMassaddParams getParams() {
		return params;
	}
	public static class TemplateMassaddParams{
		private List<Template> templates;
		private List<HostGroup> groups;
		private List<Host> hosts;
		private List<Macro> macros;
		private List<Template> templates_link;
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
		public void setTemplates_link(List<Template> templates_link) {
			this.templates_link = templates_link;
		}
		public List<Template> getTemplates_link() {
			 if(templates_link==null){
				templates_link   = new ArrayList<Template>();
				return templates_link;
			}
			 return templates_link;
		}
	}
}
