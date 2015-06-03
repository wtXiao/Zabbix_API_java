package com.zabbix.api.service;
import java.util.List;

import com.zabbix.api.domain.base.ItemPrototype;
import com.zabbix.api.domain.itemprototype.ItemPrototypeCreateRequest;
import com.zabbix.api.domain.itemprototype.ItemPrototypeDeleteRequest;
import com.zabbix.api.domain.itemprototype.ItemPrototypeExistsRequest;
import com.zabbix.api.domain.itemprototype.ItemPrototypeGetRequest;
import com.zabbix.api.domain.itemprototype.ItemPrototypeIsreadableRequest;
import com.zabbix.api.domain.itemprototype.ItemPrototypeIswritableRequest;
import com.zabbix.api.domain.itemprototype.ItemPrototypeUpdateRequest;
public interface IItemprototypeService {
	public Object itemPrototypeCreate(ItemPrototypeCreateRequest itemPrototypeCreate);
	public Object itemPrototypeDelete(ItemPrototypeDeleteRequest itemPrototypeDelete);
	public Object itemPrototypeExists(ItemPrototypeExistsRequest itemPrototypeExists);
	public Object itemPrototypeGet(ItemPrototypeGetRequest itemPrototypeGet);
	public Object itemPrototypeIsreadable(ItemPrototypeIsreadableRequest itemPrototypeIsreadable);
	public Object itemPrototypeIswritable(ItemPrototypeIswritableRequest itemPrototypeIswritable);
	public Object itemPrototypeUpdate(ItemPrototypeUpdateRequest itemPrototypeUpdate);
	public List<ItemPrototype> itemPrototypeGetToBean(ItemPrototypeGetRequest itemPrototypeGet);
}
