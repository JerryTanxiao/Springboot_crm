package com.controller;

import com.annotation.LogAction;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @LogAction(type = "查询",content = "用户登录操作")
    @PostMapping("/login")
    public String login(@RequestParam("uname") String uname, @RequestParam("pwd") String pwd) {
        System.out.println(">>>>>>>>>>>>>>>>>>>> uname : " + uname + " pwd : " + pwd);
        UsernamePasswordToken token = new UsernamePasswordToken(uname, pwd);
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        return "index1";
    }
}
