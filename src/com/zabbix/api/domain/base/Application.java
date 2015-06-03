package com.zabbix.api.domain.base;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: Application
 * @Description: application封装
 * @author Destiny
 * @date 2014年10月13日 下午4:42:58
 * 
 */
public class Application {
    private String applicationid;
    private String hostid;
    private List<String> templateids;
    private String name;
    private List<Item> items = new ArrayList<Item>();
    private List<Host> hosts = new ArrayList<Host>();

    public List<Host> getHosts() {
        return hosts;
    }

    public void setHosts(List<Host> hosts) {
        this.hosts = hosts;
    }

    public String getApplicationid() {
        return applicationid;
    }

    public void setApplicationid(String applicationid) {
        this.applicationid = applicationid;
    }

    public String getHostid() {
        return hostid;
    }

    public void setHostid(String hostid) {
        this.hostid = hostid;
    }

    public List<String> getTemplateids() {
        return templateids;
    }

    public void setTemplateids(List<String> templateids) {
        this.templateids = templateids;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
