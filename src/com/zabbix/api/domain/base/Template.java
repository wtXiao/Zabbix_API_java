package com.zabbix.api.domain.base;
public class Template{
	private String templateid;
	private String host;
	private String name;
	public void setTemplateid(String templateid) {
		this.templateid = templateid;
	}
	public String getTemplateid() {
		return templateid;
	}
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
}
