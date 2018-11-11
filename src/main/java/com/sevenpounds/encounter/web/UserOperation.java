package com.sevenpounds.encounter.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sevenpounds.encounter.dao.UserDao;
import com.sevenpounds.encounter.entity.User;
import com.sevenpounds.encounter.service.UserService;

import com.sevenpounds.encounter.util.HttpServletRequestUtil;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserOperation {

    @Autowired
    private UserService userService;
    private static final Logger logger = LoggerFactory.getLogger(UserOperation.class);

    @RequestMapping(value = "/register")
    @ResponseBody
    public Map<String, Object> register(HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
//        modelMap.put("success", true);
        String userStr = HttpServletRequestUtil.getString(request, "userStr");
        ObjectMapper mapper = new ObjectMapper();
        User user = null;
        try {
            JSONObject jsonObj = new JSONObject(userStr);
            String userName = jsonObj.getString("userName");

            if ("fjz".equalsIgnoreCase(userName)) {
                modelMap.put("success", true);
                modelMap.put("userName", userName);
            } else {
                modelMap.put("success", false);
            }

        } catch (Exception e) {
            modelMap.put("errMsg", e.getMessage());
            return modelMap;
        }
        return modelMap;
    }


    @RequestMapping(value = "/login")
    @ResponseBody
    public Map<String, Object> login(HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        String userStr = HttpServletRequestUtil.getString(request, "userStr");

        try {
            JSONObject jsonObj = new JSONObject(userStr);


        } catch (Exception e) {
            modelMap.put("errMsg", e.getMessage());
            return modelMap;
        }
        return modelMap;
    }


}
