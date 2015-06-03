package com.zabbix.api.domain.hostgroup;
import java.util.*;

import com.zabbix.api.domain.base.HostGroup;
import com.zabbix.api.domain.base.RequestBase;
public class HostGroupCreateRequest extends RequestBase{
	public HostGroupCreateRequest() {
		super("hostgroup.create");
	}
	private List<HostGroup> params;
	public void setParams(List<HostGroup> params) {
		this.params = params;
	}
	public List<HostGroup> getParams() {
		 if(params==null){
			params   = new ArrayList<HostGroup>();
			return params;
		}
		 return params;
	}
}
