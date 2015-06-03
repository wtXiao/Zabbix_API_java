package com.zabbix.api.service;
import java.util.List;

import com.zabbix.api.domain.base.Item;
import com.zabbix.api.domain.item.ItemCreateRequest;
import com.zabbix.api.domain.item.ItemDeleteRequest;
import com.zabbix.api.domain.item.ItemExistsRequest;
import com.zabbix.api.domain.item.ItemGetRequest;
import com.zabbix.api.domain.item.ItemGetobjectsRequest;
import com.zabbix.api.domain.item.ItemIsreadableRequest;
import com.zabbix.api.domain.item.ItemIswritableRequest;
import com.zabbix.api.domain.item.ItemUpdateRequest;
/**
 * @ClassName: IItemService
 * @Description: 监控项接口
 * @author 李庆雷
 * @date 2013-9-23 下午12:00:51
 */
public interface IItemService {
	public Object create(ItemCreateRequest create);
	public Object delete(ItemDeleteRequest delete);
	public Object exists(ItemExistsRequest exists);
	public Object getobjects(ItemGetobjectsRequest getobjects);
	/**
	 * @Title: get
	 * @Description: 获取监控项信息（json）
	 * @param get
	 * @return Object
	 * @throws
	 */
	public Object get(ItemGetRequest get);
	
	/**
	 * @Title: getItemToBean
	 * @Description: 获取监控项信息（bean）
	 * @param get
	 * @return List<Item>
	 * @throws
	 */
	public List<Item> getItemToBean(ItemGetRequest get);
	public Object isreadable(ItemIsreadableRequest isreadable);
	public Object iswritable(ItemIswritableRequest iswritable);
	public Object update(ItemUpdateRequest update);
}
