package top.lhylxl.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import top.lhylxl.springboot.bean.Person;

/**
 * SpringBoot单元测试
 *
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器功能
 */
@SpringBootTest
class SpringBoot03ConfigApplicationTests {

	@Autowired
	Person person;

	@Autowired
	ApplicationContext ioc;

	@Test
	void contextLoads() {
		System.out.println(person);
	}

	@Test
	public void testHelloService(){
		boolean b=ioc.containsBean("helloService");
		System.out.println(b);
	}
}
