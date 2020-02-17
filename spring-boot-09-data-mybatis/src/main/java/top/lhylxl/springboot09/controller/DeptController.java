package top.lhylxl.springboot09.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.lhylxl.springboot09.bean.Department;
import top.lhylxl.springboot09.mapper.DepartmentMapper;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/5
 * @time: 16:57
 * @description:
 */
@RestController
public class DeptController {

	@Autowired
	DepartmentMapper departmentMapper;

	@GetMapping("/dept/{id}")
	public Department getDepartment(@PathVariable Integer id){

		return departmentMapper.getDeptById(id);
	}

	@GetMapping("/dept")
	public Department insertDept(Department department){
		departmentMapper.insertDept(department);
		return department;
	}

}
