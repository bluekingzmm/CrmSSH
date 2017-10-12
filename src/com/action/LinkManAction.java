package com.action;

import java.util.List;

import com.entity.Customer;
import com.entity.LinkMan;
import com.entity.PageBean;
import com.opensymphony.xwork2.ModelDriven;
import com.service.CustomerService;
import com.service.LinkManService;

public class LinkManAction extends BaseAction implements ModelDriven<LinkMan> {
	private static final long serialVersionUID = 1L;

	private LinkMan linkman=new LinkMan();
	private int pageNo=1;

	public LinkMan getLinkman() {
		return linkman;
	}

	private LinkManService linkManService;

	private CustomerService customerService;

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public void setLinkManService(LinkManService linkManService) {
		this.linkManService = linkManService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	// ��������ҳ��
	public String create() throws Exception {
		// ��ѯ���пͻ�������ҳ������ʾ
		List<Customer> cList = customerService.listCustomer();
		request.setAttribute("cList", cList);
		return "add";
	}

	/**
	 * ������ϵ��
	 * 
	 * @return
	 * @throws Exception
	 */
	public String add() throws Exception {
		System.out.println("add"+linkman.toString());
		try {
			if (linkManService.isExist(linkman) == null) {
				linkManService.save(linkman);
				return "success";

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ERROR;

	}

	/**
	 * �޸���ϵ����Ϣ�������ͻ��޸Ľ���
	 * 
	 * @return
	 */
	public String update() {
		try {
			List<Customer> cList = customerService.listCustomer();
			LinkMan linkMan = linkManService.getLinkManById(linkman);
			if (linkMan != null) {
				request.setAttribute("cList", cList);
				request.setAttribute("linkman", linkMan);
				return "update";
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "error";
	}

	/**
	 * �޸���ϵ����Ϣ
	 * 
	 * @return
	 */
	public String edit() {
		try {

			linkManService.updateLinkMan(linkman);
			return "success";

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "error";
	}

	/**
	 * ɾ����ϵ����Ϣ
	 * 
	 * @return
	 */
	public String delete() {
		try {

			if (linkManService.getLinkManById(linkman) != null) {
				linkManService.deleteLinkMan(linkman);
				return "success";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "error";
	}

	/**
	 * ��ҳ�ķ���
	 * 
	 * @return
	 */
	public String list() {
		// ����service�ķ���ʵ�ַ�װ
		System.out.println("ooo"+linkman.toString());
		PageBean pb = null;
		try {
			pb = linkManService.listPage(pageNo, linkman.getLkm_name());
			request.setAttribute("pageBean", pb);
			System.out.println(pb + "pb");
			return "list";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "error";

	}

	@Override
	public LinkMan getModel() {
		// TODO Auto-generated method stub
		return linkman;
	}

}
