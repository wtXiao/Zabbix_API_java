package com.zabbix.api.domain.base;
public class Media{
	private String mediaid;
	private String active;
	private String mediatypeid;
	private String period;
	private String sendto;
	private String severity;
	private String userid;
	public void setMediaid(String mediaid) {
		this.mediaid = mediaid;
	}
	public String getMediaid() {
		return mediaid;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getActive() {
		return active;
	}
	public void setMediatypeid(String mediatypeid) {
		this.mediatypeid = mediatypeid;
	}
	public String getMediatypeid() {
		return mediatypeid;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getPeriod() {
		return period;
	}
	public void setSendto(String sendto) {
		this.sendto = sendto;
	}
	public String getSendto() {
		return sendto;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getSeverity() {
		return severity;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserid() {
		return userid;
	}
}
