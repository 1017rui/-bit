package lab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //通过请求cookie中的session-id，去session中读取user对象
        //如果读到了user对象，就代表用户已经登录了
        //否则，代表用户没有登录过
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter writer = resp.getWriter();
        req.setCharacterEncoding("utf-8");

        HttpSession session=req.getSession();
        User user=(User)session.getAttribute("user");//这个“user”key必须和setAttribute时的key一致
        if(user==null){
            writer.println("<p>您没有登录，所以没有个人主页</p>");
        }else{
            writer.println("<p>欢迎您!"+user.username+"</p>");
        }

    }
}
