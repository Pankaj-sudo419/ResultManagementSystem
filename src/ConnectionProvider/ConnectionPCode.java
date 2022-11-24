/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author pp843
 */
public class ConnectionPCode {
    public static Connection getcon(){
        try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ResultMang","root","Example@2022#");
          return con;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
        
    }
    public static void main(String args[]){
        ConnectionPCode con = new ConnectionPCode();
        Connection c = con.getcon();
        
    }
}
