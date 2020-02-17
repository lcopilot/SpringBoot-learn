package top.lhylxl.providerticket.service;

import org.springframework.stereotype.Service;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/11
 * @time: 16:54
 * @description:
 */
@Service
public class TicketService {

	public String getTicket(){
		System.out.println("8002");
		return "<<hello world>>";
	}
}
