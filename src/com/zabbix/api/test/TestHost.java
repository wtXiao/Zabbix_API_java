package com.zabbix.api.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import com.zabbix.api.domain.base.Host;
import com.zabbix.api.domain.base.HostGroup;
import com.zabbix.api.domain.base.HostInterface;
import com.zabbix.api.domain.base.Template;
import com.zabbix.api.domain.host.HostCreateRequest;
import com.zabbix.api.domain.host.HostGetRequest;
import com.zabbix.api.domain.host.HostGetRequest.HostGetParams;
import com.zabbix.api.service.IHostService;
import com.zabbix.api.service.impl.HostServiceImpl;

public class TestHost extends TestCase {
	private static IHostService hostService = new HostServiceImpl();
	static {
		// 登录
		new Util().login();
	}

	@Test
	public void testCreate() {
		// 数据准备
		HostCreateRequest create = new HostCreateRequest();

		create.getParams().setHost("123");
		// create.getParams().setName("testName7");
		HostGroup hostGroup = new HostGroup();
		hostGroup.setGroupid("41");
		create.getParams().getGroups().add(hostGroup);

		HostInterface hif = new HostInterface();
		hif.setType(1);
		hif.setIp("1.1.1.1");
		hif.setDns("www.basu.com");
		hif.setUseip(1);
		hif.setMain(1);
		hif.setPort("10050");
		create.getParams().getInterfaces().add(hif);
		// hif = new HostInterface();
		// hif.setUseip(0);
		// hif.setType(3);
		// hif.setMain(1);
		// hif.setIp("");
		// hif.setDns("www.baudi.com");
		// hif.setPort("8181");
		// create.getParams().getInterfaces().add(hif);
		// hif = new HostInterface();
		// hif.setUseip(0);
		// hif.setType(1);
		// hif.setMain(2);
		// hif.setIp("");
		// hif.setDns("www.baidu.com");
		// hif.setPort("8181");
		// create.getParams().getInterfaces().add(hif);

		create.getParams().setStatus(1);

		Template tem = new Template();
		tem.setTemplateid("10001");

		create.getParams().getTemplates().add(tem);

		// create.getParams().setIpmi_password("123");

		hostService.create(create);

	}

	@Test
	public void testGet() {
		// 数据准备 shorten, refer, extend
		// HostGetRequest get = new HostGetRequest();
		// get.getParams().setOutput("extend");
		// // get.getParams().setHostids("10084");
		// get.getParams().setSelectTigges("select * from triggers");
		// // get.getParams().setSelectItems("extend");
		// hostService.get(get);
		// String proxyid= "10828";
//		String proxyid = null;
//		HostGetRequest getRequest = new HostGetRequest();
//		HostGetParams param = getRequest.getParams();
//		param.setOutput("shorten");
//		if (proxyid != null) {
//			String[] proxyids = { proxyid };
//			param.setProxyids(proxyids);
//		}
//		List<String> ips = new ArrayList<String>();
//		// ips.add("10.17.1.131");
//		ips.add("192.168.153.26");
//		param.getFilter().setIp(ips);
//		Object object = hostService.get(getRequest);
//		System.out.println(object.toString());
		// JSONObject object = (JSONObject) hostService.get(getRequest);
		// if(object.containsKey("result")){
		// JSONArray array = object.getJSONArray("result");
		// JSONObject jsonObject = array.getJSONObject(0);
		// hostid = jsonObject.getString("hostid");
		// }
		HostGetRequest hostGetRequest = new HostGetRequest();
		hostGetRequest.getParams().setOutput("extend");
		List<String> nameList = new ArrayList<String>();
		nameList.add("192.168.150.204");
		hostGetRequest.getParams().getFilter().setName(nameList);
		List<Host> hostList = hostService.getHostToBean(hostGetRequest);
		
	}

	// {
	// "jsonrpc": "2.0",
	// "method": "host.get",
	// "params": {
	// "output": "extend",
	// "selectInterfaces":"extend",
	// "proxyids":["10828"],
	// "filter": {
	// "ips": [
	// "192.168.153.223"
	// ]
	// }
	// },
	// "auth": "005a36950a18e5f9768b29a1f475d0ed",
	// "id": 1
	// }

	@Test
	public void testGetToBean() {
		// 数据准备 shorten, refer, extend
		HostGetRequest get = new HostGetRequest();
		get.getParams().setOutput("shorten");
		// String[] proxyids = {"10828"};
		// get.getParams().setProxyids(proxyids);;
		// get.getParams().setSelectItems("extend")
		List<String> ips = new ArrayList<String>();
		ips.add("192.168.153.26");
		get.getParams().getFilter().setIp(ips);
		;
		List<Host> hosts = hostService.getHostToBean(get);
		System.out.println(hosts.size());

	}

	@Test
	public void testCreateHost() {
		Host host = new Host();
		HostGroup group = new HostGroup();
		HostInterface hostInterface = new HostInterface();
		Template template = new Template();
		host.setName("1112");
		host.setHost("1112");
		host.setStatus(1);
		group.setGroupid("38");
		host.setProxy_hostid("10828");
		hostInterface.setType(1); // 1 - agent; 2 - SNMP; 3 - IPMI 4 - JMX.
		hostInterface.setIp("1.1.1.1");
		hostInterface.setDns("");
		hostInterface.setUseip(1); // 0 - connect using host DNS name 1 -
									// connect using host IP address.
		hostInterface.setMain(1); // 0 - not default; 1 - default.
		hostInterface.setPort("10050"); // agent监控默认端口
		template.setTemplateid("10081");
		String ss = hostService
				.createHost(host, hostInterface, group, template);
		System.out.println(ss);
	}
}