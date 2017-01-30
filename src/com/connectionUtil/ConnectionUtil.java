package com.connectionUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	static Connection connection = null;
	private static final String driver="com.mysql.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost/bookpublishing";
	private static final String username="root";
	private static final String password="tiger";
    public static Connection getConnection(){
        try {
            Class.forName(driver);
            if(connection == null)
            {
                connection = DriverManager.getConnection
                		(url,username,password);
                System.out.println("Connected");
            } 
        } catch (ClassNotFoundException e) {
 
            e.printStackTrace();
             
        } catch (SQLException e) {
             
            e.printStackTrace();
             
        }
        return connection;
    }

}
