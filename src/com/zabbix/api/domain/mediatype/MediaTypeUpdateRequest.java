package com.zabbix.api.domain.mediatype;
import java.util.*;

import com.zabbix.api.domain.base.MediaType;
import com.zabbix.api.domain.base.RequestBase;
public class MediaTypeUpdateRequest extends RequestBase{
	public MediaTypeUpdateRequest() {
		super("mediatype.update");
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
