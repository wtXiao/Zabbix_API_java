package com.zabbix.api.domain.action;
import java.util.*;

import com.zabbix.api.domain.base.Action;
import com.zabbix.api.domain.base.RequestBase;
public class ActionGetRequest extends RequestBase{
	public ActionGetRequest() {
		super("action.get");
	}
	private ActionGetParams params = new ActionGetParams();
	public void setParams(ActionGetParams params) {
		this.params = params;
	}
	public ActionGetParams getParams() {
		return params;
	}
	public static class ActionGetParams extends Action{
		private List<String> actionids;
		private List<String> groupids;
		private List<String> hostids;
		private List<String> triggerids;
		private List<String> mediatypeids;
		private List<String> usrgrpids;
		private List<String> userids;
		private List<String> scriptids;
		private String selectConditions;
		private String selectOperations;
		private List<String> sortfield;
		private Boolean countOutput;
		private Boolean editable;
		private Boolean excludeSearch;
//		private Object filter;
		private Integer limit;
		private List<String> nodeids;
		private String output;
		private Boolean preservekeys;
//		private Object search;
		private Boolean searchByAny;
		private Boolean searchWildcardsEnabled;
		private List<String> sortorder;
		private Boolean startSearch;
		private ActionFilter filter = new ActionFilter();
		private ActionSearch search = new ActionSearch();
		
		public static class ActionFilter{
			private List eventsource;
			private List evaltype;
			private List name;
			public List getEventsource() {
				return eventsource;
			}
			public void setEventsource(List eventsource) {
				this.eventsource = eventsource;
			}
			public List getEvaltype() {
				return evaltype;
			}
			public void setEvaltype(List evaltype) {
				this.evaltype = evaltype;
			}
			public List getName() {
				return name;
			}
			public void setName(List name) {
				this.name = name;
			}
			
		}
		public static class ActionSearch{
			private String eventsource;
			private String evaltype;
			private String name;
			public String getEventsource() {
				return eventsource;
			}
			public void setEventsource(String eventsource) {
				this.eventsource = eventsource;
			}
			public String getEvaltype() {
				return evaltype;
			}
			public void setEvaltype(String evaltype) {
				this.evaltype = evaltype;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			
		}
		
		public void setActionids(List<String> actionids) {
			this.actionids = actionids;
		}
		public List<String> getActionids() {
			 if(actionids==null){
				actionids   = new ArrayList<String>();
				return actionids;
			}
			 return actionids;
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
		public void setScriptids(List<String> scriptids) {
			this.scriptids = scriptids;
		}
		public List<String> getScriptids() {
			 if(scriptids==null){
				scriptids   = new ArrayList<String>();
				return scriptids;
			}
			 return scriptids;
		}
		public void setSelectConditions(String selectConditions) {
			this.selectConditions = selectConditions;
		}
		public String getSelectConditions() {
			return selectConditions;
		}
		public void setSelectOperations(String selectOperations) {
			this.selectOperations = selectOperations;
		}
		public String getSelectOperations() {
			return selectOperations;
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
		public ActionFilter getFilter() {
			return filter;
		}
		public void setFilter(ActionFilter filter) {
			this.filter = filter;
		}
		public ActionSearch getSearch() {
			return search;
		}
		public void setSearch(ActionSearch search) {
			this.search = search;
		}
	}
}
