package com.zabbix.api.domain.event;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
import com.zabbix.api.domain.host.HostGetRequest.HostGetParams.HostFilter;
public class EventGetRequest extends RequestBase{
	public EventGetRequest() {
		super("event.get");
	}
	private EventGetParams params = new EventGetParams();
	public void setParams(EventGetParams params) {
		this.params = params;
	}
	public EventGetParams getParams() {
		return params;
	}
	public static class EventGetParams{
		private List<String> eventids;
		private List<String> groupids;
		private List<String> hostids;
		private List<String> triggerids;
		private Integer object;
		private Integer source;
		private Boolean acknowledged;
		private List<Integer> value;
		private Long time_from;
		private Long time_till;
		private String eventid_from;
		private String eventid_till;
		private String selectHosts;
		private String selectItems;
		private String selectTriggers;
		private String select_alerts;
		private String select_acknowledges;
		private List<String> sortfield;
		private Boolean countOutput;
		private Boolean editable;
		private Boolean excludeSearch;
//		private Object filter;
		private Integer limit;
		private List<String> nodeids;
		private String output;
		private Boolean preservekeys;
		private Object search;
		private Boolean searchByAny;
		private Boolean searchWildcardsEnabled;
		private List<String> sortorder;
		private Boolean startSearch;
		private EventFilter filter = new EventFilter();
		public static class EventFilter{
			private List value;

			public List getValue() {
				return value;
			}

			public void setValue(List value) {
				this.value = value;
			}
		}
		public void setEventids(List<String> eventids) {
			this.eventids = eventids;
		}
		public List<String> getEventids() {
			 if(eventids==null){
				eventids   = new ArrayList<String>();
				return eventids;
			}
			 return eventids;
		}
		public void setGroupids(List<String> groupids) {
			this.groupids = groupids;
		}
		public List<String> getGroupids() {
			 if(groupids==null){
				groupids   = new ArrayList<String>();
				return groupids;
			}
			 return groupids;
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
		public void setTriggerids(List<String> triggerids) {
			this.triggerids = triggerids;
		}
		public List<String> getTriggerids() {
			 if(triggerids==null){
				triggerids   = new ArrayList<String>();
				return triggerids;
			}
			 return triggerids;
		}
		public void setObject(Integer object) {
			this.object = object;
		}
		public Integer getObject() {
			return object;
		}
		public void setSource(Integer source) {
			this.source = source;
		}
		public Integer getSource() {
			return source;
		}
		public void setAcknowledged(Boolean acknowledged) {
			this.acknowledged = acknowledged;
		}
		public Boolean getAcknowledged() {
			return acknowledged;
		}
		public void setValue(List<Integer> value) {
			this.value = value;
		}
		public List<Integer> getValue() {
			 if(value==null){
				value   = new ArrayList<Integer>();
				return value;
			}
			 return value;
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
		public void setEventid_from(String eventid_from) {
			this.eventid_from = eventid_from;
		}
		public String getEventid_from() {
			return eventid_from;
		}
		public void setEventid_till(String eventid_till) {
			this.eventid_till = eventid_till;
		}
		public String getEventid_till() {
			return eventid_till;
		}
		public void setSelectHosts(String selectHosts) {
			this.selectHosts = selectHosts;
		}
		public String getSelectHosts() {
			return selectHosts;
		}
		public void setSelectItems(String selectItems) {
			this.selectItems = selectItems;
		}
		public String getSelectItems() {
			return selectItems;
		}
		public void setSelectTriggers(String selectTriggers) {
			this.selectTriggers = selectTriggers;
		}
		public String getSelectTriggers() {
			return selectTriggers;
		}
		public void setSelect_alerts(String select_alerts) {
			this.select_alerts = select_alerts;
		}
		public String getSelect_alerts() {
			return select_alerts;
		}
		public void setSelect_acknowledges(String select_acknowledges) {
			this.select_acknowledges = select_acknowledges;
		}
		public String getSelect_acknowledges() {
			return select_acknowledges;
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
		public EventFilter getFilter() {
			return filter;
		}
		public void setFilter(EventFilter filter) {
			this.filter = filter;
		}
	}
}
