package com.zabbix.api.domain.host;
import java.util.*;

import com.zabbix.api.domain.base.Host;
import com.zabbix.api.domain.base.RequestBase;
public class HostDeleteRequest extends RequestBase{
	public HostDeleteRequest() {
		super("host.delete");
	}
	private List<Host> params;
	public void setParams(List<Host> params) {
		this.params = params;
	}
	public List<Host> getParams() {
		 if(params==null){
			params   = new ArrayList<Host>();
			return params;
		}
		 return params;
	}
}
