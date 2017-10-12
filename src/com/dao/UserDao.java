package com.dao;

import java.sql.Connection;
import java.util.List;

import com.entity.User;

public interface UserDao {
	// public User login(String userName, String userPassword) throws Exception;

	/**
	 * ������ݵ����ݿ�
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public void save(Connection conn,User user) throws Exception;
	
	/**
	 * �������ݿ�������
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public void update(Connection conn,User user) throws Exception;
	
	/**
	 * ɾ�����ݿ�������
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public void delete(Connection conn,User user) throws Exception;
	
	/**
	 * ����id��ѯ���ݿ��еļ�¼
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User ListAllUserById(User user) throws Exception;
	
	/**
	 * ����id��ѯ���ݿ��еļ�¼
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User ListAllUserByName(User user) throws Exception;
	
	/**
	 * ��ѯ���ݿ������еļ�¼
	 * @return
	 * @throws Exception
	 */
	public List<User> ListAllUser() throws Exception;
	
	
	/**
	 * �û���¼
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User login(User user) throws Exception;
	
}
