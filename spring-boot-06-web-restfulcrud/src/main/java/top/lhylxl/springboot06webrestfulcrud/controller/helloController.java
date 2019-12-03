package top.lhylxl.springboot06webrestfulcrud.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/3
 * @time: 10:27
 * @description:
 */
@Controller
public class helloController {

	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		return "hello world";
	}

	@RequestMapping("/success1")
	public String success(Map<String,Object> map){
		map.put("hello", "<h1>hello world</h1>");
		map.put("users", Arrays.asList("zhangsan","lisi","muge"));
		return "success";
	}
}
