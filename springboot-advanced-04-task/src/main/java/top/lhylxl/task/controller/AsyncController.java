package top.lhylxl.task.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lhylxl.task.service.AsyncService;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/10
 * @time: 16:38
 * @description:
 */
@RestController
public class AsyncController {

	@Autowired
	AsyncService asyncService;

	@GetMapping("/hello")
	public String hello(){
		asyncService.hello();
		return "success";
	}
}
