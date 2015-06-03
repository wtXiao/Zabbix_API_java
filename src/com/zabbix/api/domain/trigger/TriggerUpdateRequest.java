package com.zabbix.api.domain.trigger;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
import com.zabbix.api.domain.base.Trigger;
public class TriggerUpdateRequest extends RequestBase{
	public TriggerUpdateRequest() {
		super("trigger.update");
	}
	private TriggerUpdateParams params = new TriggerUpdateParams();
	public void setParams(TriggerUpdateParams params) {
		this.params = params;
	}
	public TriggerUpdateParams getParams() {
		return params;
	}
	public static class TriggerUpdateParams extends Trigger{
		private List<Trigger> dependencies;
		public void setDependencies(List<Trigger> dependencies) {
			this.dependencies = dependencies;
		}
		public List<Trigger> getDependencies() {
			 if(dependencies==null){
				dependencies   = new ArrayList<Trigger>();
				return dependencies;
			}
			 return dependencies;
		}
	}
}
