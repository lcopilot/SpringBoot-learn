package top.lhylxl.amqp.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/9
 * @time: 13:54
 * @description:
 */
@Configuration
public class AMQPConfig {

	@Bean
	public MessageConverter messageConverter(){
		return new Jackson2JsonMessageConverter();
	}
}
