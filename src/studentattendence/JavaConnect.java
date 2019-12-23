/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentattendence;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class JavaConnect {
    
    Connection conn = null;
    public static Connection ConnectBD()
    {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Student_attended","root","");
       // JOptionPane.showMessageDialog(null,"connection established");
        return conn;
    }catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
    }
    
}
