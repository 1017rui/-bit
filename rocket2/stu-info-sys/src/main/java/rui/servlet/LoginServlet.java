package rui.servlet;

import rui.dao.UserDAO;
import rui.model.User;
import rui.util.JSONUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/user/login")
public class LoginServlet extends AbstractBaseServlet {
    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        User u= JSONUtil.read(req.getInputStream(),User.class);
        User query= UserDAO.query(u);
        if(query==null){
            throw new RuntimeException("用户名或者密码错误");
        }
        //通过用户名密码查询到用户时，生成session
        HttpSession session=req.getSession();
        session.setAttribute("user",query);
        return null;
    }
}
