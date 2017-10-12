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

	
	private Integer pageNo;//当前页
	private Integer totalCount;//总记录数
	private Integer pageSize;//每页显示记录数
	private Integer begin;//开始位置
	private Integer totalPage;//总页数
	private List<Customer> list;//每页记录的list集合
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
