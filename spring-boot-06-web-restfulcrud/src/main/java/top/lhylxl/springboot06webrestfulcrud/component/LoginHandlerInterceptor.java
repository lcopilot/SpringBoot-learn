package top.lhylxl.springboot06webrestfulcrud.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: SpringBoot
 * @auther: MuGe
 * @date: 2019/12/3
 * @time: 16:43
 * @description:
 */

/**
 * 拦截器,登录检查
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

	/**
	 * 目标方法执行之前
	 * @param request
	 * @param response
	 * @param handler
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
		Object loginUser = request.getSession().getAttribute("loginUser");
		if (loginUser==null){
			//未登录
			request.setAttribute("msg", "您尚未登录,请先登录!");
			request.getRequestDispatcher("/").forward(request, response);
			return false;
		}else {
			//已登录
			return true;
		}

	}


}
