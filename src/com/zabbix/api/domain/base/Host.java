package com.zabbix.api.domain.base;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Host
 * @Description: Host是Zabbix监控的基本载体，所有的监控项都是基于host的
 * @author 李庆雷
 * @date 2013-9-23 下午1:42:31
 * @version V1.0
 */
public class Host{
	
	private List maintenances;              //维护对象
	private String hostid;                  //设备编号
	private String host;					//设备名称
	private Integer available;				//agent的可用性
	private String disable_until;			//最后一次发生错误的时间
	private String error;					//最后一次发生的错误
	private String errors_from;				//发生错误源
	private Integer ipmi_authtype;			//IPMI认证算法
	private Integer ipmi_available;			//IPMI可用性
	private String ipmi_disable_until;		//IPMI最后一次发生错误的时间
	private String ipmi_error;				//IPMI最后一次发生的错误
	private String ipmi_errors_from;		//IPMI发生错误源
	private String ipmi_password;			//IPMI密码
	private Integer ipmi_privilege;			//IPMI优先级
	private String ipmi_username;			//IPMI用户名
	private Integer jmx_available;			//JMX可用性
	private String jmx_disable_until;		//JMX最后一次发生错误的时间
	private String jmx_error;				//JMX最后一次发生的错误
	private String jmx_errors_from;			//JMX发生错误源
	private String maintenance_from;
	private Integer maintenance_status;		//维护的状态
	private Integer maintenance_type;		//维护的类型
	private String maintenanceid;			//维护的编号
	private String name;					//设备别名
	private String proxy_hostid;			//代理设备
	private Integer snmp_available;			//snmp可用性
	private String snmp_disable_until;		//snmp最后一次错误时间
	private String snmp_error;				//snmp最后一次发生的错误
	private String snmp_errors_from;		//snmp
	private Integer status;					//设备状态
	private Integer flags;
	private Integer templateid;
	
	public void setMaintenances(List maintenances) {
		this.maintenances = maintenances;
	}
	public List getMaintenances() {
		 if(maintenances==null){
			maintenances   = new ArrayList();
			return maintenances;
		}
		 return maintenances;
	}
	public void setHostid(String hostid) {
		this.hostid = hostid;
	}
	public String getHostid() {
		return hostid;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getHost() {
		return host;
	}
	public void setAvailable(Integer available) {
		this.available = available;
	}
	public Integer getAvailable() {
		return available;
	}
	public void setDisable_until(String disable_until) {
		this.disable_until = disable_until;
	}
	public String getDisable_until() {
		return disable_until;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getError() {
		return error;
	}
	public void setErrors_from(String errors_from) {
		this.errors_from = errors_from;
	}
	public String getErrors_from() {
		return errors_from;
	}
	public void setIpmi_authtype(Integer ipmi_authtype) {
		this.ipmi_authtype = ipmi_authtype;
	}
	public Integer getIpmi_authtype() {
		return ipmi_authtype;
	}
	public void setIpmi_available(Integer ipmi_available) {
		this.ipmi_available = ipmi_available;
	}
	public Integer getIpmi_available() {
		return ipmi_available;
	}
	public void setIpmi_disable_until(String ipmi_disable_until) {
		this.ipmi_disable_until = ipmi_disable_until;
	}
	public String getIpmi_disable_until() {
		return ipmi_disable_until;
	}
	public void setIpmi_error(String ipmi_error) {
		this.ipmi_error = ipmi_error;
	}
	public String getIpmi_error() {
		return ipmi_error;
	}
	public void setIpmi_errors_from(String ipmi_errors_from) {
		this.ipmi_errors_from = ipmi_errors_from;
	}
	public String getIpmi_errors_from() {
		return ipmi_errors_from;
	}
	public void setIpmi_password(String ipmi_password) {
		this.ipmi_password = ipmi_password;
	}
	public String getIpmi_password() {
		return ipmi_password;
	}
	public void setIpmi_privilege(Integer ipmi_privilege) {
		this.ipmi_privilege = ipmi_privilege;
	}
	public Integer getIpmi_privilege() {
		return ipmi_privilege;
	}
	public void setIpmi_username(String ipmi_username) {
		this.ipmi_username = ipmi_username;
	}
	public String getIpmi_username() {
		return ipmi_username;
	}
	public void setJmx_available(Integer jmx_available) {
		this.jmx_available = jmx_available;
	}
	public Integer getJmx_available() {
		return jmx_available;
	}
	public void setJmx_disable_until(String jmx_disable_until) {
		this.jmx_disable_until = jmx_disable_until;
	}
	public String getJmx_disable_until() {
		return jmx_disable_until;
	}
	public void setJmx_error(String jmx_error) {
		this.jmx_error = jmx_error;
	}
	public String getJmx_error() {
		return jmx_error;
	}
	public void setJmx_errors_from(String jmx_errors_from) {
		this.jmx_errors_from = jmx_errors_from;
	}
	public String getJmx_errors_from() {
		return jmx_errors_from;
	}
	public void setMaintenance_from(String maintenance_from) {
		this.maintenance_from = maintenance_from;
	}
	public String getMaintenance_from() {
		return maintenance_from;
	}
	public void setMaintenance_status(Integer maintenance_status) {
		this.maintenance_status = maintenance_status;
	}
	public Integer getMaintenance_status() {
		return maintenance_status;
	}
	public void setMaintenance_type(Integer maintenance_type) {
		this.maintenance_type = maintenance_type;
	}
	public Integer getMaintenance_type() {
		return maintenance_type;
	}
	public void setMaintenanceid(String maintenanceid) {
		this.maintenanceid = maintenanceid;
	}
	public String getMaintenanceid() {
		return maintenanceid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setProxy_hostid(String proxy_hostid) {
		this.proxy_hostid = proxy_hostid;
	}
	public String getProxy_hostid() {
		return proxy_hostid;
	}
	public void setSnmp_available(Integer snmp_available) {
		this.snmp_available = snmp_available;
	}
	public Integer getSnmp_available() {
		return snmp_available;
	}
	public void setSnmp_disable_until(String snmp_disable_until) {
		this.snmp_disable_until = snmp_disable_until;
	}
	public String getSnmp_disable_until() {
		return snmp_disable_until;
	}
	public void setSnmp_error(String snmp_error) {
		this.snmp_error = snmp_error;
	}
	public String getSnmp_error() {
		return snmp_error;
	}
	public void setSnmp_errors_from(String snmp_errors_from) {
		this.snmp_errors_from = snmp_errors_from;
	}
	public String getSnmp_errors_from() {
		return snmp_errors_from;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getStatus() {
		return status;
	}
	public Integer getTemplateid() {
		return templateid;
	}
	public void setTemplateid(Integer templateid) {
		this.templateid = templateid;
	}
	public Integer getFlags() {
		return flags;
	}
	public void setFlags(Integer flags) {
		this.flags = flags;
	}
}
