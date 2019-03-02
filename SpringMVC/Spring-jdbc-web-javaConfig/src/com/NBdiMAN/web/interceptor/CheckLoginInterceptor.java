package com.NBdiMAN.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.NBdiMAN.util.UserContext;

//登录检查拦截器
public class CheckLoginInterceptor implements HandlerInterceptor{
	
	//如果做过登录就放行
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//没有登录的情况
		if(UserContext.getCurrentUser() == null) {
			response.sendRedirect("/login.jsp");
			return false;//阻止往后放行
		}
		return true;//放行,放行给下一个拦截器,或者最终的处理器
	}
	
}
