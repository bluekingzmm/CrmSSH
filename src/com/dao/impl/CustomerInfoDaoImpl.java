package com.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CustomerDao;
import com.entity.Customer;

@Transactional
/*
 * 声明这个service所有方法需要事务管理。每一个业务方法开始时都会打开一个事务。
 */
public class CustomerInfoDaoImpl extends HibernateDaoSupport implements CustomerDao {

	public void save(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(customer);

	}

	public void update(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(customer);
	}

	public void delete(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(customer);
	}

	public Customer queryById(Customer customer) throws Exception {
		Customer cust = null;
		cust = this.getHibernateTemplate().get(Customer.class, customer.getCust_id());
		return cust;
	}

	@SuppressWarnings("unchecked")
	public Customer queryByName(Customer customer) throws Exception {
		String hql = "from Customer where cust_name=?";
		List<Customer> cList = this.getHibernateTemplate().find(hql, customer.getCust_name());
		if (cList.size() > 0) {
			// 查到数据返回第一个
			return cList.get(0);
		}
		return null;
	}

	@SuppressWarnings("all")

	public List<Customer> queryByCustName(int begin, int pageSize, String custName) throws Exception {
		// List<Customer> cList = (List<Customer>)
		// this.getHibernateTemplate().find("from Customer where cust_name like
		// ?",
		// "%" + custName);
		DetachedCriteria criteria = DetachedCriteria.forClass(Customer.class);
		criteria.add(Restrictions.like("cust_name", "%" + custName + "%"));
		List<Customer> cList = (List<Customer>) this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return cList;
	}

	@SuppressWarnings("all")

	public List<Customer> ListCustomerByLinkId(String linkid) throws Exception {
		Criteria criteria = this.getSession().createCriteria(Customer.class, "cust");
		criteria.add(Restrictions.eq("cust.lkmLinkMans.lkm_id", linkid));
		List<Customer> list = criteria.list();
		System.out.println(list);
		return list;
	}

	// 获取总记录数

	@SuppressWarnings("unchecked")
	public int count(String cust_name) throws Exception {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(Customer.class);
		if (cust_name != null) {
			criteria.add(Restrictions.like("cust_name", "%" + cust_name + "%"));
		}
		List<Customer> cList = (List<Customer>) this.getHibernateTemplate().findByCriteria(criteria);
		return cList.size();
	}

	// 显示分页列表
	@SuppressWarnings("unchecked")
	public List<Customer> findPage(int begin, int pageSize) {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(Customer.class);
		List<Customer> list = this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return list;
	}

	@SuppressWarnings("unchecked")
	public List<Customer> ListCustomer() {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(Customer.class);
		List<Customer> list = this.getHibernateTemplate().findByCriteria(criteria);
		return list;
	}

}
