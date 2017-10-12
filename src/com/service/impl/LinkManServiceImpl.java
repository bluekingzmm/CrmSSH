package com.service.impl;

import java.util.List;

import com.dao.LinkManDao;
import com.entity.LinkMan;
import com.entity.PageBean;
import com.service.LinkManService;

public class LinkManServiceImpl implements LinkManService {
	private LinkManDao linkManDao;

	public void setLinkManDao(LinkManDao linkManDao) {
		this.linkManDao = linkManDao;
	}

	public PageBean listPage(int pageNo, String link_name) throws Exception {
		// 创建pageBean
		PageBean pb = new PageBean();

		// 当前页
		pb.setPageNo(pageNo);

		// 总记录数
		int totalCount = linkManDao.count(link_name);
		pb.setTotalCount(totalCount);

		// 每页显示记录数
		int pageSize = 3;

		// 总页数
		// 总记录数除以美也显示记录数
		// 能够整除
		int totalPage = 0;
		if (totalCount % pageSize == 0) {
			totalPage = totalCount / pageSize;
		} else {
			totalPage = totalCount / pageSize + 1;

		}
		pb.setTotalPage(totalPage);
		int begin = (pageNo - 1) * pageSize;
		List<LinkMan> list = null;
		if (link_name == null || link_name.equals("")) {
			list = linkManDao.listLinkManAll(begin, pageSize);
		} else {
			list = linkManDao.queryByName(begin, pageSize, link_name);

		}
		pb.setList_linkman(list);
		return pb;
	}

	public List<LinkMan> getAllLinkManByLinkManName(int begin, int pageSize, String link_name) throws Exception {
		// TODO Auto-generated method stub
		return linkManDao.queryByName(begin, pageSize, link_name);
	}

	public void deleteLinkMan(LinkMan linkman) throws Exception {
		// TODO Auto-generated method stub
		linkManDao.delete(linkman);
	}

	public void updateLinkMan(LinkMan linkman) throws Exception {
		// TODO Auto-generated method stub
		linkManDao.update(linkman);
	}

	public LinkMan isExist(LinkMan linkman) throws Exception {
		// TODO Auto-generated method stub
		return linkManDao.isExist(linkman);
	}

	public void save(LinkMan linkman) throws Exception {
		// TODO Auto-generated method stub
		linkManDao.save(linkman);
	}

	public LinkMan getLinkManById(LinkMan linkman) throws Exception {
		// TODO Auto-generated method stub
		return linkManDao.queryById(linkman);
	}

}
