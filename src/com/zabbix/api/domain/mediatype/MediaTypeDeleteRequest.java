package com.zabbix.api.domain.mediatype;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
public class MediaTypeDeleteRequest extends RequestBase{
	public MediaTypeDeleteRequest() {
		super("mediatype.delete");
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
