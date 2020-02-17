package top.lhylxl.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/4
 * @time: 16:48
 * @description:
 */
@Controller
public class HelloCotroller {

	@GetMapping("/hello")
	public String hello(Model model){
		model.addAttribute("msg", "helloworld");
		return "success";
	}
}
