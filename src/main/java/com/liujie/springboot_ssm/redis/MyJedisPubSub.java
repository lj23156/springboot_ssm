package com.liujie.springboot_ssm.redis;

import redis.clients.jedis.JedisPubSub;

public class MyJedisPubSub extends JedisPubSub {
    @Override
    public void onMessage(String s, String s1) {
        System.out.println("channl:" + s + "..." + "message: " + s1);
    }

    @Override
    public void onPMessage(String s, String s1, String s2) {

    }

    @Override
    public void onSubscribe(String s, int i) {

    }

    @Override
    public void onUnsubscribe(String s, int i) {

    }

    @Override
    public void onPUnsubscribe(String s, int i) {

    }

    @Override
    public void onPSubscribe(String s, int i) {

    }
}
