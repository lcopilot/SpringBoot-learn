package top.lhylxl.security.config;

import javax.xml.ws.WebEndpoint;
import org.springframework.boot.autoconfigure.security.servlet.WebSecurityEnablerConfiguration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/11
 * @time: 9:21
 * @description:
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	/**
	 * 定制请求的授权规则
	 *
	 * @param http
	 * @throws Exception
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		super.configure(http);
		//定制请求的授权规则
		http.authorizeRequests().antMatchers("/").permitAll()
				.antMatchers("/level1/**").hasRole("VIP1")
				.antMatchers("/level2/**").hasRole("VIP2")
				.antMatchers("/level3/**").hasRole("VIP3");

		//开启自动配置的登录功能,如果没有登录,没有权限就会来到登录页面
		http.formLogin().usernameParameter("user").passwordParameter("pwd").loginPage("/userlogin");
		//1./login来到登录页
		//2.重定向到/login?error表示登录失败
		//3.更多详细规定

		//开启自动配置的注销功能
		http.logout().logoutSuccessUrl("/");	//注销成功以后来到首页
		//1.访问/logout表示用户注销,清空session
		//2.注销成功返回/login?logout 页面

		//开启记住我
		http.rememberMe().rememberMeParameter("rem");
		//登录成功以后,将信息存入cookie
	}

	/**
	 * 定义认证规则
	 *
	 * @param auth
	 * @throws Exception
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		super.configure(auth);
		auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("MuGe").password(new BCryptPasswordEncoder().encode("123")).roles("VIP1", "VIP2")
				.and().passwordEncoder(new BCryptPasswordEncoder()).withUser("lisi").password(new BCryptPasswordEncoder().encode("123")).roles("VIP3", "VIP1")
				.and().passwordEncoder(new BCryptPasswordEncoder()).withUser("ww").password(new BCryptPasswordEncoder().encode("123")).roles("VIP2", "VIP3");
	}


}



