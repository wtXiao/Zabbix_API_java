package com.zabbix.api.domain.base;
public class MediaType{
	private String mediatypeid;
	private String description ;
	private Integer type;
	private String exec_path;
	private String gsm_modem;
	private String passwd;
	private String smtp_email;
	private String smtp_helo;
	private String smtp_server;
	private Integer status;
	private String username;
	public void setMediatypeid(String mediatypeid) {
		this.mediatypeid = mediatypeid;
	}
	public String getMediatypeid() {
		return mediatypeid;
	}
	public void setDescription (String description ) {
		this.description  = description ;
	}
	public String getDescription () {
		return description ;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getType() {
		return type;
	}
	public void setExec_path(String exec_path) {
		this.exec_path = exec_path;
	}
	public String getExec_path() {
		return exec_path;
	}
	public void setGsm_modem(String gsm_modem) {
		this.gsm_modem = gsm_modem;
	}
	public String getGsm_modem() {
		return gsm_modem;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setSmtp_email(String smtp_email) {
		this.smtp_email = smtp_email;
	}
	public String getSmtp_email() {
		return smtp_email;
	}
	public void setSmtp_helo(String smtp_helo) {
		this.smtp_helo = smtp_helo;
	}
	public String getSmtp_helo() {
		return smtp_helo;
	}
	public void setSmtp_server(String smtp_server) {
		this.smtp_server = smtp_server;
	}
	public String getSmtp_server() {
		return smtp_server;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getStatus() {
		return status;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
}
