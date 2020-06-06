import java.sql.*;

/**
 * @author 张瑞瑞
 * @date 2020/06/05 19:08
 */
public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      //注册驱动
        Class.forName("com.mysql.jdbc.Driver") ;

        //建立数据库连接
        //写明MySql服务端所在地
        //以后写项目，只需要修改默认数据库名称即可
        String defaultDatabaseName="huojianban2_0601";
        String password="0210";
        String user="root";
        String url="jdbc:mysql://127.0.0.1:3306/"+defaultDatabaseName +"?useSSL=false&characterEncoding=utf8";
       Connection connection = DriverManager .getConnection(url,user,password) ;
       //打开connection 对象验证是否连接成功。
        System.out.println(connection );
        //要真正的执行sql语言,并且获取数据库返回的结果.
        //queryDemo(connection);
        updateDemo(connection);

        // -1. 关闭刚才的连接
        connection.close();
    }
    private static void updateDemo(Connection  connection ) throws SQLException {
        Statement statement =connection .createStatement() ;
        String sql="insert into student_0604(sn,name,sex) values ('20200605','小陈','女')";
        int affectedRows =statement .executeUpdate(sql) ;
        System.out.printf("Query ok,%d row affected%n",affectedRows );//真正影响了那些行。

        statement.close();
    }
    /*
       完整的目标是执行select * from student_0604;
        */
    private static void queryDemo(Connection connection) throws SQLException {

        //关于有结果的sql

        //创建一个statement对象   记得要执行close
        //statement代表的是“结果集”的抽象对象
        Statement statement =connection .createStatement() ;
        String sql="select * from student_0604";//没有要求必须分号结尾
        //statement .executeQuery() 使用在带有结果的场景下
        //resultSet代表结果集的抽象对象
        ResultSet resultSet =statement .executeQuery(sql);
        int count=0;
        System.out.println("+----+------+-----------+-----+");
        System.out.println("| id | sn   | name      | sex |");
        System.out.println("+----+------+-----------+-----+");
        while(resultSet .next()){
            String id=resultSet .getString (1);//列
            String sn=resultSet .getString (2);
            String name=resultSet .getString (3);
            String sex=resultSet .getString (4);
            System.out.format("| %2s | %4s | %-7s | %3s |%n", id, sn, name, sex);
            count++;

        }
        System.out.println("+----+------+-----------+-----+");
        System.out.format("%d rows in set",count) ;

        // -3. 关闭 resultSet 对象
        resultSet.close();
        // -2. 关闭 statement 对象
        statement.close();
    }
}
