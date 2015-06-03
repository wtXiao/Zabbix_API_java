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
import com.zabbix.api.domain.base.IntegerHistory;
import com.zabbix.api.domain.history.HistoryGetRequest;
import com.zabbix.api.service.IHistoryService;
import com.zabbix.util.FormatData;
/**
 * @ClassName: HistoryServiceImpl
 * @Description: 历史信息实现
 * @author 李庆雷
 * @date 2013-9-23 下午12:04:13
 */
public class HistoryServiceImpl implements IHistoryService {
	private static Logger log = Logger.getLogger(HistoryServiceImpl.class);
	
	/*
	 * Title: get
	 * Description: 获取历史信息（json）
	 * @param get
	 * @return Object
	 * @see com.zabbix.api.service.IHistoryService#get(com.zabbix.api.domain.history.HistoryGetRequest)
	 */
	public Object get(HistoryGetRequest get){
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			String json = js.toJson(get);
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
	 * Title: getHistoryToBean
	 * Description: 获取历史信息（bean）
	 * @param get
	 * @return List<IntegerHistory>
	 * @see com.zabbix.api.service.IHistoryService#getHistoryToBean(com.zabbix.api.domain.history.HistoryGetRequest)
	 */
	@Override
	public List<IntegerHistory> getHistoryToBean(HistoryGetRequest get,int type) {
		JSONObject result = (JSONObject) this.get(get);
		List<IntegerHistory> histories = null;
		if (result.has("result")) {
			try {
				JSONArray array = result.getJSONArray("result");
				if(array!=null&&array.length()>0){
					histories = new ArrayList<IntegerHistory>();
					for(int i=0;i<array.length();i++){
						JSONObject object = array.getJSONObject(i);
						IntegerHistory history = new IntegerHistory();
						history.setClock(object.getString("clock"));
						history.setItemid(object.getString("itemid"));
						history.setNs(object.getInt("ns"));
						history.setValue(object.getString("value"));
						history.setType(type);
						histories.add(history);
						
					}
				}
			} catch (JSONException e) {
				e.printStackTrace();
				return null;
			}
			return histories;
		}else if (result.has("error")) {
			return null;
		}
		return histories;
	}
}
