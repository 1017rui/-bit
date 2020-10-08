package com.Small_Blog_System.Servlet;

import com.Small_Blog_System.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User user=(User)session.getAttribute("user");
        String nav="";
        if(user==null)//如果用户未登录  显示注册，登录
        {//<font size="2">我字体大小为2</font> 
            nav="&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;"+"<a  style=\"text-decoration:none \" href=\"register.html\"><big><b><font size=5>注册</font></b></big></a>\n" +"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;"+
                    "        <a  style=\"text-decoration:none \" href=\"login.html\"><big><b><font size=5>登录</font></b></big><br></a>\n";
        }else{//如果用户登录  显示发表文章
            nav="&emsp;&emsp;&emsp;&emsp;&emsp;"+"<big><b><font size=5>用户名：</font></b></big>"+"<big><b><font size=5>"+user.username+"</font></b></big>"+"\n" +"&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;"+
                    "        <a  style=\"text-decoration:none \" href=\"publish.html\"><big><b><font size=5>发表文章</font></b></big><br></a>";
        }
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter writer=resp.getWriter();
        writer.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Small_Blog_System</title>\n" +
                "</head>\n" +
                "<body background=\"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1602088049550&di=b5057d5244dcdce4c4c4f95e08aa07bc&imgtype=0&src=http%3A%2F%2Fattach.bbs.miui.com%2Fforum%2F201309%2F03%2F150928ozb82vyzhzsv96ov.jpg\" style=\"background-attachment:fixed\">\n" +
                "<div class =\"navigator\"\n" +
               // "<img width=600 height=100 src=https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1602061776869&di=296aa5529b1e7ef3b4b754b1aca2bccf&imgtype=0&src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20171110%2Fd9a2894c6a0a405db6fcadf965c179dc.gif /><br>"+
               "<table width=100% height=100%>\n" +
                "<tr>\n" +
                "<td>\n" +
                "<center>\n" +
                "\n" +
                "<div id=\"container\" style=\"width:600px;height:100px\">\n" +
                "\n" +
                "<div id=\"header\" style=\"background-color:#282828;text-align:center\">\n" +
                "<h1 style=\"margin-bottom:0;\"><font color=\"white\">Small_Blog_System</font></h1>" +
                "</div>\n" +
                "\n" +
                "\n" +
                "<div id=\"content\" style=\"background-color:#FFFAF0;height:200px;width:600px;float:left; text-align:left\">\n" +
                "<br>"+
                nav+
                "<br>"+
                //"<fieldset style=\"width:620px;\">\n"+
                //"<legend>"+"<big><b>系统中发表的文章</b></big>"+"</legend>"+

                "<div id=\"article-list\" style=\"height:125px;width:600px;overflow:auto;background:#EEEEEE;\" >\n" +
                "    <!--如果没有任何文章，显示请发表第一篇文章-->\n" +
                "    没有任何文章，请发表第一篇文章\n" +
                "    <!--如果有文章-->\n" +
                "</div>\n" +
                "<script  src=\"/js/index.js\" charset =\"utf-8\"></script>"+
               // "</fieldset>\n"+
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</center>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</table>\n"+
                //nav+
                //"<br>"+
                "</div>\n" +
                "</body>\n" +
                "</html>");

    }
}
