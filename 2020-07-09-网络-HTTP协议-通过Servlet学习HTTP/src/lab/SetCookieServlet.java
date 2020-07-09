package lab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/set-cookie")
public class SetCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.setHeader("Set-Cookie","today=2020-07-09"); //这句是关键

//以下是servlet提供的方便的类和方法种Cookie
        Cookie cookie=new Cookie("today","2020-07-09");
        cookie.setDomain("baidu.com");//我们的域假如是www.baidu.com最多可以设置到baidu.com
        resp.addCookie(cookie);
        resp.setContentType("text/plain; charset=utf-8");
        resp.getWriter().println("种下cookie:today=2020-07-09");

    }
}
