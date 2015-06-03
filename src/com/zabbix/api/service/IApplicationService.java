package com.zabbix.api.service;

import java.util.List;

import com.zabbix.api.domain.application.ApplicationGetRequest;
import com.zabbix.api.domain.base.Application;

public interface IApplicationService {

    public Object get(ApplicationGetRequest get);

    List<Application> getApplicationToBean(ApplicationGetRequest get);
}
