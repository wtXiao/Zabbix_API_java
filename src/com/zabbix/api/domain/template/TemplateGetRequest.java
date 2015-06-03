package com.zabbix.api.domain.template;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
public class TemplateGetRequest extends RequestBase{
	public TemplateGetRequest() {
		super("template.get");
	}
	private TemplateGetParams params = new TemplateGetParams();
	public void setParams(TemplateGetParams params) {
		this.params = params;
	}
	public TemplateGetParams getParams() {
		return params;
	}
	public static class TemplateGetParams{
		private List<String> templateids;
		private List<String> groupids;
		private List<String> parentTemplateids;
		private List<String> hostids;
		private List<String> graphids;
		private List<String> itemids;
		private List<String> triggerids;
		private Boolean with_items;
		private Boolean with_triggers;
		private Boolean with_graphs;
		private String selectGroups;
		private String selectHosts;
		private String selectTemplates;
		private String selectParentTemplates;
		private String selectItems;
		private String selectDiscoveries;
		private String selectTriggers;
		private String selectGraphs;
		private String selectApplications;
		private String selectMacros;
		private String selectScreens;
		private Integer limitSelects;
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
		private TemplateFilter filter = new TemplateFilter();
		public static class TemplateFilter{
			private List host;

			public List getHost() {
				return host;
			}

			public void setHost(List host) {
				this.host = host;
			}
		}
		
		public void setTemplateids(List<String> templateids) {
			this.templateids = templateids;
		}
		public List<String> getTemplateids() {
			 if(templateids==null){
				templateids   = new ArrayList<String>();
				return templateids;
			}
			 return templateids;
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
		public void setParentTemplateids(List<String> parentTemplateids) {
			this.parentTemplateids = parentTemplateids;
		}
		public List<String> getParentTemplateids() {
			 if(parentTemplateids==null){
				parentTemplateids   = new ArrayList<String>();
				return parentTemplateids;
			}
			 return parentTemplateids;
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
		public void setGraphids(List<String> graphids) {
			this.graphids = graphids;
		}
		public List<String> getGraphids() {
			 if(graphids==null){
				graphids   = new ArrayList<String>();
				return graphids;
			}
			 return graphids;
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
		public void setWith_items(Boolean with_items) {
			this.with_items = with_items;
		}
		public Boolean getWith_items() {
			return with_items;
		}
		public void setWith_triggers(Boolean with_triggers) {
			this.with_triggers = with_triggers;
		}
		public Boolean getWith_triggers() {
			return with_triggers;
		}
		public void setWith_graphs(Boolean with_graphs) {
			this.with_graphs = with_graphs;
		}
		public Boolean getWith_graphs() {
			return with_graphs;
		}
		public void setSelectGroups(String selectGroups) {
			this.selectGroups = selectGroups;
		}
		public String getSelectGroups() {
			return selectGroups;
		}
		public void setSelectHosts(String selectHosts) {
			this.selectHosts = selectHosts;
		}
		public String getSelectHosts() {
			return selectHosts;
		}
		public void setSelectTemplates(String selectTemplates) {
			this.selectTemplates = selectTemplates;
		}
		public String getSelectTemplates() {
			return selectTemplates;
		}
		public void setSelectParentTemplates(String selectParentTemplates) {
			this.selectParentTemplates = selectParentTemplates;
		}
		public String getSelectParentTemplates() {
			return selectParentTemplates;
		}
		public void setSelectItems(String selectItems) {
			this.selectItems = selectItems;
		}
		public String getSelectItems() {
			return selectItems;
		}
		public void setSelectDiscoveries(String selectDiscoveries) {
			this.selectDiscoveries = selectDiscoveries;
		}
		public String getSelectDiscoveries() {
			return selectDiscoveries;
		}
		public void setSelectTriggers(String selectTriggers) {
			this.selectTriggers = selectTriggers;
		}
		public String getSelectTriggers() {
			return selectTriggers;
		}
		public void setSelectGraphs(String selectGraphs) {
			this.selectGraphs = selectGraphs;
		}
		public String getSelectGraphs() {
			return selectGraphs;
		}
		public void setSelectApplications(String selectApplications) {
			this.selectApplications = selectApplications;
		}
		public String getSelectApplications() {
			return selectApplications;
		}
		public void setSelectMacros(String selectMacros) {
			this.selectMacros = selectMacros;
		}
		public String getSelectMacros() {
			return selectMacros;
		}
		public void setSelectScreens(String selectScreens) {
			this.selectScreens = selectScreens;
		}
		public String getSelectScreens() {
			return selectScreens;
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
		public TemplateFilter getFilter() {
			return filter;
		}
		public void setFilter(TemplateFilter filter) {
			this.filter = filter;
		}
	}
}
