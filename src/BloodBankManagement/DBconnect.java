/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodBankManagement;

import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBconnect {
    
 
    public static void main (String[] args) throws SQLException{
        Connection con;
        PreparedStatement insert;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:sqlserver://bloodbankdata.database.windows.net:1433;database=bloodBank;user=csiadmin@bloodbankdata;password=7ousRespo3!;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;","csiadmin", "7ousRespo3!");          
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
