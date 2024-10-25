package com.satellite.usercenter.service;
import java.util.Date;

import com.satellite.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

@SpringBootTest
public class RedisTest {

    @Resource
    private RedisTemplate redisTemplate;

    @Test
    void test() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        // 增
        valueOperations.set("satelliteString", "coding");
        valueOperations.set("satelliteInt", 1);
        valueOperations.set("satelliteDouble", 2.0);
        User user = new User();
        user.setId(1L);
        user.setUsername("satelliteCoding");
        valueOperations.set("satelliteUser", user);

        // 查
        Object satellite = valueOperations.get("satelliteString");
        Assertions.assertEquals("coding", ((String) satellite));
        Object satelliteInt = valueOperations.get("satelliteInt");
        Assertions.assertEquals(1, satelliteInt);
        Object satelliteDouble = valueOperations.get("satelliteDouble");
        Assertions.assertEquals(2.0, satelliteDouble);
        System.out.println(valueOperations.get("satelliteUser"));

        redisTemplate.delete("satelliteString");

    }

}
