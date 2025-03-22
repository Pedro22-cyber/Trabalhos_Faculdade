package Conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoSQL {

    private static void closeConnection(Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void closeConnection(Connection con, PreparedStatement stmt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Connection conectaDB(){
        Connection conn = null; 
        try {
            String url = "jbdc:mysql://localhost:3306/aps?user=root&password=1618f17LLP*";
            conn = DriverManager.getConnection(url);

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return conn;
    }
    public static void FecharConn(Connection con){
            try {
            if(con != null){
                con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public static void FecharConn(Connection con, PreparedStatement stmt){
        
        closeConnection(con);
        try {
            if(stmt!= null){
                stmt.close();
            }
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public static void FecharConn(Connection con, PreparedStatement stmt,ResultSet rs){
        
        closeConnection(con,stmt);
        try {
            if(rs!= null){
                rs.close();
            }
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
