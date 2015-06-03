package com.zabbix.api.domain.media;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
public class MediaGetRequest extends RequestBase{
	public MediaGetRequest() {
		super("usermedia.get");
	}
	private MediaGetParams params = new MediaGetParams();
	public void setParams(MediaGetParams params) {
		this.params = params;
	}
	public MediaGetParams getParams() {
		return params;
	}
	public static class MediaGetParams{
		private List<String> mediaids;
		private List<String> usrgrpids;
		private List<String> userids;
		private List<String> mediatypeids;
		private List<String> sortfield;
		private Boolean countOutput;
		private Boolean editable;
		private Boolean excludeSearch;
		private Object filter;
		private Integer limit;
		private List<String> nodeids;
		private String output;
		private Boolean preservekeys;
		private Object search;
		private Boolean searchByAny;
		private Boolean searchWildcardsEnabled;
		private List<String> sortorder;
		private Boolean startSearch;
		public void setMediaids(List<String> mediaids) {
			this.mediaids = mediaids;
		}
		public List<String> getMediaids() {
			 if(mediaids==null){
				mediaids   = new ArrayList<String>();
				return mediaids;
			}
			 return mediaids;
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
		public void setMediatypeids(List<String> mediatypeids) {
			this.mediatypeids = mediatypeids;
		}
		public List<String> getMediatypeids() {
			 if(mediatypeids==null){
				mediatypeids   = new ArrayList<String>();
				return mediatypeids;
			}
			 return mediatypeids;
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
		public void setEditable(Boolean editable) {
			this.editable = editable;
		}
		public Boolean getEditable() {
			return editable;
		}
		public void setExcludeSearch(Boolean excludeSearch) {
			this.excludeSearch = excludeSearch;
		}
		public Boolean getExcludeSearch() {
			return excludeSearch;
		}
		public void setFilter(Object filter) {
			this.filter = filter;
		}
		public Object getFilter() {
			return filter;
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
		public void setSearchByAny(Boolean searchByAny) {
			this.searchByAny = searchByAny;
		}
		public Boolean getSearchByAny() {
			return searchByAny;
		}
		public void setSearchWildcardsEnabled(Boolean searchWildcardsEnabled) {
			this.searchWildcardsEnabled = searchWildcardsEnabled;
		}
		public Boolean getSearchWildcardsEnabled() {
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
	}
}
