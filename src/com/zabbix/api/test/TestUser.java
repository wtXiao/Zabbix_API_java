package com.zabbix.api.test;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import junit.framework.TestCase;

import com.zabbix.api.domain.base.Media;
import com.zabbix.api.domain.base.User;
import com.zabbix.api.domain.base.UserGroup;
import com.zabbix.api.domain.user.UserAddmediaRequest;
import com.zabbix.api.domain.user.UserAuthenticateRequest;
import com.zabbix.api.domain.user.UserCreateRequest;
import com.zabbix.api.domain.user.UserDeleteMediaRequest;
import com.zabbix.api.domain.user.UserDeleteRequest;
import com.zabbix.api.domain.user.UserGetRequest;
import com.zabbix.api.domain.user.UserIsreadableRequest;
import com.zabbix.api.domain.user.UserIswritableRequest;
import com.zabbix.api.domain.user.UserLoginRequest;
import com.zabbix.api.domain.user.UserLogoutRequest;
import com.zabbix.api.domain.user.UserUpdateProfileRequest;
import com.zabbix.api.domain.user.UserUpdateRequest;
import com.zabbix.api.domain.user.UserUpdatemediaRequest;
import com.zabbix.api.service.IUserService;
import com.zabbix.api.service.impl.UserServiceImpl;

public class TestUser extends TestCase {
	private static IUserService userService = new UserServiceImpl();
	static {
		// 登录
		new Util().login();
	}

	public void testAddmedia() {
		// 数据准备
		UserAddmediaRequest addmedia =  new UserAddmediaRequest();
		
//		addmedia.getParams().getUsers().add("6");
		
		Media media = new Media();
		media.setMediatypeid("1");
		media.setSendto("admin");
		media.setPeriod("2-6,00:00-24:00");
		media.setActive("0");
		media.setSeverity("64");
		
		addmedia.getParams().getMedias().add(media);
		
		userService.addmedia(addmedia);

	}

	public void testAuthenticate() {
		// 数据准备
		UserAuthenticateRequest authenticate = new UserAuthenticateRequest();
		userService.authenticate(authenticate);

	}

	public void testCreate() {
		// 数据准备
		UserCreateRequest create = new UserCreateRequest();
		
		create.getParams().setName("test4");
		create.getParams().setAlias("test4");
		create.getParams().setPasswd("skycloud");
		List<String> usrgrps = new ArrayList<String>();
		usrgrps.add("13");
		create.getParams().setUsrgrps(usrgrps);
		create.getParams().setType(1);
		
		Media media = new Media();
		media.setMediatypeid("1");
		media.setSendto("admin");
		media.setPeriod("1-7,00:00-24:00");
		media.setActive("0");
		media.setSeverity("63");
		media.setActive("0");
		
		create.getParams().getUser_medias().add(media);
		
//		create.getParams().getUser_medias().add("4");
		userService.create(create);

	}

	public void testDeleteMedia() {
		// 数据准备
		UserDeleteMediaRequest deleteMedia = new UserDeleteMediaRequest();
		
		deleteMedia.getParams().add("6");
		
		userService.deleteMedia(deleteMedia);

	}

	public void testDelete() {
		// 数据准备
		UserDeleteRequest delete = new UserDeleteRequest();
		User user = new User();
		user.setUserid("11");
		delete.getParams().add(user);
		JSONObject object = (JSONObject) userService.delete(delete);
		System.out.println(object.toString());
//		if (object.has("result")) {
//			result = rs.get("result");
//		}
//		 else if (object.has("error")) {
//			result = rs.get("error");
//		}
	}
	
	public void testGet() {
		// 数据准备
		UserGetRequest get = new UserGetRequest();
		
		get.getParams().setOutput("extend");
		get.getParams().setSelectMedias("extend");
		List<String> userids = new ArrayList<String>();
		userids.add("12");
		get.getParams().setUserids(userids);
//		get.getParams().setSelectMediatypes("extend");
		get.getParams().setSelectUsrgrps("extend");
//		
//		jsonObject.put("select_medias", ReturnFormat.refer);
//		jsonObject.put("select_mediatypes", ReturnFormat.refer);
//		jsonObject.put("select_usrgrps", ReturnFormat.refer);
//		jsonObject.put("output", user != null ? user.getOutput()
//				: ReturnFormat.extend);
		
		Object object = userService.get(get);
		System.out.println(object.toString());
	}

