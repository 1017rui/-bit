package rui.dao;

import rui.model.Student;
import rui.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    public static List<Student> query() {
        Connection c=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        List<Student> list=new ArrayList<>();
        try{
            //1.获取数据库连接
            c= DBUtil.getConnection();
            String sql="";//关联班级表和学生表
            //2.创建操作命令对象
            ps=c.prepareStatement(sql);

            //3.执行sql语句
            rs=ps.executeQuery();
            //4.处理查询结果集
            while(rs.next()){
                Student student=new Student();

                //设置属性，通过结果集获取，并设置
                //tag.setDictionaryTagKey(rs.getString("dictionary_tag_key"));
                //tag.setDictionaryTagValue(rs.getString("dictionary_tag_value"));
                list.add(student);
            }
            return list;
        }catch(Exception e){
            throw new RuntimeException("查询学生列表出错",e);
        }finally {
            DBUtil.close(c,ps,rs);
        }
    }
}
