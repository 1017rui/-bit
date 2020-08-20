package rui.servlet;

import rui.dao.DictionaryTagDAO;
import rui.model.DictionaryTag;
import rui.model.Response;
import rui.util.JSONUtil;
import rui.util.ThreadLocalHolder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

public abstract class AbstractBaseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    //模板方法
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");

        PrintWriter pw=resp.getWriter();
        Response r=new Response();

        try {
            Object o=process(req,resp);
            r.setSuccess(true);
            r.setCode("COK200");
            r.setMessage("操作成功");
            r.setTotal(ThreadLocalHolder.getTOTAL().get());//不管是否分页接口，都获取当前线程中的total变量
            r.setData(o);
        }catch (Exception e){
            r.setCode("ERR500");
            r.setMessage(e.getMessage());
            StringWriter sw=new StringWriter();
            PrintWriter writer=new PrintWriter(sw);
            e.printStackTrace(writer);
            String stackTrace=sw.toString();
            System.err.println(stackTrace);
            r.setStackTrace(stackTrace);
        }finally {
            ThreadLocalHolder.getTOTAL().remove();//在线程结束前，一定要记得删除操作，否则会存在内存泄漏
        }
        // r.setData(tags);
        pw.println(JSONUtil.write(r));
        pw.flush();
    }

    protected abstract Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception;


}
