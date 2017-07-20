package com.Springboot.Exception;  

/**
 * 
 * 异常捕获机制，加入@ControllerAdvice 注解后异常捕获进来
 */

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
  
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
    @ExceptionHandler(value = Exception.class)
    public void defaultErrorHandler( HttpServletRequest request ,Exception e)  {
    	  String requestUrl = request.getRequestURL().toString();//得到请求的URL地址
          String requestUri = request.getRequestURI();//得到请求的资源
          String queryString = request.getQueryString();//得到请求的URL地址中附带的参数
          String remoteAddr = request.getRemoteAddr();//得到来访者的IP地址
          String remoteHost = request.getRemoteHost();
          int remotePort = request.getRemotePort();
          String remoteUser = request.getRemoteUser();
          String method = request.getMethod();//得到请求URL地址时使用的方法
          String pathInfo = request.getPathInfo();
          String localAddr = request.getLocalAddr();//获取WEB服务器的IP地址
          String localName = request.getLocalName();//获取WEB服务器的主机名
   
    	  e.printStackTrace();
          System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");
    
    }
}
