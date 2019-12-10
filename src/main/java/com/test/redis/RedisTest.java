package com.test.redis;


import redis.clients.jedis.Jedis;

import java.util.*;


/**
 * @program: springDemo
 * @description: 测试redis 里面包含了很多方法
 * @author: pijunqi
 * @create: 2019-12-04 14:27
 **/

public class RedisTest {

    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");

//        jedis.connect();//连接
//
//
        jedis.disconnect();//断开连接
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: " + jedis.ping());
        //存储数据到列表中
        jedis.lpush("site-list", "Runoob");
        jedis.lpush("site-list", "Google");
        jedis.lpush("site-list", "Taobao");


        //存储数据到列表中并设置过期时间
        jedis.setex("site-pi", 15, "junqi");
//        List<String> lrange = jedis.lrange("site-list", 0, 2);

        // 获取存储的数据并输出
        List<String> list = jedis.lrange("site-list", 0, 2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("列表项为: " + list.get(i));
        }

        // 获取数据并输出
        Set<String> keys = jedis.keys("*");//列出所有的key

//            Set<String> keys = jedis.keys("key"); //查找特定的key
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();

            System.out.println(key);
        }
        String s = jedis.get("site-pi");
        System.out.println(s);
        jedis.disconnect();//断开连接
    }
}




