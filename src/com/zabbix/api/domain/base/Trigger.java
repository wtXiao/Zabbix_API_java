package com.zabbix.api.domain.base;
public class Trigger{
	private String triggerid;
	private String description;
	private String expression;
	private String comments;
	private String error;
	private Integer flags;
	private String lastchange;
	private Integer priority;
	private Integer status;
	private String templateid;
	private Integer type;
	private String url;
	private Integer value;
	private Integer value_flags;
	public void setTriggerid(String triggerid) {
		this.triggerid = triggerid;
	}
	public String getTriggerid() {
		return triggerid;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	public void setExpression(String expression) {
		this.expression = expression;
	}
	public String getExpression() {
		return expression;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getComments() {
		return comments;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getError() {
		return error;
	}
	public void setFlags(Integer flags) {
		this.flags = flags;
	}
	public Integer getFlags() {
		return flags;
	}
	public void setLastchange(String lastchange) {
		this.lastchange = lastchange;
	}
	public String getLastchange() {
		return lastchange;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getStatus() {
		return status;
	}
	public void setTemplateid(String templateid) {
		this.templateid = templateid;
	}
	public String getTemplateid() {
		return templateid;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getType() {
		return type;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl() {
		return url;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue_flags(Integer value_flags) {
		this.value_flags = value_flags;
	}
	public Integer getValue_flags() {
		return value_flags;
	}
}
