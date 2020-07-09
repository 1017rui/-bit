package com.zhangruirui;

import javax.servlet.ServletException;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
        import java.io.PrintWriter;
        import java.util.Enumeration;

public class ReqServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        printInfo(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        printInfo(req, resp);
    }

    private void printInfo(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/plain; charset=utf-8");
        PrintWriter writer = resp.getWriter();

        // 方法(Method)
        writer.println("请求的方式是: " + req.getMethod());
        // URL or 路径(Path)
        writer.println("URL中的完整路径: " + req.getRequestURI());
        writer.println("URL中的Context路径: " + req.getContextPath());
        writer.println("URL中的 web.xml 中的路径: " + req.getServletPath());
        writer.println("完整的 QueryString: " + req.getQueryString());
        // 根据 query string 的 key 获取对应的 value
        writer.println("QueryString 中 name 为 key1 的值: " + req.getParameter("key1"));
        writer.println("QueryString 中 name 为 key2 的值: " + req.getParameter("key2"));
        // Enumeration 是一个用来做遍历的对象
        writer.println("QueryString 中有如下 name: ");
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()) {  // 只要还有更多的元素，就循环
            String name = parameterNames.nextElement();  // 挨个取 name
            writer.println(name);
        }
        // 获取协议版本信息
        writer.println("请求协议版本: " + req.getProtocol());
    }
}
