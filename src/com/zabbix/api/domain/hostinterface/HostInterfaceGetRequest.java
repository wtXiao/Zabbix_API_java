package com.zabbix.api.domain.hostinterface;
import java.util.*;

import com.zabbix.api.domain.base.RequestBase;
import com.zabbix.api.domain.item.ItemGetRequest.ItemGetParams.ItemFilter;
public class HostInterfaceGetRequest extends RequestBase{
	public HostInterfaceGetRequest() {
		super("hostinterface.get");
	}
	private HostInterfaceGetParams params = new HostInterfaceGetParams();
	public void setParams(HostInterfaceGetParams params) {
		this.params = params;
	}
	public HostInterfaceGetParams getParams() {
		return params;
	}
	public static class HostInterfaceGetParams{
		private List<String> hostids;
		private List<String> interfaceids;
		private List<String> itemids;
		private List<String> triggerids;
		private String selectItems;
		private String selectHosts;
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
		private HostInterfaceFilter filter = new HostInterfaceFilter();
		
		public static class HostInterfaceFilter{
			private List ip;
			private List dns;
			public List getIp() {
				return ip;
			}
			public void setIp(List ip) {
				this.ip = ip;
			}
			public List getDns() {
				return dns;
			}
			public void setDns(List dns) {
				this.dns = dns;
			}
			
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
		public void setInterfaceids(List<String> interfaceids) {
			this.interfaceids = interfaceids;
		}
		public List<String> getInterfaceids() {
			 if(interfaceids==null){
				interfaceids   = new ArrayList<String>();
				return interfaceids;
			}
			 return interfaceids;
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
		public void setSelectItems(String selectItems) {
			this.selectItems = selectItems;
		}
		public String getSelectItems() {
			return selectItems;
		}
		public void setSelectHosts(String selectHosts) {
			this.selectHosts = selectHosts;
		}
		public String getSelectHosts() {
			return selectHosts;
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
		public HostInterfaceFilter getFilter() {
			return filter;
		}
		public void setFilter(HostInterfaceFilter filter) {
			this.filter = filter;
		}
	}
}
