package com.hwz.mysbhhh.redis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author hwz
 * @date 2019/12/24
 */
public class JedisPoolTest {
    @Test
    public void testJedisPool() {
        GenericObjectPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(100);//设置连接池中最多允许放置100个jedis对象
        config.setMaxIdle(50);//设置连接池中最大允许的空闲连接
        config.setMinIdle(10);//设置连接池中最小允许连接数
        config.setTestOnBorrow(false);//借出连接时是否测试有效性,推荐false
        config.setTestOnReturn(false);//归还时是否测试，推荐false
        config.setTestOnCreate(true);//创建时是否测试，推荐true
        config.setBlockWhenExhausted(true);//当连接池内jedis无可用资源时，是否等待，推荐true
        config.setMaxWaitMillis(1000);//没有获取资源时最长等待一秒  一秒后没有的话就报错
        JedisPool jedisPool = new JedisPool(config, "172.16.190.130", 6666);
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.select(1);
            jedis.set("name", "hhh");
            System.out.println(jedis.get("name"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                //归还到连接池
                jedis.close();
            }
        }

    }

    @Test
    public void testDemo() {
        List<User> users = new ArrayList<>();
        users.add(User.builder().name("h").type(1).build());
        users.add(User.builder().name("w").type(1).build());
        users.add(User.builder().name("z").type(1).build());
        Map<Integer, List<User>> collect = users.stream().collect(Collectors.groupingBy(User::getType));
        List<User> users0 = collect.get(0);
        final Integer[] point0 = {0};
        final Integer[] point1 ={0};
        List<User> users1 = collect.get(1);
        if (users0!=null&&!users0.isEmpty()){
            users0.forEach(user -> {
                point0[0] +=user.getType();
            });
        }
        if (users1!=null&&!users1.isEmpty()){
            users1.forEach(user -> {
                point1[0] +=user.getType();
            });
        }
        System.out.println(point0[0]);
        System.out.println(point1[0]);

    }
}
