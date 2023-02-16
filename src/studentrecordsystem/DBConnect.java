/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentrecordsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class DBConnect
{
 
    Connection conn=null;
    public static Connection ConnecrDb(){
        
    try
    {
        Class.forName("org.sqlite.JDBC");
        Connection conn =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Hp\\Documents\\NetBeansProjects\\StudentRecordSystem\\src\\studentrecordsystem\\DBConnect.java");
        //JOptionPane.showMessageDialog(null, "Connection To Database Established");
        return conn;
    }   
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(null, "CONNECTION FAILURE");
        return null;
         }
       }
    }

