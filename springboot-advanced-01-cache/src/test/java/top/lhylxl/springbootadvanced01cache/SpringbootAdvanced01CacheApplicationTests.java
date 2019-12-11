package top.lhylxl.springbootadvanced01cache;

import java.util.List;
import javax.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.types.RedisClientInfo;
import top.lhylxl.springbootadvanced01cache.bean.Employee;
import top.lhylxl.springbootadvanced01cache.mapper.EmployeeMapper;

@SpringBootTest
class SpringbootAdvanced01CacheApplicationTests {

	@Autowired
	EmployeeMapper employeeMapper;

	@Autowired
	StringRedisTemplate stringRedisTemplate;  //操作k-v都是字符串

	@Autowired
	RedisTemplate redisTemplate; //k-v都是对象的

	//@Autowired
	//RedisTemplate<Object, Employee> redisTemplate;

	@Test
	void contextLoads() {
		Employee emp = employeeMapper.getEmpById(1);
		System.out.println(emp);
	}

	/**
	 * String 字符串,list(列表),set(集合),Hash(散列),ZSet(有序集合)
	 * 	stringRedisTemplate.opsForValue();  	String 字符串
	 * 	stringRedisTemplate.opsForList();   	list(列表)
	 * 	stringRedisTemplate.opsForSet();		set(集合)
	 * 	stringRedisTemplate.opsForHash();		Hash(散列)
	 * 	stringRedisTemplate.opsForZSet();		ZSet(有序集合)
	 */
	@Test
	public void test01(){
		//stringRedisTemplate.opsForValue().append("msg","hello");
		//String msg = stringRedisTemplate.opsForValue().get("msg");
		//System.out.println(msg);

//		stringRedisTemplate.opsForList().leftPush("myList", "1");
//		stringRedisTemplate.opsForList().leftPush("myList", "2");
//		stringRedisTemplate.opsForList().leftPush("myList", "3");
//		stringRedisTemplate.opsForList().leftPush("myList", "4");

	}

	/**
	 * 测试保存对象
	 */
	@Test
	public void test02(){
		Employee emp = employeeMapper.getEmpById(2);
		//默认保存对象,使用jdk序列化机制,序列化后的数据保存到redis中
		redisTemplate.opsForValue().set("emp-02", emp);
		Employee emp1 = (Employee)redisTemplate.opsForValue().get("emp-02");
		System.out.println(emp1);
		//1.将数据以json的方式保存
		//1.1自己转为json
		//1.2redisTemplate默认的序列化规则
	}
}





