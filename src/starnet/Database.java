/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starnet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author junnu
 */
public class Database {
    public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:account.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return conn;
    }
}
