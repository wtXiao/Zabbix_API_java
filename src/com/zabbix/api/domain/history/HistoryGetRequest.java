package com.zabbix.api.domain.history;
import java.sql.Timestamp;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
public class HistoryGetRequest extends RequestBase{
	public HistoryGetRequest() {
		super("history.get");
	}
	private HistoryGetParams params = new HistoryGetParams();
	public void setParams(HistoryGetParams params) {
		this.params = params;
	}
	public HistoryGetParams getParams() {
		return params;
	}
	public static class HistoryGetParams{
		private Integer history;
		private List<String> hostids;
		private List<String> itemids;
		private Long time_from;
		private Long time_till;
		private List<String> sortfield;
		private Boolean countOutput;
		private Boolean editable;
		private Boolean excludeSearch;
//		private Object filter;
		private Integer limit;
		private List<String> nodeids;
		private String output;
		private Object search;
		private Boolean searchByAny;
		private Boolean searchWildcardsEnabled;
		private List<String> sortorder;
		private Boolean startSearch;
		private HistoryFilter filter;
		public static class HistoryFilter{
			private List itemid;

			public List getItemid() {
				return itemid;
			}

			public void setItemid(List itemid) {
				this.itemid = itemid;
			}
		}
		
		public void setHistory(Integer history) {
			this.history = history;
		}
		public Integer getHistory() {
			return history;
		}
		public void setHostids(List<String> hostids) {
			this.hostids = hostids;
		}
		public List<String> getHostids() {
			 if(hostids==null){
				hostids   = new ArrayList<String>();
				return hostids;
			}
			 return hostids;
		}
		public void setItemids(List<String> itemids) {
			this.itemids = itemids;
		}
		public List<String> getItemids() {
			 if(itemids==null){
				itemids   = new ArrayList<String>();
				return itemids;
			}
			 return itemids;
		}
		

		public Long getTime_from() {
			return time_from;
		}
		public void setTime_from(Long time_from) {
			this.time_from = time_from;
		}
		public Long getTime_till() {
			return time_till;
		}
		public void setTime_till(Long time_till) {
			this.time_till = time_till;
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
		public HistoryFilter getFilter() {
			return filter;
		}
		public void setFilter(HistoryFilter filter) {
			this.filter = filter;
		}
	}
}
