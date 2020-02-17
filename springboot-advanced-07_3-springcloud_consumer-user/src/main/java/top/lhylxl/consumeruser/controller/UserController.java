package top.lhylxl.consumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/11
 * @time: 18:09
 * @description:
 */
@RestController
public class UserController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/buy")
	public String buyTicket(String name){
		String forObject = restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);
		return name+"购买啦"+forObject;
	}

}
