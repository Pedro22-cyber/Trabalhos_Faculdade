package DAO;

import java.sql.PreparedStatement;

import entity.Equipes;
import java.sql.SQLException;

public class EquipesDAO {
    public void cadastrarEquipes(Equipes equipes){

        String sql = "INSERT INTO USUARIO (EQUIPE) VALUES (?)";

        PreparedStatement ps = null;

        try{
            ps = Conexao.getConexao().PreparedStatement(sql);
            ps.setString(1,equipes.getEquipe())

            ps.execute();
            ps.close();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
