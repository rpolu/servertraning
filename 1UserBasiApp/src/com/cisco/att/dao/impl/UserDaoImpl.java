package com.cisco.att.dao.impl;

import java.util.LinkedList;
import java.util.List;

import com.cisco.att.dao.UserDao;
import com.cisco.att.user.UserBean;

public class UserDaoImpl implements UserDao {

	public void inserUser(UserBean uesrBean) {
		System.out.println("Inserted successfully");

	}

	public UserBean getUserDeatils(int userId) {

		UserBean userBean = new UserBean();
		userBean.setUserId(10);
		userBean.setName("HHH");
		userBean.setAddress("Banglore");
		return userBean;
	}

	public List<UserBean> getUsers() {

		List users = new LinkedList();
		UserBean userBean1 = new UserBean();
		userBean1.setUserId(10);
		userBean1.setName("HHH");
		userBean1.setAddress("Banglore");

		UserBean userBean2 = new UserBean();
		userBean2.setUserId(10);
		userBean2.setName("HHH");
		userBean2.setAddress("Banglore");

		users.add(userBean1);
		users.add(userBean2);

		return users;
	}

	public void deleteUser(int userId) {
		System.out.println(" Deleted successfully");

	}

	public void modifyUser(UserBean userBean) {

		System.out.println(" Modified successfully");

	}

}
