package com.dao;

import java.util.List;

import com.entity.LinkMan;

public interface LinkManDao {

	public void save(LinkMan linkman) throws Exception;

	public void update(LinkMan linkman) throws Exception;

	public void delete(LinkMan linkman) throws Exception;

	public List<LinkMan> listLinkManAll(int begin, int pageSize) throws Exception;

	public LinkMan queryById(LinkMan linkman) throws Exception;

	public List<LinkMan> queryByName(int begin, int pageSize, String linkName) throws Exception;

	public LinkMan isExist(LinkMan linkman);

	public int count(String linkName) throws Exception;

}
