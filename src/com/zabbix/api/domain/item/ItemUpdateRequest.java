package com.zabbix.api.domain.item;
import java.util.*;

import com.zabbix.api.domain.base.Item;
import com.zabbix.api.domain.base.RequestBase;
public class ItemUpdateRequest extends RequestBase{
	public ItemUpdateRequest() {
		super("item.update");
	}
	private ItemUpdateParams params = new ItemUpdateParams();
	public void setParams(ItemUpdateParams params) {
		this.params = params;
	}
	public ItemUpdateParams getParams() {
		return params;
	}
	public static class ItemUpdateParams extends Item{
		private List<Item> applications;
		public void setApplications(List<Item> applications) {
			this.applications = applications;
		}
		public List<Item> getApplications() {
			 if(applications==null){
				applications   = new ArrayList<Item>();
				return applications;
			}
			 return applications;
		}
	}
}
