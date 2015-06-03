package com.zabbix.api.domain.base;

/**
 * @ClassName: IntegerHistory
 * @Description: 历史数据
 * @author 李庆雷
 * @date 2013-9-23 下午1:44:03
 * @version V1.0
 */
public class IntegerHistory implements Comparable<IntegerHistory>{
	private String clock;	//采集时间
	private String itemid;	//监控项编号
	private Integer ns;		//采集时间的纳秒数
	private String value;	//值
	private Integer type;	//值的类型
	
	
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public void setClock(String clock) {
		this.clock = clock;
	}
	public String getClock() {
		return clock;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public String getItemid() {
		return itemid;
	}
	public void setNs(Integer ns) {
		this.ns = ns;
	}
	public Integer getNs() {
		return ns;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int compareTo(IntegerHistory o) {
		if(this.type==0){
			//return  (Double.parseDouble(o.getValue())).compareTo(Double.parseDouble(this.getValue()));
			Double a = Double.parseDouble(o.getValue());
			Double b = Double.parseDouble(this.getValue());
			return  (a).compareTo(b);
		}else if(this.type==3){
			Long a = Long.parseLong(o.getValue());
			Long b = Long.parseLong(this.getValue());
			return  (a).compareTo(b);
		}else{
			return  ((String)o.getValue()).compareTo((String)this.getValue());
		}
	}



}
