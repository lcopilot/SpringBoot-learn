package top.lhylxl.springboot06webrestfulcrud.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import top.lhylxl.springboot06webrestfulcrud.dao.EmployeeDao;
import top.lhylxl.springboot06webrestfulcrud.entities.Employee;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/3
 * @time: 17:34
 * @description:
 */
@Controller
public class EmployeeController {

	@Autowired
	EmployeeDao employeeDao;

	//查询所有员工返回列表页面
	@GetMapping("/emps")
	public String list(Model model){
		Collection<Employee> employees = employeeDao.getAll();
		model.addAttribute("emps", employees);
		//thymeleaf默认就会拼串
		return "emp/list";
	}

}
