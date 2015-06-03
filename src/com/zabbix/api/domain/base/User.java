package com.zabbix.api.domain.base;

import java.util.List;
import com.zabbix.api.domain.base.Media;

/**
 * @ClassName: User
 * @Description: 用户实体
 * @author 李庆雷
 * @date 2013-9-23 下午1:45:52
 * @version V1.0
 */
public class User{
	private String userid;				//用户编号
	private String alias;				//别名
	private String passwd;				//密码
	private String attempt_clock;		//最近一次登录失败的时间
	private Integer attempt_failed;		//登录失败次数
	private String attempt_ip;			//登录失败的Ip
	private Integer autologin;			//是否自动登录（0是禁用，1是启用）
	private Integer autologout;			//会话持续时间（0为永不过期，默认900秒）
	private String lang;				//语言，默认为en_GB
	private String name;				//用户名称
	private Integer refresh;			//自动刷新（默认为30秒）
	private Integer rows_per_page;		//默认显示行数（默认为50）
	private String surname;				//姓
	private String theme;				//主题，Possible values:default - (default) system default;classic - Classic;originalblue - Original blue;darkblue - Black & Blue;darkorgange - Dark orange. 
	private Integer type;				//用户类型（1 - (default) Zabbix user; 2 - Zabbix admin; 3 - Zabbix super admin. ）
	private String url;					//登陆后的页面重定向url
	private List<UserGroup> groups;
	private List<Media> mideas;
	
	public List<UserGroup> getGroups() {
		return groups;
	}
	public void setGroups(List<UserGroup> groups) {
		this.groups = groups;
	}
	public List<Media> getMideas() {
		return mideas;
	}
	public void setMideas(List<Media> mideas) {
		this.mideas = mideas;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserid() {
		return userid;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getAlias() {
		return alias;
	}
	public void setAttempt_clock(String attempt_clock) {
		this.attempt_clock = attempt_clock;
	}
	public String getAttempt_clock() {
		return attempt_clock;
	}
	public void setAttempt_failed(Integer attempt_failed) {
		this.attempt_failed = attempt_failed;
	}
	public Integer getAttempt_failed() {
		return attempt_failed;
	}
	public void setAttempt_ip(String attempt_ip) {
		this.attempt_ip = attempt_ip;
	}
	public String getAttempt_ip() {
		return attempt_ip;
	}
	public void setAutologin(Integer autologin) {
		this.autologin = autologin;
	}
	public Integer getAutologin() {
		return autologin;
	}
	public void setAutologout(Integer autologout) {
		this.autologout = autologout;
	}
	public Integer getAutologout() {
		return autologout;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getLang() {
		return lang;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setRefresh(Integer refresh) {
		this.refresh = refresh;
	}
	public Integer getRefresh() {
		return refresh;
	}
	public void setRows_per_page(Integer rows_per_page) {
		this.rows_per_page = rows_per_page;
	}
	public Integer getRows_per_page() {
		return rows_per_page;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getSurname() {
		return surname;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getTheme() {
		return theme;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getType() {
		return type;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl() {
		return url;
	}
}
