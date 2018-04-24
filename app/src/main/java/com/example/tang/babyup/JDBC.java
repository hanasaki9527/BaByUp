package com.example.tang.babyup;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//操作数据库用的
public class JDBC {
    //注册mysql驱动
    public void hello(){
        try {
            DriverManager.registerDriver(new Driver());

            //地址和账号和密码
            String username = "root";
            String password = "$Qwer1234";
            //url为腾讯云的服务器,数据库端口默认3306
            String url = "jdbc:mysql://118.24.131.29:3306/User_DB";

            //访问数据库
            Connection connection = DriverManager.getConnection(url,username,password);

            //获取statrment对象，用来执行sql
            Statement statement = connection.createStatement();
            //定义一句sql
            String sql = "select user_username from User_table;";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                String name = resultSet.getString(2);
                System.out.println(name);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        //资源释放没写


    }

}
