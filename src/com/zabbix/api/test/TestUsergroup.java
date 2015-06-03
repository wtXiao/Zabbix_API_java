package com.zabbix.api.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.zabbix.api.domain.base.Permission;
import com.zabbix.api.domain.usergroup.UserGroupCreateRequest;
import com.zabbix.api.domain.usergroup.UserGroupDeleteRequest;
import com.zabbix.api.domain.usergroup.UserGroupExistsRequest;
import com.zabbix.api.domain.usergroup.UserGroupGetRequest;
import com.zabbix.api.domain.usergroup.UserGroupGetobjectsRequest;
import com.zabbix.api.domain.usergroup.UserGroupIsreadableRequest;
import com.zabbix.api.domain.usergroup.UserGroupIswritableRequest;
import com.zabbix.api.domain.usergroup.UserGroupMassaddRequest;
import com.zabbix.api.domain.usergroup.UserGroupMassupdateRequest;
import com.zabbix.api.domain.usergroup.UserGroupUpdateRequest;
import com.zabbix.api.service.IUsergroupService;
import com.zabbix.api.service.impl.UsergroupServiceImpl;

public class TestUsergroup extends TestCase {
	private static IUsergroupService usergroupService = new UsergroupServiceImpl();
	static {
		// 登录
		new Util().login();
	}

	public void testUserGroupCreate() {
		// 数据准备
		UserGroupCreateRequest userGroupCreate = new UserGroupCreateRequest();

		userGroupCreate.getParams().setName("testGroup15");
//		List<Permission> rights = new ArrayList<>();
//		Permission permission = new Permission();
//		permission.setId("16");
//		permission.setPermission(3);
//		rights.add(permission);
//		permission = new Permission();
//		permission.setId("15");
//		permission.setPermission(3);
//		rights.add(permission);
//		userGroupCreate.getParams().setRights(rights);
//		List<String> ids = new ArrayList<>();
//		ids.add("1");
//		ids.add("2");
//		userGroupCreate.getParams().setUserids(ids);

		usergroupService.userGroupCreate(userGroupCreate);

	}

	public void testUserGroupDelete() {
		// 数据准备
		UserGroupDeleteRequest userGroupDelete = new UserGroupDeleteRequest();

		userGroupDelete.getParams().add("26");
		userGroupDelete.getParams().add("27");

		usergroupService.userGroupDelete(userGroupDelete);

	}

	public void testUserGroupExists() {
		// 数据准备
		UserGroupExistsRequest userGroupExists = new UserGroupExistsRequest();

		List<String> ids = new ArrayList<String>();
		ids.add("testGroup10");
		userGroupExists.getParams().setName(ids);

		usergroupService.userGroupExists(userGroupExists);

	}

	public void testUserGroupGetobjects() {
		// 数据准备
		UserGroupGetobjectsRequest userGroupGetobjects = new UserGroupGetobjectsRequest();
		
		userGroupGetobjects.getParams().setName("test");
		
		
		usergroupService.userGroupGetobjects(userGroupGetobjects);

	}

	public void testUserGroupGet() {
		// 数据准备
		UserGroupGetRequest userGroupGet = new UserGroupGetRequest();
		
		userGroupGet.getParams().setOutput("shoren");
		List<String> names = new ArrayList<String>();
		names.add("Zabbix administrators");
		names.add("Enabled debug mode");
		userGroupGet.getParams().getFilter().setName(names);
		usergroupService.userGroupGet(userGroupGet);

	}

	public void testUserGroupIsreadable() {
		// 数据准备
		UserGroupIsreadableRequest userGroupIsreadable = new UserGroupIsreadableRequest();
//		List<String> ids = new ArrayList<>();
		userGroupIsreadable.getParams().add("12");
//		userGroupIsreadable.getParams().add("17");
		usergroupService.userGroupIsreadable(userGroupIsreadable);

	}

	public void testUserGroupIswritable() {
		// 数据准备
		UserGroupIswritableRequest userGroupIswritable = new UserGroupIswritableRequest();
		userGroupIswritable.getParams().add("12");
		usergroupService.userGroupIswritable(userGroupIswritable);

	}

	public void testUserGroupMassadd() {
		// 数据准备
		UserGroupMassaddRequest userGroupMassadd = new UserGroupMassaddRequest();
		
		userGroupMassadd.getParams().getUsrgrpids().add("25");
		Permission permission = new Permission();
		permission.setId("16");
		permission.setPermission(3);		
		userGroupMassadd.getParams().getRights().add(permission);		
		permission = new Permission();
		permission.setId("15");
		permission.setPermission(2);
		userGroupMassadd.getParams().getRights().add(permission);
		userGroupMassadd.getParams().getUserids().add("1");
		userGroupMassadd.getParams().getUserids().add("2");
		
		usergroupService.userGroupMassadd(userGroupMassadd);

	}

	public void testUserGroupMassupdate() {
		// 数据准备
		UserGroupMassupdateRequest userGroupMassupdate = new UserGroupMassupdateRequest();
		
		
		userGroupMassupdate.getParams().getUsrgrpids().add("25");
		Permission permission = new Permission();
		permission.setId("16");
		permission.setPermission(3);		
		userGroupMassupdate.getParams().getRights().add(permission);		
		permission = new Permission();
		permission.setId("15");
		permission.setPermission(3);
		userGroupMassupdate.getParams().getRights().add(permission);
		userGroupMassupdate.getParams().getUserids().add("1");
		
		usergroupService.userGroupMassupdate(userGroupMassupdate);

	}

	public void testUserGroupUpdate() {
		// 数据准备
		UserGroupUpdateRequest userGroupUpdate = new UserGroupUpdateRequest();
		userGroupUpdate.getParams().setUsrgrpid("30");
//		userGroupUpdate.getParams().setId("30");
		userGroupUpdate.getParams().setName("testGroup_testwei");
		List<Permission> rights = new ArrayList<Permission>();
		Permission permission = new Permission();
		permission.setId("16");
		permission.setPermission(3);
		rights.add(permission);
		permission = new Permission();
		permission.setId("15");
		permission.setPermission(3);
		rights.add(permission);
		userGroupUpdate.getParams().setRights(rights);
		List<String> ids = new ArrayList<String>();
		ids.add("1");
		userGroupUpdate.getParams().setUserids(ids);		
		usergroupService.userGroupUpdate(userGroupUpdate);

	}
}