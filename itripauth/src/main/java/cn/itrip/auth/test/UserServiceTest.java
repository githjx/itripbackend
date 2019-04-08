package cn.itrip.auth.test;

import cn.itrip.auth.service.UserService;
import cn.itrip.beans.pojo.ItripUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;
import java.net.Socket;

public class UserServiceTest {

   /*public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
        UserService userService = (UserService)ctx.getBean("userService");
        ItripUser user = new ItripUser();
        user.setUserCode("Jian_xin@aliyun.com");
        user.setUserName("小明");
        try {

            userService.insertUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
   public static String tip = new String("java");
   char[] you = {'t','e','s','t'};
   public static void test(char you[],String str){
       you[0] ='b';
       str = "welcome";
   }
   private static UserServiceTest um=null;
   private  UserServiceTest(){}
   public static  UserServiceTest getUm(){
       if (um == null){
           um = new UserServiceTest();
       }
       return um;
   }
   public static void main(String[] args){
       try {

       } catch (Exception e) {
           e.printStackTrace();
   }
   }



}
