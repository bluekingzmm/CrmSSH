package com.dao;

import java.sql.Connection;
import java.util.List;

import com.entity.User;

public interface UserDao {
	// public User login(String userName, String userPassword) throws Exception;

	/**
	 * 添加数据到数据库
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public void save(Connection conn,User user) throws Exception;
	
	/**
	 * 更新数据库中数据
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public void update(Connection conn,User user) throws Exception;
	
	/**
	 * 删除数据库中数据
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public void delete(Connection conn,User user) throws Exception;
	
	/**
	 * 根据id查询数据库中的记录
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User ListAllUserById(User user) throws Exception;
	
	/**
	 * 根据id查询数据库中的记录
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User ListAllUserByName(User user) throws Exception;
	
	/**
	 * 查询数据库中所有的记录
	 * @return
	 * @throws Exception
	 */
	public List<User> ListAllUser() throws Exception;
	
	
	/**
	 * 用户登录
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User login(User user) throws Exception;
	
}
