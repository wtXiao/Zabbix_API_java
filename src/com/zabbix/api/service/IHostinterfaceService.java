package com.zabbix.api.service;
import java.util.List;

import com.zabbix.api.domain.base.HostInterface;
import com.zabbix.api.domain.hostinterface.HostInterfaceGetRequest;
/**
 * @ClassName: IHostinterfaceService
 * @Description: 设备接口接口（该接口可以获得设备ip,port,dns等信息）
 * @author 李庆雷
 * @date 2013-9-23 上午11:57:30
 */
public interface IHostinterfaceService {
	/**
	 * @Title: hostInterfaceGet
	 * @Description: 获取接口信息（json）
	 * @param hostInterfaceGet
	 * @return Object
	 * @throws
	 */
	public Object hostInterfaceGet(HostInterfaceGetRequest hostInterfaceGet);
	/**
	 * 
	 * @Title: getHostInterfaceBean
	 * @Description:  获取接口信息（bean）
	 * @param @param hostInterfaceGet
	 * @param @return  
	 * @return List<HostInterface>
	 * @throws
	 */
	public List<HostInterface> getHostInterfaceBean(HostInterfaceGetRequest hostInterfaceGet);
}
