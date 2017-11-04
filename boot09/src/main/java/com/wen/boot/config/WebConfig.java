package com.wen.boot.config;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.wen.boot.filter.TimeFilter;
import com.wen.boot.filter.interceptor.TimeInterceptor;
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{
	@Resource 
	private TimeInterceptor timeInterceptor;
	public void addInterceptors(InterceptorRegistry registry) {
		InterceptorRegistration ir=registry.addInterceptor(timeInterceptor);
		//  ；拦截器拦截  路径
		ir.addPathPatterns("/user/*");
	}
	//静态资源配置
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/**").addResourceLocations("classpath:/");
	        super.addResourceHandlers(registry);
	   }
	//@Bean 
	public FilterRegistrationBean TimeFilter() {
		FilterRegistrationBean filterRegistrationBean =new FilterRegistrationBean();
		TimeFilter timeFilter=new TimeFilter();
		filterRegistrationBean.setFilter(timeFilter);
		List<String> urls=new ArrayList<String>();
		urls.add("/user/*"); 
		filterRegistrationBean.setUrlPatterns(urls);
		return filterRegistrationBean;
	}
}
