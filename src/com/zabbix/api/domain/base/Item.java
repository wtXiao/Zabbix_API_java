package com.zabbix.api.domain.base;

/**
 * @ClassName: Item
 * @Description: 监控项
 * @author 李庆雷
 * @date 2013-9-23 下午1:44:18
 * @version V1.0
 */
public class Item{
	private String itemid;		//监控项编号
	private Integer delay;		//监控周期
	private String hostid;		//设备编号
	private String interfaceid;	//接口编号
	private String key_;		//键
	private String name;		//监控项名称
	private Integer type;		//类型
	private Integer value_type;	//值类型
	private Integer authtype;	//认证方式
	private Integer data_type;	//数据类型
	private String delay_flex;
	private Integer delta;		//保存值
	private String description;	//描述
	private String error;		//错误信息
	private Integer flags;		//标记（0为普通监控项，1为发现监控项）
	private Integer formula;	//定制的乘数（默认为1）
	private Integer history;	//历史数据保存天数（默认为90天）
	private Integer inventory_link;
	private String ipmi_sensor;	//ipmi传感器
	private String lastclock;	//最后一次采集时间
	private Integer lastns;		//最后一次更新的纳秒数
	private String lastvalue;	//最后一次采集的值
	private String logtimefmt;	//日志时间的显示格式
	private Integer multiplier;	//日至最后一次更新的时间
	private String params;		//参数
	private String password;	//密码
	private String port;		//端口
//	private String prevorgvalue;//监控项上一次的原始数据
	private String prevvalue;	//监控项上一次的值
	private String privatekey;	//私有的密钥
	private String publickey;	//公有的密钥
	private String snmp_community;//snmp community
	private String snmp_oid;	  //snmp oid
	private String snmpv3_authpassphrase;//SNMPv3 auth密码
	private String snmpv3_privpassphrase;//SNMPv3 priv密码
	private Integer snmpv3_securitylevel;//SNMPv3 安全等级
	private String snmpv3_securityname;  //SNMPv3 安全名称
	private Integer status;				 //监控项状态（0：启用；1：禁用；3：不支持）
	private String templateid;			 //模板编号
	private String trapper_hosts;		 //允许的主机
	private Integer trends;				 //监控项统计数据的保存时间（默认365天）
	private String units;				 //单位
	private String username;		     //用户名 用于SSH、telnet和JMX
	private String valuemapid;			 //值趋势图的编号
	private Integer snmpv3_authprotocol;
	private Integer snmpv3_privprotocol;
	private Integer state;
	private String snmpv3_contextname;
	
