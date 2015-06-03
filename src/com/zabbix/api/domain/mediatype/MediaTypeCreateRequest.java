package com.zabbix.api.domain.mediatype;
import java.util.*;

import com.zabbix.api.domain.base.MediaType;
import com.zabbix.api.domain.base.RequestBase;
public class MediaTypeCreateRequest extends RequestBase{
	public MediaTypeCreateRequest() {
		super("mediatype.create");
	}
	private List<MediaType> params;
	public void setParams(List<MediaType> params) {
		this.params = params;
	}
	public List<MediaType> getParams() {
		 if(params==null){
			params   = new ArrayList<MediaType>();
			return params;
		}
		 return params;
	}
}
