package com.wen.boot.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
@Component
public class TimeFilter implements  Filter{
	/**
	 * 销毁方法
	 */
	public void destroy() {
		System.out.println("Filter destory");		
	}
	/**
	 * 执行过滤器
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
			System.out.println("开始执行 doFilter");
			long start =new Date().getTime();
			//chain.doFilter(request, response);
		 Object user=((HttpServletRequest)request).getSession().getAttribute("users");  
	        if(user==null){  
	                response.setContentType("text/html");  
	                response.setCharacterEncoding("utf-8");  
	                PrintWriter out = response.getWriter();    
	                StringBuilder builder = new StringBuilder();    
	                builder.append("<script type=\"text/javascript\" charset=\"UTF-8\">");    
	                builder.append("alert(\"登录失效请重新登录\");");    
	                builder.append("window.location.href=\"/page/login/\";");    
	                builder.append("</script>");    
	                out.print(builder.toString());    
	                out.close();    
	            }else{
	            	chain.doFilter(request, response);  
	            } 
	        System.out.println("执行结束  time fliter"+(new Date().getTime()-start));
			System.out.println("time fliter finish");
	}
	/**
	 * 创建方法
	 */
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Filter init");
	}
}
