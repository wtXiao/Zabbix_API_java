package com.zabbix.api.domain.host;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
public class HostIswritableRequest extends RequestBase{
	public HostIswritableRequest() {
		super("host.iswritable");
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
