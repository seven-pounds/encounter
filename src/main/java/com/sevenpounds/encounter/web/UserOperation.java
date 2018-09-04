package com.sevenpounds.encounter.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "user", method = { RequestMethod.GET })
public class UserOperation {
	@RequestMapping(value = "/register")
	public String register() {
		// 转发至店铺注册/编辑页面
		return "user/register";
	}

}
