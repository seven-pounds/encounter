package com.sevenpounds.encounter.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by jingzfan on 11/8/2018.
 */
@Controller
@RequestMapping(value = "/user" )
public class UserController {
    @RequestMapping(value = "/registerPage")
    public String register() {
        // 转发至店铺注册/编辑页面
        return "user/register";
    }
    @RequestMapping(value = "/loginPage")
    public String login() {
        // 转发至店铺注册/编辑页面
        return "user/login";
    }
    @RequestMapping(value = "/index")
    public String toIndex() {
        // 转发至店铺注册/编辑页面
        return "/index.html";
    }
}
