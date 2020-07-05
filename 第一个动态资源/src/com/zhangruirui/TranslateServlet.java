package com.zhangruirui;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 张瑞瑞
 * @date 2020/07/05 11:34
 */
public class TranslateServlet extends HttpServlet {
   /* //事先定义一个字典
    private static Map<String,String> dictionary=new HashMap <>();
    static{
    dictionary .put("apple","苹果");
    dictionary .put("pear","梨子");
    dictionary .put("pig","猪");
    dictionary .put("orange","橘子");
    }*/
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String english=req.getParameter("english");
        //没有任何的错误处理。

       // String chinese=dictionary.getOrDefault(english,"不认识的单词");

        //select chinese from dictionary where english=?
        String chinese;
        try(Connection c=DBUtil.getConnection()){
            String sql="select chinese from dictionary where english=?";

            try(PreparedStatement s=c.prepareStatement(sql)){
                s.setString(1,english);
                try(ResultSet r=s.executeQuery()){
                    //因为创建表的时候，english字段设定为unique
                    //所以，上述SQL，要不返回1行数据，要不返回0行数据。
                    if(r.next()){
                        //代表有结果
                        chinese=r.getString("chinese");
                    }else{
                        //没有结果
                        chinese="不认识的单词";
                    }
                }
            }
        }catch (SQLException e){
            throw new ServletException(e);
        }
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer= resp.getWriter() ;
        writer.println("<h1>翻译结果 </h1>") ;
        writer .println("<p>"+english+"的意思是"+chinese+"</p>");

    }
}
