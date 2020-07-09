package lab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/status")
public class StatusServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //resp.setStatus(404);
        resp.setContentType("text/plain;charset=utf-8");
        resp.getWriter().println("你好");
        //resp.sendError(404,"我随便写的");
        //int i=1/0;
        //int[] array=new int[4];
        //System.out.println(array[4]);
        //Object o=null;
        //synchronized (o){

        //}
        //resp.setStatus(301);
        //resp.setHeader("Location","https://www.baidu.com");

    }
}
