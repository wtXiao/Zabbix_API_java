package com.zabbix.api.domain.base;
import java.util.*;

import com.zabbix.api.domain.base.ActionOperationMessage;
import com.zabbix.api.domain.base.ActionOperationSyn;
/**
 * @ClassName: ActionOperation
 * @Description: 动作触发的操作
 * @author 李庆雷
 * @date 2013-9-26 上午9:45:33
 * @version V1.0
 */
public class ActionOperation{
	private String operationid;			//操作编号
	private Integer operationtype;		//操作类型（0 - send message;1 - remote command;2 - add host;3 - remove host;4 - add to host group;5 - remove from host group;6 - link to template;7 - unlink from template;8 - enable host;9 - disable host.）
	private String actionid;			//动作编号
	private Integer esc_period;			//步骤持续时间 	Step duration
	private Integer esc_step_from;		//开始步骤
	private Integer esc_step_to;		//结束步骤
	private Integer evaltype;			//操作算法类型
	private ActionOperationCommand opcommand;				//远程命令操作
	private List<ActionOperationSyn> opcommand_grp;			//以设备组运行远程命令操作
	private List<ActionOperationSyn> opcommand_hst;			//以设备运行远程命令操作
	private List<ActionOperationCondition> opconditions;	//触发动作的操作条件
	private List<ActionOperationSyn> opgroup;				//设备组				
	private ActionOperationMessage opmessage;				//发送消息操作
	private List<ActionOperationSyn> opmessage_grp;			//以用户组发送消息操作
	private List<ActionOperationSyn> opmessage_usr;			//以用户发送消息操作
	private List<ActionOperationSyn> optemplate;			//模板
	public void setOperationid(String operationid) {
		this.operationid = operationid;
	}
	public String getOperationid() {
		return operationid;
	}
	public void setOperationtype(Integer operationtype) {
		this.operationtype = operationtype;
	}
	public Integer getOperationtype() {
		return operationtype;
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
	public void setEsc_step_from(Integer esc_step_from) {
		this.esc_step_from = esc_step_from;
	}
	public Integer getEsc_step_from() {
		return esc_step_from;
	}
	public void setEsc_step_to(Integer esc_step_to) {
		this.esc_step_to = esc_step_to;
	}
	public Integer getEsc_step_to() {
		return esc_step_to;
	}
	public void setEvaltype(Integer evaltype) {
		this.evaltype = evaltype;
	}
	public Integer getEvaltype() {
		return evaltype;
	}
	public void setOpcommand(ActionOperationCommand opcommand) {
		this.opcommand = opcommand;
	}
	public ActionOperationCommand getOpcommand() {
		return opcommand;
	}
	public void setOpcommand_grp(List<ActionOperationSyn> opcommand_grp) {
		this.opcommand_grp = opcommand_grp;
	}
	public List<ActionOperationSyn> getOpcommand_grp() {
		 if(opcommand_grp==null){
			opcommand_grp   = new ArrayList<ActionOperationSyn>();
			return opcommand_grp;
		}
		 return opcommand_grp;
	}
	public void setOpcommand_hst(List<ActionOperationSyn> opcommand_hst) {
		this.opcommand_hst = opcommand_hst;
	}
	public List<ActionOperationSyn> getOpcommand_hst() {
		 if(opcommand_hst==null){
			opcommand_hst   = new ArrayList<ActionOperationSyn>();
			return opcommand_hst;
		}
		 return opcommand_hst;
	}
	public void setOpconditions(List<ActionOperationCondition> opconditions) {
		this.opconditions = opconditions;
	}
	public List<ActionOperationCondition> getOpconditions() {
		 if(opconditions==null){
			opconditions   = new ArrayList<ActionOperationCondition>();
			return opconditions;
		}
		 return opconditions;
	}
	public void setOpgroup(List<ActionOperationSyn> opgroup) {
		this.opgroup = opgroup;
	}
	public List<ActionOperationSyn> getOpgroup() {
		 if(opgroup==null){
			opgroup   = new ArrayList<ActionOperationSyn>();
			return opgroup;
		}
		 return opgroup;
	}
	public void setOpmessage(ActionOperationMessage opmessage) {
		this.opmessage = opmessage;
	}
	public ActionOperationMessage getOpmessage() {
		return opmessage;
	}
	public void setOpmessage_grp(List<ActionOperationSyn> opmessage_grp) {
		this.opmessage_grp = opmessage_grp;
	}
	public List<ActionOperationSyn> getOpmessage_grp() {
		 if(opmessage_grp==null){
			opmessage_grp   = new ArrayList<ActionOperationSyn>();
			return opmessage_grp;
		}
		 return opmessage_grp;
	}
	public void setOpmessage_usr(List<ActionOperationSyn> opmessage_usr) {
		this.opmessage_usr = opmessage_usr;
	}
	public List<ActionOperationSyn> getOpmessage_usr() {
		 if(opmessage_usr==null){
			opmessage_usr   = new ArrayList<ActionOperationSyn>();
			return opmessage_usr;
		}
		 return opmessage_usr;
	}
	public void setOptemplate(List<ActionOperationSyn> optemplate) {
		this.optemplate = optemplate;
	}
	public List<ActionOperationSyn> getOptemplate() {
		 if(optemplate==null){
			optemplate   = new ArrayList<ActionOperationSyn>();
			return optemplate;
		}
		 return optemplate;
	}
}
