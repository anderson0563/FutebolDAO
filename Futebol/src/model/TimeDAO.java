/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import server.Conexao;

/**
 *
 * @author anderson
 */
public class TimeDAO {
    private Connection banco;
    
    public TimeDAO() throws SQLException{
        banco = (new Conexao(0)).conectar();
    }
    
    public int inserirTime(Time t) throws SQLException{
        //String SQL
        String SQL = "INSERT INTO time (`nome`, `atleta`) VALUES (?, ?)";
        
        //Preparacao do Comando
        PreparedStatement comando = banco.prepareStatement(SQL);
        comando.setString(1, t.getNome());
        comando.setString(2, t.getAtleta());
        
        //Execucao do Comando
        int resultado = comando.executeUpdate();
        
        //Retorno do resultado
        return resultado;
    }
}
