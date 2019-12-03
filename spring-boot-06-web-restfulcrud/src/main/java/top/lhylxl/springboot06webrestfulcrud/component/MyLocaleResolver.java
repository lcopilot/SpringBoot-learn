package top.lhylxl.springboot06webrestfulcrud.component;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/3
 * @time: 15:30
 * @description:
 */

import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.jni.Local;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

/**
 * 可以在链接上携带区域信息
 */

public class MyLocaleResolver implements LocaleResolver {

	@Override
	public Locale resolveLocale(HttpServletRequest httpServletRequest) {
		String l = httpServletRequest.getParameter("l");
		Locale locale=Locale.getDefault();
		if(!StringUtils.isEmpty(l)){
			String[] split = l.split("_");
			locale=new Locale(split[0],split[1]);
		}
		return locale;
	}

	@Override
	public void setLocale(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse, Locale locale) {

	}
}
