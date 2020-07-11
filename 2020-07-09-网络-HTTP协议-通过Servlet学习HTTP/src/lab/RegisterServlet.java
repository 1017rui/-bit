package lab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter writer=resp.getWriter();
        req.setCharacterEncoding("utf-8");
        //1.读取用户的输入（username+password）
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //注册
        User user=User.register(username,password);
        //User user=new User(username,password);
        //userList.add(user);//得用public修饰User类中的userList
        writer.println(user.username+"<p>注册成功</p>");

    }
}
