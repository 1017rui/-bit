package lab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/login")
public class loginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter writer=resp.getWriter();
        //1.读取用户的输入（username+password）
        req.setCharacterEncoding("utf-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        //2.验证用户输入的正确性，并得到user对象
        User user=User.login(username,password);
        if(user==null){
            //代表用户名或者密码错误
            writer.println("<p>用户名或者密码错误</p>");
            return;

        }
        //3.设置cookie和session  设置了Session背后的Tomcat的代码会同时设置Cookie信息
        HttpSession session=req.getSession();
        session.setAttribute("user",user);
        //4.显示登录成功
        writer.println("<p>登录成功</p>");
    }
}
