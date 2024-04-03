package com.github.houbb.minicat.support.servlet;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;

/**
 * servlet 管理
 *
 * @since 0.3.0
 */
public interface IServletManager {

    /**
     * 注册 servlet
     *
     * @param url     url
     * @param servlet servlet
     */
    void register(String url, HttpServlet servlet);

    /**
     * 获取 servlet
     *
     * @param url url
     * @return servlet
     */
    HttpServlet getServlet(String url);

}
