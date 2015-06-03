package com.zabbix.api.domain.hostgroup;
import java.util.*;

import com.zabbix.api.domain.base.HostGroup;
import com.zabbix.api.domain.base.RequestBase;
public class HostGroupUpdateRequest extends RequestBase{
	public HostGroupUpdateRequest() {
		super("hostgroup.update");
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
