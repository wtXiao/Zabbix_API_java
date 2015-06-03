package com.zabbix.api.domain.itemprototype;
import java.util.List;

import com.zabbix.api.domain.base.RequestBase;
public class ItemPrototypeGetRequest extends RequestBase{
	public ItemPrototypeGetRequest() {
		super("itemprototype.get");
	}
	private ItemPrototypeGetParams params = new ItemPrototypeGetParams();
	public void setParams(ItemPrototypeGetParams params) {
		this.params = params;
	}
	public ItemPrototypeGetParams getParams() {
		return params;
	}
	public static class ItemPrototypeGetParams{
		private String discoveryids;
		private String graphids;
		private String hostids;
		private Boolean inherited;
		private String itemids;
		private Boolean monitored;
		private Boolean templated;
		private String templateids;
		private String triggerids;
		private String selectApplications;
		private String selectGraphs;
		private String selectHosts;
		private String selectTriggers;
		private Integer limitSelects;
		private String sortfield;
		private Boolean countOutput;
		private Boolean editable;
		private Boolean excludeSearch;
//		private Object filter;
		private String nodeids;
		private String output;
		private Boolean preservekeys;
		private Object search;
		private Boolean searchByAny;
		private Boolean searchWildcardsEnabled;
		private String sortorder;
		private Boolean startSearch;
		private ItemPrototypeFilter filter = new ItemPrototypeFilter();
		
		public static class ItemPrototypeFilter{
			private List host;
			private List key_;
			public List getKey_() {
				return key_;
			}
			public void setKey_(List key_) {
				this.key_ = key_;
			}
			public List getHost() {
				return host;
			}
			public void setHost(List host) {
				this.host = host;
			}
		}
		
		public void setDiscoveryids(String discoveryids) {
			this.discoveryids = discoveryids;
		}
		public String getDiscoveryids() {
			return discoveryids;
		}
		public void setGraphids(String graphids) {
			this.graphids = graphids;
		}
		public String getGraphids() {
			return graphids;
		}
		public void setHostids(String hostids) {
			this.hostids = hostids;
		}
		public String getHostids() {
			return hostids;
		}
		public void setInherited(Boolean inherited) {
			this.inherited = inherited;
		}
		public Boolean getInherited() {
			return inherited;
		}
		public void setItemids(String itemids) {
			this.itemids = itemids;
		}
		public String getItemids() {
			return itemids;
		}
		public void setMonitored(Boolean monitored) {
			this.monitored = monitored;
		}
		public Boolean getMonitored() {
			return monitored;
		}
		public void setTemplated(Boolean templated) {
			this.templated = templated;
		}
		public Boolean getTemplated() {
			return templated;
		}
		public void setTemplateids(String templateids) {
			this.templateids = templateids;
		}
		public String getTemplateids() {
			return templateids;
		}
		public void setTriggerids(String triggerids) {
			this.triggerids = triggerids;
		}
		public String getTriggerids() {
			return triggerids;
		}
		public void setSelectApplications(String selectApplications) {
			this.selectApplications = selectApplications;
		}
		public String getSelectApplications() {
			return selectApplications;
		}
		public void setSelectGraphs(String selectGraphs) {
			this.selectGraphs = selectGraphs;
		}
		public String getSelectGraphs() {
			return selectGraphs;
		}
		public void setSelectHosts(String selectHosts) {
			this.selectHosts = selectHosts;
		}
		public String getSelectHosts() {
			return selectHosts;
		}
		public void setSelectTriggers(String selectTriggers) {
			this.selectTriggers = selectTriggers;
		}
		public String getSelectTriggers() {
			return selectTriggers;
		}
		public void setLimitSelects(Integer limitSelects) {
			this.limitSelects = limitSelects;
		}
		public Integer getLimitSelects() {
			return limitSelects;
		}
		public void setSortfield(String sortfield) {
			this.sortfield = sortfield;
		}
		public String getSortfield() {
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
		public void setNodeids(String nodeids) {
			this.nodeids = nodeids;
		}
		public String getNodeids() {
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
		public void setSortorder(String sortorder) {
			this.sortorder = sortorder;
		}
		public String getSortorder() {
			return sortorder;
		}
		public void setStartSearch(Boolean startSearch) {
			this.startSearch = startSearch;
		}
		public Boolean getStartSearch() {
			return startSearch;
		}
		public ItemPrototypeFilter getFilter() {
			return filter;
		}
		public void setFilter(ItemPrototypeFilter filter) {
			this.filter = filter;
		}
	}
}
