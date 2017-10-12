package com.dao;

import java.util.List;

import com.entity.Customer;

public interface CustomerDao {

	/**
	 * 添加数据到数据库
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public void save(Customer customer) throws Exception;

	/**
	 * 更新数据库中数据
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public void update(Customer customer) throws Exception;

	/**
	 * 删除数据库中数据
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public void delete(Customer customer) throws Exception;

	/**
	 * 根据id查询数据库中的记录
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public Customer queryById(Customer customer) throws Exception;

	/**
	 * 根据name查询数据库中的记录
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public Customer queryByName(Customer customer) throws Exception;

	/**
	 * 根据名字获取数据
	 * 
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public List<Customer> queryByCustName(int begin, int pageSize, String custName) throws Exception;

	/**
	 * 根据联系人id查找该联系人下所有的客户记录
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Customer> ListCustomerByLinkId(String linkid) throws Exception;

	/**
	 * 查询数据库中所有的记录
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Customer> findPage(int begin, int pageSize) throws Exception;

	/**
	 * 获得客户总数量(客户名称)
	 * 
	 * @param cust_name
	 * @return
	 * @throws Exception
	 */

	public int count(String cust_name) throws Exception;

	/**
	 * 获得客户列表
	 * 
	 * @param cust_name
	 * @return
	 * @throws Exception
	 */
	public List<Customer> ListCustomer();

}
