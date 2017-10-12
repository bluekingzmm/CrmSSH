package com.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.dao.LinkManDao;
import com.entity.LinkMan;

@Transactional
public class LinkManInfoDaoImpl extends HibernateDaoSupport implements LinkManDao {

	@Override
	public void save(LinkMan linkman) throws Exception {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(linkman);
	}

	@Override
	public void update(LinkMan linkman) throws Exception {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(linkman);

	}

	@Override
	public void delete(LinkMan linkman) throws Exception {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(linkman);
	}

	@SuppressWarnings("unchecked")
	public List<LinkMan> listLinkManAll(int begin, int pageSize) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("uoui");
		DetachedCriteria criteria = DetachedCriteria.forClass(LinkMan.class);
		List<LinkMan> list = this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		System.out.println("ll"+list.toString());
		return list;
	}

	@Override
	public LinkMan queryById(LinkMan linkman) throws Exception {
		// TODO Auto-generated method stub
		LinkMan linkMan = this.getHibernateTemplate().get(linkman.getClass(), linkman.getLkm_id());
		return linkMan;
	}

	@SuppressWarnings("unchecked")
	public List<LinkMan> queryByName(int begin, int pageSize, String linkName) throws Exception {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(LinkMan.class);
		criteria.add(Restrictions.like("lkm_name", "%" + linkName + "%"));
		List<LinkMan> lList = (List<LinkMan>) this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return lList;
	}

	@SuppressWarnings("unchecked")
	public LinkMan isExist(LinkMan linkman) {
		// TODO Auto-generated method stub
		String hql = "from LinkMan where lkm_name=?";
		List<LinkMan> cList = this.getHibernateTemplate().find(hql, linkman.getLkm_name());
		if (cList.size() > 0) {
			// 查到数据返回第一个
			System.out.println("you");

			return cList.get(0);
		}
		System.out.println("isNoExist");
		return null;
	}

	@SuppressWarnings("unchecked")
	public int count(String linkName) throws Exception {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(LinkMan.class);
		if (linkName != null) {
			criteria.add(Restrictions.like("lkm_name", "%" + linkName + "%"));
		}
		List<LinkMan> lList = (List<LinkMan>) this.getHibernateTemplate().findByCriteria(criteria);
		return lList.size();
	}

}
