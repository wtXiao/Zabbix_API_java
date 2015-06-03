package com.zabbix.api.domain.triggerprototype;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
import com.zabbix.api.domain.trigger.TriggerGetRequest.TriggerGetParams.TriggerFilter;
import com.zabbix.api.domain.trigger.TriggerGetRequest.TriggerGetParams.TriggerSerach;
public class TriggerPrototypeGetRequest extends RequestBase{
	public TriggerPrototypeGetRequest() {
		super("triggerprototype.get");
	}
	private TriggerPrototypeGetParams params = new TriggerPrototypeGetParams();
	public void setParams(TriggerPrototypeGetParams params) {
		this.params = params;
	}
	public TriggerPrototypeGetParams getParams() {
		return params;
	}
	public static class TriggerPrototypeGetParams{
		private Boolean active;
		private List<String> applicationids;
		private List<String> discoveryids;
		private List<String> functions;
		private String group;
		private List<String> groupids;
		private String host;
		private List<String> hostids;
		private Boolean inherited;
		private Boolean maintenance;
		private Integer min_severity;
		private Boolean monitored;
		private Boolean templated;
		private List<String> templateids;
		private List<String> triggerids;
		private Boolean expandData;
		private Boolean expandExpression;
		private String selectDiscoveryRule;
		private String selectFunctions;
		private String selectGroups;
		private String selectHosts;
		private String selectItems;
//		private Object filter;
		private Integer limitSelects;
		private List<String> sortfield;
		private Boolean countOutput;
		private Boolean editable;
		private Boolean excludeSearch;
		private Integer limit;
		private List<String> nodeids;
		private String output;
		private Boolean preservekeys;
//		private Object search;
		private Boolean searchByAny;
		private Boolean searchWildcardsEnabled;
		private List<String> sortorder;
		private Boolean startSearch;
		private TriggerPrototypeFilter filter = new TriggerPrototypeFilter();
		private TriggerPrototypeSerach search = new TriggerPrototypeSerach();
		
		public static class TriggerPrototypeFilter{
			private List host;
			private List status;
			public List getHost() {
				return host;
			}
			public void setHost(List host) {
				this.host = host;
			}
			public List getStatus() {
				return status;
			}
			public void setStatus(List status) {
				this.status = status;
			}
		}
		
		public static class TriggerPrototypeSerach{
			private String description;
			private String expression;
			public String getDescription() {
				return description;
			}
			public void setDescription(String description) {
				this.description = description;
			}
			public String getExpression() {
				return expression;
			}
			public void setExpression(String expression) {
				this.expression = expression;
			}
		}
		
		public void setActive(Boolean active) {
			this.active = active;
		}
		public Boolean getActive() {
			return active;
		}
		public void setApplicationids(List<String> applicationids) {
			this.applicationids = applicationids;
		}
		public List<String> getApplicationids() {
			 if(applicationids==null){
				applicationids   = new ArrayList<String>();
				return applicationids;
			}
			 return applicationids;
		}
		public void setDiscoveryids(List<String> discoveryids) {
			this.discoveryids = discoveryids;
		}
		public List<String> getDiscoveryids() {
			 if(discoveryids==null){
				discoveryids   = new ArrayList<String>();
				return discoveryids;
			}
			 return discoveryids;
		}
		public void setFunctions(List<String> functions) {
			this.functions = functions;
		}
		public List<String> getFunctions() {
			 if(functions==null){
				functions   = new ArrayList<String>();
				return functions;
			}
			 return functions;
		}
		public void setGroup(String group) {
			this.group = group;
		}
		public String getGroup() {
			return group;
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
		public void setHost(String host) {
			this.host = host;
		}
		public String getHost() {
			return host;
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
		public void setInherited(Boolean inherited) {
			this.inherited = inherited;
		}
		public Boolean getInherited() {
			return inherited;
		}
		public void setMaintenance(Boolean maintenance) {
			this.maintenance = maintenance;
		}
		public Boolean getMaintenance() {
			return maintenance;
		}
		public void setMin_severity(Integer min_severity) {
			this.min_severity = min_severity;
		}
		public Integer getMin_severity() {
			return min_severity;
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
		public void setExpandData(Boolean expandData) {
			this.expandData = expandData;
		}
		public Boolean getExpandData() {
			return expandData;
		}
		public void setExpandExpression(Boolean expandExpression) {
			this.expandExpression = expandExpression;
		}
		public Boolean getExpandExpression() {
			return expandExpression;
		}
		public void setSelectDiscoveryRule(String selectDiscoveryRule) {
			this.selectDiscoveryRule = selectDiscoveryRule;
		}
		public String getSelectDiscoveryRule() {
			return selectDiscoveryRule;
		}
		public void setSelectFunctions(String selectFunctions) {
			this.selectFunctions = selectFunctions;
		}
		public String getSelectFunctions() {
			return selectFunctions;
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
		public void setSelectItems(String selectItems) {
			this.selectItems = selectItems;
		}
		public String getSelectItems() {
			return selectItems;
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
		public TriggerPrototypeFilter getFilter() {
			return filter;
		}
		public void setFilter(TriggerPrototypeFilter filter) {
			this.filter = filter;
		}
		public TriggerPrototypeSerach getSearch() {
			return search;
		}
		public void setSearch(TriggerPrototypeSerach search) {
			this.search = search;
		}
	}
}
