package top.lhylxl.spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/2
 * @time: 13:58
 * @description:
 */
@RestController
public class helloWorldController {


	@RequestMapping("/hello")
	public String hello(){
		return "hello world quick";
	}

	// RESTAPI的方式
}
