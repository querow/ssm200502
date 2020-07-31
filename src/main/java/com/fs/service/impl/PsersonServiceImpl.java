package com.fs.service.impl;

import com.fs.model.Person;
import com.fs.service.PsersonService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.mgt.DefaultFilter;
import org.springframework.stereotype.Service;

/**
 * @ClassName PsersonServiceImpl
 * @Description TODO
 * @Author ss
 * @Date 2020/7/28 14:45
 * @Version 1.0
 */
@Service
public class PsersonServiceImpl implements PsersonService {
    @Override
    public String checkLogin(Person p) {
        //1.拿到当前用户
        Subject s = SecurityUtils.getSubject();
        s.hasRole("admin");
        //2.判断当前用户是否被认证，并做相关处理
        if(!s.isAuthenticated()){
            //UsernamePasswordToken 令牌类  稍后会把保存在里面账号密码和shiro的身份和凭证比对
            UsernamePasswordToken upt = new UsernamePasswordToken(p.getPersonName(),p.getPersonPassword());
            upt.setRememberMe(true);
            try {
                //进行认证(因为我们写了自定义的realm类，所以会自动到realm类里面去认证)
                s.login(upt);
                //登录成功
                //保存用户名在session
                s.getSession().setAttribute("userName",p.getPersonName());
                return "success";
            }catch (AuthenticationException e){
                //登录失败
                return "ERROR";
            }
        }else {

        }
        return null;
    }
    @RequiresRoles(value={"admin","user"},logical= Logical.AND)
    @Override
    public void testAnnotions() {
        System.out.println("测试注解！！！");
    }
}
