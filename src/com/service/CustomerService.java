package com.service;

import java.util.List;

import com.entity.Customer;
import com.entity.PageBean;
/**
 * �ͻ������ҵ���ӿ�ʵ����
 * @author zmm
 */
public interface CustomerService {

	Customer isExist(Customer customer)throws Exception;

	void save(Customer customer) throws Exception;

	Customer getCustomerByCustId(Customer customer)throws Exception;

	void updateCustomer(Customer customer)throws Exception;

	void deleteCustomer(Customer customer)throws Exception;

	PageBean listPage(int pageNo, String cust_name)throws Exception;

	List<Customer> listCustomer();

}
