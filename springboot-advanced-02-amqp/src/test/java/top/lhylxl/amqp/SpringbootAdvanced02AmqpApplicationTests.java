package top.lhylxl.amqp;

import com.rabbitmq.client.AMQP.Exchange;
import com.sun.org.apache.xpath.internal.operations.Bool;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Binding.DestinationType;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.lhylxl.amqp.bean.Book;

@SpringBootTest
class SpringbootAdvanced02AmqpApplicationTests {

	@Autowired
	RabbitTemplate rabbitTemplate;

	@Autowired
	AmqpAdmin amqpAdmin;

	@Test
	public void createExchange(){

//		amqpAdmin.declareExchange(new DirectExchange("amqpAdmin.exchange"));
//		System.out.println("创建完成");

//		amqpAdmin.declareQueue(new Queue("amqpAdmin.queue",true));

		//创建绑定规则
//		amqpAdmin.declareBinding(new Binding("amqpAdmin.queue", Binding.DestinationType.QUEUE,"amqpAdmin.exchange","amqp.haha",null));

		//删除
//		amqpAdmin.deleteExchange();

	}


	/**
	 * 1.单播(点对点)
	 */
	@Test
	void contextLoads() {
		//Message需要自己构造一个 定制消息体内容和消息头
		//rabbitTemplate.send(exchange, routingKey, message);

		//object默认当成消息体,只需要传入要发送的对象,自动序列化发送给rabbitmq
		//rabbitTemplate.convertAndSend(exchange, routingKey,object);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("msg", "第一个消息");
		map.put("data", Arrays.asList("helloWorld",123,true));
		//对象被默认序列化以后发送出去
		rabbitTemplate.convertAndSend("exchange.direct","lhylxl.news",new Book("西游记","张三"));

	}

	/**
	 * 接收数据
	 */
	@Test
	public void receive(){
		Book o = (Book)rabbitTemplate.receiveAndConvert("lhylxl.news");
		System.out.println(o.getClass());
		System.out.println(o);
	}

	/**
	 * 广播
	 */
	@Test
	public void sedMsg(){
		rabbitTemplate.convertAndSend("exchange.fanout","",new Book("sdfjskl","啥的健康"));
	}


}
