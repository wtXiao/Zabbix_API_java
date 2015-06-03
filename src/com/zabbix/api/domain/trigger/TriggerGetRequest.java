package com.zabbix.api.domain.trigger;
import java.util.ArrayList;
import java.util.List;

import com.zabbix.api.domain.base.RequestBase;
import com.zabbix.api.domain.base.Trigger;
public class TriggerGetRequest extends RequestBase{
	public TriggerGetRequest() {
		super("trigger.get");
	}
	private TriggerGetParams params = new TriggerGetParams();
	public void setParams(TriggerGetParams params) {
		this.params = params;
	}
	public TriggerGetParams getParams() {
		return params;
	}
	public static class TriggerGetParams extends Trigger{
		private List<String> triggerids;
		private List<String> groupids;
		private List<String> templateids;
		private List<String> hostids;
		private List<String> itemids;
		private List<String> applicationids;
		private List<String> functions;
		private String group;
		private String host;
		private Boolean inherited;
		private Boolean templated;
		private Boolean monitored;
		private Boolean active;
		private Boolean maintenance;
		private Boolean withUnacknowledgedEvents;
		private Boolean withAcknowledgedEvents;
		private Boolean withLastEventUnacknowledged;
		private Boolean skipDependent;
		private String lastChangeSince;
		private String lastChangeTill;
		private Boolean only_true;
		private Integer min_severity;
		private Boolean expandData;
		private Boolean expandDescription;
		private Boolean expandExpression;
		private String selectGroups;
		private String selectHosts;
		private String selectItems;
		private String selectFunctions;
		private String selectDependencies;
		private String selectDiscoveryRule;
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
		private TriggerFilter filter = new TriggerFilter();
		private TriggerSerach search = new TriggerSerach();
		
		public static class TriggerSerach{
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
		
		public static class TriggerFilter{
			private List host;
			private List status;
            private String value;

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

			public List getStatus() {
				return status;
			}
			public void setStatus(List status) {
				this.status = status;
			}
			public List getHost() {
				return host;
			}
			public void setHost(List host) {
				this.host = host;
			}
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
		public void setHost(String host) {
			this.host = host;
		}
		public String getHost() {
			return host;
		}
		public void setInherited(Boolean inherited) {
			this.inherited = inherited;
		}
		public Boolean getInherited() {
			return inherited;
		}
		public void setTemplated(Boolean templated) {
			this.templated = templated;
		}
		public Boolean getTemplated() {
			return templated;
		}
		public void setMonitored(Boolean monitored) {
			this.monitored = monitored;
		}
		public Boolean getMonitored() {
			return monitored;
		}
		public void setActive(Boolean active) {
			this.active = active;
		}
		public Boolean getActive() {
			return active;
		}
		public void setMaintenance(Boolean maintenance) {
			this.maintenance = maintenance;
		}
		public Boolean getMaintenance() {
			return maintenance;
		}
		public void setWithUnacknowledgedEvents(Boolean withUnacknowledgedEvents) {
			this.withUnacknowledgedEvents = withUnacknowledgedEvents;
		}
		public Boolean getWithUnacknowledgedEvents() {
			return withUnacknowledgedEvents;
		}
		public void setWithAcknowledgedEvents(Boolean withAcknowledgedEvents) {
			this.withAcknowledgedEvents = withAcknowledgedEvents;
		}
		public Boolean getWithAcknowledgedEvents() {
			return withAcknowledgedEvents;
		}
		public void setWithLastEventUnacknowledged(Boolean withLastEventUnacknowledged) {
			this.withLastEventUnacknowledged = withLastEventUnacknowledged;
		}
		public Boolean getWithLastEventUnacknowledged() {
			return withLastEventUnacknowledged;
		}
		public void setSkipDependent(Boolean skipDependent) {
			this.skipDependent = skipDependent;
		}
		public Boolean getSkipDependent() {
			return skipDependent;
		}
		public void setLastChangeSince(String lastChangeSince) {
			this.lastChangeSince = lastChangeSince;
		}
		public String getLastChangeSince() {
			return lastChangeSince;
		}
		public void setLastChangeTill(String lastChangeTill) {
			this.lastChangeTill = lastChangeTill;
		}
		public String getLastChangeTill() {
			return lastChangeTill;
		}
		public void setOnly_true(Boolean only_true) {
			this.only_true = only_true;
		}
		public Boolean getOnly_true() {
			return only_true;
		}
		public void setMin_severity(Integer min_severity) {
			this.min_severity = min_severity;
		}
		public Integer getMin_severity() {
			return min_severity;
		}
		public void setExpandData(Boolean expandData) {
			this.expandData = expandData;
		}
		public Boolean getExpandData() {
			return expandData;
		}
		public void setExpandDescription(Boolean expandDescription) {
			this.expandDescription = expandDescription;
		}
		public Boolean getExpandDescription() {
			return expandDescription;
		}
		public void setExpandExpression(Boolean expandExpression) {
			this.expandExpression = expandExpression;
		}
		public Boolean getExpandExpression() {
			return expandExpression;
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
		public void setSelectFunctions(String selectFunctions) {
			this.selectFunctions = selectFunctions;
		}
		public String getSelectFunctions() {
			return selectFunctions;
		}
		public void setSelectDependencies(String selectDependencies) {
			this.selectDependencies = selectDependencies;
		}
		public String getSelectDependencies() {
			return selectDependencies;
		}
		public void setSelectDiscoveryRule(String selectDiscoveryRule) {
			this.selectDiscoveryRule = selectDiscoveryRule;
		}
		public String getSelectDiscoveryRule() {
			return selectDiscoveryRule;
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
		public TriggerFilter getFilter() {
			return filter;
		}
		public void setFilter(TriggerFilter filter) {
			this.filter = filter;
		}
		public TriggerSerach getSearch() {
			return search;
		}
		public void setSearch(TriggerSerach search) {
			this.search = search;
		}
	}
}
