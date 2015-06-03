package com.zabbix.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PutMethod;
import org.json.JSONArray;
import org.json.JSONObject;

import com.zabbix.api.domain.base.User;

/**
 * 全局格式化数据类
 */
public class FormatData {
	public static String auth = ""; // 放返回一个sessionid
	public static String username = ""; // 放返回用户的名称
	public static User user; // 放返回用户
	public static Map<String, String> serverInfo = new HashMap<String, String>(); // 存放从文件中读取的连接数据库的信息
	public static Map<String, String> userInfo = new HashMap<String, String>(); // 存放从文件中读取的用户的信息关于记住密码
	// public static String API_URL =
	// "http://192.168.0.85/zabbix/api_jsonrpc.php"; // API的连接
	public static String API_URL ="" ;//"http://192.168.0.198/ywgunicloudsh/api_jsonrpc.php"; // API的连接，在接口中给它赋值
	public static String IP = ""; // 系统中用到的IP地址的地方都从这里取得
	public static String[] adAuth;
	public static String PASSWORD="";//登录用户的密码
	public static String[] colors={"#666699","#7DB5B1","#DE6F6A","#DA6B66","#8B9AA7","#B77BB6","#F75C5C","#E2736E","#9283A3","#7DB57D","#B4B57D","#AE8884","#7B799B","#996C73"};//深蓝色,浅红色,亮红
	public static String[] alarmcolors={"#BEBEBE","#99CC00","#FFFF00","#F1BA56","#F75C5C","#8B0000"};//未知,信息,警告,轻微,严重,灾难
//	public final static String[][] function = {
//			{ "最后两次值差值的绝对值<N", "最后两次值差值的绝对值>N", "最后两次值差值的绝对值=N",
//					"最后两次值差值的绝对值不等于N", "T时间内最后一次与之前一次的差值<N",
//					"T时间内最后一次与之前一次的差值>N", "T时间内最后一次与之前一次的差值=N",
//					"T时间内最后一次与之前一次的差值不等于N", "N=X，最后两次值不同时X为1，否则X为0",
//					"N不等于X，最后两次值不同时X为1，否则X为0", "前一个值<N", "前一个值>N", "前一个值=N",
//					"前一个值不等于N", "当前日期<N", "当前日期>N", "当前日期=N", "当前日期不等于N",
//					"一周的第几天<N", "一周的第几天>N", "一周的第几天=N", "一周的第几天不等于N",
//					"一个月的第几天<N", "一个月的第几天>N", "一个月的第几天=N", "一个月的第几天不等于N",
//					"最后一条日志的级别<N", "最后一条日志的级别>N", "最后一条日志的级别=N",
//					"最后一条日志的级别不等于N", "从元年至今的秒数<N", "从元年至今的秒数>N", "从元年至今的秒数=N",
//					"从元年至今的秒数不等于N", "当前时间<N", "当前时间>N", "当前时间=N", "当前时间不等于N",
//
//			},
//			{ "abschange(0)}<", "abschange(0)}>", "abschange(0)}=",
//					"abschange(0)}#", "change(0)}<", "change(0)}>",
//					"change(0)}=", "change(0)}#", "diff(0)}=", "diff(0)}#",
//					"prev(0)}<", "prev(0)}>", "prev(0)}=", "prev(0)}#",
//					"date(0)}<", "date(0)}>", "date(0)}=", "date(0)}#",
//					"dayofweek(0)}<", "dayofweek(0)}>", "dayofweek(0)}=",
//					"dayofweek(0)}#", "dayofmonth(0)}<", "dayofmonth(0)}>",
//					"dayofmonth(0)}=", "dayofmonth(0)}#", "logseverity(0)}<",
//					"logseverity(0)}>", "logseverity(0)}=", "logseverity(0)}#",
//					"now(0)}<", "now(0)}>", "now(0)}=", "now(0)}#",
//					"time(0)}<", "time(0)}>", "time(0)}=", "time(0)}#", } };
	public final static String function () throws Exception {
		JSONArray jArray=new JSONArray();
		JSONObject jObject=new JSONObject();
		try {
		jObject.put("key", "abschange(0)}<");
		jObject.put("value", "最后两次值差值的绝对值小于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "abschange(0)}>");
		jObject.put("value", "最后两次值差值的绝对值大于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "abschange(0)}=");
		jObject.put("value", "最后两次值差值的绝对值等于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "abschange(0)}#");
		jObject.put("value", "最后两次值差值的绝对值不等于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "change(0)}<");
		jObject.put("value", "T时间内最后一次与之前一次的差值小于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "change(0)}>");
		jObject.put("value", "T时间内最后一次与之前一次的差值大于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "change(0)}=");
		jObject.put("value", "T时间内最后一次与之前一次的差值等于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "change(0)}#");
		jObject.put("value", "T时间内最后一次与之前一次的差值不等于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "diff(0)}=");
		jObject.put("value", "N=X，最后两次值不同时X为1，否则X为0");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "diff(0)}#");
		jObject.put("value", "N不等于X，最后两次值不同时X为1，否则X为0");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "time(0)}#");
		jObject.put("value", "当前时间不等于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "time(0)}=");
		jObject.put("value", "当前时间等于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "time(0)}>");
		jObject.put("value", "当前时间大于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "time(0)}<");
		jObject.put("value", "当前时间小于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "now(0)}#");
		jObject.put("value", "从元年至今的秒数不等于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "now(0)}=");
		jObject.put("value", "从元年至今的秒数等于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "now(0)}>");
		jObject.put("value", "从元年至今的秒数大于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "now(0)}<");
		jObject.put("value", "从元年至今的秒数小于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "logseverity(0)}#");
		jObject.put("value", "最后一条日志的级别不等于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "logseverity(0)}=");
		jObject.put("value", "最后一条日志的级别等于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "logseverity(0)}>");
		jObject.put("value", "最后一条日志的级别大于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "logseverity(0)}<");
		jObject.put("value", "最后一条日志的级别小于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "dayofmonth(0)}#");
		jObject.put("value", "一个月的第几天不等于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "dayofmonth(0)}=");
		jObject.put("value", "一个月的第几天等于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "dayofmonth(0)}>");
		jObject.put("value", "一个月的第几天大于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "dayofmonth(0)}<");
		jObject.put("value", "一个月的第几天小于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "dayofweek(0)}#");
		jObject.put("value", "一周的第几天不等于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "dayofweek(0)}=");
		jObject.put("value", "一周的第几天等于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "dayofweek(0)}>");
		jObject.put("value", "一周的第几天大于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "dayofweek(0)}<");
		jObject.put("value", "一周的第几天小于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "date(0)}#");
		jObject.put("value", "当前日期不等于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "date(0)}=");
		jObject.put("value", "当前日期等于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "date(0)}>");
		jObject.put("value", "当前日期大于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "date(0)}<");
		jObject.put("value", "当前日期小于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "prev(0)}#");
		jObject.put("value", "前一个值不等于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "prev(0)}=");
		jObject.put("value", "前一个值等于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "prev(0)}>");
		jObject.put("value", "前一个值大于N");
		jArray.put(jObject);
		jObject=new JSONObject();
		jObject.put("key", "prev(0)}<");
		jObject.put("value", "前一个值小于N");
		jArray.put(jObject);
		
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return jArray.toString();
	}

	/********************************************************************************************/
	public static void setAPI_URL(String aPI_URL) {
		API_URL = aPI_URL;
	}

	public static InputStream fromString(String str)
			throws UnsupportedEncodingException {
		byte[] bytes = str.getBytes("UTF-8");
		return new ByteArrayInputStream(bytes);
	}

	public static String inputStream2String(InputStream is) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		InputStreamReader in = new InputStreamReader(is, "UTF-8");
		int i = -1;
		while ((i = in.read()) != -1) {
			baos.write(i);
		}
		return baos.toString();
	}

	public static ArrayList<String> getNameList(String[][] arr)
			throws IOException {
		ArrayList<String> name = new ArrayList<String>();
		for (int i = 0; i < arr[0].length; i++) {
			name.add(arr[0][i]);
		}
		return name;
	}

	public static String getValue(String[][] arr, int index) throws IOException {
		return arr[1][index];
	}
	
	public static String getPermissionRead(Map<String, List<String>> map){
			String hostGroupIDs="-1";
			
			//读写权限做的判断
			if(map.get("permissionReadOnly")!=null&&map.get("permissionReadOnly").size()>0){
				hostGroupIDs=hostGroupIDs+","+
						map.get("permissionReadOnly").toString().substring(1, map.get("permissionReadOnly").toString().indexOf("]"));
			}
			
		return hostGroupIDs;
	}
	
	public static String getPermissionReadAndWrite(Map<String, List<String>> map){
		String hostGroupIDs="-1";
		
		//读写权限做的判断
		
		if(map.get("permissionReadAndWrite")!=null&&map.get("permissionReadAndWrite").size()>0){
			hostGroupIDs=hostGroupIDs+","+
					map.get("permissionReadAndWrite").toString().substring(1, map.get("permissionReadAndWrite").toString().indexOf("]"));
		}
		
		if(map.get("permissionReadOnly")!=null&&map.get("permissionReadOnly").size()>0){
			hostGroupIDs=hostGroupIDs+","+
					map.get("permissionReadOnly").toString().substring(1, map.get("permissionReadOnly").toString().indexOf("]"));
		}
		
	return hostGroupIDs;
}
	
	public static String getPermissionWrite(Map<String, List<String>> map){
		String hostGroupIDs="-1";
		if(map.get("permissionReadAndWrite")!=null&&map.get("permissionReadAndWrite").size()>0){
			hostGroupIDs=hostGroupIDs+","+
					map.get("permissionReadAndWrite").toString().substring(1, map.get("permissionReadAndWrite").toString().indexOf("]"));
		}
		return hostGroupIDs;
	}
	
	public static String sqlite3_url="";
	
	public static String executeJsonSring(String json){
		System.out.println(json);
		try {
			HttpClient client = new HttpClient();
			PutMethod putMethod = new PutMethod(FormatData.API_URL);
			putMethod.setRequestHeader("Content-Type", "application/json-rpc");
			JSONObject jsonObj = new JSONObject(json);
			putMethod.setRequestBody(FormatData.fromString(jsonObj.toString()));
			String response = "";
			client.executeMethod(putMethod);
			response = putMethod.getResponseBodyAsString();
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			return "false";
		}
	};
}