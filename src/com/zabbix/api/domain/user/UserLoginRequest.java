package com.zabbix.api.domain.user;
import com.zabbix.api.domain.base.RequestBase;
import com.zabbix.api.domain.base.User;
public class UserLoginRequest extends RequestBase{
	public UserLoginRequest() {
		super("user.login");
	}
	private UserLoginParamsParams params = new UserLoginParamsParams();
	public void setParams(UserLoginParamsParams params) {
		this.params = params;
	}
	public UserLoginParamsParams getParams() {
		return params;
	}
	public static class UserLoginParamsParams extends User{
		private String password;
		private String ser;
		private Boolean userData;
		public void setPassword(String password) {
			this.password = password;
		}
		public String getPassword() {
			return password;
		}
		public void setSer(String ser) {
			this.ser = ser;
		}
		public String getSer() {
			return ser;
		}
		public void setUserData(Boolean userData) {
			this.userData = userData;
		}
		public Boolean getUserData() {
			return userData;
		}
	}
}
