package top.lhylxl.springbootadvanced01cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 搭建环境
 * 1.导入数据库
 * 2.创建javaBean  清空缓存
 */
@MapperScan("top.lhylxl.springbootadvanced01cache.mapper")
@SpringBootApplication
@EnableCaching		//开启基于注解的缓存
public class SpringbootAdvanced01CacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAdvanced01CacheApplication.class, args);
	}

}
