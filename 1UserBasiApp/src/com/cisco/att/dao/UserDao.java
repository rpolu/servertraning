package com.cisco.att.dao;

import java.util.List;

import com.cisco.att.user.UserBean;

public interface UserDao {
	public void inserUser(UserBean uesrBean);

	public UserBean getUserDeatils(int userId);

	public List<UserBean> getUsers();

	public void deleteUser(int userId);

	public void modifyUser(UserBean userBean);

}
