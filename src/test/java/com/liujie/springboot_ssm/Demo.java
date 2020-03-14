package com.liujie.springboot_ssm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.*;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@SpringBootTest
public class Demo {
    public static void main(String[] args) {

    }

    @Test
    public void demo(){
        Jedis jedis = new Jedis("192.168.3.33", 6379);
        jedis.auth("123");
        System.out.println(jedis.ping());

        jedis.set("class", "222");
    }

    @Test
    public void m1(){
        // 1. 创建 redis 连接池配置类
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxTotal(5);  // 设置最大连接数
        poolConfig.setMaxIdle(2);   // 设置最大空闲数

        // 2. 创建 redis 连接池类
        String host = "192.168.3.33";
        int port = 6379;
        JedisPool pool = new JedisPool(poolConfig, host, port);

        // 3. 通过连接池对象创建 redis 连接
        Jedis jedis = pool.getResource();
        jedis.auth("123");

        String key = "name";
        String result = jedis.get(key);
        System.out.println(result);

        // 4. 关闭连接
        jedis.close();
    }

    @Autowired
    RedisTemplate redisTemplate;


    @Test
    public void t1(){
        boolean flag = redisTemplate.hasKey("person1");
        System.out.println("-----------------" + flag);
        
        // 操作 string 类
        ValueOperations valueOperations = redisTemplate.opsForValue();

        // hash
        HashOperations hashOperations = redisTemplate.opsForHash();

        // list
        ListOperations listOperations = redisTemplate.opsForList();
        
        // set
        SetOperations setOperations = redisTemplate.opsForSet();

        // zset
        ZSetOperations zSetOperations = redisTemplate.opsForZSet();

        Object num = valueOperations.get("num");
        System.out.println(num);

/*
        valueOperations.set("1101", "你好", 3, TimeUnit.DAYS);
        System.out.println(valueOperations.get("1101"));*/

        hashOperations.put("person1", "instersts", "dance");

    }
}
