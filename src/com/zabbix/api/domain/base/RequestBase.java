package com.zabbix.api.domain.base;

import com.zabbix.util.FormatData;

/**
 * @ClassName: RequestBase
 * @Description: 生成请求json字符串
 * @author 李庆雷
 * @date 2013-9-23 下午1:45:03
 * @version V1.0
 */
public class RequestBase {

	private String jsonrpc;
	private String method;
	private String auth;
	private int id;
	{
		jsonrpc = "2.0";
		id =1;
		auth = FormatData.auth;
	}
	public RequestBase(String method){
		
		this.method = method;
	}
	public String getJsonrpc() {
		return jsonrpc;
	}
	public void setJsonrpc(String jsonrpc) {
		this.jsonrpc = jsonrpc;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
