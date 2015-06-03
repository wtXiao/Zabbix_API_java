package com.zabbix.api.test;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.zabbix.api.domain.base.HostInterface;
import com.zabbix.api.domain.hostinterface.HostInterfaceGetRequest;
import com.zabbix.api.service.IHostinterfaceService;
import com.zabbix.api.service.impl.HostinterfaceServiceImpl;

public class TestHostinterface extends TestCase {
	private static  IHostinterfaceService hostinterfaceService = new HostinterfaceServiceImpl();
	 static{
 		//登录 
 		new Util().login();
 	}

	public void testHostInterfaceGet(){
		//数据准备 
		HostInterfaceGetRequest hostInterfaceGet = new HostInterfaceGetRequest();
		hostInterfaceGet.getParams().setOutput("extend");
		List<String> ids = new ArrayList<String>();
		ids.add("10084");
		hostInterfaceGet.getParams().setHostids(ids);
		hostinterfaceService.hostInterfaceGet(hostInterfaceGet);
	
	}
	
	public void testHostInterfaceGetToBean(){
		//数据准备 
		HostInterfaceGetRequest hostInterfaceGet = new HostInterfaceGetRequest();
		hostInterfaceGet.getParams().setOutput("extend");
//		List<String> ids = new ArrayList<String>();
//		ids.add("10084");
//		hostInterfaceGet.getParams().setHostids(ids);
		List ips = new ArrayList();
		ips.add("192.168.153.26");
		hostInterfaceGet.getParams().getFilter().setIp(ips);
		List<HostInterface> list = hostinterfaceService.getHostInterfaceBean(hostInterfaceGet);
		System.out.println(list.size());
	}
}