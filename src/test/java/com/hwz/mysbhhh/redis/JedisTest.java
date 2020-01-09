package com.hwz.mysbhhh.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @author hwz
 * @date 2019/12/24
 */
public class JedisTest {
    @Test
    public void testJedis() {
        //创建一个redis通道
        Jedis jedis = new Jedis("172.16.190.130", 6666, 1000);
        try {
            //设置登录密码 我这里没密码
//        jedis.auth("123456");
            //选择第几个数据库
            jedis.select(1);
            //方法名就是命令
            jedis.set("hello", "world");
            System.out.println(jedis.get("hello"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();

        }
    }
}
