package top.lhylxl.springboot06webrestfulcrud.controller;

import java.util.Map;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/3
 * @time: 15:44
 * @description:
 */
@Controller
@RequestMapping("/user")
public class UserController {

	//记录器
	Logger logger=LoggerFactory.getLogger(getClass());;

	@PostMapping("/login")
	public String login(@RequestParam("username") String username,
			@RequestParam("password") String password, Map<String,Object> map, HttpSession session) {
		if(username!=null && password.equals("123456")){
			//登录成功
			logger.info("登录成功!");
			session.setAttribute("loginUser", username);
			//防止表单重复提交,重定向到主页
			return "redirect:/main.html";
		}else {
			map.put("msg", "用户名密码错误");
			logger.error("用户名密码错误");
			return "login";
		}

	}
}
