package com.zabbix.api.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.zabbix.api.domain.base.Item;
import com.zabbix.api.domain.item.ItemCreateRequest;
import com.zabbix.api.domain.item.ItemDeleteRequest;
import com.zabbix.api.domain.item.ItemExistsRequest;
import com.zabbix.api.domain.item.ItemGetRequest;
import com.zabbix.api.domain.item.ItemGetobjectsRequest;
import com.zabbix.api.domain.item.ItemIsreadableRequest;
import com.zabbix.api.domain.item.ItemIswritableRequest;
import com.zabbix.api.domain.item.ItemUpdateRequest;
import com.zabbix.api.service.IHistoryService;
import com.zabbix.api.service.IItemService;
import com.zabbix.api.service.impl.HistoryServiceImpl;
import com.zabbix.api.service.impl.ItemServiceImpl;

public class TestItem extends TestCase {
	private static IItemService itemService = new ItemServiceImpl();
	private static IHistoryService historyService = new HistoryServiceImpl();

	static {
		// 登录
		new Util().login();
	}

	public void testCreate() {
		// 数据准备
		ItemCreateRequest create = new ItemCreateRequest();

		create.getParams().setName("Free disk space on $1");
		create.getParams().setKey_("vfs.fs.size[/home/joe/4,free]");
		create.getParams().setHostid("288");
		create.getParams().setType(0);
		create.getParams().setValue_type(3);
		// create.getParams().setInterfaceid("383");
		create.getParams().setDelay(30);

		itemService.create(create);

	}

	public void testDelete() {
		// 数据准备
		ItemDeleteRequest delete = new ItemDeleteRequest();

		delete.getParams().add("17139");

		itemService.delete(delete);

	}

	public void testExists() {
		// 数据准备
		ItemExistsRequest exists = new ItemExistsRequest();
		// exists.getParams().getHost().add("testName6");
		exists.getParams().getKey_().add("vfs.fs.size[/home/joe/,free]");
		itemService.exists(exists);

	}

	public void testGetobjects() {
		// 数据准备
		ItemGetobjectsRequest getobjects = new ItemGetobjectsRequest();
		getobjects.getParams().setItemid("17139");
		itemService.getobjects(getobjects);

	}

	public void testGet() {
		// 数据准备
		ItemGetRequest get = new ItemGetRequest();
		get.getParams().setOutput("extend");// shorten, refer, extend
		String[] hostids = { "10715" };
		get.getParams().setHostids(hostids);
		// get.getParams().setItemids("10009");
		get.getParams().getSearch().setKey_("pused");
		System.out.println(itemService.get(get));
	}

	public void testGetItemBean() {
		// 数据准备
		ItemGetRequest get = new ItemGetRequest();
		get.getParams().setOutput("extend");
		// String[] hostids = {"10084"};
		// get.getParams().setHostids(hostids);
		String[] itemids = { "36998" };
		get.getParams().setItemids(itemids);
		// String[] s = {"347"};
		// get.getParams().setApplicationids(s);
		// String[] keys = {"vm.memory.size[used]"};
		List<String> hosts = new ArrayList<String>();
		// List<String> keys = new ArrayList<String>();
		// hosts.add("192.168.155.21");
		// String name = "Used disk space on $1  (percentage)";
		// keys.add("vm.memory.size[used]");
		// keys.add("system.cpu.load[all,avg5]");
		// get.getParams().getSearch().setName(name);
		// get.getParams().getFilter().setHost(hosts);
		// get.getParams().getSearch().setKey_("system.cpu");
		// get.getParams().getSearch().setName("cpu");
		// get.getParams().setSearch(keys);
		List<Item> items = itemService.getItemToBean(get);
		if (items != null && items.size() > 0) {
			System.out.println(items.size());
			// for (Item item : items) {
			// System.out.println(item.getItemid());
			// }
		} else {
			System.out.println("查不到结果");
		}

	}

	public void testIsreadable() {
		// 数据准备
		ItemIsreadableRequest isreadable = new ItemIsreadableRequest();
		isreadable.getParams().add("17139");
		itemService.isreadable(isreadable);

	}

	public void testIswritable() {
		// 数据准备
		ItemIswritableRequest iswritable = new ItemIswritableRequest();
		iswritable.getParams().add("17139");
		itemService.iswritable(iswritable);

	}

	public void testUpdate() {
		// 数据准备
		ItemUpdateRequest update = new ItemUpdateRequest();

		update.getParams().setItemid("37814");
		// update.getParams().setName("DisFree disk space on $1");
		// update.getParams().setKey_("vfs.fs.size[/home/joe/,free]");
		// update.getParams().setHostid("137");
		// update.getParams().setType(0);
		// update.getParams().setValue_type(3);
		// update.getParams().setInterfaceid("108");
		update.getParams().setDelay(120);
		itemService.update(update);

	}
}