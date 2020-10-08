<<<<<<< HEAD
package com.Small_Blog_System.Servlet;

import com.Small_Blog_System.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String username=req.getParameter("username");
        String password=req.getParameter("password");

        User user= null;
        try {
            user = User.register(username,password);
        } catch (SQLException e) {
            //throw new ServletException(e);
        }

        if(user==null){
            //resp.sendRedirect("register.html");
            resp.getWriter().println("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <script>\n" +
                    "        alert(\"该用户名已经使用或者检查是否有字段未填写！\")\n" +
                    "        window.location.href='register.html';\n" +
                    "    </script>\n" +
                    "</head>\n" +
                    "</html>");
            return;

        }
        if(user==null){
            //resp.sendRedirect("register.html");
            resp.getWriter().println("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <script>\n" +
                    "        alert(\"检查是否有字段未填写！\")\n" +
                    "        window.location.href='register.html';\n" +
                    "    </script>\n" +
                    "</head>\n" +
                    "</html>");
            return;

        }
        //注册完之后保持登录
        HttpSession session=req.getSession();
        session.setAttribute("user",user);

        resp.sendRedirect("/");//登录完成跳转回主页即可


    }
}
=======
package com.Small_Blog_System.Servlet;

import com.Small_Blog_System.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String username=req.getParameter("username");
        String password=req.getParameter("password");

        User user= null;
        try {
            user = User.register(username,password);
        } catch (SQLException e) {
            //throw new ServletException(e);
        }

        if(user==null){
            //resp.sendRedirect("register.html");
            resp.getWriter().println("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <script>\n" +
                    "        alert(\"该用户名已经使用或者检查是否有字段未填写！\")\n" +
                    "        window.location.href='register.html';\n" +
                    "    </script>\n" +
                    "</head>\n" +
                    "</html>");
            return;

        }
        if(user==null){
            //resp.sendRedirect("register.html");
            resp.getWriter().println("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <script>\n" +
                    "        alert(\"检查是否有字段未填写！\")\n" +
                    "        window.location.href='register.html';\n" +
                    "    </script>\n" +
                    "</head>\n" +
                    "</html>");
            return;

        }
        //注册完之后保持登录
        HttpSession session=req.getSession();
        session.setAttribute("user",user);

        resp.sendRedirect("/");//登录完成跳转回主页即可


    }
}
>>>>>>> 64b400532b9ce10e2603c7cd10c3636032e66765
