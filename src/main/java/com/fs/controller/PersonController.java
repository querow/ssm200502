package com.fs.controller;

import com.fs.model.Person;
import com.fs.service.PsersonService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.mgt.DefaultFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;


/**
 * @ClassName UserController
 * @Description TODO
 * @Author ss
 * @Date 2020/7/28 14:44
 * @Version 1.0
 */
@Controller
@RequestMapping("pc")
public class PersonController {
    @Autowired
    private PsersonService ps;

    @RequestMapping("checkLogin.ajax")
    @ResponseBody
    public String checkLogin(Person p, String isRemenber, HttpServletResponse response){
        //System.out.println(p);
        //交给业务层来进行 shiro认证
        String info = ps.checkLogin(p);
        System.out.println(isRemenber);
        return info;
    }
    //DefaultFilter //这个类里面定义所有shiro所有的过滤器
    @RequestMapping("success.do")
    public String success(){

        return "index";
    }

    //退出用户
    @RequestMapping("logout.ajax")
    @ResponseBody
    public String logout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "";
    }

    @RequestMapping("testAnnotions.do")
    public String testAnnotions(){
        ps.testAnnotions();
        return "list";
    }


    @RequestMapping("showWelcome.do")
    public String showWelcome(){
        //要获取服务器某些并通过EL表达式显示在welcome.jsp
        return "welcome";
    }


}
