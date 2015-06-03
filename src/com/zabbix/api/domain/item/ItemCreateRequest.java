package com.zabbix.api.domain.item;
import java.util.*;

import com.zabbix.api.domain.base.Item;
import com.zabbix.api.domain.base.RequestBase;
public class ItemCreateRequest extends RequestBase{
	public ItemCreateRequest() {
		super("item.create");
	}
	private ItemCreateParams params = new ItemCreateParams();
	public void setParams(ItemCreateParams params) {
		this.params = params;
	}
	public ItemCreateParams getParams() {
		return params;
	}
	public static class ItemCreateParams extends Item{
		private List<String> applications;
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
