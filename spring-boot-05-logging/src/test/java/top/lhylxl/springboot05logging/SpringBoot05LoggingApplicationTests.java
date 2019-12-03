package top.lhylxl.springboot05logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot05LoggingApplicationTests {

	//记录器
	Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	void contextLoads() {

		//日志级别
		//有低到高   trace<debug<info<warn<error
		//可以调整输出日志级别,日志就只会在这个级别及以后的高级别生效
		logger.trace("trace日志...");
		logger.debug("debug日志...");
		//SpringBoot默认使用info级别
		logger.info("info日志...");
		logger.warn("warn日志...");
		logger.error("error日志...");

	}

}
