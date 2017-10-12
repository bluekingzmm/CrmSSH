package com.dao.impl;

import java.sql.Connection;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.UserDao;
import com.entity.User;

public class UserInfoDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
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

	@SuppressWarnings("all")
	public User login(User user) throws Exception {
		// TODO Auto-generated method stub
		List<User> uList = (List<User>) this.getHibernateTemplate()
				.find("from User where user_name=? and user_password=?", user.getUser_name(), user.getUser_password());

		// 判断list是否为空，下标越界
		if (uList != null && uList.size() != 0) {
			User u = uList.get(0);
			return u;
		}
		return null;
	}

}
