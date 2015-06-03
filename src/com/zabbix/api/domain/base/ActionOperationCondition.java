package com.zabbix.api.domain.base;
/**
 * @ClassName: ActionOperationCondition
 * @Description: 触发动作的命令操作
 * @author 李庆雷
 * @date 2013-9-26 上午11:30:44
 * @version V1.0
 */
public class ActionOperationCondition{
	private String opconditionid;		//条件编号
	private Integer conditiontype;		//触发条件类型
	private String value;				//值
	private String operationid;			//操作编号
	private Integer operator;			//条件操作符
	public void setOpconditionid(String opconditionid) {
		this.opconditionid = opconditionid;
	}
	public String getOpconditionid() {
		return opconditionid;
	}
	public void setConditiontype(Integer conditiontype) {
		this.conditiontype = conditiontype;
	}
	public Integer getConditiontype() {
		return conditiontype;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	public void setOperationid(String operationid) {
		this.operationid = operationid;
	}
	public String getOperationid() {
		return operationid;
	}
	public void setOperator(Integer operator) {
		this.operator = operator;
	}
	public Integer getOperator() {
		return operator;
	}
}
