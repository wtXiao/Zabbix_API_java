package com.zabbix.api.domain.user;
import java.util.*;

import com.zabbix.api.domain.base.Host;
import com.zabbix.api.domain.base.RequestBase;
public class UserUpdateProfileRequest extends RequestBase{
	public UserUpdateProfileRequest() {
		super("user.updateprofile");
	}
	private UserUpdateProfileParams params = new UserUpdateProfileParams();
	public void setParams(UserUpdateProfileParams params) {
		this.params = params;
	}
	public UserUpdateProfileParams getParams() {
		return params;
	}
	public static class UserUpdateProfileParams extends Host{
		private String passwd;
		private List<String> userids;
		public void setPasswd(String passwd) {
			this.passwd = passwd;
		}
		public String getPasswd() {
			return passwd;
		}
		public void setUserids(List<String> userids) {
			this.userids = userids;
		}
		public List<String> getUserids() {
			 if(userids==null){
				userids   = new ArrayList<String>();
				return userids;
			}
			 return userids;
		}
	}
}
