package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    private static final String url = "jdbc:mysql://localhost3306";
    private static final String user = "root";
    private static final String password = "1618f17LLP*";

    private static Connection conn;
    
    //verificar se a conexao foi estanciada
    public static Connection getConexao(){
        
        try {
            if(conn == null){
                conn = DriverManager.getConnection(url,user,password);
                return conn;
            }else{
                return conn;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return  null;
        }
    }
}
