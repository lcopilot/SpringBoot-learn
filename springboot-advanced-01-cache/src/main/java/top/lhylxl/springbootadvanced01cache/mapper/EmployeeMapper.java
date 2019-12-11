package top.lhylxl.springbootadvanced01cache.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import top.lhylxl.springbootadvanced01cache.bean.Employee;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/6
 * @time: 10:00
 * @description:
 */
public interface EmployeeMapper {

	@Select("select * from employee where id=#{id}")
	public Employee getEmpById(Integer id);

	@Update("update employee set lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{d_Id} Where id=#{id}")
	public void updateEmp(Employee employee);

	@Delete("DELETE FROM employee Where id=#{id}")
	public void deleteEmpById(Integer id);

	@Insert("Insert into employee(lastName,email,gender,d_id) VALUES(#{lastName},#{email},#{gender},#{d_Id})")
	public void insertUser(Employee employee);

	@Select("select * from employee where lastName=#{lastName}")
	public Employee getEmpByLastName(String lastName);
}
