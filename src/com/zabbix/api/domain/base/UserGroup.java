package com.zabbix.api.domain.base;

import java.util.List;

public class UserGroup{
	private String usrgrpid;
	private String name;
	private Integer debug_mode;
	private Integer gui_access;
	private Integer users_status;
	private List<User> users;
	public void setUsrgrpid(String usrgrpid) {
		this.usrgrpid = usrgrpid;
	}
	public String getUsrgrpid() {
		return usrgrpid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setDebug_mode(Integer debug_mode) {
		this.debug_mode = debug_mode;
	}
	public Integer getDebug_mode() {
		return debug_mode;
	}
	public void setGui_access(Integer gui_access) {
		this.gui_access = gui_access;
	}
	public Integer getGui_access() {
		return gui_access;
	}
	public void setUsers_status(Integer users_status) {
		this.users_status = users_status;
	}
	public Integer getUsers_status() {
		return users_status;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
}
