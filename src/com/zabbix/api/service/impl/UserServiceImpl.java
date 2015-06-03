package com.zabbix.api.service.impl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.PostMethod;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.zabbix.api.domain.base.Media;
import com.zabbix.api.domain.base.User;
import com.zabbix.api.domain.base.UserGroup;
import com.zabbix.api.domain.user.UserAddmediaRequest;
import com.zabbix.api.domain.user.UserAuthenticateRequest;
import com.zabbix.api.domain.user.UserCreateRequest;
import com.zabbix.api.domain.user.UserCreateRequest.UserCreateParams;
import com.zabbix.api.domain.user.UserDeleteMediaRequest;
import com.zabbix.api.domain.user.UserDeleteRequest;
import com.zabbix.api.domain.user.UserGetRequest;
import com.zabbix.api.domain.user.UserIsreadableRequest;
import com.zabbix.api.domain.user.UserIswritableRequest;
import com.zabbix.api.domain.user.UserLoginRequest;
import com.zabbix.api.domain.user.UserLogoutRequest;
import com.zabbix.api.domain.user.UserUpdateProfileRequest;
import com.zabbix.api.domain.user.UserUpdateRequest;
import com.zabbix.api.domain.user.UserUpdateRequest.UserUpdateParams;
import com.zabbix.api.domain.user.UserUpdatemediaRequest;
import com.zabbix.api.service.IUserService;
import com.zabbix.util.FormatData;

/**
 * @ClassName: UserServiceImpl
 * @Description: 用户接口实现
 * @author 李庆雷
 * @date 2013-9-23 下午1:18:30
 */
