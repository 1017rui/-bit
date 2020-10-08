package com.Small_Blog_System.Servlet;

import com.Small_Blog_System.model.User;

import javax.servlet.ServletException;
import javax.servlet.WriteListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String username=req.getParameter("username");
        String password=req.getParameter("password");

        User user;
        try {
            user = User.login(username,password);
        } catch (SQLException e) {
            throw new ServletException(e);
        }

        if(user==null){
            //如果登录失败，提示错误，返回主页面
            resp.getWriter().println("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <script>\n" +
                    "        alert(\"登录失败！！检查该用户是否注册或者密码填写是否正确！\")\n" +
                    "        window.location.href='/';\n" +
                    "    </script>\n" +
                    "</head>\n" +
                    "</html>");
            return;

        }
        HttpSession session=req.getSession();
        session.setAttribute("user",user);
        resp.sendRedirect("/");//登录完成跳转回主页即可
    }
}
