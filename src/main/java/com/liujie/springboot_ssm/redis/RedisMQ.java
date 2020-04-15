package com.liujie.springboot_ssm.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisMQ {

    public static void main(String[] args) {
        Subscriber subscriber = new Subscriber(new MyJedisPubSub());
        Thread t1 = new Thread(subscriber);
        t1.start();


    }

}
