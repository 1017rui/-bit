import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.DataSource ;


/**
 * @author 张瑞瑞
 * @date 2020/06/07 16:55
 */
public class use_datasource {
    public static void getConnectionUseDriverManger() throws ClassNotFoundException,SQLException {
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver") ;
        //2.获取连接
        String url="jdbc:mysql://127.0.0.1:3306/huojianban2_0601?charsetEncoding=utf&useSSL=false";
        String user="root";
        String password="0210";
        try(Connection connection =DriverManager.getConnection(url,user,password)){
         //目的就是获取Connection对象
        }
    }
    // 1. 这个是新版 JDBC 标准提供的写法
    // 2. 写法比 url 的方式更加明确，不容易出现拼写错误
    // 3. 支持连接池的方式，所以可能效率更高
    public static void getConnectionDataSource() throws SQLException {
        DataSource dataSource ;
        MysqlDataSource mysqlDataSource =new MysqlDataSource() ;
        mysqlDataSource .setServerName("127.0.0.1") ;
        mysqlDataSource .setPort(3306) ;
        mysqlDataSource .setUser("root") ;
        mysqlDataSource .setPassword("0210") ;
        mysqlDataSource .setDatabaseName("huojianban2_0601") ;
        mysqlDataSource .setUseSSL(false);
        mysqlDataSource .setCharacterEncoding("utf8") ;
        //DataSource 也支持url的方式指定连接参数
        //mysqlDataSource .setUrl("jdbc:mysql://127.0.0.1:3306/huojianban2_0601?charsetEncoding=utf&useSSL=false") ;

        dataSource =mysqlDataSource ;

        try(Connection connection =dataSource .getConnection()) {
            // 我的目的就是要获取 Connection 对象
        }
    }

}
