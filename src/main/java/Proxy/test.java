package Proxy;

import Proxy.StaticProxy.User;
import Proxy.jdkProxy.*;
import Proxy.StaticProxy.*;


import Proxy.jdkProxy.UserProxy;

public class test {
    public static void main(String[] args) {
        User user = new userImpl();
        /*静态代理
        User userProxy = new userProxy(user);
        userProxy.login("aaaaa");
        */


        //jdk动态代理
        UserProxy userproxy = new UserProxy(user);
        User proxy = (User)userproxy.getProxy();
        System.out.println(proxy.print("123123"));


    }
}
