package com.zabbix.api.service;
import java.util.List;

import com.zabbix.api.domain.base.Host;
import com.zabbix.api.domain.base.HostGroup;
import com.zabbix.api.domain.base.HostInterface;
import com.zabbix.api.domain.base.Template;
import com.zabbix.api.domain.host.HostCreateRequest;
import com.zabbix.api.domain.host.HostDeleteRequest;
import com.zabbix.api.domain.host.HostExistsRequest;
import com.zabbix.api.domain.host.HostGetRequest;
import com.zabbix.api.domain.host.HostGetobjectsRequest;
import com.zabbix.api.domain.host.HostIsreadableRequest;
import com.zabbix.api.domain.host.HostIswritableRequest;
import com.zabbix.api.domain.host.HostMassaddRequest;
import com.zabbix.api.domain.host.HostMassremoveRequest;
import com.zabbix.api.domain.host.HostMassupdateRequest;
import com.zabbix.api.domain.host.HostUpdateRequest;
/**
 * @ClassName: IHostService
 * @Description: 设备接口
 * @author 李庆雷
 * @date 2013-9-23 上午11:59:42
 */
public interface IHostService {
	public Object create(HostCreateRequest create);
	/**
	 * @Title: get
	 * @Description: 获取设备信息（json）
	 * @param get
	 * @return Object
	 * @throws
	 */
	public Object get(HostGetRequest get);
	
	/**
	 * @Title: getHostToBean
	 * @Description: 获取设备信息（bean）
	 * @param get
	 * @return List<Host>
	 * @throws
	 */
	public List<Host> getHostToBean(HostGetRequest get);
	String createHost(Host host, HostInterface hostInterface,
			HostGroup hostgroup, Template template);
	
	public Object delete(HostDeleteRequest delete);
	public Object exists(HostExistsRequest exists);
	public Object getobjects(HostGetobjectsRequest getobjects);
	public Object isreadable(HostIsreadableRequest isreadable);
	public Object iswritable(HostIswritableRequest iswritable);
	public Object massadd(HostMassaddRequest massadd);
	public Object massremove(HostMassremoveRequest massremove);
	public Object massupdate(HostMassupdateRequest massupdate);
	public Object update(HostUpdateRequest update);
	
}
