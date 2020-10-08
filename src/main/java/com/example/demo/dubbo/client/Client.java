package com.example.demo.dubbo.client;

import com.example.demo.dubbo.api.IHelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author labu@xiaohongshu.com
 * @create 2020/10/8 3:59 下午
 */
public class Client {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();

        IHelloService helloService = (IHelloService) context.getBean("helloService");
        String hello = helloService.sayHello("hello world");
        System.out.println(hello);
    }
}
