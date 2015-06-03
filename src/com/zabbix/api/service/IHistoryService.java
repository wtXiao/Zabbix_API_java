package com.zabbix.api.service;
import java.util.List;
import com.zabbix.api.domain.base.IntegerHistory;
import com.zabbix.api.domain.history.HistoryGetRequest;
/**
 * @ClassName: IHistoryService
 * @Description: 历史信息接口
 * @author 李庆雷
 * @date 2013-9-23 上午11:52:35
 */
public interface IHistoryService {
	/**
	 * @Title: get
	 * @Description: 获取历史信息（json）
	 * @param get
	 * @return Object
	 * @throws
	 */
	public Object get(HistoryGetRequest get);

	/**
	 * @param type 数据类型 
	 * @Title: getHistoryToBean
	 * @Description: 获取历史信息（bean）
	 * @param get
	 * @return List<IntegerHistory>
	 * @throws
	 */
	public List<IntegerHistory> getHistoryToBean(HistoryGetRequest get, int type);
}
