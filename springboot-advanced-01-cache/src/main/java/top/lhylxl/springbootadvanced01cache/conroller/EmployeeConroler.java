package top.lhylxl.springbootadvanced01cache.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.lhylxl.springbootadvanced01cache.bean.Employee;
import top.lhylxl.springbootadvanced01cache.service.EmployeeService;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/6
 * @time: 10:59
 * @description:
 */
@RestController
public class EmployeeConroler {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/emp/{id}")
	public Employee getEmployee(@PathVariable("id") Integer id) {
		Employee employee = employeeService.getEmp(id);
		return employee;
	}

	@GetMapping("/emp")
	public Employee update(Employee employee) {
		Employee emp = employeeService.updateEmp(employee);
		return emp;
	}

	@GetMapping("/delEmp/{id}")
	public void deleteEmp(@PathVariable("id") Integer id) {
		employeeService.deleteEmp(id);
	}

	@GetMapping("/empln/{lastName}")
	public Employee getEmployeeByLastName(@PathVariable("lastName") String lastName) {
		Employee employee = employeeService.getEmpByLastName(lastName);
		return employee;
	}

}
