package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class DataBase {
    private static DataBase instance;

    private final Connection connection;

    private DataBase(){
    try{
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc","root","1618f17LLP*");
    } catch (SQLException ex) {
        throw new RuntimeException("Ocorreu um erro ao se conectar com banco de dados");
    }
    }

    public static DataBase getInstance(){
        if(Objects.isNull(instance)){
            instance = new DataBase();
        }
        return instance;
    }
    public Connection connection(){
        return connection;
    }
}
