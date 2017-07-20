package com.zwn.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/7/19.
 */
@RequestMapping("/user")
public class RedisJava {
    @RequestMapping("/redis")
    public static void main(String[] args) {
        TestRedis.getJedis().set("name","陈浩翔");
        String a = TestRedis.getJedis().get("name");
        System.out.println(a);
    }
}
