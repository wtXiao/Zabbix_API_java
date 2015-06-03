package com.zabbix.api.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.json.JSONObject;

import com.zabbix.api.domain.base.Trigger;
import com.zabbix.api.domain.trigger.TriggerAdddependenciesRequest;
import com.zabbix.api.domain.trigger.TriggerCreateRequest;
import com.zabbix.api.domain.trigger.TriggerDeleteRequest;
import com.zabbix.api.domain.trigger.TriggerDeletedependenciesRequest;
import com.zabbix.api.domain.trigger.TriggerExistsRequest;
import com.zabbix.api.domain.trigger.TriggerGetRequest;
import com.zabbix.api.domain.trigger.TriggerGetobjectsRequest;
import com.zabbix.api.domain.trigger.TriggerIsreadableRequest;
import com.zabbix.api.domain.trigger.TriggerIswritableRequest;
import com.zabbix.api.domain.trigger.TriggerUpdateRequest;
import com.zabbix.api.service.ITriggerService;
import com.zabbix.api.service.impl.TriggerServiceImpl;

public class TestTrigger extends TestCase {
	private static ITriggerService triggerService = new TriggerServiceImpl();
	static {
		// 登录
		new Util().login();
	}

	public void testAdddependencies() {
		// 数据准备
		TriggerAdddependenciesRequest adddependencies = new TriggerAdddependenciesRequest();

		adddependencies.getParams().setTriggerid("1714");
		adddependencies.getParams().setDependsOnTriggerid("977");

		triggerService.adddependencies(adddependencies);

	}

	public void testCreate() {
		// 数据准备
		TriggerCreateRequest create = new TriggerCreateRequest();

		create.getParams().setDescription("主机CPU使用率大于阀值20小于阀值80触发告警");
		create.getParams()
				.setExpression(
						"{Template OS Windows:system.cpu.util[,system].last()}>20&&{Template OS Windows:system.cpu.util[,system].last()}<80");
		create.getParams().setPriority(2);
		// Trigger t = new Trigger();
		// t.setTriggerid("977");
		// create.getParams().getDependencies().add(t);

		triggerService.create(create);

	}

	public void testDeletedependencies() {
		// 数据准备
		TriggerDeletedependenciesRequest deletedependencies = new TriggerDeletedependenciesRequest();

		Trigger t = new Trigger();
		t.setTriggerid("1714");

		deletedependencies.getParams().add(t);

		triggerService.deletedependencies(deletedependencies);

	}

	public void testDelete() {
		// 数据准备
		TriggerDeleteRequest delete = new TriggerDeleteRequest();

		delete.getParams().add("1714");

		JSONObject result = (JSONObject) triggerService.delete(delete);
		if (result.has("result")) {
		} else if (result.has("error")) {
		}

	}

	public void testExists() {
		// 数据准备
		TriggerExistsRequest exists = new TriggerExistsRequest();
		exists.getParams().setExpression(
				"{ALLMONI204_0.53:system.hostname.diff(0)}>0");

		triggerService.exists(exists);

	}

	public void testGetobjects() {
		// 数据准备
		TriggerGetobjectsRequest getobjects = new TriggerGetobjectsRequest();
		getobjects.getParams().setTriggerid("1714");
		triggerService.getobjects(getobjects);

	}

	public void testGet() {
		// 数据准备
		TriggerGetRequest get = new TriggerGetRequest();
		get.getParams().setOutput("extend");
		get.getParams().setSelectDependencies("10715");

		triggerService.get(get);
	}

	public void testGetTriggerBean() {
		// 数据准备
		TriggerGetRequest get = new TriggerGetRequest();
		get.getParams().setOutput("shorten");
		List<String> hostids = new ArrayList<String>();
		hostids.add("10715");
		get.getParams().setHostids(hostids);
		List<String> itemids = new ArrayList<String>();
		itemids.add("50969");
		get.getParams().setItemids(itemids);
		// List host = new ArrayList();
		// List status = new ArrayList();
		// host.add("Template OS Linux");
		// status.add(0);
		// get.getParams().getFilter().setHost(host);
		// get.getParams().getFilter().setStatus(status);
		// // get.getParams().setSelectDependencies("10010");
		// get.getParams().getSearch().setDescription("Too many processes on");
		List<Trigger> list = triggerService.getTriggerBean(get);
		System.out.println(list.size());

	}

	public void testIsreadable() {
		// 数据准备
		TriggerIsreadableRequest isreadable = new TriggerIsreadableRequest();
		isreadable.getParams().add("1714");
		triggerService.isreadable(isreadable);

	}

	public void testIswritable() {
		// 数据准备
		TriggerIswritableRequest iswritable = new TriggerIswritableRequest();
		iswritable.getParams().add("1714");
		triggerService.iswritable(iswritable);

	}

	public void testUpdate() {
		// 数据准备
		TriggerUpdateRequest update = new TriggerUpdateRequest();
		update.getParams().setTriggerid("13914");
		update.getParams().setDescription("linux_test_trigger1");
		update.getParams().setExpression(
				"{ALLMONI204_0.53:system.hostname.diff(0)}>0");
		//
		// Trigger t = new Trigger();
		// t.setTriggerid("977");
		// update.getParams().getDependencies().add(t);
		triggerService.update(update);
	}

	public void testaddTrigger() {
		Trigger trigger = new Trigger();
		trigger.setDescription("我的触发器");
		trigger.setExpression("{Template OS Windows:system.cpu.util[,system].last()}>20");
		trigger.setPriority(5);
		trigger.setStatus(0);
		triggerService.addTrigger(trigger);
	}
}