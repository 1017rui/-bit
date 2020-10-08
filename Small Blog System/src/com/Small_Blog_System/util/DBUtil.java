package com.Small_Blog_System.util;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
/*
Java语言的JDBC编程的基本步骤：
1.根据需要安装数据库系统并创建数据库；
2.加载数据库驱动程序；
3.建立驱动程序与数据库的连接；
4.执行SQL语句；
5.处理查询结果;
6.断开数据库连接。
 */
public class DBUtil {
    public static final DataSource dataSource=initDataSource();

    private static DataSource initDataSource() {
        MysqlDataSource mysqlDataSource=new MysqlDataSource();
        mysqlDataSource.setServerName("127.0.0.1");
        mysqlDataSource.setPort(3306);
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("0210");
        mysqlDataSource.setDatabaseName("Small_Blog_System");
        mysqlDataSource.setCharacterEncoding("utf8");
        mysqlDataSource.setUseSSL(false);

        return mysqlDataSource;
    }

    public static Connection getConnection() throws SQLException {
       return dataSource.getConnection();
    }
}
