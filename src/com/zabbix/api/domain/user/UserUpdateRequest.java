package com.zabbix.api.domain.user;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
import com.zabbix.api.domain.base.User;
public class UserUpdateRequest extends RequestBase{
	public UserUpdateRequest() {
		super("user.update");
	}
	private UserUpdateParams params = new UserUpdateParams();
	public void setParams(UserUpdateParams params) {
		this.params = params;
	}
	public UserUpdateParams getParams() {
		return params;
	}
	public static class UserUpdateParams extends User{
		private String passwd;
		private List<String> usrgrps;
		public void setPasswd(String passwd) {
			this.passwd = passwd;
		}
		public String getPasswd() {
			return passwd;
		}
		public void setUsrgrps(List<String> usrgrps) {
			this.usrgrps = usrgrps;
		}
		public List<String> getUsrgrps() {
			 if(usrgrps==null){
				usrgrps   = new ArrayList<String>();
				return usrgrps;
			}
			 return usrgrps;
		}
	}
}