	public Integer getSnmpv3_authprotocol() {
		return snmpv3_authprotocol;
	}
	public void setSnmpv3_authprotocol(Integer snmpv3_authprotocol) {
		this.snmpv3_authprotocol = snmpv3_authprotocol;
	}
	public Integer getSnmpv3_privprotocol() {
		return snmpv3_privprotocol;
	}
	public void setSnmpv3_privprotocol(Integer snmpv3_privprotocol) {
		this.snmpv3_privprotocol = snmpv3_privprotocol;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getSnmpv3_contextname() {
		return snmpv3_contextname;
	}
	public void setSnmpv3_contextname(String snmpv3_contextname) {
		this.snmpv3_contextname = snmpv3_contextname;
	}
	
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public String getItemid() {
		return itemid;
	}
	public void setDelay(Integer delay) {
		this.delay = delay;
	}
	public Integer getDelay() {
		return delay;
	}
	public void setHostid(String hostid) {
		this.hostid = hostid;
	}
	public String getHostid() {
		return hostid;
	}
	public void setInterfaceid(String interfaceid) {
		this.interfaceid = interfaceid;
	}
	public String getInterfaceid() {
		return interfaceid;
	}
	public void setKey_(String key_) {
		this.key_ = key_;
	}
	public String getKey_() {
		return key_;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getType() {
		return type;
	}
	public void setValue_type(Integer value_type) {
		this.value_type = value_type;
	}
	public Integer getValue_type() {
		return value_type;
	}
	public void setAuthtype(Integer authtype) {
		this.authtype = authtype;
	}
	public Integer getAuthtype() {
		return authtype;
	}
	public void setData_type(Integer data_type) {
		this.data_type = data_type;
	}
	public Integer getData_type() {
		return data_type;
	}
	public void setDelay_flex(String delay_flex) {
		this.delay_flex = delay_flex;
	}
	public String getDelay_flex() {
		return delay_flex;
	}
	public void setDelta(Integer delta) {
		this.delta = delta;
	}
	public Integer getDelta() {
		return delta;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getError() {
		return error;
	}
	public void setFlags(Integer flags) {
		this.flags = flags;
	}
	public Integer getFlags() {
		return flags;
	}
	public void setFormula(Integer formula) {
		this.formula = formula;
	}
	public Integer getFormula() {
		return formula;
	}
	public void setHistory(Integer history) {
		this.history = history;
	}
	public Integer getHistory() {
		return history;
	}
	public void setInventory_link(Integer inventory_link) {
		this.inventory_link = inventory_link;
	}
	public Integer getInventory_link() {
		return inventory_link;
	}
	public void setIpmi_sensor(String ipmi_sensor) {
		this.ipmi_sensor = ipmi_sensor;
	}
	public String getIpmi_sensor() {
		return ipmi_sensor;
	}
	public void setLastclock(String lastclock) {
		this.lastclock = lastclock;
	}
	public String getLastclock() {
		return lastclock;
	}
	public void setLastns(Integer lastns) {
		this.lastns = lastns;
	}
	public Integer getLastns() {
		return lastns;
	}
	public void setLastvalue(String lastvalue) {
		this.lastvalue = lastvalue;
	}
	public String getLastvalue() {
		return lastvalue;
	}
	public void setLogtimefmt(String logtimefmt) {
		this.logtimefmt = logtimefmt;
	}
	public String getLogtimefmt() {
		return logtimefmt;
	}
	public void setMultiplier(Integer multiplier) {
		this.multiplier = multiplier;
	}
	public Integer getMultiplier() {
		return multiplier;
	}
	public void setParams(String params) {
		this.params = params;
	}
	public String getParams() {
		return params;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getPort() {
		return port;
	}
//	public void setPrevorgvalue(String prevorgvalue) {
//		this.prevorgvalue = prevorgvalue;
//	}
//	public String getPrevorgvalue() {
//		return prevorgvalue;
//	}
	public void setPrevvalue(String prevvalue) {
		this.prevvalue = prevvalue;
	}
	public String getPrevvalue() {
		return prevvalue;
	}
	public void setPrivatekey(String privatekey) {
		this.privatekey = privatekey;
	}
	public String getPrivatekey() {
		return privatekey;
	}
	public void setPublickey(String publickey) {
		this.publickey = publickey;
	}
	public String getPublickey() {
		return publickey;
	}
	public void setSnmp_community(String snmp_community) {
		this.snmp_community = snmp_community;
	}
	public String getSnmp_community() {
		return snmp_community;
	}
	public void setSnmp_oid(String snmp_oid) {
		this.snmp_oid = snmp_oid;
	}
	public String getSnmp_oid() {
		return snmp_oid;
	}
	public void setSnmpv3_authpassphrase(String snmpv3_authpassphrase) {
		this.snmpv3_authpassphrase = snmpv3_authpassphrase;
	}
	public String getSnmpv3_authpassphrase() {
		return snmpv3_authpassphrase;
	}
	public void setSnmpv3_privpassphrase(String snmpv3_privpassphrase) {
		this.snmpv3_privpassphrase = snmpv3_privpassphrase;
	}
	public String getSnmpv3_privpassphrase() {
		return snmpv3_privpassphrase;
	}
	public void setSnmpv3_securitylevel(Integer snmpv3_securitylevel) {
		this.snmpv3_securitylevel = snmpv3_securitylevel;
	}
	public Integer getSnmpv3_securitylevel() {
		return snmpv3_securitylevel;
	}
	public void setSnmpv3_securityname(String snmpv3_securityname) {
		this.snmpv3_securityname = snmpv3_securityname;
	}
	public String getSnmpv3_securityname() {
		return snmpv3_securityname;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getStatus() {
		return status;
	}
	public void setTemplateid(String templateid) {
		this.templateid = templateid;
	}
	public String getTemplateid() {
		return templateid;
	}
	public void setTrapper_hosts(String trapper_hosts) {
		this.trapper_hosts = trapper_hosts;
	}
	public String getTrapper_hosts() {
		return trapper_hosts;
	}
	public void setTrends(Integer trends) {
		this.trends = trends;
	}
	public Integer getTrends() {
		return trends;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public String getUnits() {
		return units;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	public void setValuemapid(String valuemapid) {
		this.valuemapid = valuemapid;
	}
	public String getValuemapid() {
		return valuemapid;
	}
}
