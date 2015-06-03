package com.zabbix.api.domain.template;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
import com.zabbix.api.domain.base.Template;
public class TemplateGetobjectsRequest extends RequestBase{
	public TemplateGetobjectsRequest() {
		super("template.getobjects");
	}
	private TemplateGetobjectsParams params = new TemplateGetobjectsParams();
	public void setParams(TemplateGetobjectsParams params) {
		this.params = params;
	}
	public TemplateGetobjectsParams getParams() {
		return params;
	}
	public static class TemplateGetobjectsParams extends Template{
		private String node;
		private List<String> nodeids;
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
