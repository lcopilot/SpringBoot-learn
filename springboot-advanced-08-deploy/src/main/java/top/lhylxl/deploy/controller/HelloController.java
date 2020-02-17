package top.lhylxl.deploy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/12
 * @time: 10:14
 * @description:
 */
@Controller
public class HelloController {

	@GetMapping("/abc")
	public String hello(){
		return "hello";
	}

}
