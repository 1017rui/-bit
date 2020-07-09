package com.zhangruirui;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author 张瑞瑞
 * @date 2020/07/05 14:03
 */
/*
懒汉单例
 */
public class DBUtil {
    private static volatile DataSource dataSource =null;
    public static Connection getConnection() throws SQLException {
        if(dataSource==null){
            synchronized (DBUtil.class){
                if(dataSource==null){
                    dataSource=initDataSource();
                }
            }
        }
        return dataSource.getConnection();

    }

    private static DataSource initDataSource() {
        MysqlDataSource mysqlDataSource=new MysqlDataSource();
        mysqlDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/hjb2_0705?useSSL=false&characterEncoding=utf8");
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("0210");
        return mysqlDataSource;
    }
}
