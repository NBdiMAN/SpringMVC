package com.NBdiMAN;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration.Dynamic;
import javax.servlet.ServletContext;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//Web容器启动
public class MyWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	//根容器
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class};
	}
	
	//SpringMVC容器
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {WebConfig.class};
	}
	
	//映射路径配置
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
	//注册上下文启动的监听器
	protected void registerContextLoaderListener(ServletContext servletContext) {
		super.registerContextLoaderListener(servletContext);
		//编码过滤器
		Dynamic filter = servletContext.addFilter("CharacterEncodingFilter", CharacterEncodingFilter.class);
		filter.setInitParameter("encoding", "UTF-8");
		filter.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/*");
	}
}
