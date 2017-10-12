package com.entity;

import java.util.HashSet;
import java.util.Set;

public class Customer {

	private String cust_id;
	private String cust_name;
	private String cust_level;
	private String cust_zip;
	private String cust_linkman;
	private String cust_phone;
	private String cust_mobile;
	private String cust_source;
	private String cust_fax;
	private String cust_website;
	private String cust_address;
//	private LinkMan lkmLinkMans;
	
	private Set<LinkMan> setLinkMan=new  HashSet<LinkMan>();
	
	public Set<LinkMan> getSetLinkMan() {
		return setLinkMan;
	}
	public void setSetLinkMan(Set<LinkMan> setLinkMan) {
		this.setLinkMan = setLinkMan;
	}
	
//	public LinkMan getLkmLinkMans() {
//		return lkmLinkMans;
//	}
//	public void setLkmLinkMans(LinkMan lkmLinkMans) {
//		this.lkmLinkMans = lkmLinkMans;
//	}
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_level() {
		return cust_level;
	}
	public void setCust_level(String cust_level) {
		this.cust_level = cust_level;
	}
	public String getCust_zip() {
		return cust_zip;
	}
	public void setCust_zip(String cust_zip) {
		this.cust_zip = cust_zip;
	}
	public String getCust_linkman() {
		return cust_linkman;
	}
	public void setCust_linkman(String cust_linkman) {
		this.cust_linkman = cust_linkman;
	}

	public String getCust_phone() {
		return cust_phone;
	}
	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}
	public String getCust_mobile() {
		return cust_mobile;
	}
	public void setCust_mobile(String cust_mobile) {
		this.cust_mobile = cust_mobile;
	}
	public String getCust_source() {
		return cust_source;
	}
	public void setCust_source(String cust_source) {
		this.cust_source = cust_source;
	}
	public String getCust_fax() {
		return cust_fax;
	}
	public void setCust_fax(String cust_fax) {
		this.cust_fax = cust_fax;
	}
	public String getCust_website() {
		return cust_website;
	}
	public void setCust_website(String cust_website) {
		this.cust_website = cust_website;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", cust_level=" + cust_level
				+ ", cust_zip=" + cust_zip + ", cust_linkman=" + cust_linkman + ", cust_phone=" + cust_phone
				+ ", cust_mobile=" + cust_mobile + ", cust_source=" + cust_source + ", cust_fax=" + cust_fax
				+ ", cust_website=" + cust_website + ", cust_address=" + cust_address + "]";
	}
	

}
