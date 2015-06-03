package com.zabbix.api.domain.template;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
public class TemplateExistsRequest extends RequestBase{
	public TemplateExistsRequest() {
		super("template.exists");
	}
	private TemplateCreateParams params = new TemplateCreateParams();
	public void setParams(TemplateCreateParams params) {
		this.params = params;
	}
	public TemplateCreateParams getParams() {
		return params;
	}
	public static class TemplateCreateParams{
		private String host;
		private String name;
		private String node;
		private List<String> nodeids;
		private List<String> templateid;
		public void setHost(String host) {
			this.host = host;
		}
		public String getHost() {
			return host;
		}
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
		public void setTemplateid(List<String> templateid) {
			this.templateid = templateid;
		}
		public List<String> getTemplateid() {
			 if(templateid==null){
				templateid   = new ArrayList<String>();
				return templateid;
			}
			 return templateid;
		}
	}
}
