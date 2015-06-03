package com.zabbix.api.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import com.zabbix.api.domain.base.Event;
import com.zabbix.api.domain.event.EventGetRequest;
import com.zabbix.api.service.IEventService;
import com.zabbix.api.service.impl.EventServiceImpl;


public class TestEvent extends TestCase {
	private static IEventService eventService = new EventServiceImpl();
	static {
		// 登录
		new Util().login();
	}

	public void testGet() {
		// 数据准备
		EventGetRequest get = new EventGetRequest();
		
		get.getParams().setOutput("extend");
		Long endTime = new Date().getTime()/1000;
		Long startTime = endTime - 18*24*60*60;
//		get.getParams().setSelect_acknowledges("extend");
//		get.getParams().getTriggerids().add("967");
//		get.getParams().getSortfield().add("eventid");
//		get.getParams().getSortorder().add("DESC");
//		List<String> hostids = new ArrayList<String>();
//		hostids.add("10084");
//		get.getParams().setHostids(hostids);
//		List<String> hostNameList = new ArrayList<String>();
//		hostNameList.add("sjc_zabbix_destiny_vm1");
//		hostNameList.add("sjc_zabbix_destiny_vm2");
//		get.getParams().getFilter().setValue(hostNameList);
		List<String> hostIds = new ArrayList<String>();
		hostIds.add("11342");
		get.getParams().setObject(0);
		get.getParams().setSource(0);
		get.getParams().setHostids(hostIds);
		get.getParams().setTime_from(startTime);
		get.getParams().setTime_till(endTime);
		get.getParams().setSelectTriggers("extend");
		get.getParams().setSelectItems("extend");
		get.getParams().setSelectHosts("extend");
		Object result = (Object)eventService.get(get);
		System.out.println(result.toString());
		
	}
	
	public void testGetEventToBean() {
		// 数据准备
		EventGetRequest get = new EventGetRequest();
		
		get.getParams().setOutput("extend");
		get.getParams().setSelectItems("extend");
//		get.getParams().setSelect_acknowledges("extend");
		get.getParams().setSelectHosts("extend");
		get.getParams().setSelectTriggers("extend");
		List values = new ArrayList();
		values.add("1");
		get.getParams().getFilter().setValue(values);
		get.getParams().setSource(0);
		get.getParams().setObject(0);
//		get.getParams().getTriggerids().add("967");
//		get.getParams().setTime_from(1399132800l);
//		get.getParams().getSortfield().add("clock");
//		get.getParams().getSortorder().add("DESC");
//		List<String> hostids = new ArrayList<String>();
//		hostids.add("10084");
//		get.getParams().setHostids(hostids);
		List<Event> events = eventService.getEventToBean(get);
		System.out.println(events.size());
	}
}