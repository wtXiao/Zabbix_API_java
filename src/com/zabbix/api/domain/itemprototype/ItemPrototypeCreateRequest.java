package com.zabbix.api.domain.itemprototype;
import java.util.*;

import com.zabbix.api.domain.base.ItemPrototype;
import com.zabbix.api.domain.base.RequestBase;
public class ItemPrototypeCreateRequest extends RequestBase{
	public ItemPrototypeCreateRequest() {
		super("itemprototype.create");
	}
	private ItemPrototypeCreateParams params = new ItemPrototypeCreateParams();
	public void setParams(ItemPrototypeCreateParams params) {
		this.params = params;
	}
	public ItemPrototypeCreateParams getParams() {
		return params;
	}
	public static class ItemPrototypeCreateParams extends ItemPrototype{
		private String ruleid ;
		private List<String> applications;
		public void setRuleid (String ruleid ) {
			this.ruleid  = ruleid ;
		}
		public String getRuleid () {
			return ruleid ;
		}
		public void setApplications(List<String> applications) {
			this.applications = applications;
		}
		public List<String> getApplications() {
			 if(applications==null){
				applications   = new ArrayList<String>();
				return applications;
			}
			 return applications;
		}
	}
}
