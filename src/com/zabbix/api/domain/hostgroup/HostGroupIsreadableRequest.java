package com.zabbix.api.domain.hostgroup;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
public class HostGroupIsreadableRequest extends RequestBase{
	public HostGroupIsreadableRequest() {
		super("hostgroup.isreadable");
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
