package com.zabbix.api.domain.base;
public class Macro{
	private String globalmacroid;
	private String hostmacroid;
	private String macro;
	private String value;
	private String hostid;
	public void setGlobalmacroid(String globalmacroid) {
		this.globalmacroid = globalmacroid;
	}
	public String getGlobalmacroid() {
		return globalmacroid;
	}
	public void setHostmacroid(String hostmacroid) {
		this.hostmacroid = hostmacroid;
	}
	public String getHostmacroid() {
		return hostmacroid;
	}
	public void setMacro(String macro) {
		this.macro = macro;
	}
	public String getMacro() {
		return macro;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	public void setHostid(String hostid) {
		this.hostid = hostid;
	}
	public String getHostid() {
		return hostid;
	}
}
