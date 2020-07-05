import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 张瑞瑞
 * @date 2020/07/05 10:46
 */
public class MySecondDynamicResource extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String target=req.getParameter("target");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer= resp.getWriter() ;
        writer.println("<h1>输出html </h1>") ;
        writer .println("<p>用户要查找的关键字是:"+"Hello"+" "+target+"</p>");
    }
}
