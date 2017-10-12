package com.action;

import java.util.List;

import com.entity.Customer;
import com.entity.PageBean;
import com.opensymphony.xwork2.ModelDriven;
import com.service.CustomerService;
public class CustomerAction extends BaseAction implements ModelDriven<Customer> {
	private static final long serialVersionUID = 1L;
	private CustomerService customerService;

	private Customer customer = new Customer();

	// 模型驱动
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
	
	// 注入客户管理service

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	// 当前页数
	private int pageNo=1;

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	private List<Customer> cList;

	public List<Customer> getcList() {
		return cList;
	}

	/**
	 * 添加客户信息
	 * 
	 * @return
	 */
	public String add() {

		try {
			if (customerService.isExist(customer) == null) {
				customerService.save(customer);
				return "success";

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ERROR;

	}

	/**
	 * 修改客户信息，跳到客户修改界面
	 * 
	 * @return
	 */
	public String update() {
		try {
			Customer cust = customerService.getCustomerByCustId(customer);
			if (cust != null) {
				request.setAttribute("customer", cust);
				return "update";
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "error";
	}

	/**
	 * 修改客户信息
	 * 
	 * @return
	 */
	public String edit() {
		try {

			customerService.updateCustomer(customer);
			return "success";

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "error";
	}

	/**
	 * 删除客户信息
	 * 
	 * @return
	 */
	public String delete() {
		try {

			if (customerService.getCustomerByCustId(customer) != null) {
				customerService.deleteCustomer(customer);
				return "success";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "error";
	}

	/**
	 * 添加客户信息，跳到客户添加界面
	 * 
	 * @return
	 * @throws Exception
	 */
	public String create() throws Exception {
		return "add";
	}

	/**
	 * 分页的方法
	 * 
	 * @return
	 */
	public String list() {
		// 调用service的方法实现封装
		PageBean pb = null;
		try {
			pb = customerService.listPage(pageNo, customer.getCust_name());
			request.setAttribute("pageBean", pb);
			System.out.println(pb+"pb");
			return "list";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "error";

	}

}
