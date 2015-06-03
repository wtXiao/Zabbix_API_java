package com.zabbix.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PutMethod;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

public class ZabbixLoginUtil {
	public static String url = "";
	private static String loginName = "";
	private static String password = "";

	static {
		// EnvironmentUtil environmentUtil=
		// EnvironmentUtil.getInstance("zabbix_configinfos.properties");
		// try {
		// Properties properties = new Properties();
		// File file = new File("zabbix_configinfos.properties");
		// FileInputStream fis = new FileInputStream(file);
		// properties.load(fis);
		// fis.close();
		// FormatData.API_URL = (String) properties.get("url");
		// url = (String) properties.get("url");
		// loginName = (String) properties.get("loginName");
		// password = (String) properties.get("password");
		// } catch (IOException e) {
		// System.out.println("加载配置文件出错，错误信息："+e.getMessage());
		// }
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
			// InputStream sss =
			// ZabbixLoginUtil.class.getResourceAsStream("zabbix_configinfos.properties");
			Properties properties = new Properties();
			File file = new File("zabbix_configinfos.properties");
			System.out.println(file.getPath());
			FileInputStream fis = new FileInputStream(file);
			// FileInputStream fis = new
			// FileInputStream("zabbix_configinfos.properties");
			properties.load(fis);
			// fis.close();
			FormatData.API_URL = (String) properties.get("url");
			url = (String) properties.get("url");
			loginName = (String) properties.get("loginName");
			password = (String) properties.get("password");
			HttpClient client = new HttpClient();
			PutMethod putMethod = new PutMethod(url);
			putMethod.setRequestHeader("Content-Type", "application/json-rpc");
			String jsonrpc = loginJson(loginName, password);
			JSONObject jsonObj = new JSONObject(jsonrpc);
			// HttpClientParams httparams=new HttpClientParams();
			// httparams.setSoTimeout(100);
			// client.setParams(httparams);
			// client.setTimeout(60);
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
//		 HttpClient client = login();
		String filePath = System.getProperty("user.dir");
		System.out.println(filePath);
	}
}
