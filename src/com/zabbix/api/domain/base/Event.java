package com.zabbix.api.domain.base;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Event
 * @Description: 事件的实体类
 * @author 李庆雷
 * @date 2013-9-23 下午1:41:00
 * @version V1.0
 */
public class Event{
	private String eventid;				//事件编号
	private Integer acknowledged;		//是否已确认
	private Long clock;				//时间
	private Integer ns;					//事件创建的毫秒数
	private Integer object;				//0 - trigger;  1 - discovered host; 2 - discovered service; 3 - auto-registered host
	private String objectid;			//根据object的值对应的ID
	private Integer source;				//事件类型  0 - event created by a trigger; 1 - event created by a discovery rule; 2 - event created by active agent auto-registration. 
	private Integer value;				//值
	private List<Host> hosts = new ArrayList<Host>();
	private List<Trigger> triggers = new ArrayList<Trigger>();
	private List<Item> items = new ArrayList<Item>();
//	private Integer value_changed;		//值得变化    2.2.0版本中该属性已删除
	
	public void setEventid(String eventid) {
		this.eventid = eventid;
	}
	public List<Host> getHosts() {
		return hosts;
	}
	public void setHosts(List<Host> hosts) {
		this.hosts = hosts;
	}
	public List<Trigger> getTriggers() {
		return triggers;
	}
	public void setTriggers(List<Trigger> triggers) {
		this.triggers = triggers;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public String getEventid() {
		return eventid;
	}
	public void setAcknowledged(Integer acknowledged) {
		this.acknowledged = acknowledged;
	}
	public Integer getAcknowledged() {
		return acknowledged;
	}
	public void setClock(Long clock) {
		this.clock = clock;
	}
	public Long getClock() {
		return clock;
	}
	public void setNs(Integer ns) {
		this.ns = ns;
	}
	public Integer getNs() {
		return ns;
	}
	public void setObject(Integer object) {
		this.object = object;
	}
	public Integer getObject() {
		return object;
	}
	public void setObjectid(String objectid) {
		this.objectid = objectid;
	}
	public String getObjectid() {
		return objectid;
	}
	public void setSource(Integer source) {
		this.source = source;
	}
	public Integer getSource() {
		return source;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Integer getValue() {
		return value;
	}
//	public void setValue_changed(Integer value_changed) {
//		this.value_changed = value_changed;
//	}
//	public Integer getValue_changed() {
//		return value_changed;
//	}
}
