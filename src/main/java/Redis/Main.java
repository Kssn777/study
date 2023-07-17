package Redis;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.time.Duration;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.TimeUnit;


@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        //RedisTemplate<String,String> redisTemplate = context.getBean("redisTemplate", RedisTemplate.class);
        StringRedisTemplate redisTemplate = context.getBean("stringRedisTemplate",StringRedisTemplate.class);
        ValueOperations<String, String> operator = redisTemplate.opsForValue();



    }
}
