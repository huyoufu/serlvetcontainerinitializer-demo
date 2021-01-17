package com.jk1123.web.filter.xml;

import javax.servlet.*;
import java.io.IOException;

public class XmlFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("使用Xml方式注入的filter");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
