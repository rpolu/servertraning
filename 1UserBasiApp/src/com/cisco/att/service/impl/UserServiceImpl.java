package com.cisco.att.service.impl;

import java.util.List;

import com.cisco.att.dao.UserDao;
import com.cisco.att.dao.impl.UserDaoImpl;
import com.cisco.att.service.UserService;
import com.cisco.att.user.UserBean;

public class UserServiceImpl implements UserService {
	UserDao dao = new UserDaoImpl();

	public void inserUser(UserBean uesrBean) {

		dao.inserUser(uesrBean);
	}

	public UserBean getUserDeatils(int userId) {
		return dao.getUserDeatils(userId);
	}

	public List<UserBean> getUsers() {
		return dao.getUsers();
	}

	public void deleteUser(int userId) {
		dao.deleteUser(userId);

	}

	public void modifyUser(UserBean userBean) {
		dao.modifyUser(userBean);

	}

}
