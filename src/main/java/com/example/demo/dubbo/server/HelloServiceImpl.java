package com.example.demo.dubbo.server;

import com.example.demo.dubbo.api.IHelloService;

/**
 * @Author labu@xiaohongshu.com
 * @create 2020/10/8 3:27 下午
 */
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String name) {
        return name;
    }
}
