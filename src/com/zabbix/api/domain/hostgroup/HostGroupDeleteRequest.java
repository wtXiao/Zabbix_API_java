package com.zabbix.api.domain.hostgroup;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
public class HostGroupDeleteRequest extends RequestBase{
	public HostGroupDeleteRequest() {
		super("hostgroup.delete");
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
