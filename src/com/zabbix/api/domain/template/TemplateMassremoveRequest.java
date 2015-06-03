package com.zabbix.api.domain.template;
import java.util.*;

import com.zabbix.api.domain.base.Macro;
import com.zabbix.api.domain.base.RequestBase;
public class TemplateMassremoveRequest extends RequestBase{
	public TemplateMassremoveRequest() {
		super("template.massremove");
	}
	private TemplateMassremoveParams params = new TemplateMassremoveParams();
	public void setParams(TemplateMassremoveParams params) {
		this.params = params;
	}
	public TemplateMassremoveParams getParams() {
		return params;
	}
	public static class TemplateMassremoveParams{
		private List<String> hostids;
		private String groupids;
		private List<String> templateids_link;
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
		public void setGroupids(String groupids) {
			this.groupids = groupids;
		}
		public String getGroupids() {
			return groupids;
		}
		public void setTemplateids_link(List<String> templateids_link) {
			this.templateids_link = templateids_link;
		}
		public List<String> getTemplateids_link() {
			 if(templateids_link==null){
				templateids_link   = new ArrayList<String>();
				return templateids_link;
			}
			 return templateids_link;
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
