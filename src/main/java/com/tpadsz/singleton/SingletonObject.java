package com.tpadsz.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by hongjian.chen on 2018/2/27.
 */
public class SingletonObject {

    public enum MyEnumSingleton {
        connectionFactory;
        private Connection connection;

        MyEnumSingleton() {
            System.out.println("创建SingletonObject对象");
            try {
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

    public static Connection getConnection() {
        return MyEnumSingleton.connectionFactory.getConnection();
    }
}
