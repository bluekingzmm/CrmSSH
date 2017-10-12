package com.service.impl;

import java.sql.Connection;
import java.util.List;

import com.dao.UserDao;
import com.entity.User;
import com.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User login(User user) throws Exception {
		// TODO Auto-generated method stub

		return userDao.login(user);
	}

	
	public void save(Connection conn, User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Connection conn, User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Connection conn, User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User ListAllUserById(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User ListAllUserByName(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> ListAllUser() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
