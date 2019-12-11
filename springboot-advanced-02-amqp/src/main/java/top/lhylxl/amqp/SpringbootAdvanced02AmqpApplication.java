package top.lhylxl.amqp;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 自动配置
 * 1.RabbitAutoConfiguration
 * 2.自动配置了链接工厂 CachingConnectionFactory
 * 3.RabbitProperties 封装了RabbitM的配置
 * 4.RabbitTemplate : 给RabbitMQ发送消息和接收
 * 5.AmqpAdmin : RabbitMQ系统管理功能组件
 * 	 AmqpAdmin: 创建 Queue,Exchange,Binding
 * 6.@EnableRabbit + @RabbitListener 监听消息队列的内容
 */
@EnableRabbit	//开启基于注解的RabbitMQ模式
@SpringBootApplication
public class SpringbootAdvanced02AmqpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAdvanced02AmqpApplication.class, args);
	}

}
