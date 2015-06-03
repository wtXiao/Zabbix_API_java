package com.zabbix.api.domain.hostgroup;
import java.util.*;

import com.zabbix.api.domain.base.HostGroup;
import com.zabbix.api.domain.base.RequestBase;
public class HostGroupGetRequest extends RequestBase{
	public HostGroupGetRequest() {
		super("hostgroup.get");
	}
	private HostGroupGetParams params = new HostGroupGetParams();
	public void setParams(HostGroupGetParams params) {
		this.params = params;
	}
	public HostGroupGetParams getParams() {
		return params;
	}
	public static class HostGroupGetParams extends HostGroup{
		private List<String> graphids ;
		private List<String> groupids;
		private String hostids;
		private List<String> maintenanceids;
		private Boolean monitored_hosts;
		private Boolean not_proxy_hosts;
		private Boolean real_hosts;
		private Boolean templated_hosts;
		private List<String> templateids;
		private List<String> triggerids;
		private Boolean with_applications;
		private Boolean with_graphs;
		private Boolean with_historical_items;
		private Boolean with_hosts_and_templates;
		private Boolean with_httptests;
		private Boolean with_items;
		private Boolean with_monitored_httptests;
		private Boolean with_monitored_items;
		private Boolean with_monitored_triggers;
		private Boolean with_simple_graph_items;
		private Boolean with_triggers;
		private String selectHosts;
		private String selectTemplates;
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
		private HostGroupFilter filter = new HostGroupFilter();
		
		public HostGroupFilter getFilter() {
			return filter;
		}
		public void setFilter(HostGroupFilter filter) {
			this.filter = filter;
		}
		public static class HostGroupFilter {
			private List name;

			public List getName() {
				return name;
			}

			public void setName(List name) {
				this.name = name;
			}
		}
		
		public void setGraphids (List<String> graphids ) {
			this.graphids  = graphids ;
		}
		public List<String> getGraphids () {
			 if(graphids ==null){
				graphids    = new ArrayList<String>();
				return graphids ;
			}
			 return graphids ;
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
		public void setHostids(String hostids) {
			this.hostids = hostids;
		}
		public String getHostids() {
			return hostids;
		}
		public void setMaintenanceids(List<String> maintenanceids) {
			this.maintenanceids = maintenanceids;
		}
		public List<String> getMaintenanceids() {
			 if(maintenanceids==null){
				maintenanceids   = new ArrayList<String>();
				return maintenanceids;
			}
			 return maintenanceids;
		}
		public void setMonitored_hosts(Boolean monitored_hosts) {
			this.monitored_hosts = monitored_hosts;
		}
		public Boolean getMonitored_hosts() {
			return monitored_hosts;
		}
		public void setNot_proxy_hosts(Boolean not_proxy_hosts) {
			this.not_proxy_hosts = not_proxy_hosts;
		}
		public Boolean getNot_proxy_hosts() {
			return not_proxy_hosts;
		}
		public void setReal_hosts(Boolean real_hosts) {
			this.real_hosts = real_hosts;
		}
		public Boolean getReal_hosts() {
			return real_hosts;
		}
		public void setTemplated_hosts(Boolean templated_hosts) {
			this.templated_hosts = templated_hosts;
		}
		public Boolean getTemplated_hosts() {
			return templated_hosts;
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
		public void setWith_applications(Boolean with_applications) {
			this.with_applications = with_applications;
		}
		public Boolean getWith_applications() {
			return with_applications;
		}
		public void setWith_graphs(Boolean with_graphs) {
			this.with_graphs = with_graphs;
		}
		public Boolean getWith_graphs() {
			return with_graphs;
		}
		public void setWith_historical_items(Boolean with_historical_items) {
			this.with_historical_items = with_historical_items;
		}
		public Boolean getWith_historical_items() {
			return with_historical_items;
		}
		public void setWith_hosts_and_templates(Boolean with_hosts_and_templates) {
			this.with_hosts_and_templates = with_hosts_and_templates;
		}
		public Boolean getWith_hosts_and_templates() {
			return with_hosts_and_templates;
		}
		public void setWith_httptests(Boolean with_httptests) {
			this.with_httptests = with_httptests;
		}
		public Boolean getWith_httptests() {
			return with_httptests;
		}
		public void setWith_items(Boolean with_items) {
			this.with_items = with_items;
		}
		public Boolean getWith_items() {
			return with_items;
		}
		public void setWith_monitored_httptests(Boolean with_monitored_httptests) {
			this.with_monitored_httptests = with_monitored_httptests;
		}
		public Boolean getWith_monitored_httptests() {
			return with_monitored_httptests;
		}
		public void setWith_monitored_items(Boolean with_monitored_items) {
			this.with_monitored_items = with_monitored_items;
		}
		public Boolean getWith_monitored_items() {
			return with_monitored_items;
		}
		public void setWith_monitored_triggers(Boolean with_monitored_triggers) {
			this.with_monitored_triggers = with_monitored_triggers;
		}
		public Boolean getWith_monitored_triggers() {
			return with_monitored_triggers;
		}
		public void setWith_simple_graph_items(Boolean with_simple_graph_items) {
			this.with_simple_graph_items = with_simple_graph_items;
		}
		public Boolean getWith_simple_graph_items() {
			return with_simple_graph_items;
		}
		public void setWith_triggers(Boolean with_triggers) {
			this.with_triggers = with_triggers;
		}
		public Boolean getWith_triggers() {
			return with_triggers;
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
	}
}
