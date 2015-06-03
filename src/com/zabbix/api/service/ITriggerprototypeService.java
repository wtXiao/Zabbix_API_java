package com.zabbix.api.service;
import java.util.List;

import com.zabbix.api.domain.base.TriggerPrototype;
import com.zabbix.api.domain.itemprototype.ItemPrototypeGetRequest;
import com.zabbix.api.domain.triggerprototype.TriggerPrototypeCreateRequest;
import com.zabbix.api.domain.triggerprototype.TriggerPrototypeDeleteRequest;
import com.zabbix.api.domain.triggerprototype.TriggerPrototypeGetRequest;
import com.zabbix.api.domain.triggerprototype.TriggerPrototypeUpdateRequest;
public interface ITriggerprototypeService {
	public Object triggerPrototypeCreate(TriggerPrototypeCreateRequest triggerPrototypeCreate);
	public Object addTriggerPrototype(TriggerPrototype triggerPrototype);
	public Object triggerPrototypeDelete(TriggerPrototypeDeleteRequest triggerPrototypeDelete);
	public Object triggerPrototypeGet(TriggerPrototypeGetRequest triggerPrototypeGet);
	public Object triggerPrototypeUpdate(TriggerPrototypeUpdateRequest triggerPrototypeUpdate);
	List<TriggerPrototype> triggerPrototypeGetToBean(TriggerPrototypeGetRequest triggerPrototypeGet);
}
