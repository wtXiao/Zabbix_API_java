package com.zabbix.api.domain.action;
import java.util.*;

import com.zabbix.api.domain.base.Action;
import com.zabbix.api.domain.base.ActionCondition;
import com.zabbix.api.domain.base.ActionOperation;
import com.zabbix.api.domain.base.RequestBase;
public class ActionUpdateRequest extends RequestBase{
	public ActionUpdateRequest() {
		super("action.update");
	}
	private ActionUpdateParams params = new ActionUpdateParams();
	public void setParams(ActionUpdateParams params) {
		this.params = params;
	}
	public ActionUpdateParams getParams() {
		return params;
	}
	public static class ActionUpdateParams extends Action{
		private List<ActionCondition> conditions;
		private List<ActionOperation> operations;
		public void setConditions(List<ActionCondition> conditions) {
			this.conditions = conditions;
		}
		public List<ActionCondition> getConditions() {
			 if(conditions==null){
				conditions   = new ArrayList<ActionCondition>();
				return conditions;
			}
			 return conditions;
		}
		public void setOperations(List<ActionOperation> operations) {
			this.operations = operations;
		}
		public List<ActionOperation> getOperations() {
			 if(operations==null){
				operations   = new ArrayList<ActionOperation>();
				return operations;
			}
			 return operations;
		}
	}
}
