package com.example.demo.dubbo.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author labu@xiaohongshu.com
 * @create 2020/10/8 3:54 下午
 */
public class Server {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();
        System.in.read();   // 按任意键退出
    }
}
