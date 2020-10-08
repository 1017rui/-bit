<<<<<<< HEAD
package com.Small_Blog_System.model;


import com.Small_Blog_System.util.DBUtil;

import java.io.IOException;
import java.sql.*;

public class User {
    public int id;
    public String username;



    public static User register(String username, String password) throws SQLException {
   //使用JDBC
        if(username==null || password==null){
            return null;
        }
        try(Connection c= DBUtil.getConnection()){
            String sql="insert into users(username,password) values(?,?)";
            try(PreparedStatement s=c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
                s.setString(1,username);
                s.setString(2,password);

                s.executeUpdate();
                try(ResultSet r=s.getGeneratedKeys()){
                    User user=new User();
                    user.id=r.getInt(1);
                    user.username=r.getString(2);
                    return user;
                }
            }
        }
    }

    public static User login(String username, String password) throws SQLException {
        try(Connection c= DBUtil.getConnection()){
            String sql="select id from users where username= ? and password= ? ";
            try(PreparedStatement s=c.prepareStatement(sql)){
                s.setString(1,username);
                s.setString(2,password);

                try(ResultSet r=s.executeQuery()){
                    if(!r.next()){
                        return null;
                    }
                    User user=new User();
                    user.id=r.getInt("id");
                    user.username=username;
                    return user;
                }
            }
        }
    }
}
=======
package com.Small_Blog_System.model;


import com.Small_Blog_System.util.DBUtil;

import java.io.IOException;
import java.sql.*;

public class User {
    public int id;
    public String username;



    public static User register(String username, String password) throws SQLException {
   //使用JDBC
        if(username==null || password==null){
            return null;
        }
        try(Connection c= DBUtil.getConnection()){
            String sql="insert into users(username,password) values(?,?)";
            try(PreparedStatement s=c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
                s.setString(1,username);
                s.setString(2,password);

                s.executeUpdate();
                try(ResultSet r=s.getGeneratedKeys()){
                    User user=new User();
                    user.id=r.getInt(1);
                    user.username=r.getString(2);
                    return user;
                }
            }
        }
    }

    public static User login(String username, String password) throws SQLException {
        try(Connection c= DBUtil.getConnection()){
            String sql="select id from users where username= ? and password= ? ";
            try(PreparedStatement s=c.prepareStatement(sql)){
                s.setString(1,username);
                s.setString(2,password);

                try(ResultSet r=s.executeQuery()){
                    if(!r.next()){
                        return null;
                    }
                    User user=new User();
                    user.id=r.getInt("id");
                    user.username=username;
                    return user;
                }
            }
        }
    }
}
>>>>>>> 64b400532b9ce10e2603c7cd10c3636032e66765
