package top.lhylxl.consumeruser.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import top.lhylxl.consumeruser.dubboticket.service.TicketService;


/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/11
 * @time: 14:46
 * @description:
 */
@Service
public class UserService {

	@Reference
	TicketService ticketService;

	public void hello(){
		String tick = ticketService.getTick();
		System.out.println(tick);
	}

}
