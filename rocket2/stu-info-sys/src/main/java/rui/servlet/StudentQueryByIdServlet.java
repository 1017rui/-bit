package rui.servlet;

import rui.dao.StudentDAO;
import rui.model.Student;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/student/queryById")
public class StudentQueryByIdServlet extends AbstractBaseServlet {
    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String id=req.getParameter("id");//获取id
        Student s= StudentDAO.queryById(Integer.parseInt(id));
        return s ;
    }
}
