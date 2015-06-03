package com.zabbix.api.service;
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
public interface IUsergroupService {
	public Object userGroupCreate(UserGroupCreateRequest userGroupCreate);
	public Object userGroupDelete(UserGroupDeleteRequest userGroupDelete);
	public Object userGroupExists(UserGroupExistsRequest userGroupExists);
	public Object userGroupGetobjects(UserGroupGetobjectsRequest userGroupGetobjects);
	public Object userGroupGet(UserGroupGetRequest userGroupGet);
	public Object userGroupIsreadable(UserGroupIsreadableRequest userGroupIsreadable);
	public Object userGroupIswritable(UserGroupIswritableRequest userGroupIswritable);
	public Object userGroupMassadd(UserGroupMassaddRequest userGroupMassadd);
	public Object userGroupMassupdate(UserGroupMassupdateRequest userGroupMassupdate);
	public Object userGroupUpdate(UserGroupUpdateRequest userGroupUpdate);
}
