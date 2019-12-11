package top.lhylxl.springbootadvanced01cache.config;


import java.time.Duration;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import top.lhylxl.springbootadvanced01cache.bean.Employee;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/6
 * @time: 17:04
 * @description:
 */
//@Configuration
//public class RedisConfig {
//
//	@Bean
//	public RedisTemplate<Object, Employee> redisTemplate(RedisConnectionFactory redisConnectionFactory)
//			throws UnknownHostException {
//		RedisTemplate<Object, Employee> template = new RedisTemplate<>();
//		template.setConnectionFactory(redisConnectionFactory);
//		Jackson2JsonRedisSerializer<Employee> ser = new Jackson2JsonRedisSerializer<Employee>(Employee.class);
//		template.setDefaultSerializer(ser);
//		return template;
//	}
//
//}

@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {


	@Bean
	public RedisCacheManager cacheManager(RedisConnectionFactory connectionFactory) {

		RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig()
				.entryTtl(Duration.ofSeconds(10))  //设置默认过期时间
				.serializeKeysWith(
						RedisSerializationContext.SerializationPair.fromSerializer(keySerializer()))
				.serializeValuesWith(RedisSerializationContext.SerializationPair
						.fromSerializer(valueSerializer()))
				.disableCachingNullValues();
		RedisCacheManager redisCacheManager = RedisCacheManager.builder(connectionFactory)
				.cacheDefaults(config)
				.transactionAware()
				.build();

		return redisCacheManager;
	}

	@Bean(name = "redisTemplate")
	public RedisTemplate<String, Object> redisTemplate(
			RedisConnectionFactory redisConnectionFactory) {
		RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(redisConnectionFactory);
		//设置序列化
		redisTemplate.setKeySerializer(keySerializer());
		redisTemplate.setHashKeySerializer(keySerializer());
		redisTemplate.setValueSerializer(valueSerializer());
		redisTemplate.setHashValueSerializer(valueSerializer());

		return redisTemplate;
	}

	private RedisSerializer<String> keySerializer() {
		return new StringRedisSerializer();
	}

	private RedisSerializer<Object> valueSerializer() {
		return new GenericJackson2JsonRedisSerializer();
	}

}


