package com.jk1123.web.filter.annotation;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 使用注解生成filter
 */
@WebFilter("/*")
public class AnnotationFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("使用注解生成的filter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
