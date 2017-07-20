package com.zwn.controller;

import com.zwn.model.User;
import com.zwn.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2017/5/31.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    //登陆
    @RequestMapping("/login")
    public String login(HttpServletRequest request, Model model){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        List<User> list = userService.login(username,password);
        int i = list.size();
        if(i==1){
            TestRedis.getJedis().set("username",username);
            return "admin-jsp/index";
        }else{
            return "admin-jsp/welcome";
        }
    }
    @RequestMapping("/regist")

    public String regist(HttpServletRequest request, Model model){

        String a = TestRedis.getJedis().get("username");
        request.getSession().getServletContext().setAttribute("username",a);
        return "admin-jsp/regist";
    }

}
