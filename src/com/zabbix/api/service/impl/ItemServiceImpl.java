package com.zabbix.api.service.impl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.PostMethod;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.zabbix.api.domain.base.Item;
import com.zabbix.api.domain.item.ItemCreateRequest;
import com.zabbix.api.domain.item.ItemDeleteRequest;
import com.zabbix.api.domain.item.ItemExistsRequest;
import com.zabbix.api.domain.item.ItemGetRequest;
import com.zabbix.api.domain.item.ItemGetobjectsRequest;
import com.zabbix.api.domain.item.ItemIsreadableRequest;
import com.zabbix.api.domain.item.ItemIswritableRequest;
import com.zabbix.api.domain.item.ItemUpdateRequest;
import com.zabbix.api.service.IItemService;
import com.zabbix.util.FormatData;

/**
 * @ClassName: ItemServiceImpl
 * @Description: 监控项接口实现
 * @author 李庆雷
 * @date 2013-9-23 下午1:16:40
 */
public class ItemServiceImpl implements IItemService {
	
	public Object create(ItemCreateRequest create){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(create));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(create)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
			System.out.println(rs);
			if (rs.has("result")) {
				result = rs.get("result");
			}
			 else if (rs.has("error")) {
				result = rs.get("error");
			}
		}
		 catch (HttpException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
		 catch (JSONException e) {
			e.printStackTrace();
		}
		return result;
	}
	public Object delete(ItemDeleteRequest delete){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(delete));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(delete)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
			System.out.println(rs);
			if (rs.has("result")) {
				result = rs.get("result");
			}
			 else if (rs.has("error")) {
				result = rs.get("error");
			}
		}
		 catch (HttpException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
		 catch (JSONException e) {
			e.printStackTrace();
		}
		return result;
	}
	public Object exists(ItemExistsRequest exists){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(exists));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(exists)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
			System.out.println(rs);
			if (rs.has("result")) {
				result = rs.get("result");
			}
			 else if (rs.has("error")) {
				result = rs.get("error");
			}
		}
		 catch (HttpException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
		 catch (JSONException e) {
			e.printStackTrace();
		}
		return result;
	}

	public Object getobjects(ItemGetobjectsRequest getobjects){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(getobjects));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(getobjects)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
			System.out.println(rs);
			if (rs.has("result")) {
				result = rs.get("result");
			}
			 else if (rs.has("error")) {
				result = rs.get("error");
			}
		}
		 catch (HttpException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
		 catch (JSONException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/*
	 * Title: get
	 * Description: 获取监控项信息（json）
	 * @param get
	 * @return Object
	 * @see com.zabbix.api.service.IItemService#get(com.zabbix.api.domain.item.ItemGetRequest)
	 */
	public Object get(ItemGetRequest get){
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(get));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(get)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			 rs = new JSONObject(response);
			System.out.println(rs);
		}
		 catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	/*
	 * Title: getItemToBean
	 * Description: 获取监控项信息（bean）
	 * @param get
	 * @return List<Item>
	 * @see com.zabbix.api.service.IItemService#getItemToBean(com.zabbix.api.domain.item.ItemGetRequest)
	 */
	@Override
	public List<Item> getItemToBean(ItemGetRequest get) {
		JSONObject result = (JSONObject) this.get(get);
		List<Item> items = null;
		if (result.has("result")) {
			try {
				JSONArray array  = result.getJSONArray("result");
				if(array!=null&&array.length()>0){
					items = new ArrayList<Item>();
					for(int i=0;i<array.length();i++){
						JSONObject object = array.getJSONObject(i);
						Item item = new Item();
						item.setAuthtype(object.getInt("authtype"));
						item.setData_type(object.getInt("data_type"));
						item.setDelay(object.getInt("delay"));
						item.setDelay_flex(object.getString("delay_flex"));
						item.setDelta(object.getInt("delta"));
						if(object.getString("description").contains("$")){
							item.setDescription(replaceStr(object.getString("description"),object.getString("key_")));
						}else{
							item.setDescription(object.getString("description"));
						}
						item.setError(object.getString("error"));
						item.setFlags(object.getInt("flags"));
						item.setFormula(object.getInt("formula"));
						item.setHistory(object.getInt("history"));
						item.setHostid(object.getString("hostid"));
						item.setInterfaceid(object.getString("interfaceid"));
						item.setInventory_link(object.getInt("inventory_link"));
						item.setIpmi_sensor(object.getString("ipmi_sensor"));
						item.setItemid(object.getString("itemid"));
						item.setKey_(object.getString("key_"));
						item.setLastclock(object.getString("lastclock"));
			item.setLastns(object.getInt("lastns"));
			item.setLastvalue(object.getString("lastvalue"));
			item.setLogtimefmt(object.getString("logtimefmt"));
						item.setMultiplier(object.getInt("multiplier"));
						if(object.getString("name").contains("$")){
							item.setName(replaceStr(object.getString("name"),object.getString("key_")));
						}else{
							item.setName(object.getString("name"));
						}
						item.setParams(object.getString("params"));
						item.setPassword(object.getString("password"));
						item.setPort(object.getString("port"));
//			item.setPrevorgvalue(object.getString("prevorgvalue"));
			item.setPrevvalue(object.getString("prevvalue"));
						item.setPrivatekey(object.getString("privatekey"));
						item.setPublickey(object.getString("publickey"));
						item.setSnmp_community(object.getString("snmp_community"));
						item.setSnmp_oid(object.getString("snmp_oid"));
						item.setSnmpv3_authpassphrase(object.getString("snmpv3_authpassphrase"));
						item.setSnmpv3_privpassphrase(object.getString("snmpv3_privpassphrase"));
						item.setSnmpv3_securitylevel(object.getInt("snmpv3_securitylevel"));
						item.setSnmpv3_securityname(object.getString("snmpv3_securityname"));
						item.setStatus(object.getInt("status"));
						item.setTemplateid(object.getString("templateid"));
						item.setTrapper_hosts(object.getString("trapper_hosts"));
						item.setTrends(object.getInt("trends"));
						item.setType(object.getInt("type"));
						item.setUnits(object.getString("units"));
						item.setUsername(object.getString("username"));
						item.setValue_type(object.getInt("value_type"));
						item.setValuemapid(object.getString("valuemapid"));
						items.add(item);
					}
				}
			} catch (JSONException e) {
				e.printStackTrace();
				return null;
			}
			return items;
		}else if (result.has("error")) {
			 return null;
		}
		return items;
	}
	
	public Object isreadable(ItemIsreadableRequest isreadable){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(isreadable));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(isreadable)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
			System.out.println(rs);
			if (rs.has("result")) {
				result = rs.get("result");
			}
			 else if (rs.has("error")) {
				result = rs.get("error");
			}
		}
		 catch (HttpException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
		 catch (JSONException e) {
			e.printStackTrace();
		}
		return result;
	}
	public Object iswritable(ItemIswritableRequest iswritable){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(iswritable));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(iswritable)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
			System.out.println(rs);
			if (rs.has("result")) {
				result = rs.get("result");
			}
			 else if (rs.has("error")) {
				result = rs.get("error");
			}
		}
		 catch (HttpException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
		 catch (JSONException e) {
			e.printStackTrace();
		}
		return result;
	}
	public Object update(ItemUpdateRequest update){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(update));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(update)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
			System.out.println(rs);
		}
		 catch (HttpException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
		 catch (JSONException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	private String replaceStr(String str, String key) {
			try{
				String[] infoStr = null;
				if (key.contains("[")) { // 包含[]，说明有$符号产生
					infoStr = key.substring(key.indexOf("[")+1, key.lastIndexOf("]")).split(",");
				}
				for (int i=1;i<=infoStr.length;i++) {
					str = str.replace("$" + i, infoStr[i-1]);
				}
			}catch(Exception e) {
			}
			return str;
	}
	

}
