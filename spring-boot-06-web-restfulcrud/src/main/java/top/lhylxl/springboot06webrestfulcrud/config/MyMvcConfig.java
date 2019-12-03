package top.lhylxl.springboot06webrestfulcrud.config;


import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import top.lhylxl.springboot06webrestfulcrud.component.LoginHandlerInterceptor;
import top.lhylxl.springboot06webrestfulcrud.component.MyLocaleResolver;


/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/3
 * @time: 13:11
 * @description:
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

	/**
	 * 将组件注册在容器
	 *
	 * @param registry
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("login");
		registry.addViewController("/index").setViewName("login");
		registry.addViewController("/index.html").setViewName("login");
		registry.addViewController("/main.html").setViewName("dashboard");

	}

	/**
	 * 注册拦截器
	 *
	 * @param registry
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//静态资源
		//SpringBoot以做好静态资源映射
		registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
				.excludePathPatterns("/", "/index", "/index.html","/user/login"); //addPathPatterns拦截请求  excludePathPatterns不拦截的请求
	}

	@Bean
	public LocaleResolver localeResolver() {
		return new MyLocaleResolver();
	}


}
