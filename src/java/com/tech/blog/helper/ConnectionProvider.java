
package com.tech.blog.helper;
import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
public class ConnectionProvider {
    private static Connection con;
    public static Connection getDbConnection(){
        try{
            if(con == null){
                Class.forName("com.mysql.jdbc.Driver");  
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog", "root", "tanmay");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return con; 
    } 
}
