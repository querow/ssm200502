package com.fs.controller;

import com.fs.model.User;
import org.apache.shiro.web.filter.mgt.DefaultFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author ss
 * @Date 2020/7/27 10:01
 * @Version 1.0
 */
@Controller
@RequestMapping("tc")
public class TestController {

    @RequestMapping("demo.do")
    public String demo(){
        return "1111";
    }

    @RequestMapping("firstShiro.do")
    public String firstShiro(){
        return "login";
    }

    @RequestMapping("demo2.do")
    public String demo2(){
        return "2222";
    }
    @RequestMapping("demo3.do")
    public String demo3(){
        return "3333";
    }

    /*接收ajax请求传过来的数组  通过设置  traditional:true*/
    @RequestMapping(value = "demo1.ajax",produces = "application/text;charset=utf-8")
    @ResponseBody
    public String demo1(HttpServletRequest request, String[] a, HttpServletResponse response){
        //response.setContentType("text/html;charset=utf-8");
       /* String[] strings = request.getParameterValues("a[]");
        for (String s:
             strings) {
            System.out.println(s);
        }*/
        for (String s: a) {
            System.out.println(s);
        }
        return "";
    }

    /*接收ajax请求传过来的数组  直接传对象的方式来解析*/
    @RequestMapping(value = "demo2.ajax",produces = "application/json;charset=utf-8")
    @ResponseBody
    public List<User> demo2(@RequestBody List<User> users){
        //response.setContentType("text/html;charset=utf-8");
       /* String[] strings = request.getParameterValues("a[]");
        for (String s:
             strings) {
            System.out.println(s);
        }*/
        System.out.println(users);
        return users;
    }

    /*使用表单的序列化提交*/
    @RequestMapping(value = "demo3.ajax",produces = "application/text;charset=utf-8")
    @ResponseBody
    public String demo3(User user){
        //response.setContentType("text/html;charset=utf-8");
       /* String[] strings = request.getParameterValues("a[]");
        for (String s:
             strings) {
            System.out.println(s);
        }*/
        System.out.println(user);
        return "success";
    }

    /*ajax的跨域访问*/
    @RequestMapping(value = "demo4.ajax",produces = "application/text;charset=utf-8")
    @ResponseBody
    public String demo4(HttpServletResponse resp){
        //允许所有域名访问该资源
        resp.setHeader("Access-Control-Allow-Origin","*");
        /*resp.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        resp.setHeader("Access-Control-Max-Age", "3600");*/
        resp.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        /*  resp.setHeader("Access-Control-Allow-Credentials","true");*/
        System.out.println("wo  jin  lai！");
       return "success";
    }


}
