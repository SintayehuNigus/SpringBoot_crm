package com.springdemo.Springboot.filter;

import jakarta.servlet.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class MyNewFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, SecurityException, ServletException {
        System.out.println("The new Filter is called...");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
