package com.zabbix.api.domain.itemprototype;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
public class ItemPrototypeIsreadableRequest extends RequestBase{
	public ItemPrototypeIsreadableRequest() {
		super("itemprototype.isreadable");
	}
	private List<String> params;
	public void setParams(List<String> params) {
		this.params = params;
	}
	public List<String> getParams() {
		 if(params==null){
			params   = new ArrayList<String>();
			return params;
		}
		 return params;
	}
}
