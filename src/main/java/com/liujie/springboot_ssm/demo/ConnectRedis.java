package com.liujie.springboot_ssm.demo;

import redis.clients.jedis.Jedis;

public class ConnectRedis {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.3.33", 6379);
        jedis.auth("123");
        System.out.println(jedis.ping());
    }
}
