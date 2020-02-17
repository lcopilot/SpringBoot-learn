package top.lhylxl.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/5
 * @time: 17:40
 * @description:
 */
//使用JPA注解配置映射关系
@Entity		//告诉JPA这是一个实体类(和数据表映射的类)
@Table(name ="tb_user")	//指定和那个数据表对应;不写着默认表名就是类名小写user
public class User {

	@Id //这是一个主键
	@GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
	private Integer id;

	@Column(name="last_name",length = 50) //这是和数据表对应的一个列
	private String lastName;
	@Column //默认列名就是属性名
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



}
