package com.zabbix.api.test;

import junit.framework.TestCase;

import com.zabbix.api.domain.base.MediaType;
import com.zabbix.api.domain.mediatype.MediaTypeCreateRequest;
import com.zabbix.api.domain.mediatype.MediaTypeDeleteRequest;
import com.zabbix.api.domain.mediatype.MediaTypeGetRequest;
import com.zabbix.api.domain.mediatype.MediaTypeUpdateRequest;
import com.zabbix.api.service.IMediatypeService;
import com.zabbix.api.service.impl.MediatypeServiceImpl;

public class TestMediatype extends TestCase {
	private static IMediatypeService mediatypeService = new MediatypeServiceImpl();
	static {
		// 登录
		new Util().login();
	}

	public void testMediaTypeCreate() {
		// 数据准备
		MediaTypeCreateRequest mediaTypeCreate = new MediaTypeCreateRequest();
		
		MediaType mt = new MediaType();
		mt.setDescription("e-mail");
		mt.setType(0);
		mt.setSmtp_email("soso@qq.com");
		mt.setSmtp_helo("comapany.com");
		mt.setSmtp_server("192.168.0.123");
		mediaTypeCreate.getParams().add(mt);
		MediaType mt1 = new MediaType();
		mt1.setDescription("e-mail1");
		mt1.setType(0);
		mt1.setSmtp_email("soso1@qq.com");
		mt1.setSmtp_helo("comapany1.com");
		mt1.setSmtp_server("192.168.0.223");
		mediaTypeCreate.getParams().add(mt1);
		
		mediatypeService.mediaTypeCreate(mediaTypeCreate);

	}

	public void testMediaTypeDelete() {
		// 数据准备
		MediaTypeDeleteRequest mediaTypeDelete = new MediaTypeDeleteRequest();
		mediaTypeDelete.getParams().add("5");
		mediatypeService.mediaTypeDelete(mediaTypeDelete);

	}

	public void testMediaTypeGet() {
		// 数据准备
		MediaTypeGetRequest mediaTypeGet = new MediaTypeGetRequest();
		
		mediaTypeGet.getParams().setOutput("shoren");
		mediaTypeGet.getParams().getFilter().setDescription("邮件提醒");
//		mediaTypeGet.getParams().setDescription("邮件提醒");;
		
		Object object = mediatypeService.mediaTypeGet(mediaTypeGet);
		System.out.println(object);
		
	}

	public void testMediaTypeUpdate() {
		// 数据准备
		MediaTypeUpdateRequest mediaTypeUpdate = new MediaTypeUpdateRequest();
		
		MediaType mt = new MediaType();
		mt.setMediatypeid("4");
		mt.setDescription("e-maila");
		mt.setType(0);
		mt.setSmtp_email("sosoaa@qq.com");
		mt.setSmtp_helo("comapany.com");
		mt.setSmtp_server("192.168.0.123");
		mediaTypeUpdate.getParams().add(mt);

		
		mediatypeService.mediaTypeUpdate(mediaTypeUpdate);

	}
}