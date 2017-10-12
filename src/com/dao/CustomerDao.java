package com.dao;

import java.util.List;

import com.entity.Customer;

public interface CustomerDao {

	/**
	 * ������ݵ����ݿ�
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public void save(Customer customer) throws Exception;

	/**
	 * �������ݿ�������
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public void update(Customer customer) throws Exception;

	/**
	 * ɾ�����ݿ�������
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public void delete(Customer customer) throws Exception;

	/**
	 * ����id��ѯ���ݿ��еļ�¼
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public Customer queryById(Customer customer) throws Exception;

	/**
	 * ����name��ѯ���ݿ��еļ�¼
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public Customer queryByName(Customer customer) throws Exception;

	/**
	 * �������ֻ�ȡ����
	 * 
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public List<Customer> queryByCustName(int begin, int pageSize, String custName) throws Exception;

	/**
	 * ������ϵ��id���Ҹ���ϵ�������еĿͻ���¼
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Customer> ListCustomerByLinkId(String linkid) throws Exception;

	/**
	 * ��ѯ���ݿ������еļ�¼
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Customer> findPage(int begin, int pageSize) throws Exception;

	/**
	 * ��ÿͻ�������(�ͻ�����)
	 * 
	 * @param cust_name
	 * @return
	 * @throws Exception
	 */

	public int count(String cust_name) throws Exception;

	/**
	 * ��ÿͻ��б�
	 * 
	 * @param cust_name
	 * @return
	 * @throws Exception
	 */
	public List<Customer> ListCustomer();

}
