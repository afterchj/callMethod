package com.tpadsz.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by hongjian.chen on 2018/2/27.
 */
public enum MyEnum {
    connectionFactory;
    private Connection connection;

    MyEnum() {
        try {
            System.out.println("调用了MyEnum构造方法");
            String url = "jdbc:mysql:///test";
            String userName = "root";
            String password = "root";
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, userName, password);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

}
