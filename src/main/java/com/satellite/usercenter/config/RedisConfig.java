package com.satellite.usercenter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;


/**
 * 底层redis自动配置中的
 * @ConditionalOnMissingBean(name = "redisTemplate")
 * 会检测Spring容器中是否有一个id为redisTemplate的Bean,如果有,就用现成的,不在使用默认配置去初始化
 * 如果没有,用默认配置初始化
 */
@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<Object, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        //设置序列化器
        template.setKeySerializer(RedisSerializer.string());
        return template;
    }
}
