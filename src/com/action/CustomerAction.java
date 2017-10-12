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

	// ģ������
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
	
	// ע��ͻ�����service

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	// ��ǰҳ��
	private int pageNo=1;

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	private List<Customer> cList;

	public List<Customer> getcList() {
		return cList;
	}

	/**
	 * ��ӿͻ���Ϣ
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
	 * �޸Ŀͻ���Ϣ�������ͻ��޸Ľ���
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
	 * �޸Ŀͻ���Ϣ
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
	 * ɾ���ͻ���Ϣ
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
	 * ��ӿͻ���Ϣ�������ͻ���ӽ���
	 * 
	 * @return
	 * @throws Exception
	 */
	public String create() throws Exception {
		return "add";
	}

	/**
	 * ��ҳ�ķ���
	 * 
	 * @return
	 */
	public String list() {
		// ����service�ķ���ʵ�ַ�װ
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
