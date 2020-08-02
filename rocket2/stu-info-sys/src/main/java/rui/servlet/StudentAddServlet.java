package rui.servlet;

import rui.dao.StudentDAO;
import rui.model.Student;
import rui.util.JSONUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/student/add")
public class StudentAddServlet extends AbstractBaseServlet{
    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        Student s= JSONUtil.read(req.getInputStream(),Student.class);
        StudentDAO.insert(s);
        return null;
    }
}
