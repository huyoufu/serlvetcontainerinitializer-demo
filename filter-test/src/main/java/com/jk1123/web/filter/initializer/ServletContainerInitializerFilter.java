package com.jk1123.web.filter.initializer;

import javax.servlet.*;
import java.io.IOException;

/**
 * <p>
 *     使用{@link ServletContainerInitializer}注解的filter
 * </p>
 */
public class ServletContainerInitializerFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("使用ServletContainerInitializer注入的filter");
        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
