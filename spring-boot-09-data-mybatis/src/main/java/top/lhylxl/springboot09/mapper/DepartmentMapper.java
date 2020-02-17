package top.lhylxl.springboot09.mapper;

import java.util.List;
import org.apache.coyote.OutputBuffer;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import top.lhylxl.springboot09.bean.Department;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/5
 * @time: 16:49
 * @description:
 */

//指定这是一个操作数据库的mapper
@Mapper
public interface DepartmentMapper {

	@Select("select*from department where id=#{id}")
	public Department getDeptById(Integer id);

	@Delete("delete from department where id=#{id}")
	public int deleteDept(Integer id);

	//插入后返回id
	@Options(useGeneratedKeys = true,keyProperty = "id")
	@Insert("insert into department (departmentName) values(#{departmentName})")
	public int insertDept(Department department);

	@Update("update from department set departmentName=#{departmentName} where id=#{id}")
	public int updateDept(Department department);
}
