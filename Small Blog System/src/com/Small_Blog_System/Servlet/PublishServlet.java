package com.Small_Blog_System.Servlet;

import com.Small_Blog_System.model.Article;
import com.Small_Blog_System.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/publish")
public class PublishServlet extends HttpServlet {
    //为了防止恶意用户绕过前端效验直接像我们这个接口url中提交信息，所以还得进行一次是否登录的效验

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        User user=(User) session.getAttribute("user");
        if(user==null){
            resp.sendRedirect("login.html");
            return;
        }
        req.setCharacterEncoding("utf-8");
        String title=req.getParameter("title");
        String content=req.getParameter("content");

        try {
            Article.publish(user.id,title,content);

        }catch( SQLException e){
            throw new ServletException(e);

        }
        resp.sendRedirect("/");
    }
}
