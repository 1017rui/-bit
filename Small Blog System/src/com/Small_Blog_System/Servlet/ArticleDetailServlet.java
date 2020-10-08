package com.Small_Blog_System.Servlet;

import com.Small_Blog_System.model.Article;
import com.Small_Blog_System.model.User;
import javafx.scene.shape.ArcTo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/article")
public class ArticleDetailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession();
        User user=(User)session.getAttribute("user");
        if(user==null){//如果没有登录不能查看文章
            //提示用户没有登录，需要进行登录
            resp.getWriter().println("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <script charset=\"UTF-8\">\n" +
                    "        alert(\"请先登录！\");\n" +
                    "        window.location.href='/';\n" +
                    "    </script>\n" +
                    "\n" +
                    "</head>\n" +
                    "\n" +
                    "</html>\n");



            return;
        }
        String idStr=req.getParameter("id");
        int id=Integer.parseInt(idStr);

        Article article= null;//根据id拿到这篇文章
        try {
            article = Article.get(id);
        } catch (SQLException e) {
            throw new ServletException(e);
        }
        if(article==null) {
            resp.sendError(404,"没有这篇文章");
            return ;

        }

        PrintWriter writer=resp.getWriter();
        writer.println("<h1>"+article.title+"</h1>");
        writer.println("<p>"+article.content+"<p>");
    }
}
