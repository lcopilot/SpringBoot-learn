package top.lhylxl.springboot03config02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/2
 * @time: 16:35
 * @description:
 */
@RestController
public class helloController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}

}
