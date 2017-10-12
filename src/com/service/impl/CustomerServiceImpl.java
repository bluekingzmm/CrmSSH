package com.service.impl;

import java.util.List;

import com.dao.CustomerDao;
import com.entity.Customer;
import com.entity.PageBean;
import com.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	// ע��serviceDao
	private CustomerDao customerDao;



	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public void save(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		customerDao.save(customer);
	}

	public List<Customer> getAllCustomerByCustName(int pageNo, Integer pageSize, String cust_name)
			throws Exception {
		// TODO Auto-generated method stub
		return customerDao.queryByCustName(pageNo, pageSize, cust_name);
	}

	public Customer getCustomerByCustId(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return customerDao.queryById(customer);
	}

	public List<Customer> getCustomerByLinkId(String linkid) throws Exception {
		// TODO Auto-generated method stub
		return customerDao.ListCustomerByLinkId(linkid);
	}

	public void deleteCustomer(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		customerDao.delete(customer);
	}

	public void updateCustomer(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		customerDao.update(customer);
	}

	public Customer isExist(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		if (customer == null) {
			return null;
		}
		Customer cust = customerDao.queryByName(customer);
		if (cust == null) {
			return null;
		} else {
			return customer;
		}
	}

	// ��װ��ҳ���ݵ�pageBean��
	public PageBean listPage(int pageNo, String cust_name) throws Exception {
		// ����pageBean
		PageBean pb = new PageBean();

		// ��ǰҳ
		pb.setPageNo(pageNo);

		// �ܼ�¼��
		int totalCount = customerDao.count(cust_name);
		pb.setTotalCount(totalCount);

		// ÿҳ��ʾ��¼��
		int pageSize = 3;

		// ��ҳ��
		// �ܼ�¼��������Ҳ��ʾ��¼��
		// �ܹ�����
		int totalPage = 0;
		if (totalCount % pageSize == 0) {
			totalPage = totalCount / pageSize;
		} else {
			totalPage = totalCount / pageSize + 1;

		}
		pb.setTotalPage(totalPage);
		int begin = (pageNo - 1) * pageSize;
		List<Customer> list = null;
		if (cust_name == null || cust_name.equals("")) {
			list = customerDao.findPage(begin, pageSize);
		} else {
			System.out.println("cust_name"+cust_name);
			System.out.println("totalCount:"+customerDao.count(cust_name));
			list = customerDao.queryByCustName(begin, pageSize, cust_name);
			System.out.println("pbService"+pb.toString());

		}
		pb.setList(list);

		return pb;
	}


	public List<Customer> listCustomer() {
		// TODO Auto-generated method stub
		return customerDao.ListCustomer();
	}



}
