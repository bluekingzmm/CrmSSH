package com.service;

import com.entity.LinkMan;
import com.entity.PageBean;

public interface LinkManService {

	LinkMan isExist(LinkMan linkman) throws Exception;

	void save(LinkMan linkman) throws Exception;

	LinkMan getLinkManById(LinkMan linkman) throws Exception;

	void deleteLinkMan(LinkMan linkman) throws Exception;

	void updateLinkMan(LinkMan linkman) throws Exception;

	PageBean listPage(int begin, String lkm_name) throws Exception;

}
