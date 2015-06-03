package com.zabbix.api.domain.mediatype;
import java.util.*;

import com.zabbix.api.domain.base.MediaType;
import com.zabbix.api.domain.base.RequestBase;
public class MediaTypeGetRequest extends RequestBase{
	public MediaTypeGetRequest() {
		super("mediatype.get");
	}
	private MediaTypeGetParams params = new MediaTypeGetParams();
	public void setParams(MediaTypeGetParams params) {
		this.params = params;
	}
	public MediaTypeGetParams getParams() {
		return params;
	}
	public static class MediaTypeGetParams extends MediaType{
		private List<String> mediatypeids;
		private List<String> mediaids;
		private List<String> userids;
		private String selectUsers;
		private List<String> sortfield;
		private Boolean countOutput;
		private Boolean editable;
		private Boolean excludeSearch;
		private Integer limit;
		private List<String> nodeids;
		private String output;
		private Boolean preservekeys;
		private Boolean searchByAny;
		private Boolean searchWildcardsEnabled;
		private List<String> sortorder;
		private Boolean startSearch;
		private MediaTypeFilter filter = new MediaTypeFilter();
		private MediaTypeSearch search = new MediaTypeSearch();
		
		public class MediaTypeSearch{
		    private String description;

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }
		}
		
		public class MediaTypeFilter{
		    private String description;

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }
		    
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
		public void setSelectUsers(String selectUsers) {
			this.selectUsers = selectUsers;
		}
		public String getSelectUsers() {
			return selectUsers;
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
        public MediaTypeFilter getFilter() {
            return filter;
        }
        public void setFilter(MediaTypeFilter filter) {
            this.filter = filter;
        }
        public MediaTypeSearch getSearch() {
            return search;
        }
        public void setSearch(MediaTypeSearch search) {
            this.search = search;
        }
	}
}
