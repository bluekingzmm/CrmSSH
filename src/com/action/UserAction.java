package com.action;

import com.entity.User;
import com.service.UserService;

public class UserAction extends BaseAction {
	private static final long serialVersionUID = 1L;

	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	// 用户登录
	public String login() {
		User u = null;
		try {
			u = userService.login(user);
			if (u != null) {
				session.put("user", u);
				return "index";
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("msg", "用户名或密码错误 ");
		return "login";
	}

	// 注销
	public String quit() {
		request.getSession().invalidate();
		return SUCCESS;
	}
}