public class UserServiceImpl implements IUserService {
	public Object addmedia(UserAddmediaRequest addmedia){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(addmedia));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(addmedia)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
			System.out.println(rs);
			if (rs.has("result")) {
				result = rs.get("result");
			}
			 else if (rs.has("error")) {
				result = rs.get("error");
			}
		}
		 catch (HttpException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
		 catch (JSONException e) {
			e.printStackTrace();
		}
		return result;
	}
	public Object authenticate(UserAuthenticateRequest authenticate){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(authenticate));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(authenticate)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
			System.out.println(rs);
			if (rs.has("result")) {
				result = rs.get("result");
			}
			 else if (rs.has("error")) {
				result = rs.get("error");
			}
		}
		 catch (HttpException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
		 catch (JSONException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean addUser(User user){
		boolean result = false;
		String alias = user.getAlias();
		String name = user.getName();
		String password = user.getPasswd();
		List<UserGroup> grouplist = user.getGroups();
		List<Media> medias = user.getMideas();
		UserCreateRequest createRequest = new UserCreateRequest();
		UserCreateParams params = createRequest.getParams();
		if(grouplist!=null&&grouplist.size()>0){
			if(password!=null&&!"".equals(password)&&alias!=null&&!"".equals(alias)){
				params.setAlias(alias);
				params.setPasswd(password);
				params.setName(name);
				params.setUsrgrps(grouplist);
				params.setUser_medias(medias);
				JSONObject  object = (JSONObject) create(createRequest);
			    if (object.has("result")) {
			    	result = true;
				}
				 else if (object.has("error")) {
					result = false;
				}
			}
		}
		return result;
	}
	
	public Object create(UserCreateRequest create){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(create));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(create)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
			System.out.println(rs);
//			if (rs.has("result")) {
//				result = rs.get("result");
//			}
//			 else if (rs.has("error")) {
//				result = rs.get("error");
//			}
		}
		 catch (HttpException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
		 catch (JSONException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	
	public Object deleteMedia(UserDeleteMediaRequest deleteMedia){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(deleteMedia));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(deleteMedia)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
			System.out.println(rs);
			if (rs.has("result")) {
				result = rs.get("result");
			}
			 else if (rs.has("error")) {
				result = rs.get("error");
			}
		}
		 catch (HttpException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
		 catch (JSONException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean deleteUser(User user){
		boolean result = false;
		if(user!=null&&user.getUserid()!=null&&!"".equals(user.getUserid())){
			UserDeleteRequest delete = new UserDeleteRequest();
			delete.getParams().add(user);
			JSONObject object = (JSONObject)delete(delete);
			if (object.has("result")) {
				result = true;
			}
			 else if (object.has("error")) {
				result = false;
			}
		}
		return result;
	}
	
	public Object delete(UserDeleteRequest delete){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(delete));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(delete)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
			System.out.println(rs);
//			if (rs.has("result")) {
//				result = rs.get("result");
//			}
//			 else if (rs.has("error")) {
//				result = rs.get("error");
//			}
		}
		 catch (HttpException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
		 catch (JSONException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public Object isreadable(UserIsreadableRequest isreadable){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(isreadable));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(isreadable)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
			System.out.println(rs);
			if (rs.has("result")) {
				result = rs.get("result");
			}
			 else if (rs.has("error")) {
				result = rs.get("error");
			}
		}
		 catch (HttpException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
		 catch (JSONException e) {
			e.printStackTrace();
		}
		return result;
	}
	public Object iswritable(UserIswritableRequest iswritable){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(iswritable));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(iswritable)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
			System.out.println(rs);
			if (rs.has("result")) {
				result = rs.get("result");
			}
			 else if (rs.has("error")) {
				result = rs.get("error");
			}
		}
		 catch (HttpException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
		 catch (JSONException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/*
	 * Title: get
	 * Description: 获得设备信息（json）
	 * @param get
	 * @return Object
	 * @see com.zabbix.api.service.IUserService#get(com.zabbix.api.domain.user.UserGetRequest)
	 */
	@Override
	public Object get(UserGetRequest get){
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
//			System.out.println(js.toJson(get));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(get)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
//			System.out.println(response);
			 rs = new JSONObject(response);
//			System.out.println(rs);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	public List<User> getUser(User user){
		UserGetRequest get = new UserGetRequest();
		get.getParams().setOutput("extend");
		get.getParams().setSelectMedias("extend");
		List<String> userids = new ArrayList<String>();
		userids.add(user.getUserid());
		get.getParams().setUserids(userids);
//		get.getParams().setSelectMediatypes("extend");
		get.getParams().setSelectUsrgrps("extend");
		List<User> users = getUserBean(get);
		return users;
	}
	
	/*
	 * Title: getUserBean
	 * Description: 获取用户信息（bean）
	 * @param get
	 * @return
	 * @see com.zabbix.api.service.IUserService#getUserBean(com.zabbix.api.domain.user.UserGetRequest)
	 */
	@Override
	public List<User> getUserBean(UserGetRequest get) {
		JSONObject result = (JSONObject) this.get(get);
		List<User> users =new ArrayList<User>();
		if (result.has("result")) {
			try {
				JSONArray array = result.getJSONArray("result");
				if(array!=null&&array.length()>0){
					for(int i=0;i<array.length();i++){
						JSONObject userjson = array.getJSONObject(i);
						User user =new User(); 
						user.setAlias(userjson.getString("alias"));
						user.setAttempt_clock(userjson.getString("attempt_clock"));
						user.setAttempt_failed(userjson.getInt("attempt_failed"));
						user.setAttempt_ip(userjson.getString("attempt_ip"));
						user.setAutologin(userjson.getInt("autologin"));
						user.setAutologout(userjson.getInt("autologout"));
						user.setLang(userjson.getString("lang"));
						user.setName(userjson.getString("name"));
						if(userjson.has("passwd")){
							user.setPasswd(userjson.getString("passwd"));
						}
						user.setRefresh(userjson.getInt("refresh"));
						user.setRows_per_page(userjson.getInt("rows_per_page"));
						user.setSurname(userjson.getString("surname"));
						user.setTheme(userjson.getString("theme"));
						user.setType(userjson.getInt("type"));
						user.setUrl(userjson.getString("url"));
						user.setUserid(userjson.getString("userid"));
						if(userjson.has("medias")){
							JSONArray medias = userjson.getJSONArray("medias");
							List<Media> list = new ArrayList<Media>();
							for (int j = 0; j < medias.length(); j++) {
								JSONObject object = (JSONObject) medias.get(i);
								Media media = new Media();
								media.setActive(object.getString("active"));
								media.setMediaid(object.getString("mediaid"));
								media.setMediatypeid(object.getString("mediatypeid"));
								media.setPeriod(object.getString("period"));
								media.setSendto(object.getString("sendto"));
								media.setSeverity(object.getString("severity"));
								list.add(media);
							}
							user.setMideas(list);
						}
						if(userjson.has("usrgrps")){
							JSONArray usrgrps = userjson.getJSONArray("usrgrps");
							List<UserGroup> list = new ArrayList<UserGroup>();
							for (int j = 0; j < usrgrps.length(); j++) {
								JSONObject object = (JSONObject) usrgrps.get(i);
								UserGroup group = new UserGroup();
								group.setUsrgrpid(object.getString("usrgrpid"));
								group.setUsers_status(object.getInt("users_status"));
								group.setName(object.getString("name"));
								group.setGui_access(object.getInt("gui_access"));
								group.setDebug_mode(object.getInt("debug_mode"));
								list.add(group);
							}
							user.setGroups(list);
						}
						users.add(user);
					}
				}
			} catch (JSONException e) {
				e.printStackTrace();
				return users;
			}
		}else if (result.has("error")) {
			return users;
		}
		return users;
	}
	
	/*
	 * Title: login
	 * Description: 用户登录
	 * @param login
	 * @return Object
	 * @see com.zabbix.api.service.IUserService#login(com.zabbix.api.domain.user.UserLoginRequest)
	 */
	@Override
	public Object login(UserLoginRequest login){
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
//			System.out.println(js.toJson(login));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(login)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
//			System.out.println(response);
			 rs = new JSONObject(response);
//			System.out.println(rs);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	/*
	 * Title: logout
	 * Description: 用户退出
	 * @param logout
	 * @return Object
	 * @see com.zabbix.api.service.IUserService#logout(com.zabbix.api.domain.user.UserLogoutRequest)
	 */
	@Override
	public Object logout(UserLogoutRequest logout){
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
//			System.out.println(js.toJson(logout));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(logout)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
//			System.out.println(response);
			 rs = new JSONObject(response);
//			System.out.println(rs);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	public Object updatemedia(UserUpdatemediaRequest updatemedia){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(updatemedia));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(updatemedia)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
//			System.out.println(rs);
//			if (rs.has("result")) {
//				result = rs.get("result");
//			}
//			 else if (rs.has("error")) {
//				result = rs.get("error");
//			}
		}
		 catch (HttpException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
		 catch (JSONException e) {
			e.printStackTrace();
		}
		return rs;
	}
	public Object updateProfile(UserUpdateProfileRequest updateProfile){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(updateProfile));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(updateProfile)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
			System.out.println(rs);
			if (rs.has("result")) {
				result = rs.get("result");
			}
			 else if (rs.has("error")) {
				result = rs.get("error");
			}
		}
		 catch (HttpException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
		 catch (JSONException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean updateUser(User user){
		boolean result = false;
		String alias = user.getAlias();
		String name = user.getName();
		String password = user.getPasswd();
		String userid = user.getUserid();
		List<UserGroup> groups = user.getGroups();
		List<String> grouplist = new ArrayList<String>();
		if(groups!=null&&groups.size()>0){
			for (int i = 0; i < groups.size(); i++) {
				grouplist.add(groups.get(i).getUsrgrpid()+"");
			}
			List<Media> medias = user.getMideas();
			List<Media> addmedias = new ArrayList<Media>();
			List<Media> updatemedias = new ArrayList<Media>();
			UserUpdateRequest updateRequest = new UserUpdateRequest();
			UserUpdateParams params = updateRequest.getParams();
			if(grouplist!=null&&grouplist.size()>0){
				if(userid!=null&&!"".equals(userid)&&password!=null&&!"".equals(password)&&alias!=null&&!"".equals(alias)){
					params.setUserid(userid);
					params.setAlias(alias);
					params.setPasswd(password);
					params.setName(name);
					params.setUsrgrps(grouplist);
//					params.setMideas(medias);
					UserUpdatemediaRequest updatemedia = new UserUpdatemediaRequest();
					UserAddmediaRequest addmedia =  new UserAddmediaRequest();
					if(medias!=null&&medias.size()>0){
						User u = new User();
						u.setUserid(userid);
						for (int i = 0; i < medias.size(); i++) {
							Media media = medias.get(i);
							if(media.getMediaid()!=null&&!"".equals(media.getMediaid())){
								updatemedias.add(media);
							}else{
								addmedias.add(media);
							}
						}
						if(updatemedias.size()>0){
							updatemedia.getParams().getMedias().addAll(updatemedias);
							updatemedia.getParams().getUsers().add(u);
							JSONObject jsonObject = (JSONObject) updatemedia(updatemedia);
						}
						if(addmedias.size()>0){
							addmedia.getParams().getMedias().addAll(addmedias);
							addmedia.getParams().getUsers().add(u);
							JSONObject jsonObject1 =  (JSONObject) addmedia(addmedia);
						}
					}
					JSONObject  object = (JSONObject) update(updateRequest);
					if (object.has("result")) {
						result = true;
					} else if (object.has("error")) {
						result = false;
					}
				}
			}
		}
		return result;
	}
	
	public Object update(UserUpdateRequest update){
		Object result = null;
		Gson js = new Gson();
		HttpClient client = new HttpClient();
		PostMethod putMethod = new PostMethod(FormatData.API_URL);
		putMethod.setRequestHeader("Content-Type", "application/json-rpc");
		JSONObject rs =null;
		try {
			System.out.println(js.toJson(update));
			putMethod.setRequestBody( FormatData.fromString(js.toJson(update)));
			client.executeMethod(putMethod);
			String response = putMethod.getResponseBodyAsString();
			System.out.println(response);
			 rs = new JSONObject(response);
			System.out.println(rs);
			if (rs.has("result")) {
				result = rs.get("result");
			}
			 else if (rs.has("error")) {
				result = rs.get("error");
			}
		}
		 catch (HttpException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
		 catch (JSONException e) {
			e.printStackTrace();
		}
		return result;
	}
}
