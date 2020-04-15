package com.liujie.springboot_ssm.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtils {
    private static Jedis jedis;
    static {
        // 1. 创建 redis 连接池配置类
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxTotal(5);  // 设置最大连接数
        poolConfig.setMaxIdle(2);   // 设置最大空闲数

        // 2. 创建 redis 连接池类
        String host = "192.168.3.33";
        int port = 6379;
        JedisPool pool = new JedisPool(poolConfig, host, port);

        // 3. 通过连接池对象创建 redis 连接
        jedis = pool.getResource();
        jedis.auth("123");
    }
    public static Jedis getJedis(){
        return jedis;
    }
}
