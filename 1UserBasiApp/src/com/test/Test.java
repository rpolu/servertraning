package com.test;

import java.util.List;

import com.cisco.att.service.UserService;
import com.cisco.att.service.impl.UserServiceImpl;
import com.cisco.att.user.UserBean;

public class Test {

	public static void main(String[] args) {

		UserService us = new UserServiceImpl();

		UserBean userBean = new UserBean();
		userBean.setUserId(10);
		userBean.setName("HHH");
		userBean.setAddress("Banglore");

		us.inserUser(userBean);

		us.modifyUser(userBean);

		List<UserBean> users = us.getUsers();
		for (UserBean u : users) {
			System.out.println(u.getUserId());
			System.out.println(u.getName());
			System.out.println(u.getAddress());
		}
		
		us.deleteUser(10);
		
		System.out.println("*************");
		
		UserBean ub=us.getUserDeatils(10);
		System.out.println(ub.getUserId());
		System.out.println(ub.getName());
		System.out.println(ub.getAddress());
		

	}

}
