package top.lhylxl.amqp.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import top.lhylxl.amqp.bean.Book;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/9
 * @time: 16:52
 * @description:
 */
@Service
public class BookService {

	/**
	 * 监听lhylxl.news队列
	 * @param book
	 */
	@RabbitListener(queues = "lhylxl.news")
	public void receive(Book book){
		System.out.println("收到消息:"+book);
	}

	/**
	 * 监听lhylxl队列的所有消息
	 * @param message
	 */
	@RabbitListener(queues = "lhylxl")
	public void receive02(Message message){
		System.out.println(message.getBody());
		System.out.println("djkasdkl");
		System.out.println(message.getMessageProperties());
	}
}
