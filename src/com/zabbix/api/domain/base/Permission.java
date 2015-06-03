package com.zabbix.api.domain.base;
public class Permission{
	private String id;
	private Integer permission;
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setPermission(Integer permission) {
		this.permission = permission;
	}
	public Integer getPermission() {
		return permission;
	}
}
