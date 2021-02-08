package com.example.demo.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class shiroConfig {
//
//    //3. shiroFilterfactaryBean
//    @Bean
//    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("getDefaultWebSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager){
//        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
//        shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager);//设置安全管理器
//        shiroFilterFactoryBean.setLoginUrl("/toLogin");//没有认证后跳到的页面
//        /**
//         * shiro的内置过滤器
//         anon：无需认证就可以访问 默认
//         authc：必须认证了才能访问
//         user：必须拥有记住我功能才能访问
//         perms：必须拥有对某个的权限才能访问
//         role：拥有某个角色权限才能访问
//         */
//        //添加shiro的内置过滤器  设置要拦截的url
//        Map<String,String> filterChainDefinitionMap=new LinkedHashMap<>();//拦截
//        filterChainDefinitionMap.put("/add","authc");// /add请求必须认证才能访问
//        filterChainDefinitionMap.put("/del","authc");//del必须认证才能访问
//        // filterChainDefinitionMap.put("user/**","authc");//支持通配符
//        //授权
//        filterChainDefinitionMap.put("/add","perms[user:add]");//没有这个user:add权限的会被拦截下来
//        filterChainDefinitionMap.put("/del","perms[user:delete]");//没有这个user:delete权限的会被拦截下来
//        //未授权的跳转的url
//        shiroFilterFactoryBean.setUnauthorizedUrl("/Unauthorized");
//        //设置注销的url
//        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);//把设置好的过滤设置到ShiroFilterFactoryBean
//        return shiroFilterFactoryBean;
//    }
//
//    //2. DefaultWebSecurityManager
//    @Bean
//    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
//        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
//        //关联realm对象  userRealm
//        securityManager.setRealm(userRealm);
//        return  securityManager;
//    }
//    //1. 创建realm对象 自定义的·类
//    @Bean
//    public UserRealm userRealm(){
//        return new UserRealm();
//    }
//
//    //整合shiroDialect：用来整合shiro-thymeleaf
//    @Bean
//    public ShiroDialect getshiroDialect(){
//        return new  ShiroDialect();
//    }

}
//package com.example.demo.config;
//
//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//public class shiroConfig {
//
//    /**
//     * 创建ShiroFilterFactoryBean
//     */
//    @Bean
//    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager){
//        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
//
//        //设置安全管理器
//        shiroFilterFactoryBean.setSecurityManager(securityManager);
//
//        //添加Shiro内置过滤器
//        /**
//         * Shiro内置过滤器，可以实现权限相关的拦截器
//         *    常用的过滤器：
//         *       anon: 无需认证（登录）可以访问
//         *       authc: 必须认证才可以访问
//         *       user: 如果使用rememberMe的功能可以直接访问
//         *       perm： 该资源必须得到资源权限才可以访问
//         *       role: 该资源必须得到角色权限才可以访问
//         */
//        Map<String,String> filterMap = new LinkedHashMap<String,String>();
//        filterMap.put("/druid/**","anon");
//        filterMap.put("/css/**", "anon");
//        filterMap.put("/js/**", "anon");
//        filterMap.put("/layui/**", "anon");
//        filterMap.put("/login.html","anon");
//        filterMap.put("/loginteacher.html","anon");
//        filterMap.put("/studentlogin","anon");
//        filterMap.put("/teacherlogin","anon");
//        //授权过滤器
//        //注意：当前授权拦截后，shiro会自动跳转到未授权页面
//        filterMap.put("/teacher/**","roles[teacher]");
//        filterMap.put("/student/**","roles[student]");
//        filterMap.put("/**", "authc");//authc即为认证登陆后即可访问
//
//        //修改调整的登录页面
//        shiroFilterFactoryBean.setLoginUrl("/index2.html");
//        //设置未授权提示页面
//        shiroFilterFactoryBean.setUnauthorizedUrl("/index3.html");
//        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
//        return shiroFilterFactoryBean;
//    }
//
//    /**
//     * 创建DefaultWebSecurityManager
//     */
//    @Bean(name="securityManager")
//    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
//        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
//        //关联realm
//        securityManager.setRealm(userRealm);
//        return securityManager;
//    }
//
//    /**
//     * 创建Realm
//     */
//    @Bean(name="userRealm")
//    public UserRealm getRealm(){
//        return new UserRealm();
//    }
//}
