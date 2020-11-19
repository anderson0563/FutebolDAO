/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author anderson
 */
public class Conexao {
    private String servidor, banco, usuario, senha;
    private int porta;        

    public Conexao(int status) {
        if(status == 0){//dev
            this.servidor = "127.0.0.1";
            this.porta = 3306;
            this.banco = "futebol";
            this.usuario = "galvaobueno";
            this.senha = "ronaldinho";
        }
    }

    public Connection conectar() throws SQLException{
        String url = "jdbc:mysql://" + this.getServidor() + ":" +
                this.getPorta() + "/" + this.getBanco();
        
        return (Connection)DriverManager.getConnection(url, usuario, senha);
    }
    
    
    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }
    
    
}