	public void testGetUserBean() {
		// 数据准备
		UserGetRequest get = new UserGetRequest();
		
		get.getParams().setOutput("extend");
		get.getParams().setSelectMedias("extend");
		List<String> userids = new ArrayList<String>();
		userids.add("12");
		get.getParams().setUserids(userids);
//		get.getParams().setSelectMediatypes("extend");
		get.getParams().setSelectUsrgrps("extend");
//		get.getParams().setSelectMedias("extend");
//		get.getParams().setSelectMediatypes("extend");
//		get.getParams().setSelectUsrgrps("extend");
//		
//		jsonObject.put("select_medias", ReturnFormat.refer);
//		jsonObject.put("select_mediatypes", ReturnFormat.refer);
//		jsonObject.put("select_usrgrps", ReturnFormat.refer);
//		jsonObject.put("output", user != null ? user.getOutput()
//				: ReturnFormat.extend);
		
		List<User> list = userService.getUserBean(get);
		System.out.println(list.size());

	}
	
	public void testIsreadable() {
		// 数据准备
		UserIsreadableRequest isreadable = new UserIsreadableRequest();
		userService.isreadable(isreadable);

	}

	public void testIswritable() {
		// 数据准备
		UserIswritableRequest iswritable = new UserIswritableRequest();
		userService.iswritable(iswritable);

	}
	
	public void testLogin() {
		// 数据准备
		UserLoginRequest login = new UserLoginRequest();
		userService.login(login);

	}

	public void testLogout() {
		// 数据准备
		UserLogoutRequest logout = new UserLogoutRequest();
		User user = new User();
		user.setAlias("admin");
		logout.getParams().add(user);
		userService.logout(logout);

	}
	
	public void testUpdatemedia() {
		// 数据准备
		UserUpdatemediaRequest updatemedia = new UserUpdatemediaRequest();	
		Media media = new Media();
		media.setMediatypeid("2");
		media.setSendto("admin");
		media.setPeriod("2-6,00:00-24:00");
		media.setActive("0");
		media.setSeverity("64");
		updatemedia.getParams().getMedias().add(media);
//		updatemedia.getParams().getUsers().add("6"); 封装的不是字符串，而是一个对象
		User u = new User();
		u.setUserid("11");
		updatemedia.getParams().getUsers().add(u);
		userService.updatemedia(updatemedia);

	}

	public void testUpdateProfile() {
		// 数据准备
		UserUpdateProfileRequest updateProfile = new UserUpdateProfileRequest();
		
		userService.updateProfile(updateProfile);

	}

	public void testUpdate() {
		// 数据准备
		UserUpdateRequest update = new UserUpdateRequest();
		
		update.getParams().setUserid("11");
		update.getParams().setName("testwei");
		update.getParams().setAlias("testwei");
		update.getParams().setPasswd("skycloud");
		List<String> usrgrps = new ArrayList<String>();
		usrgrps.add("8");
		update.getParams().setUsrgrps(usrgrps);
		update.getParams().setType(1);

//		Media media = new Media();
//		media.setMediatypeid("1");
//		media.setSendto("admin");
//		media.setPeriod("1-7,00:00-24:00");
//		media.setActive("0");
//		media.setSeverity("63");
		
		userService.update(update);

	}
	
	public void testUpdateUser(){
		User user = new User();
		user.setUserid("11");
		user.setName("test");
		user.setAlias("test");
		user.setPasswd("123456");
		List<UserGroup> usrgrps = new ArrayList<UserGroup>();
		UserGroup group = new UserGroup();
		group.setUsrgrpid("13");
		usrgrps.add(group);
		user.setGroups(usrgrps);
		List<Media> medias = new ArrayList<Media>();
		Media media = new Media();
		media.setMediaid("5");
		media.setMediatypeid("1");
		media.setSendto("admin@qqd.com");
		media.setPeriod("1-7,00:00-24:00");
		media.setActive("0");
		media.setSeverity("63");
		medias.add(media);
		user.setMideas(medias);
		userService.updateUser(user);
	}
	
	public void testAddUser(){
		User user = new User();
		user.setName("test4");
		user.setAlias("test4");
		user.setPasswd("123456");
		List<UserGroup> usrgrps = new ArrayList<UserGroup>();
		UserGroup group = new UserGroup();
		group.setUsrgrpid("13");
		usrgrps.add(group);
		user.setGroups(usrgrps);
		List<Media> medias = new ArrayList<Media>();
		Media media = new Media();
		media.setMediatypeid("1");
		media.setSendto("admin");
		media.setPeriod("1-7,00:00-24:00");
		media.setActive("0");
		media.setSeverity("63");
		media.setActive("0");
		medias.add(media);
		user.setMideas(medias);
		userService.addUser(user);
	}
}