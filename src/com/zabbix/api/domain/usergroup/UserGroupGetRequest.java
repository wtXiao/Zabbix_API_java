package com.zabbix.api.domain.usergroup;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
public class UserGroupGetRequest extends RequestBase{
	public UserGroupGetRequest() {
		super("usergroup.get");
	}
	private UserGroupGetParams params = new UserGroupGetParams();
	public void setParams(UserGroupGetParams params) {
		this.params = params;
	}
	public UserGroupGetParams getParams() {
		return params;
	}
	public static class UserGroupGetParams{
		private Integer status;
		private List<String> userids;
		private List<String> usrgrpids;
		private Integer with_gui_access;
		private String selectUsers;
		private Integer limitSelects;
		private List<String> sortfield;
		private Boolean countOutput;
		private boolean editable;
		private Boolean excludeSearch;
		private Integer limit;
		private List<String> nodeids;
		private String output;
		private Boolean preservekeys;
		private boolean searchByAny;
		private boolean searchWildcardsEnabled;
		private List<String> sortorder;
		private Boolean startSearch;
		private UserGroupFilter filter = new UserGroupFilter();
		private UserGroupSearch search = new UserGroupSearch();
		
		public void setSearch(UserGroupSearch search) {
            this.search = search;
        }
        public class UserGroupSearch{
		    private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
		}
		
		public class UserGroupFilter{
		    private List<String> name;

            public List<String> getName() {
                return name;
            }

            public void setName(List<String> name) {
                this.name = name;
            }
		    
		}
		
		public void setStatus(Integer status) {
			this.status = status;
		}
		public Integer getStatus() {
			return status;
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
		public void setWith_gui_access(Integer with_gui_access) {
			this.with_gui_access = with_gui_access;
		}
		public Integer getWith_gui_access() {
			return with_gui_access;
		}
		public void setSelectUsers(String selectUsers) {
			this.selectUsers = selectUsers;
		}
		public String getSelectUsers() {
			return selectUsers;
		}
		public void setLimitSelects(Integer limitSelects) {
			this.limitSelects = limitSelects;
		}
		public Integer getLimitSelects() {
			return limitSelects;
		}
		public void setSortfield(List<String> sortfield) {
			this.sortfield = sortfield;
		}
		public List<String> getSortfield() {
			 if(sortfield==null){
				sortfield   = new ArrayList<String>();
				return sortfield;
			}
			 return sortfield;
		}
		public void setCountOutput(Boolean countOutput) {
			this.countOutput = countOutput;
		}
		public Boolean getCountOutput() {
			return countOutput;
		}
		public void setEditable(boolean editable) {
			this.editable = editable;
		}
		public boolean getEditable() {
			return editable;
		}
		public void setExcludeSearch(Boolean excludeSearch) {
			this.excludeSearch = excludeSearch;
		}
		public Boolean getExcludeSearch() {
			return excludeSearch;
		}
		public void setLimit(Integer limit) {
			this.limit = limit;
		}
		public Integer getLimit() {
			return limit;
		}
		public void setNodeids(List<String> nodeids) {
			this.nodeids = nodeids;
		}
		public List<String> getNodeids() {
			 if(nodeids==null){
				nodeids   = new ArrayList<String>();
				return nodeids;
			}
			 return nodeids;
		}
		public void setOutput(String output) {
			this.output = output;
		}
		public String getOutput() {
			return output;
		}
		public void setPreservekeys(Boolean preservekeys) {
			this.preservekeys = preservekeys;
		}
		public Boolean getPreservekeys() {
			return preservekeys;
		}
		
		public void setSearchByAny(boolean searchByAny) {
			this.searchByAny = searchByAny;
		}
		public boolean getSearchByAny() {
			return searchByAny;
		}
		public void setSearchWildcardsEnabled(boolean searchWildcardsEnabled) {
			this.searchWildcardsEnabled = searchWildcardsEnabled;
		}
		public boolean getSearchWildcardsEnabled() {
			return searchWildcardsEnabled;
		}
		public void setSortorder(List<String> sortorder) {
			this.sortorder = sortorder;
		}
		public List<String> getSortorder() {
			 if(sortorder==null){
				sortorder   = new ArrayList<String>();
				return sortorder;
			}
			 return sortorder;
		}
		public void setStartSearch(Boolean startSearch) {
			this.startSearch = startSearch;
		}
		public Boolean getStartSearch() {
			return startSearch;
		}
        public UserGroupFilter getFilter() {
            return filter;
        }
        public void setFilter(UserGroupFilter filter) {
            this.filter = filter;
        }
	}
}
