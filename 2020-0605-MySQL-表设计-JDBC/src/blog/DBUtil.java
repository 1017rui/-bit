package blog;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

// Utilize 工具
//由于dataSource只需要创建一次，所以写到一个工具类当中。
public class DBUtil {
    // 静态属性，这个代码运行过程中，只有一份（整个进程运行过程中）
    private static DataSource dataSource = null;

    static {
        initDataSource();
    }
//1.初始化DataSource
    private static void initDataSource() {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setServerName("127.0.0.1");//服务器名
        mysqlDataSource.setPort(3306);//端口
        mysqlDataSource.setUser("root");//用户名
        mysqlDataSource.setPassword("0210");//密码
        mysqlDataSource.setDatabaseName("huojianban2_boke");//数据库名
        mysqlDataSource.setUseSSL(false);
        mysqlDataSource.setCharacterEncoding("utf8");

        dataSource = mysqlDataSource;
    }
//2.通过dataSource获取Connection
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
