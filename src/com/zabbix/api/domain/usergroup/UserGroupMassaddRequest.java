package com.zabbix.api.domain.usergroup;
import java.util.*;

import com.zabbix.api.domain.base.Permission;
import com.zabbix.api.domain.base.RequestBase;
public class UserGroupMassaddRequest extends RequestBase{
	public UserGroupMassaddRequest() {
		super("usergroup.massadd");
	}
	private UserGroupMassaddParams params = new UserGroupMassaddParams();
	public void setParams(UserGroupMassaddParams params) {
		this.params = params;
	}
	public UserGroupMassaddParams getParams() {
		return params;
	}
	public static class UserGroupMassaddParams{
		private List<String> usrgrpids;
		private List<Permission> rights;
		private List<String> userids;
		public void setUsrgrpids(List<String> usrgrpids) {
			this.usrgrpids = usrgrpids;
		}
		public List<String> getUsrgrpids() {
			 if(usrgrpids==null){
				usrgrpids   = new ArrayList<String>();
				return usrgrpids;
			}
			 return usrgrpids;
		}
		public void setRights(List<Permission> rights) {
			this.rights = rights;
		}
		public List<Permission> getRights() {
			 if(rights==null){
				rights   = new ArrayList<Permission>();
				return rights;
			}
			 return rights;
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
