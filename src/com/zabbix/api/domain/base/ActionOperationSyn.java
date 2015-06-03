package com.zabbix.api.domain.base;
public class ActionOperationSyn{
	private String opcommand_grpid;
	private String operationid;
	private String groupid;
	private String opcommand_hstid;
	private String hostid;
	private String usrgrpid;
	private String userid;
	private String templateid;
	public void setOpcommand_grpid(String opcommand_grpid) {
		this.opcommand_grpid = opcommand_grpid;
	}
	public String getOpcommand_grpid() {
		return opcommand_grpid;
	}
	public void setOperationid(String operationid) {
		this.operationid = operationid;
	}
	public String getOperationid() {
		return operationid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setOpcommand_hstid(String opcommand_hstid) {
		this.opcommand_hstid = opcommand_hstid;
	}
	public String getOpcommand_hstid() {
		return opcommand_hstid;
	}
	public void setHostid(String hostid) {
		this.hostid = hostid;
	}
	public String getHostid() {
		return hostid;
	}
	public void setUsrgrpid(String usrgrpid) {
		this.usrgrpid = usrgrpid;
	}
	public String getUsrgrpid() {
		return usrgrpid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserid() {
		return userid;
	}
	public void setTemplateid(String templateid) {
		this.templateid = templateid;
	}
	public String getTemplateid() {
		return templateid;
	}
}
