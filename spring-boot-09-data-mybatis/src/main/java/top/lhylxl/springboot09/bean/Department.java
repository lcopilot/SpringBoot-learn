package top.lhylxl.springboot09.bean;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/5
 * @time: 16:47
 * @description:
 */
public class Department {

	private Integer id;
	private String departmentName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
