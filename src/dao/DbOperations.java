/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author durge
 */
public class DbOperations {
     public static void setDataOrDelete(String Query, String msg){
        try{
            Connection con = ConnectionProvider.getCon();              //creating connection
            Statement st = con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals(""))                                            //msg should not be blanked
                JOptionPane.showConfirmDialog(null, msg);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Message",JOptionPane.ERROR_MESSAGE);
        }      
    }
     
    public static ResultSet getData(String query){
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.CreateStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
