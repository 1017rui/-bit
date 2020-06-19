
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author 张瑞瑞
 * @date 2020/06/19 20:19
 */
public class DBUtil {
    //这个应用期间 只需要一个DataSource  就是单例的应用
    //饿汉模式的单例
    /*
    private static final DataSource dataSource ;
    static{
        MysqlDataSource mysqlDataSource =new MysqlDataSource() ;
        mysqlDataSource .setServerName("127.0.0.1") ;
        mysqlDataSource .setPort(3306) ;
        mysqlDataSource .setUser("root") ;
        mysqlDataSource .setPassword("0210") ;
        mysqlDataSource .setUseSSL(false) ;
        mysqlDataSource .setCharacterEncoding("utf8") ;
        dataSource =mysqlDataSource ;
    }
    public static Connection getConnection() throws SQLException {
       return  dataSource .getConnection();
    }
    */
    //懒汉模式
    private static volatile DataSource dataSource=null;
    private static void initDataSource(){
        MysqlDataSource mysqlDataSource =new MysqlDataSource() ;
        mysqlDataSource .setServerName("127.0.0.1") ;
        mysqlDataSource .setPort(3306) ;
        mysqlDataSource .setUser("root") ;
        mysqlDataSource .setPassword("0210") ;
        mysqlDataSource .setUseSSL(false) ;
        mysqlDataSource .setCharacterEncoding("utf8") ;
        //volatile 可见性进一步限制了重排序的效果
        //不可能重排序到上面
        dataSource =mysqlDataSource ;
    }
    public static Connection getConnection() throws SQLException {
        if(dataSource ==null){
            synchronized (DBUtil .class){
                if(dataSource ==null){
                   initDataSource() ;
                }
            }
        }
        return dataSource .getConnection();
    }
}
