package com.zabbix.api.service;
import java.util.List;

import com.zabbix.api.domain.base.Template;
import com.zabbix.api.domain.template.TemplateCreateRequest;
import com.zabbix.api.domain.template.TemplateDeleteRequest;
import com.zabbix.api.domain.template.TemplateExistsRequest;
import com.zabbix.api.domain.template.TemplateGetRequest;
import com.zabbix.api.domain.template.TemplateGetobjectsRequest;
import com.zabbix.api.domain.template.TemplateIsreadableRequest;
import com.zabbix.api.domain.template.TemplateIswritableRequest;
import com.zabbix.api.domain.template.TemplateMassaddRequest;
import com.zabbix.api.domain.template.TemplateMassremoveRequest;
import com.zabbix.api.domain.template.TemplateMassupdateRequest;
import com.zabbix.api.domain.template.TemplateUpdateRequest;
public interface ITemplateService {
	public Object create(TemplateCreateRequest create);
	public Object delete(TemplateDeleteRequest delete);
	public Object exists(TemplateExistsRequest exists);
	public Object getobjects(TemplateGetobjectsRequest getobjects);
	public Object get(TemplateGetRequest get);
	public Object isreadable(TemplateIsreadableRequest isreadable);
	public Object iswritable(TemplateIswritableRequest iswritable);
	public Object massadd(TemplateMassaddRequest massadd);
	public Object massremove(TemplateMassremoveRequest massremove);
	public Object massupdate(TemplateMassupdateRequest massupdate);
	public Object update(TemplateUpdateRequest update);
	List<Template> getTemplateToBean(TemplateGetRequest get);
}
