package com.zabbix.api.test;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import com.zabbix.api.domain.action.ActionCreateRequest;
import com.zabbix.api.domain.action.ActionDeleteRequest;
import com.zabbix.api.domain.action.ActionExistsRequest;
import com.zabbix.api.domain.action.ActionGetRequest;
import com.zabbix.api.domain.action.ActionUpdateRequest;
import com.zabbix.api.domain.base.Action;
import com.zabbix.api.domain.base.ActionCondition;
import com.zabbix.api.domain.base.ActionOperation;
import com.zabbix.api.domain.base.ActionOperationMessage;
import com.zabbix.api.domain.base.ActionOperationSyn;
import com.zabbix.api.service.IActionService;
import com.zabbix.api.service.impl.ActionServiceImpl;

public class TestAction extends TestCase {
	private static IActionService actionService = new ActionServiceImpl();
	static {
		// 登录
		new Util().login();
	}

	public void testCreate() {
		// 数据准备
		ActionCreateRequest create = new ActionCreateRequest();
		create.getParams().setName("testAction");
		create.getParams().setEsc_period(120);
		create.getParams().setEvaltype(0);
		create.getParams().setEventsource(0);
		create.getParams().setDef_shortdata("TRIGGER.NAME}: {TRIGGER.STATUS}   Last value: {ITEM.LASTVALUE}   {TRIGGER.URL}");
		create.getParams().setDef_longdata("{TRIGGER.NAME}: {TRIGGER.STATUS}");
		create.getParams().setStatus(0);

		ActionOperation ao = new ActionOperation();
		ao.setOperationtype(0);
		ao.setEsc_period(0);
		ao.setEsc_step_from(1);
		ao.setEsc_step_to(2);
		ao.setEvaltype(0);
		
		ActionOperationSyn aos = new ActionOperationSyn();
		aos.setUsrgrpid("17");
		
		ao.getOpmessage_grp().add(aos);
		ActionOperationMessage aom = new ActionOperationMessage();
		aom.setDefault_msg(1);
		aom.setMediatypeid("1");
		ao.setOpmessage(aom);
		
		create.getParams().getOperations().add(ao);

		ActionCondition ac = new ActionCondition();
		ac.setConditiontype(3);
		ac.setOperator(0);
		ac.setValue("200");
		create.getParams().getConditions().add(ac);
		
		actionService.create(create);

	}

	public void testAddAction(){
		System.out.println("sssssssssssssss");
		Action action = new Action();
		List<ActionOperation> actionOperations = new ArrayList<ActionOperation>();
		List<ActionCondition> actionConditions = new ArrayList<ActionCondition>();
		// 数据准备
//		ActionCreateRequest create = new ActionCreateRequest();
		action.setName("testAction1");
		action.setEsc_period(120);
		action.setEvaltype(0);
		action.setEventsource(0);
		action.setDef_shortdata("TRIGGER.NAME}: {TRIGGER.STATUS}   Last value: {ITEM.LASTVALUE}   {TRIGGER.URL}");
		action.setDef_longdata("{TRIGGER.NAME}: {TRIGGER.STATUS}");
		action.setStatus(0);

		ActionOperation ao = new ActionOperation();
		ao.setOperationtype(0);
		ao.setEsc_period(0);
		ao.setEsc_step_from(1);
		ao.setEsc_step_to(2);
		ao.setEvaltype(0);
		
		ActionOperationSyn aos = new ActionOperationSyn();
		aos.setUsrgrpid("7");
		
		ao.getOpmessage_grp().add(aos);
		ActionOperationMessage aom = new ActionOperationMessage();
		aom.setDefault_msg(1);
		aom.setMediatypeid("1");
		ao.setOpmessage(aom);
		
		actionOperations.add(ao);

		ActionCondition ac = new ActionCondition();
		ac.setConditiontype(2);
		ac.setOperator(0);
		ac.setValue("20629");
		actionConditions.add(ac);
		
		ActionCondition ac1 = new ActionCondition();
		ac1.setConditiontype(5);
		ac1.setOperator(0);
		ac1.setValue("1");
		actionConditions.add(ac1);
		
		ActionCondition ac2 = new ActionCondition();
		ac2.setConditiontype(16);
		ac2.setOperator(7);
		ac2.setValue("");
		actionConditions.add(ac2);
		action.setOperations(actionOperations);
		action.setConditions(actionConditions);
		actionService.addAction(action);
//		actionService.create(create);
	}
	
	
	public void testDelete() {
		// 数据准备
		ActionDeleteRequest delete = new ActionDeleteRequest();
		
		delete.getParams().add("3");
		
		JSONObject rs = (JSONObject) actionService.delete(delete);
		if (rs.has("result")) {
			System.out.println(true);
		}
		 else if (rs.has("error")) {
			 System.out.println(false);
		}

	}

	public void testExists() {
		// 数据准备
		ActionExistsRequest exists = new ActionExistsRequest();
		exists.getParams().getActionid().add("31");
		actionService.exists(exists);

	}


