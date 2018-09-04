package com.sevenpounds.encounter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "user", method = { RequestMethod.GET })
public class UserController {
	@RequestMapping(value = "/register")
	public String register() {
		return "user/register";
	}

}
