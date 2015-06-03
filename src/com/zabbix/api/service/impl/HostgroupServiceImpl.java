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
import com.zabbix.api.domain.base.HostGroup;
import com.zabbix.api.domain.hostgroup.HostGroupCreateRequest;
import com.zabbix.api.domain.hostgroup.HostGroupDeleteRequest;
import com.zabbix.api.domain.hostgroup.HostGroupExistsRequest;
import com.zabbix.api.domain.hostgroup.HostGroupGetRequest;
import com.zabbix.api.domain.hostgroup.HostGroupGetobjectsRequest;
import com.zabbix.api.domain.hostgroup.HostGroupIsreadableRequest;
import com.zabbix.api.domain.hostgroup.HostGroupIswritableRequest;
import com.zabbix.api.domain.hostgroup.HostGroupMassaddRequest;
import com.zabbix.api.domain.hostgroup.HostGroupMassremoveRequest;
import com.zabbix.api.domain.hostgroup.HostGroupMassupdateRequest;
import com.zabbix.api.domain.hostgroup.HostGroupUpdateRequest;
import com.zabbix.api.service.IHostgroupService;
import com.zabbix.util.FormatData;
/**
 * @ClassName: HostgroupServiceImpl
 * @Description: 设备组接口实现
 * @author 李庆雷
 * @date 2013-9-23 下午12:08:10
 */
public class HostgroupServiceImpl implements IHostgroupService {
	
	
	public Object hostGroupCreate(HostGroupCreateRequest hostGroupCreate){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(hostGroupCreate));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(hostGroupCreate)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
			System.out.println(rs);
//			if (rs.has("result")) {
//				result = rs.get("result");
//			}
//			 else if (rs.has("error")) {
//				result = rs.get("error");
//			}
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
	public Object hostGroupDelete(HostGroupDeleteRequest hostGroupDelete){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(hostGroupDelete));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(hostGroupDelete)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
			System.out.println(rs);
//			if (rs.has("result")) {
//				result = rs.get("result");
//			}
//			 else if (rs.has("error")) {
//				result = rs.get("error");
//			}
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
	public Object hostGroupExists(HostGroupExistsRequest hostGroupExists){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(hostGroupExists));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(hostGroupExists)));
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
	public Object hostGroupGetobjects(HostGroupGetobjectsRequest hostGroupGetobjects){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(hostGroupGetobjects));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(hostGroupGetobjects)));
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
	 * Title: hostGroupGet
	 * Description: 获得设备组信息（json）
	 * @param hostGroupGet
	 * @return Object
	 * @see com.zabbix.api.service.IHostgroupService#hostGroupGet(com.zabbix.api.domain.hostgroup.HostGroupGetRequest)
	 */
	@SuppressWarnings("deprecation")
	public Object hostGroupGet(HostGroupGetRequest hostGroupGet){
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
//			System.out.println(js.toJson(hostGroupGet));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(hostGroupGet)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
//			System.out.println(response);
			 rs = new JSONObject(response);
		}
		 catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	/*
	 * Title: getHostGroupBean
	 * Description: 获得设备组信息（bean）
	 * @param hostGroupGet
	 * @return List<HostGroup>
	 * @see com.zabbix.api.service.IHostgroupService#getHostGroupBean(com.zabbix.api.domain.hostgroup.HostGroupGetRequest)
	 */
	@Override
	public List<HostGroup> getHostGroupBean(HostGroupGetRequest hostGroupGet) {
		JSONObject result = (JSONObject) this.hostGroupGet(hostGroupGet);
		List<HostGroup> hostGroups = null;
		if (result.has("result")){
			try {
				JSONArray array = result.getJSONArray("result");
				if(array!=null&&array.length()>0){
					hostGroups = new ArrayList<HostGroup>();
					for(int i=0;i<array.length();i++){
						JSONObject object = array.getJSONObject(i);
						HostGroup group = new HostGroup();
						group.setGroupid(object.getString("groupid"));
						group.setInternal(object.getInt("internal"));
						group.setName(object.getString("name"));
						hostGroups.add(group);
					}
				}
			} catch (JSONException e) {
				e.printStackTrace();
				return null;
			}
			return hostGroups;
		}
		 else if (result.has("error")) {
			 return null;
		}
		return hostGroups;
	}
	
	public Object hostGroupIsreadable(HostGroupIsreadableRequest hostGroupIsreadable){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(hostGroupIsreadable));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(hostGroupIsreadable)));
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
	public Object hostGroupIswritable(HostGroupIswritableRequest hostGroupIswritable){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(hostGroupIswritable));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(hostGroupIswritable)));
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
	public Object hostGroupMassadd(HostGroupMassaddRequest hostGroupMassadd){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(hostGroupMassadd));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(hostGroupMassadd)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
			System.out.println(rs);
//			if (rs.has("result")) {
//				result = rs.get("result");
//			}
//			 else if (rs.has("error")) {
//				result = rs.get("error");
//			}
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
	public Object hostGroupMassremove(HostGroupMassremoveRequest hostGroupMassremove){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(hostGroupMassremove));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(hostGroupMassremove)));
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
	public Object hostGroupMassupdate(HostGroupMassupdateRequest hostGroupMassupdate){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(hostGroupMassupdate));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(hostGroupMassupdate)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
			System.out.println(rs);
//			if (rs.has("result")) {
//				result = rs.get("result");
//			}
//			 else if (rs.has("error")) {
//				result = rs.get("error");
//			}
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
	public Object hostGroupUpdate(HostGroupUpdateRequest hostGroupUpdate){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(hostGroupUpdate));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(hostGroupUpdate)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
			System.out.println(rs);
//			if (rs.has("result")) {
//				result = rs.get("result");
//			}
//			 else if (rs.has("error")) {
//				result = rs.get("error");
//			}
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
}
