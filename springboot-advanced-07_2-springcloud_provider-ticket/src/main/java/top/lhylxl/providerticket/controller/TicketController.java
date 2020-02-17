package top.lhylxl.providerticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lhylxl.providerticket.service.TicketService;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/11
 * @time: 16:56
 * @description:
 */
@RestController
public class TicketController {

	@Autowired
	TicketService ticketService;

	@GetMapping("/ticket")
	public String getTicket(){
		return ticketService.getTicket();
	}
}
