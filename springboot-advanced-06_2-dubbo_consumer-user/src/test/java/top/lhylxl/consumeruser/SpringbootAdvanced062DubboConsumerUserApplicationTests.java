package top.lhylxl.consumeruser;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.lhylxl.consumeruser.service.UserService;

@SpringBootTest
class SpringbootAdvanced062DubboConsumerUserApplicationTests {

	@Autowired
	UserService userService;

	@Test
	void contextLoads() {
	userService.hello();
	}

}
