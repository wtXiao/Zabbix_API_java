package com.zabbix.api.test;

import junit.framework.TestCase;

import com.zabbix.api.domain.triggerprototype.TriggerPrototypeCreateRequest;
import com.zabbix.api.domain.triggerprototype.TriggerPrototypeDeleteRequest;
import com.zabbix.api.domain.triggerprototype.TriggerPrototypeGetRequest;
import com.zabbix.api.domain.triggerprototype.TriggerPrototypeUpdateRequest;
import com.zabbix.api.service.ITriggerprototypeService;
import com.zabbix.api.service.impl.TriggerprototypeServiceImpl;

public class TestTriggerprototype extends TestCase {
	private static ITriggerprototypeService triggerprototypeService = new TriggerprototypeServiceImpl();
	static {
		// 登录
		new Util().login();
	}
	
	

	public void testTriggerPrototypeCreate() {
		// 数据准备
		TriggerPrototypeCreateRequest triggerPrototypeCreate = new TriggerPrototypeCreateRequest();
		
		triggerPrototypeCreate.getParams().setExpression("{Template OS Linux:vfs.fs.size[{#FSNAME},pused].last(0)}>50");
		triggerPrototypeCreate.getParams().setDescription("磁盘使用率大于百分之50");
		triggerPrototypeCreate.getParams().setUrl("");
		triggerPrototypeCreate.getParams().setStatus(0);
		triggerPrototypeCreate.getParams().setPriority(5);
		triggerPrototypeCreate.getParams().setComments("");
		
		triggerprototypeService.triggerPrototypeCreate(triggerPrototypeCreate);

	}

	public void testTriggerPrototypeDelete() {
		// 数据准备
		TriggerPrototypeDeleteRequest triggerPrototypeDelete = new TriggerPrototypeDeleteRequest();
		
		triggerPrototypeDelete.getParams().add("2021");
		
		triggerprototypeService.triggerPrototypeDelete(triggerPrototypeDelete);

	}

	public void testTriggerPrototypeGet() {
		// 数据准备
		TriggerPrototypeGetRequest triggerPrototypeGet = new TriggerPrototypeGetRequest();
		triggerPrototypeGet.getParams().setOutput("extend");
		triggerprototypeService.triggerPrototypeGet(triggerPrototypeGet);

	}

	public void testTriggerPrototypeGetToBean() {
		// 数据准备
		TriggerPrototypeGetRequest triggerPrototypeGet = new TriggerPrototypeGetRequest();
		triggerPrototypeGet.getParams().setOutput("extend");
		triggerprototypeService.triggerPrototypeGetToBean(triggerPrototypeGet);

	}
	
	public void testTriggerPrototypeUpdate() {
		// 数据准备
		TriggerPrototypeUpdateRequest triggerPrototypeUpdate = new TriggerPrototypeUpdateRequest();
		triggerPrototypeUpdate.getParams().setTriggerid("2023");
		triggerPrototypeUpdate.getParams().setExpression("{AddrTable测试192.168.0.253:ipAdEntAddr[{#SNMPVALUE}].last(0)}=0");
		triggerPrototypeUpdate.getParams().setDescription("abc123");
		triggerPrototypeUpdate.getParams().setUrl("");
		triggerPrototypeUpdate.getParams().setStatus(0);
		triggerPrototypeUpdate.getParams().setPriority(2);
		triggerPrototypeUpdate.getParams().setComments("");
		triggerprototypeService.triggerPrototypeUpdate(triggerPrototypeUpdate);

	}
}