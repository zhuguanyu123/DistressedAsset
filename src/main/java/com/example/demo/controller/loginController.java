package com.example.demo.controller;

import com.example.demo.dao.InfoService;
import com.example.demo.dao.operatorMapper;
import com.example.demo.pojo.Info;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Controller
public class loginController {
//    @RequestMapping("/login")
//    public String login(String username,String password){
//        try {
//            //获取当前的用户
//            Subject subject = SecurityUtils.getSubject();
//            //封装用户的登录数据
//            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, password);
//            subject.login(usernamePasswordToken);//执行登录的方法 没有异常就成功了
//            return "index";
//        } catch (UnknownAccountException e) {
//            /**
//             * 异常信息
//             * UnknownAccountException ：用户名不存在
//             * IncorrectCredentialsException：密码错误
//             */
//            e.printStackTrace();
//            System.out.println("用户名不存在");
//        }catch (IncorrectCredentialsException e){
//            System.out.println("密码错误");
//        }
//        return "login";
//    }
//
//    @RequestMapping("/add")
//    public String add(){//跳转页面
//        return "add";
//    }
//    @RequestMapping("/del")
//    public String delete(){//跳转页面
//        return "delete";
//    }
//    @RequestMapping("/Unauthorized")
//    public String Unauthorized(){//没有权限跳转的url
//        return "Unauthorized";
//    }
//    //注销
//    @RequestMapping("/logout")
//    public String logout() {
//        Subject subject = SecurityUtils.getSubject();
//        Session session = subject.getSession();
//        session.setAttribute("loginuser",null);//清空session
//        return "login";
//    }
//    @RequestMapping("/login")
//    public String login(String username,String password){
//        try {
//            //获取当前的用户
//            Subject subject = SecurityUtils.getSubject();
//            //封装用户的登录数据
//            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, password);
//            subject.login(usernamePasswordToken);//执行登录的方法 没有异常就成功了
//            return "index";
//        } catch (UnknownAccountException e) {
//            /**
//             * 异常信息
//             * UnknownAccountException ：用户名不存在
//             * IncorrectCredentialsException：密码错误
//             */
//            e.printStackTrace();
//            System.out.println("用户名不存在");
//        }catch (IncorrectCredentialsException e){
//            System.out.println("密码错误");
//        }
//        return "login";
//
//    }
//
//
////    @RequestMapping("/login")
////    public String login(String username,String password){
////        try {
////            //获取当前的用户
////            Subject subject = SecurityUtils.getSubject();
////            //封装用户的登录数据
////            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, password);
////            subject.login(usernamePasswordToken);//执行登录的方法 没有异常就成功了
////            return "index";
////        } catch (UnknownAccountException e) {
////            /**
////             * 异常信息
////             * UnknownAccountException ：用户名不存在
////             * IncorrectCredentialsException：密码错误
////             */
////            e.printStackTrace();
////            System.out.println("用户名不存在");
////        }catch (IncorrectCredentialsException e){
////            System.out.println("密码错误");
////        }
////        return "login";
////    }
//
//    @RequestMapping("/add")
//    public String add(){//跳转页面
//        return "add";
//    }
//    @RequestMapping("/del")
//    public String delete(){//跳转页面
//        return "delete";
//    }
//    @RequestMapping("/Unauthorized")
//    public String Unauthorized(){//没有权限跳转的url
//        return "Unauthorized";
//    }
//    //注销
//    @RequestMapping("/logout")
//    public String logout() {
//        Subject subject = SecurityUtils.getSubject();
//        Session session = subject.getSession();
//        session.setAttribute("loginuser",null);//清空session
//        return "login";
//    }
//
//    @Autowired
//    InfoService service;
//    @RequestMapping({"/","tologin"})
//    public String tologin(){
//        return "login";
//    }
//    @RequestMapping("/showuser")
//    @ResponseBody
//    public void showuser(){
//        Info dj = service.queryByName("dj");
//        System.out.println(dj);
//    }

//    @RequestMapping({"/","tologin"})
//    public String tologin(){
//        return "login";
//    }
//    @Autowired(required = false)
//    private operatorMapper operatorMapper;
//    @ResponseBody
//    @PostMapping("operatorLogin")
//    public String operatorLogin(String username, String password, HttpServletRequest request) {
//        Subject subject = SecurityUtils.getSubject();
//        subject.getSession().setAttribute("role","operator");
//        //2.封装用户数据
//        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
//
//        //3.执行登录方法
//        try {
//            subject.login(token);
//            //登录成功
//            //跳转到test.html
//            request.getSession().setAttribute("operatorId",username);
//            return "redirect:operator";
//        } catch (UnknownAccountException e) {
//            //e.printStackTrace();
//            //登录失败:用户名不存在
//            return "redirect:login.html";
//        }catch (IncorrectCredentialsException e) {
//            //e.printStackTrace();
//            //登录失败:密码错误
//            return "redirect:login.html";
//        } catch (Exception e)
//        {
//            e.printStackTrace();
//            return "redirect:login.html";
//        }
//    }
//
//    @PostMapping("administratorLogin")
//    public String administratorLogin(String username, String password, HttpServletRequest request) {
//        Subject subject = SecurityUtils.getSubject();
//        subject.getSession().setAttribute("role","administrator");
//        //2.封装用户数据
//        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
//
//        //3.执行登录方法
//        try {
//            subject.login(token);
//            //登录成功
//            //跳转到test.html
//            request.getSession().setAttribute("administratorId",username);
//            return "redirect:administrator";
//        } catch (UnknownAccountException e) {
//            //e.printStackTrace();
//            //登录失败:用户名不存在
//            return "redirect:loginAdministrator.html";
//        }catch (IncorrectCredentialsException e) {
//            //e.printStackTrace();
//            //登录失败:密码错误
//            return "redirect:loginAdministrator.html";
//        } catch (Exception e)
//        {
//            e.printStackTrace();
//            return "redirect:loginAdministrator.html";
//        }
//    }
}
