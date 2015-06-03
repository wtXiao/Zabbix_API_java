package com.zabbix.api.service;
import java.util.List;

import com.zabbix.api.domain.base.User;
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
/**
 * @ClassName: IUserService
 * @Description: 用户接口
 * @author 李庆雷
 * @date 2013-9-23 下午12:02:10
 */
public interface IUserService {
	/**
	 * @Title: get
	 * @Description: 获得用户信息（json）
	 * @param get
	 * @return Object
	 * @throws
	 */
	public Object get(UserGetRequest get);
	
	/**
	 * @Title: login
	 * @Description: 用户登录
	 * @param login
	 * @return Object
	 * @throws
	 */
	public Object login(UserLoginRequest login);
	
	/**
	 * @Title: logout
	 * @Description: 用户退出
	 * @param logout
	 * @return Object
	 * @throws
	 */
	public Object logout(UserLogoutRequest logout);

	/**
	 * @Title: getUserBean
	 * @Description: 获得用户信息（bean）
	 * @param get void
	 * @throws
	 */
	public List<User> getUserBean(UserGetRequest get);
	
	public Object addmedia(UserAddmediaRequest addmedia);
	public Object authenticate(UserAuthenticateRequest authenticate);
	public Object create(UserCreateRequest create);
	public Object deleteMedia(UserDeleteMediaRequest deleteMedia);
	public Object delete(UserDeleteRequest delete);
	public Object isreadable(UserIsreadableRequest isreadable);
	public Object iswritable(UserIswritableRequest iswritable);
	public Object updatemedia(UserUpdatemediaRequest updatemedia);
	public Object updateProfile(UserUpdateProfileRequest updateProfile);
	public Object update(UserUpdateRequest update);
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(User user);
	public List<User> getUser(User user);
}
