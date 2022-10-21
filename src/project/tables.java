/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author pminp
 */
public class tables {
    public static void main(String []args){
        Connection con=null;
        Statement st=null;
        
        try
        {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate("create table if not exists users( name varchar(200), email varchar(200), password varchar(50), securityQuestion varchar (200), answer varchar (200), address varchar(200), status varchar(20))");
            st.executeUpdate("create table if not exists rooms( roomNo varchar(10), roomtype varchar(200), bed varchar(200), price int , status varchar(20))");
            st.executeUpdate("create table if not exists guests( id int, name varchar(200), mobileNo varchar(20), nationalty varchar(200), gender varchar(50) , email varchar(200), idProof varchar(200), address varchar(200), checkIn varchar(200), roomNo varchar(10), bed varchar(200), roomType varchar(200), pricePerDay int(10), numberOfDayStay varchar(20), totalAmount varchar(200), checkOut varchar(200))");
            JOptionPane.showMessageDialog(null, "Tables created successfully");
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
        finally
        {
            try
            {
                con.close();;
                st.close();

            }
            catch(Exception e)
            {

            }
        }
    }
    
}
