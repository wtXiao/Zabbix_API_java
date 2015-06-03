package com.zabbix.api.domain.base;

import java.util.List;

public class Action{
	private String actionid;		//动作编号主键
	private Integer esc_period;		//required 默认操作步骤停留时间(必须大于60秒) Default operation step duration
	private Integer evaltype;		//required 计算方式		0 - AND / OR;1 - AND;2 - OR. 默认配置0
	private Integer eventsource;	//required 发生事件的类型（event source）0 - event created by a trigger;默认选择此项
															//1 - event created by a discovery rule;
															//2 - event created by active agent auto-registration;
															//3 - internal event. 
	private String name;			//required 动作名称			
	private String def_longdata;	//动作触发的消息		Default message
	private String def_shortdata;	//动作触发的标题		Default subject
	private String r_longdata;		//动作恢复的消息		Recovery message
	private String r_shortdata;		//动作恢复的标题		Recovery subject
	private Integer recovery_msg;	//是否启用恢复消息
	private Integer status;			//动作的状态（0：启用;1：禁用）
	private List<ActionCondition> conditions;	//动作触发的条件
	private List<ActionOperation> operations;	//动作触发的操作
	
	public List<ActionCondition> getConditions() {
		return conditions;
	}
	public void setConditions(List<ActionCondition> conditions) {
		this.conditions = conditions;
	}
	public List<ActionOperation> getOperations() {
		return operations;
	}
	public void setOperations(List<ActionOperation> operations) {
		this.operations = operations;
	}
	public void setActionid(String actionid) {
		this.actionid = actionid;
	}
	public String getActionid() {
		return actionid;
	}
	public void setEsc_period(Integer esc_period) {
		this.esc_period = esc_period;
	}
	public Integer getEsc_period() {
		return esc_period;
	}
	public void setEvaltype(Integer evaltype) {
		this.evaltype = evaltype;
	}
	public Integer getEvaltype() {
		return evaltype;
	}
	public void setEventsource(Integer eventsource) {
		this.eventsource = eventsource;
	}
	public Integer getEventsource() {
		return eventsource;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setDef_longdata(String def_longdata) {
		this.def_longdata = def_longdata;
	}
	public String getDef_longdata() {
		return def_longdata;
	}
	public void setDef_shortdata(String def_shortdata) {
		this.def_shortdata = def_shortdata;
	}
	public String getDef_shortdata() {
		return def_shortdata;
	}
	public void setR_longdata(String r_longdata) {
		this.r_longdata = r_longdata;
	}
	public String getR_longdata() {
		return r_longdata;
	}
	public void setR_shortdata(String r_shortdata) {
		this.r_shortdata = r_shortdata;
	}
	public String getR_shortdata() {
		return r_shortdata;
	}
	public void setRecovery_msg(Integer recovery_msg) {
		this.recovery_msg = recovery_msg;
	}
	public Integer getRecovery_msg() {
		return recovery_msg;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getStatus() {
		return status;
	}
}
