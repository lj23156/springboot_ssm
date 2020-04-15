package com.liujie.springboot_ssm.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

public class Subscriber implements Runnable {

    private Jedis jedis;

    private JedisPubSub jedisPubSub;

    public Subscriber(JedisPubSub jedisPubSub){
        this.jedis = RedisUtils.getJedis();
        this.jedisPubSub = jedisPubSub;
    }

    @Override
    public void run() {
        jedis.subscribe(jedisPubSub, "cctv5");
    }
}
