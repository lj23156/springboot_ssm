package com.liujie.springboot_ssm.redis;

import redis.clients.jedis.Jedis;

public class Publisher implements Runnable{
    private Jedis jedis;

    public Publisher(){
        this.jedis = RedisUtils.getJedis();
    }

    @Override
    public void run() {
        jedis.publish("cctv5", "nihao");
    }
}
