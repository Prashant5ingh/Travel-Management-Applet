/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Home
 */
public class MyFirst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try         {
         //Class.forName("org.apache.derby.jdbc.ClientDriver");
         Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/travel2","travel2","travel2"); 
    System.out.println("Connected......");
        }
          
        
    
        catch(Exception e)
        {
            System.out.println("not");
        }

    
}
    }
