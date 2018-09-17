package com.controller;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BaseController {


    /**
     * 获取当前线程的request对象
     */
    public HttpServletRequest getCurrentRequest() throws IllegalStateException {
        return this.getServletRequestAttributes().getRequest();
    }

    /**
     * 获取当前线程的response对象
     */
    public HttpServletResponse getCurrentResponse() throws IllegalStateException {
        return this.getServletRequestAttributes().getResponse();
    }

    /**
     * 获取当前线程上下文对象
     */
    private ServletRequestAttributes getServletRequestAttributes() throws IllegalStateException {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (servletRequestAttributes == null) {
            throw new IllegalStateException("当前线程中不存在 Request 上下文");
        }
        return servletRequestAttributes;
    }

    /**
     * 获取session对象
     * @return
     */
    private HttpSession getSession(){
        return getCurrentRequest().getSession();
    }

}
