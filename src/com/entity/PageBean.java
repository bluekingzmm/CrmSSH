/**
 * 
 */
package com.entity;

import java.util.List;

/**
 * @author Administrator
 *
 */
public class PageBean {

	
	private Integer pageNo;//��ǰҳ
	private Integer totalCount;//�ܼ�¼��
	private Integer pageSize;//ÿҳ��ʾ��¼��
	private Integer begin;//��ʼλ��
	private Integer totalPage;//��ҳ��
	private List<Customer> list;//ÿҳ��¼��list����
	private List<LinkMan> list_linkman;
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getBegin() {
		return begin;
	}
	public void setBegin(Integer begin) {
		this.begin = begin;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public List<Customer> getList() {
		return list;
	}
	public void setList(List<Customer> list) {
		this.list = list;
	}
	

	public List<LinkMan> getList_linkman() {
		return list_linkman;
	}
	public void setList_linkman(List<LinkMan> list_linkman) {
		this.list_linkman = list_linkman;
	}
	@Override
	public String toString() {
		return "PageBean [pageNo=" + pageNo + ", totalCount=" + totalCount + ", pageSize=" + pageSize + ", begin="
				+ begin + ", totalPage=" + totalPage + ", list=" + list + ", list_linkman=" + list_linkman + "]";
	}
	
	

}
