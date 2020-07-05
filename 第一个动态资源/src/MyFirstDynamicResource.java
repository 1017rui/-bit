import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 张瑞瑞
 * @date 2020/07/05 9:34
 */
public class MyFirstDynamicResource extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.通过query string 取到wd这个name所对应的value
        String wd=req.getParameter("wd");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer= resp.getWriter() ;
        writer.println("<h1>我是/s 资源 </h1>") ;
        writer .println("<p>用户要查找的关键字是:"+wd+"</p>");
    }
}
