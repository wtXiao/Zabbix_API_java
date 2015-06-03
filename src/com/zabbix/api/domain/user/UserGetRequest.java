package com.zabbix.api.domain.user;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
public class UserGetRequest extends RequestBase{
	public UserGetRequest() {
		super("user.get");
	}
	private UserGetParams params = new UserGetParams();
	public void setParams(UserGetParams params) {
		this.params = params;
	}
	public UserGetParams getParams() {
		return params;
	}
	public static class UserGetParams{
		private List<String>  mediaids;
		private List<String>  mediatypeids;
		private List<String>  usrgrpids;
		private List<String>  userids;
		private Boolean getAccess;
		private String selectMedias;
		private String selectMediatypes;
		private String selectUsrgrps;
		private List<String>  sortfield;
		private Boolean countOutput;
		private boolean editable;
		private Boolean excludeSearch;
		private Integer limit;
		private List<String> nodeids;
		private String output;
		private Boolean preservekeys;
		private Object search;
		private boolean searchByAny;
		private boolean searchWildcardsEnabled;
		private List<String> sortorder;
		private Boolean startSearch;
		public void setMediaids(List<String>  mediaids) {
			this.mediaids = mediaids;
		}
		public List<String>  getMediaids() {
			 if(mediaids==null){
				mediaids   = new ArrayList<String >();
				return mediaids;
			}
			 return mediaids;
		}
		public void setMediatypeids(List<String>  mediatypeids) {
			this.mediatypeids = mediatypeids;
		}
		public List<String>  getMediatypeids() {
			 if(mediatypeids==null){
				mediatypeids   = new ArrayList<String >();
				return mediatypeids;
			}
			 return mediatypeids;
		}
		public void setUsrgrpids(List<String>  usrgrpids) {
			this.usrgrpids = usrgrpids;
		}
		public List<String>  getUsrgrpids() {
			 if(usrgrpids==null){
				usrgrpids   = new ArrayList<String >();
				return usrgrpids;
			}
			 return usrgrpids;
		}
		public void setGetAccess(Boolean getAccess) {
			this.getAccess = getAccess;
		}
		public Boolean getGetAccess() {
			return getAccess;
		}
		public void setSelectMedias(String selectMedias) {
			this.selectMedias = selectMedias;
		}
		public String getSelectMedias() {
			return selectMedias;
		}
		public void setSelectMediatypes(String selectMediatypes) {
			this.selectMediatypes = selectMediatypes;
		}
		public String getSelectMediatypes() {
			return selectMediatypes;
		}
		public void setSelectUsrgrps(String selectUsrgrps) {
			this.selectUsrgrps = selectUsrgrps;
		}
		public String getSelectUsrgrps() {
			return selectUsrgrps;
		}
		public void setSortfield(List<String>  sortfield) {
			this.sortfield = sortfield;
		}
		public List<String>  getSortfield() {
			 if(sortfield==null){
				sortfield   = new ArrayList<String >();
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
		public void setSearch(Object search) {
			this.search = search;
		}
		public Object getSearch() {
			return search;
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
		public List<String> getUserids() {
			return userids;
		}
		public void setUserids(List<String> userids) {
			this.userids = userids;
		}
	}
}
