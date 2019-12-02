package top.lhylxl.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.lhylxl.springboot.bean.Dog;
import top.lhylxl.springboot.service.HelloService;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/2
 * @time: 15:27
 * @description:
 */

/**
 *  @Configuration :指明当前类是一个配置类,代替之前的spring配置文件
 */
@Configuration
public class MyAppConfig {

	/**
	 * 将方法的返回值添加到容器中;容器中这个组件默认的id就是方法名
	 * @return
	 */
	@Bean
	public HelloService helloService(){
		System.out.println("添加组件了");
		return new HelloService();
	}

}
