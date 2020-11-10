package com.atb.mumushop.user.controller;

import com.atb.mumushop.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by atb1998 on 2020/11/10.
 */
@Controller
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/index")
    @ResponseBody
    public String hello(){
        return "hello";
    }

}
