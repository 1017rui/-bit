package rui.filter;

import rui.model.Response;
import rui.util.JSONUtil;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
//登录的过滤器
//配置了过滤器，只要请求路径匹配到过滤器路径，都会先执行过滤器的doFilter方法
//至于是否往后执行，袭来与是否再次调用filterChain.doFilter方法
@WebFilter("/*")
///*模糊匹配所有路径
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//后台接口：只校验除登录接口之外的后台接口，没有登陆的时候，不允许访问
//前端资源：只校验/public/page/main.html首页，其他的都放行

        HttpServletRequest req=(HttpServletRequest)servletRequest;
        HttpServletResponse res=(HttpServletResponse)servletResponse;

        String url=req.getServletPath();

        HttpSession session=req.getSession(false);
        if(session==null){
            //如果没有登录 重定向到登录界面
               //首页重定向到登录页面
              // req.setCharacterEncoding("UTF-8");
              // res.setCharacterEncoding("UTF-8");
               if("/public/page/main.html".equals(url)){
                   res.setContentType("text/html");
                   String schema=req.getScheme();
                   String host=req.getServerName();
                    int port=req.getServerPort();
                    String ctx=req.getContextPath();
                    String basePath=schema+"://"+host+":"+port+ctx;
                    res.sendRedirect(basePath+"/public/index.html");//会出问题
                    return;
               }else if(!url.startsWith("/public/")
                       &&!url.startsWith("/static/")&&!"/user/login".equals(url)){
                   res.setContentType("application/json");
                   PrintWriter pw=res.getWriter();
                   Response r=new Response();
                   r.setCode("ERR401");
                   //返回401状态码  未登录不允许访问的请求
                   r.setMessage("不允许访问");
                   res.setStatus(401);
                   pw.println(JSONUtil.write(r));
                   pw.flush();
                   return;
               }
           }
        filterChain.doFilter(servletRequest,servletResponse);

    }
    @Override
    public void destroy() {
    }
}
