package top.lhylxl.springboot.bean;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/2
 * @time: 14:24
 * @description:
 */
public class Dog {

	private String name;
	private Integer age;

	@Override
	public String toString() {
		return "Dog{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
