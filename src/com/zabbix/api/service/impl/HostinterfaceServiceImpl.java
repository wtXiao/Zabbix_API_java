package com.zabbix.api.service.impl;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.zabbix.api.domain.base.HostInterface;
import com.zabbix.api.domain.hostinterface.HostInterfaceGetRequest;
import com.zabbix.api.service.IHostinterfaceService;
import com.zabbix.util.FormatData;
/**
 * @ClassName: HostinterfaceServiceImpl
 * @Description: 设备接口接口实现
 * @author 李庆雷
 * @date 2013-9-23 下午1:09:14
 */
public class HostinterfaceServiceImpl implements IHostinterfaceService {
	private static Logger log = Logger.getLogger(HostinterfaceServiceImpl.class);
	/*
	 * Title: hostInterfaceGet
	 * Description: 获得设备接口信息（json）
	 * @param hostInterfaceGet
	 * @return Object
	 * @see com.zabbix.api.service.IHostinterfaceService#hostInterfaceGet(com.zabbix.api.domain.hostinterface.HostInterfaceGetRequest)
	 */
	public Object hostInterfaceGet(HostInterfaceGetRequest hostInterfaceGet){
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			String json = js.toJson(hostInterfaceGet);
			log.info("json request:"+json);
			putMethod.setRequestBody( FormatData.fromString(json));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			log.info("json response:"+response);
			 rs = new JSONObject(response);
//			 System.out.println(rs);
		}
		 catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	/*
	 * Title: getHostInterfaceBean
	 * Description:  获得设备接口信息（bean）
	 * @param hostInterfaceGet
	 * @return List<HostInterface>
	 * @see com.zabbix.api.service.IHostinterfaceService#getHostInterfaceBean(com.zabbix.api.domain.hostinterface.HostInterfaceGetRequest)
	 */
	@Override
	public List<HostInterface> getHostInterfaceBean(HostInterfaceGetRequest hostInterfaceGet) {
		List<HostInterface> interfaces = null;
		JSONObject result = (JSONObject) this.hostInterfaceGet(hostInterfaceGet);
		if(result!=null){
			if (result.has("result")) {
				try {
					JSONArray array = result.getJSONArray("result");
					if(array!=null&&array.length()>0){
						interfaces = new ArrayList<HostInterface>();
						for(int i=0;i<array.length();i++){
							HostInterface hostInterface = new HostInterface();
							JSONObject object = array.getJSONObject(i);
							hostInterface.setDns(object.getString("dns"));
							hostInterface.setHostid(object.getString("hostid"));
							hostInterface.setInterfaceid(object.getString("interfaceid"));
							hostInterface.setIp(object.getString("ip"));
							hostInterface.setMain(object.getInt("main"));
							hostInterface.setPort(object.getString("port"));
							hostInterface.setType(object.getInt("type"));
							hostInterface.setUseip(object.getInt("useip"));
							interfaces.add(hostInterface);
						}
					}
				} catch (JSONException e) {
					e.printStackTrace();
					return null;
				}
			 return interfaces;
			}else if (result.has("error")) {
				return null;
			}
		}
		return interfaces;
	}
	
	

}
