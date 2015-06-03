package com.zabbix.api.domain.application;

import java.util.ArrayList;
import java.util.List;

import com.zabbix.api.domain.base.RequestBase;

public class ApplicationGetRequest extends RequestBase {

    public ApplicationGetRequest() {
        super("application.get");
    }

    private ApplicationGetParams params = new ApplicationGetParams();

    public ApplicationGetParams getParams() {
        return params;
    }

    public void setParams(ApplicationGetParams params) {
        this.params = params;
    }

    public static class ApplicationGetParams {
        private List<String> applicationids;
        private List<String> groupids;
        private List<String> hostids;
        private List<String> itemids;
        private List<String> templateids;
        private String selectHosts;
        private String selectItems;
        private String output;
        private Boolean inherited;
        private Boolean templated;
        private Boolean preservekeys;
        private Object search;
        private Boolean searchByAny;
        private Boolean searchWildcardsEnabled;
        private List<String> sortorder;
        private Boolean startSearch;
        private List<String> sortfield;
        private Boolean countOutput;
        private Boolean editable;
        private Boolean excludeSearch;
        private Integer limit;
        private ApplicationFilter filter = new ApplicationFilter();

        public static class ApplicationFilter {
            private List<String> name = new ArrayList<String>();;

            public List<String> getName() {
                return name;
            }

            public void setName(List<String> name) {
                this.name = name;
            }

        }

        public List<String> getApplicationids() {
            if (applicationids == null) {
                applicationids = new ArrayList<String>();
            }
            return applicationids;
        }

        public void setApplicationids(List<String> applicationids) {
            this.applicationids = applicationids;
        }

        public List<String> getGroupids() {
            if (groupids == null) {
                groupids = new ArrayList<String>();
            }
            return groupids;
        }

        public void setGroupids(List<String> groupids) {
            this.groupids = groupids;
        }

        public List<String> getHostids() {
            if (hostids == null) {
                hostids = new ArrayList<String>();
            }
            return hostids;
        }

        public void setHostids(List<String> hostids) {
            this.hostids = hostids;
        }

        public List<String> getItemids() {
            if (itemids == null) {
                itemids = new ArrayList<String>();
            }
            return itemids;
        }

        public void setItemids(List<String> itemids) {
            this.itemids = itemids;
        }

        public List<String> getTemplateids() {
            if (templateids == null) {
                templateids = new ArrayList<String>();
            }
            return templateids;
        }

        public void setTemplateids(List<String> templateids) {
            this.templateids = templateids;
        }

        public String getSelectHosts() {
            return selectHosts;
        }

        public void setSelectHosts(String selectHosts) {
            this.selectHosts = selectHosts;
        }

        public String getSelectItems() {
            return selectItems;
        }

        public void setSelectItems(String selectItems) {
            this.selectItems = selectItems;
        }

        public String getOutput() {
            return output;
        }

        public void setOutput(String output) {
            this.output = output;
        }

        public Boolean getInherited() {
            return inherited;
        }

        public void setInherited(Boolean inherited) {
            this.inherited = inherited;
        }

        public Boolean getTemplated() {
            return templated;
        }

        public void setTemplated(Boolean templated) {
            this.templated = templated;
        }

        public Boolean getPreservekeys() {
            return preservekeys;
        }

        public void setPreservekeys(Boolean preservekeys) {
            this.preservekeys = preservekeys;
        }

        public Object getSearch() {
            return search;
        }

        public void setSearch(Object search) {
            this.search = search;
        }

        public Boolean getSearchByAny() {
            return searchByAny;
        }

        public void setSearchByAny(Boolean searchByAny) {
            this.searchByAny = searchByAny;
        }

        public Boolean getSearchWildcardsEnabled() {
            return searchWildcardsEnabled;
        }

        public void setSearchWildcardsEnabled(Boolean searchWildcardsEnabled) {
            this.searchWildcardsEnabled = searchWildcardsEnabled;
        }

        public List<String> getSortorder() {
            if (sortorder == null) {
                sortorder = new ArrayList<String>();
            }
            return sortorder;
        }

        public void setSortorder(List<String> sortorder) {
            this.sortorder = sortorder;
        }

        public Boolean getStartSearch() {
            return startSearch;
        }

        public void setStartSearch(Boolean startSearch) {
            this.startSearch = startSearch;
        }

        public List<String> getSortfield() {
            if (sortfield == null) {
                sortfield = new ArrayList<String>();
            }
            return sortfield;
        }

        public void setSortfield(List<String> sortfield) {
            this.sortfield = sortfield;
        }

        public Boolean getCountOutput() {
            return countOutput;
        }

        public void setCountOutput(Boolean countOutput) {
            this.countOutput = countOutput;
        }

        public Boolean getEditable() {
            return editable;
        }

        public void setEditable(Boolean editable) {
            this.editable = editable;
        }

        public Boolean getExcludeSearch() {
            return excludeSearch;
        }

        public void setExcludeSearch(Boolean excludeSearch) {
            this.excludeSearch = excludeSearch;
        }

        public Integer getLimit() {
            return limit;
        }

        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        public ApplicationFilter getFilter() {
            return filter;
        }

        public void setFilter(ApplicationFilter filter) {
            this.filter = filter;
        }
    }
}
