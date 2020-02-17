package top.lhylxl.consumeruser;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.引入依赖
 * 2.配置注册中心地址
 * 3.引用服务
 */
@EnableDubbo
@SpringBootApplication
public class SpringbootAdvanced062DubboConsumerUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAdvanced062DubboConsumerUserApplication.class, args);
	}

}
