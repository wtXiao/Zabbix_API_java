package com.zabbix.api.domain.user;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
public class UserIsreadableRequest extends RequestBase{
	public UserIsreadableRequest() {
		super("user.isreadable");
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
