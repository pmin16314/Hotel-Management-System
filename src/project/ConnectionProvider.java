/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author pminp
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/brandiveHotel";
            String username = "root";
            String password = "PmiIsh@16326";
            Connection con = DriverManager.getConnection(url, username, password);
            return con;
        }
        
        catch(Exception e)
        {
            return null;
        }
    }
    
}
