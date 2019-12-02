package top.lhylxl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/2
 * @time: 13:51
 * @description:
 */
@Controller
public class helloWorldController {

	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		return "hello world";
	}
}
