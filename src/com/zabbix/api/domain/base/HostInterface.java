package com.zabbix.api.domain.base;

/**
 * @ClassName: HostInterface
 * @Description: 接口，存放设备的ip，端口，和dns的实体类
 * @author 李庆雷
 * @date 2013-9-23 下午1:43:27
 * @version V1.0
 */
public class HostInterface{
	private String interfaceid;		//接口编号
	private String dns;				//dns地址
	private String hostid;			//设备编号
	private String ip;				//ip地址
	private Integer main;			//配置多个ip的先后顺序
	private String port;			//端口
	private Integer type;			//监控方式的类型
	private Integer useip;			//是否使用ip
	public void setInterfaceid(String interfaceid) {
		this.interfaceid = interfaceid;
	}
	public String getInterfaceid() {
		return interfaceid;
	}
	public void setDns(String dns) {
		this.dns = dns;
	}
	public String getDns() {
		return dns;
	}
	public void setHostid(String hostid) {
		this.hostid = hostid;
	}
	public String getHostid() {
		return hostid;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getIp() {
		return ip;
	}
	public void setMain(Integer main) {
		this.main = main;
	}
	public Integer getMain() {
		return main;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getPort() {
		return port;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getType() {
		return type;
	}
	public void setUseip(Integer useip) {
		this.useip = useip;
	}
	public Integer getUseip() {
		return useip;
	}
}
