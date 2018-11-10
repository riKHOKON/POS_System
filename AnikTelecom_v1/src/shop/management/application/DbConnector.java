package shop.management.application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author rIslam
 */
public class DbConnector {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
//    private static final String CONN = "jdbc:mysql://localhost:3306/test";
//    private static final String CONN = "jdbc:mysql://localhost:3306/like_telecom_db";
    private static final String CONN = "jdbc:mysql://localhost:3306/app_db";
    
    
    public static Connection ConnectDB(){
        try {
            return  DriverManager.getConnection(CONN,USERNAME,PASSWORD);                                              
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Check the database connection if it's working.");
            System.err.println(e);
            return null;    
        }
    }      
}
