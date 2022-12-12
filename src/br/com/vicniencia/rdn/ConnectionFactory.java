/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vicniencia.rdn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author victo
 */
public class ConnectionFactory {
    
     //private String URL = "jdbc:sqlserver://localhost:1433;databaseName=db_vicniencia;trustServerCertificate=true;integratedSecurity=true;";
     
     // private String URL = "jdbc:sqlserver:VICTORIA\\SQLEXPRESS:1433;databaseName=db_vicniencia;trustServerCertificate=true;integratedSecurity=true;";
      
      private String URL = "jdbc:sqlserver://VICTORIA\\SQLEXPRESS:1433;databaseName=db_vicniencia;trustServerCertificate=true;user=sa;password=sa";
    
      
     
    public Connection getConnection(){
    
         try {

            return DriverManager.getConnection(this.URL);
        } catch (SQLException ex) {

             System.out.println("Erro: " + ex.getMessage());
             
             return null;
           // throw new RuntimeException(ex);
        }
    }
    
}
