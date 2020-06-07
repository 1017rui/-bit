package com.peixinchen;


import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;
/*
项目一：
模拟一个MySQL客户端。
1.JDBC的使用
2.理解MySQL 做的事情
3.理解cmd上，启动Java的知识点
 */

public class MySQLClient {
    /**
     * 以下配置，可以通过 parseArguments 进行替换
     */
    private static String host = "127.0.0.1";//主机
    private static int port = 3306;//端口
    private static String user = null;//用户
    private static String password = "0210";//密码
    private static String defaultDatabaseName = "";//默认数据库名

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(Arrays.toString(args));
        // args 代表的就是用户输入的参数
        if (args.length == 0) {
            printUsageAndExit();//打印使用说明，直接退出就行
        }
        //将参数传进去进行解析
        parseArguments(args);
        //1.进行数据库的连接
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //建立数据库的连接
        String url=String.format("jdbc:mysql://%s:%d/%s?useSSL=false&charsetEncoding=utf8",host,port,defaultDatabaseName );
        System.out.println("DEBUG: url = " + url);
        System.out.println("DEBUG: user = " + user);
        System.out.println("DEBUG: password = " + password);

        try {
            //  连接数据库  一次连接
            Connection connection = DriverManager .getConnection(url,user,password ) ;
           printWelcome();//打印欢迎界面。
            Scanner scanner=new Scanner(System.in);
            //进入所谓的mysql界面了
            System.out.print("mysql>");
            //一次连接，多次sql执行
            while(true){
                String cmd=scanner.nextLine() ;
                // 模拟，使用 quit 可以退出
                // quit 不需要输入 分号
                if(cmd.equalsIgnoreCase("quit") ){
                    break;
                }
                // 模拟真实的 mysql 中，不输入 分号，一行命令就不结束的现象
                while(!cmd.endsWith(";")){
                    System.out.print(" ->");
                    cmd+=scanner .nextLine();
                }
                //  System.out.println(cmd);
                // 分号 只是 mysql 程序的要求，不是 SQL 语言的要求
                cmd=cmd.substring(0,cmd.length()-1) ;//去掉分号
                System.out.println("DEBUG:"+cmd);

                // select 和 show 开头的 sql，是会返回结果的
                // 所以使用，带 ResultSet 的查询方式
                // 否则，使用 executeUpdate 的执行方式
                // 多次 sql 执行
                if(cmd.startsWith("select")|| cmd .startsWith("show") ){
                    executeQuery(connection,cmd);
                }else{
                    executeUpdate(connection,cmd);
                }
                System.out.print("mysql>");
            }
            connection .close();
        } catch (SQLException e) {
            printUsageAndExit(e.toString());
        }
        /*
        System.out.println(host);
        System.out.println(port);
        System.out.println(user);
        System.out.println(password);
        System.out.println(defaultDatabaseName);*/

    }
    //没有返回结果的语句
    private static void executeUpdate(Connection connection, String sql) throws SQLException {
        long b = System.currentTimeMillis();

        Statement statement=connection .createStatement() ;
        int count=statement.executeUpdate(sql);//得到受影响的行数。
        long e=System.currentTimeMillis() ;
        System.out.printf("Query ok,%d row affected(%.2f sec)%n",count,(e-b)/1000.0);
        statement .close();

    }

    private static void executeQuery(Connection connection, String sql) throws SQLException {
        long b = System.currentTimeMillis();//当前时间的毫秒级时间戳

        Statement statement=connection .createStatement() ;
        ResultSet resultSet =statement .executeQuery(sql);
        // 利用结果集中的 “元数据 MetaData” 获取一些基本信息
        // 一共有多少列
        // 每一列的名称是什么
        int columnCount=resultSet .getMetaData() .getColumnCount() ;
        // 打印表头 - 打印列的名称
        for (int i = 0; i < columnCount; i++) {
            String label = resultSet.getMetaData().getColumnLabel(i + 1);
            if (i != columnCount - 1) {
                System.out.print(label + ", ");
            } else {
                System.out.println(label);
            }
        }
        // 依次去遍历每一行，打印每一行的结果
        int rowCount=0;
        while(resultSet .next()) {
            rowCount++;
            for (int i = 0; i < columnCount; i++) {
                String value = resultSet.getString(i + 1);
                if (i != columnCount - 1) {
                    System.out.print(value + ", ");
                } else {
                    System.out.println(value);
                }
            }
        }
        long e=System.currentTimeMillis() ;
        //模拟mysql打印行数和时间(s)
           System.out.printf("%d rows int set(%.2f sec) %n",rowCount ,(e-b)/1000.0);
//执行结果集的关闭以及语句的关闭
        resultSet.close();
        statement .close();
    }

    private static void printWelcome() {
        System.out.print("欢迎使用MySQLClient");
        System.out.println();
    }

    private static void parseArguments(String[] args) {
        defaultDatabaseName = args[args.length - 1];//在最后一个位置  读取默认数据库
        args = Arrays.copyOfRange(args, 0, args.length - 1);

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            switch (arg) {
                case "--help":
                    printUsageAndExit();
                case "-h":
                case "--host":
                    host = args[++i];
                    break;
                case "-P":
                case "--port":
                    port = Integer.parseInt(args[++i]);
                    break;
                case "-u":
                case "--user":
                    user = args[++i];//读取用户名保存到user中
                    break;
                case "-p":
                case "--password":
                    password = args[++i];//读取密码  保存在password
                    break;
                default:
                    printUsageAndExit("不认识的选项: " + arg);
            }
        }
    }
    //相当于打印了一个菜单。
    private static void printUsageAndExit(String... messages) {
        System.out.println("使用帮助: mysql [选项] 默认数据库");
        System.out.println(" --help         打印帮助信息");
        System.out.println(" -h, --host     连接主机，默认是 127.0.0.1");
        System.out.println(" -P, --port     连接端口，默认是 3306");
        System.out.println(" -u, --user     mysql 用户名，必须设置");
        System.out.println(" -p, --password mysql 密码");

        // 1. stream 的操作
        // 2. 方法引用
        // 等于下面代码的简单版本
        //Arrays.stream(messages).peek(System.out::println);

        for (String s : messages) {
            System.out.println(s);
        }

        System.exit(1);//退出
    }
}
