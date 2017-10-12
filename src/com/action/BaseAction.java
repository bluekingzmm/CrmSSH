package com.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	protected ActionContext context=ActionContext.getContext();
	protected Map<String, Object> session=context.getSession();
	
	protected HttpServletResponse response=(HttpServletResponse) context.get(ServletActionContext.HTTP_RESPONSE);
	protected HttpServletRequest request=(HttpServletRequest) context.get(ServletActionContext.HTTP_REQUEST);



}
