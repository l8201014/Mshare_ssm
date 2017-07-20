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
 * Created by Administrator on 2017/5/26.
 */
@Controller
@RequestMapping("/user1")
public class UserTest {
    @Resource
    private UserService userService;
    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        /*UserEntity user = userService.selectByPrimaryKey();
        List<UserEntity> userList = new ArrayList<UserEntity>();
        userList.add(user);*/
        List<User> userList = userService.showUser();
        model.addAttribute("userList",userList);
        //request.getSession().getServletContext().setAttribute("userList",userList);
        return "jsp/showUser";
    }
}
