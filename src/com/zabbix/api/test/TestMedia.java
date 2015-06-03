package com.zabbix.api.test;
import junit.framework.TestCase;

import com.zabbix.api.domain.media.MediaGetRequest;
import com.zabbix.api.service.IMediaService;
import com.zabbix.api.service.impl.MediaServiceImpl;
public class TestMedia extends TestCase {
	private static  IMediaService mediaService = new MediaServiceImpl();
	 static{
 		//登录 
 		new Util().login();
 	}

public void testGet(){
	//数据准备 
	MediaGetRequest get = new MediaGetRequest();
	
	get.getParams().setOutput("extend");
	
	mediaService.get(get);

}
}