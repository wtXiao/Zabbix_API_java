package com.zabbix.api.domain.base;
/**
 * @ClassName: ActionOperationMessage
 * @Description: 触发动作的信息发送
 * @author 李庆雷
 * @date 2013-9-26 上午11:28:05
 * @version V1.0
 */
public class ActionOperationMessage{
	private String operationid;			//操作编号
	private Integer default_msg;		//是否使用默认动作消息文本和主题（0为使用，1为不使用）
	private String mediatypeid;			//发送信息的媒体类型
	private String message;				//信息
	private String subject;				//标题
	public void setOperationid(String operationid) {
		this.operationid = operationid;
	}
	public String getOperationid() {
		return operationid;
	}
	public void setDefault_msg(Integer default_msg) {
		this.default_msg = default_msg;
	}
	public Integer getDefault_msg() {
		return default_msg;
	}
	public void setMediatypeid(String mediatypeid) {
		this.mediatypeid = mediatypeid;
	}
	public String getMediatypeid() {
		return mediatypeid;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
}
