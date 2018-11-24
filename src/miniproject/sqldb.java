/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Ketna S. Soni
 */
public class sqldb {
    static Connection conn = null;
    
    public static Connection getConnection(){
    try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"not Connected");
        }
        return conn;
    } 
}
