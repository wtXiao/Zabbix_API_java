package com.zabbix.api.domain.user;
import java.util.ArrayList;
import java.util.List;

import com.zabbix.api.domain.base.Media;
import com.zabbix.api.domain.base.RequestBase;
import com.zabbix.api.domain.base.User;
public class UserCreateRequest extends RequestBase{
	public UserCreateRequest() {
		super("user.create");
	}
	private UserCreateParams params = new UserCreateParams();
	public void setParams(UserCreateParams params) {
		this.params = params;
	}
	public UserCreateParams getParams() {
		return params;
	}
	public static class UserCreateParams extends User{
		private String passwd;
		private List usrgrps;
		private List<Media> user_medias;
		public void setPasswd(String passwd) {
			this.passwd = passwd;
		}
		public String getPasswd() {
			return passwd;
		}
		public void setUsrgrps(List usrgrps) {
			this.usrgrps = usrgrps;
		}
		public List getUsrgrps() {
			 if(usrgrps==null){
				usrgrps   = new ArrayList();
				return usrgrps;
			}
			 return usrgrps;
		}
		public void setUser_medias(List<Media> user_medias) {
			this.user_medias = user_medias;
		}
		public List<Media> getUser_medias() {
			 if(user_medias==null){
				user_medias   = new ArrayList<Media>();
				return user_medias;
			}
			 return user_medias;
		}
	}
}