	public void testGet() {
		// 数据准备
		ActionGetRequest get = new ActionGetRequest();
		get.getParams().setOutput("extend");
		get.getParams().setSelectConditions("extend");
		get.getParams().setSelectOperations("extend");
		get.getParams().getActionids().add("3");
		try {
			JSONObject jsonObject = ((JSONObject)actionService.get(get)).getJSONArray("result").getJSONObject(0).getJSONObject("conditions");
			
			for (Iterator ite = jsonObject.keys();ite.hasNext();) {
//				System.out.println(">>" + ite.next());
				JSONObject json1 = new JSONObject();
				json1 = jsonObject.getJSONObject(ite.next().toString());
				System.out.println(json1.toString());
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void testGetActionBean() {
		// 数据准备
		ActionGetRequest get = new ActionGetRequest();
		get.getParams().setOutput("extend");
		get.getParams().setSelectConditions("extend");
		get.getParams().setSelectOperations("extend");
		get.getParams().getActionids().add("3");
		List<Action> actionlist = actionService.getActionBean(get);
		System.out.println(actionlist.size());
	}
	
	public void testUpdate() {
		// 数据准备
		ActionUpdateRequest update = new ActionUpdateRequest();
		update.getParams().setActionid("3");

		update.getParams().setName("testAction123");
		update.getParams().setEsc_period(120);
		update.getParams().setEvaltype(0);
		update.getParams().setEventsource(0);
		update.getParams().setDef_shortdata("TRIGGER.NAME}: {TRIGGER.STATUS}   Last value: {ITEM.LASTVALUE}   {TRIGGER.URL}");
		update.getParams().setDef_longdata("{TRIGGER.NAME}: {TRIGGER.STATUS}");
		update.getParams().setStatus(0);

		ActionOperation ao = new ActionOperation();
		ao.setOperationtype(0);
		ao.setEsc_period(0);
		ao.setEsc_step_from(1);
		ao.setEsc_step_to(2);
		ao.setEvaltype(0);
		
		ActionOperationSyn aos = new ActionOperationSyn();
		aos.setUsrgrpid("17");
		
		ao.getOpmessage_grp().add(aos);
		ActionOperationMessage aom = new ActionOperationMessage();
		aom.setDefault_msg(1);
		aom.setMediatypeid("1");
		ao.setOpmessage(aom);
		
		update.getParams().getOperations().add(ao);

		ActionCondition ac = new ActionCondition();
		ac.setConditiontype(3);
		ac.setOperator(0);
		ac.setValue("220");
		update.getParams().getConditions().add(ac);
		
		actionService.update(update);

	}
	
	public void testUpdateByBean() {
		Action action = new Action();
		List<ActionOperation> actionOperations = new ArrayList<ActionOperation>();
		List<ActionCondition> actionConditions = new ArrayList<ActionCondition>();
		// 数据准备
//		ActionCreateRequest create = new ActionCreateRequest();
		action.setActionid("11");
		action.setName("testAction2");
		action.setEsc_period(120);
		action.setEvaltype(0);
		action.setEventsource(0);
		action.setDef_shortdata("TRIGGER.NAME}: {TRIGGER.STATUS}   Last value: {ITEM.LASTVALUE}   {TRIGGER.URL}");
		action.setDef_longdata("{TRIGGER.NAME}: {TRIGGER.STATUS}");
		action.setStatus(0);

		ActionOperation ao = new ActionOperation();
		ao.setOperationtype(0);
		ao.setEsc_period(0);
		ao.setEsc_step_from(1);
		ao.setEsc_step_to(2);
		ao.setEvaltype(0);
		
		ActionOperationSyn aos = new ActionOperationSyn();
		aos.setUsrgrpid("7");
		
		ao.getOpmessage_grp().add(aos);
		ActionOperationMessage aom = new ActionOperationMessage();
		aom.setDefault_msg(1);
		aom.setMediatypeid("1");
		ao.setOpmessage(aom);
		
		actionOperations.add(ao);

		ActionCondition ac = new ActionCondition();
		ac.setConditiontype(2);
		ac.setOperator(0);
		ac.setValue("20629");
		actionConditions.add(ac);
		
		ActionCondition ac1 = new ActionCondition();
		ac1.setConditiontype(5);
		ac1.setOperator(0);
		ac1.setValue("1");
		actionConditions.add(ac1);
		
//		ActionCondition ac2 = new ActionCondition();
//		ac2.setConditiontype(16);
//		ac2.setOperator(7);
//		ac2.setValue("");
//		actionConditions.add(ac2);
		action.setOperations(actionOperations);
		action.setConditions(actionConditions);
		
		actionService.updateAction(action);

	}
	
	public void testdsssText(){
		DecimalFormat formater = new DecimalFormat("0.000000");
		formater.setRoundingMode(RoundingMode.FLOOR);
		System.out.println((formater.format(11111112.227)));
	}
}