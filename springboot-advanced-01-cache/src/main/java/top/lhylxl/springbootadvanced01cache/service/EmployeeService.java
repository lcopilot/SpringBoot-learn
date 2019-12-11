package top.lhylxl.springbootadvanced01cache.service;

import javax.annotation.Resource;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import top.lhylxl.springbootadvanced01cache.bean.Employee;
import top.lhylxl.springbootadvanced01cache.mapper.EmployeeMapper;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/6
 * @time: 10:51
 * @description:
 */
@CacheConfig(cacheNames = "emp")
@Service
public class EmployeeService {

	@Autowired
	EmployeeMapper employeeMapper;

	/**
	 * @Cacheable  将方法的运行结果进行缓存  以后再用相同的数据时直接从缓存中获取,不用再调用方法
	 * 			属性:
	 * 				cacheNames/value: 缓存的名字
	 * 				key: 缓存数据使用的key; 可以指定,默认方法的参数值  id-emp
	 * 					编写spEL: #id,参数id的值
	 * 				keyGenerator:key的生成器;可以自己指定key的生成器的组件id
	 * 					key/keyGenerator: 二选一使用
	 *				cacheManager: 指定缓存管理器,或者cacheResolver指定缓存解析器
	 *				condition: 指定符合条件的情况下才缓存
	 *						condition = "#id>0"
	 *				unless: 否定缓存,当指定条件为true,不缓存,可以获取到结果进行判断
	 *						unless = "#result==null"
	 *				sync:是否使用异步模式
	 *
	 * @param id
	 * @return
	 */
	@Cacheable(cacheNames = {"emp"})
	public Employee getEmp(Integer id){
		System.out.println(id);
		Employee emp = employeeMapper.getEmpById(id);
		return emp;
	}

	/**
	 * @CachePut:既调用方法,又更新缓存数据
	 * 		修改了数据库的某个数据,同时更新缓存
	 * 		运行时机:
	 * 			1.先调用目标方法
	 * 			2.将目标方法的结果集缓存起来
	 * @param employee
	 * @return
	 */
	@CachePut(value="emp",key = "#result.id")
	public Employee updateEmp(Employee employee){
		System.out.println("update:"+employee);
		employeeMapper.updateEmp(employee);
		return employee;
	}

	/**
	 * @CacheEvict : 缓存清除
	 * 	key: 指定要清除的数据
	 * 	allEntries = true 指定清除这个缓存中所有的数据
	 * 	beforeInvocation = false 缓存是否在方法执行之前执行
	 * 		默认之后执行
	 * @param id
	 */
	@CacheEvict(value = "emp",key = "#id")
	public void deleteEmp(Integer id){
		System.out.println("deleteEmp："+id);
		employeeMapper.deleteEmpById(id);
	}

	@Caching(
			cacheable = {
					@Cacheable(value = "emp",key = "#lastName")
			},
			put={
					@CachePut(value = "emp",key = "#result.id"),
					@CachePut(value = "emp",key = "#result.email")
			}
	)
	public Employee getEmpByLastName(String lastName){
		return employeeMapper.getEmpByLastName(lastName);
	}
}
