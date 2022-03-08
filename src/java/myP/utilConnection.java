/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khaoula ouifaya
 */
public class utilConnection {
    public static  Connection seConnecter(){
        try {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
            } catch (ClassNotFoundException ex) {
               System.out.println("probleme de jre");
            }
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","gpointage","gpointage");
            return con;
             } catch (SQLException ex) {
            System.out.println("probleme de sql");
             }
        return null;
    }
    
    public static void main(String[] args){
        Connection con=utilConnection.seConnecter();
    System.out.println("connection okkkk");
    }
}
