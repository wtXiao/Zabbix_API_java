package com.zabbix.api.test;


import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PutMethod;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

import com.zabbix.util.FormatData;


public class Util {
//	public static final String url = "http://192.168.3.211/allmoniapi/api_jsonrpc.php";
//	public static final String url = "http://192.168.153.163/zabbix/api_jsonrpc.php";
	public static final String url = "http://192.168.153.26/zabbix/api_jsonrpc.php";
	private static String loginName = "admin";
	private static String password = "zabbix";
	static{
		FormatData.API_URL = url;
	}
	/**
	 * 登录json
	 * 
	 * @return
	 */
	private static String loginJson(String loginName, String password) {
		JSONStringer js = new JSONStringer();
		try {
			js.object();
			js.key("jsonrpc").value("2.0");
			js.key("method").value("user.login");
			js.key("id").value(1);
			// js.key("auth").value(FormatData.auth);

			JSONObject jsonObject = new JSONObject();
			jsonObject.put("user", loginName);
			jsonObject.put("password", password);
			js.key("params").value(jsonObject);

			js.endObject();
		} catch (JSONException e) {
			return null;
		}
		return js.toString();
	}
	public static HttpClient login() {
		try {
			HttpClient client = new HttpClient();
			PutMethod putMethod = new PutMethod(url);
			putMethod.setRequestHeader("Content-Type", "application/json-rpc");
			String jsonrpc = loginJson(loginName, password);
			JSONObject jsonObj = new JSONObject(jsonrpc);
			
			putMethod.setRequestBody(FormatData.fromString(jsonObj.toString()));
			String loginResponse = "";
			client.executeMethod(putMethod);
			loginResponse = putMethod.getResponseBodyAsString();
			JSONObject obj = new JSONObject(loginResponse);
			String sessionId = "";

			if (obj.has("result")) {
				sessionId = obj.getString("result");
				
				FormatData.auth = sessionId; //
				// init();

				// IUserGroupService ius = new UserGroupServiceImpl();
				// ius.getAllUserGroup(); 
				// IHostGroupService ihs = new HostGroupServiceImpl();
				// ihs.getAllHostGroup(); // 
				System.out.println(loginResponse);
				System.out.println(sessionId);
				return client;
			} else if (obj.has("error")) {
				sessionId = obj.getJSONObject("error").getString("data");
				throw new Exception(sessionId);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) {
		HttpClient client = login();
	}
}
