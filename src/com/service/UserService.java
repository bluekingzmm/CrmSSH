package com.service;

import java.sql.Connection;
import java.util.List;

import com.entity.User;

public interface UserService {

	User login(User user) throws Exception;

	void update(Connection conn, User user) throws Exception;

	void delete(Connection conn, User user) throws Exception;

	User ListAllUserById(User user) throws Exception;

	User ListAllUserByName(User user) throws Exception;

	List<User> ListAllUser() throws Exception;

}
