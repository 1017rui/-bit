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

@WebServlet("/publish.html")
public class PublishHtmlServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User user=(User)session.getAttribute("user");
        if(user==null){
            resp.sendRedirect("login.html");
            return;
        }

        String htmlContent="<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Small_Blog_System | 发表文章</title>\n" +
                "</head>\n" +
                "<body background=\"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1602150427601&di=6fb327c9c89a6f1a3829fccc432a55f8&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2Fe%2F578c9f0f4a7dd.jpg\" style=\"background-attachment:fixed\">\n" +
                "<center>\n" +
                "    <style type=\"text/css\">\n" +
                "        label{\n" +
                "            /*居中对齐*/\n" +
                "            display: inline-block;\n" +
                "            width:70px;\n" +
                "            height: 40px;\n" +
                "            line-height: 40px;\n" +
                "            text-align: justify;\n" +
                "            text-align-last: justify;\n" +
                "        }\n" +
                "\n" +
                "    </style>"+
                "<form method=\"post\" action=\"publish\">\n" +
                "    <fieldset style=\"width:400px;\">\n" +
                "<br>"+
                "    <div>\n" +
                "        <label for=\"title\"><big><b><font  color=\"white\">标题：</font></b></big></label>\n" +
                "        <input type=\"text\" id=\"title\" name=\"title\" style=\"height: 30px;width: 200px\">\n" +
                "    </div>\n" +
                "<br>"+
                "\n" +
                "    <div>\n" +
                "        <label for=\"content\"><big><b><font  color=\"white\">正文：</font></b></big></label>\n" +
                "        <textarea id=\"content\" name=\"content\" style=\"height: 100px;width: 200px\"></textarea>\n" +
                "    </div>\n" +
                "<br>"+
                "\n" +
                "    <div>\n" +
                "        <button type=\"submit\"style=\"height: 40px;width: 65px\" ><big><b>发表</b></big></button>\n" +
                "    </div>\n" +
                "<br>"+
                "    </fieldset>\n" +
                "</form>\n" +
                "</center>\n" +
                "</body>\n" +
                "</html>";
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println(htmlContent);

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

@WebServlet("/publish.html")
public class PublishHtmlServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User user=(User)session.getAttribute("user");
        if(user==null){
            resp.sendRedirect("login.html");
            return;
        }

        String htmlContent="<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Small_Blog_System | 发表文章</title>\n" +
                "</head>\n" +
                "<body background=\"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1602150427601&di=6fb327c9c89a6f1a3829fccc432a55f8&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2Fe%2F578c9f0f4a7dd.jpg\" style=\"background-attachment:fixed\">\n" +
                "<center>\n" +
                "    <style type=\"text/css\">\n" +
                "        label{\n" +
                "            /*居中对齐*/\n" +
                "            display: inline-block;\n" +
                "            width:70px;\n" +
                "            height: 40px;\n" +
                "            line-height: 40px;\n" +
                "            text-align: justify;\n" +
                "            text-align-last: justify;\n" +
                "        }\n" +
                "\n" +
                "    </style>"+
                "<form method=\"post\" action=\"publish\">\n" +
                "    <fieldset style=\"width:400px;\">\n" +
                "<br>"+
                "    <div>\n" +
                "        <label for=\"title\"><big><b><font  color=\"white\">标题：</font></b></big></label>\n" +
                "        <input type=\"text\" id=\"title\" name=\"title\" style=\"height: 30px;width: 200px\">\n" +
                "    </div>\n" +
                "<br>"+
                "\n" +
                "    <div>\n" +
                "        <label for=\"content\"><big><b><font  color=\"white\">正文：</font></b></big></label>\n" +
                "        <textarea id=\"content\" name=\"content\" style=\"height: 100px;width: 200px\"></textarea>\n" +
                "    </div>\n" +
                "<br>"+
                "\n" +
                "    <div>\n" +
                "        <button type=\"submit\"style=\"height: 40px;width: 65px\" ><big><b>发表</b></big></button>\n" +
                "    </div>\n" +
                "<br>"+
                "    </fieldset>\n" +
                "</form>\n" +
                "</center>\n" +
                "</body>\n" +
                "</html>";
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println(htmlContent);

    }
}
>>>>>>> 64b400532b9ce10e2603c7cd10c3636032e66765
