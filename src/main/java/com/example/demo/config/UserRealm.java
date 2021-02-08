package com.example.demo.config;

import com.example.demo.dao.InfoService;
import com.example.demo.dao.administratorMapper;
import com.example.demo.dao.operatorMapper;
import com.example.demo.pojo.Info;
import com.example.demo.pojo.administratorDao;
import com.example.demo.pojo.operatorDao;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
public class UserRealm{
//
//    @Autowired
//    InfoService service;
//
//    //授权
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        System.out.println("执行了授权 doGetAuthorizationInfo");
//        SimpleAuthorizationInfo simpInfo = new SimpleAuthorizationInfo();
//        //获取当前用户的对象
//        Subject subject=SecurityUtils.getSubject();
//        Info user = (Info)subject.getPrincipal();//获取用户信息
//        simpInfo.addStringPermission(user.getPerm());//获取数据库权限
//        return simpInfo;
//    }
//
//    //认证
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        System.out.println("执行了认证 doGetAuthorizationInfo");
//        //获取当前的用户
//        Subject subject = SecurityUtils.getSubject();
//        UsernamePasswordToken userToken=(UsernamePasswordToken)authenticationToken;//获取登录的信息
//        //获取用户名 密码  数据库取
//        System.out.println(userToken.getUsername());
//        Info query = service.queryByName(userToken.getUsername());
//        System.out.println(query);
//        if(query==null){//没有这个用户
//            return null;
//        }
//        Session session=subject.getSession();//获取用户的session
//        session.setAttribute("loginuser",query);
//
//        if(!userToken.getUsername().equals(query.getUsername())){//判断登录的用户名密码 匹配数据库是否正确
//            return null;//抛出异常
//        }
//        //密码认证，shiro做
//        return new SimpleAuthenticationInfo(query,query.getPassword(),"");
//    }
}
//public class UserRealm extends AuthorizingRealm {
//
//    @Autowired(required = false)
//    private operatorMapper operatorMapper;
//    @Autowired(required = false)
//    private administratorMapper administratorMapper;
//
//    private final Logger logger= LoggerFactory.getLogger(UserRealm.class);
//    /**
//     * 执行授权逻辑
//     */
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
//        logger.info("执行逻辑授权");
//
//        //给资源进行授权
//        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        //添加资源的授权字符串
//        //info.addStringPermission("user:add");
//
//        //到数据库查询当前登录用户的授权字符串
//        //获取当前登录用户
//        Subject subject = SecurityUtils.getSubject();
//
//        if(((String)subject.getSession().getAttribute("role")).equals("administrator"))
//            info.addRole("administrator");
//        if(((String)subject.getSession().getAttribute("role")).equals("operator"))
//            info.addRole("operator");
//        return info;
//    }
//    /**
//     * 执行认证逻辑
//     */
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
//        System.out.println("执行认证逻辑");
//        //判断身份
//        //编写shiro判断逻辑，判断用户名和密码
//        //1.判断用户名
//        String role=(String) SecurityUtils.getSubject().getSession().getAttribute("role");
//        UsernamePasswordToken token = (UsernamePasswordToken)arg0;
//        if(role.equals("operator")) {
//            operatorDao operator = operatorMapper.selectByPrimaryKey(token.getUsername());
//            if (operator == null) {
//                //用户名不存在
//                return null;//shiro底层会抛出UnKnowAccountException
//            }
//            //2.判断密码 存入姓名
//            SecurityUtils.getSubject().getSession().setAttribute("name",operator.getOperatorName());
//            return new SimpleAuthenticationInfo(operator,operator.getPassword(),"");
//        }
//        else {
//            administratorDao administrator = administratorMapper.selectByPrimaryKey(token.getUsername());
//            if(administrator==null)
//            {
//                return  null;
//            }
//            return new SimpleAuthenticationInfo(administrator, administrator.getPassword(),"");
//
//        }
//
//
//
//    }
//}
