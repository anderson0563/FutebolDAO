/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.Scanner;
import model.Time;
import model.TimeDAO;

/**
 *
 * @author anderson
 */
public class Futebol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Entre com o nome do time: ");
        String nome = leitura.next();
        System.out.println(">>>> Valor lido:" + nome);

        System.out.print("Entre com o nome do atleta: ");
        String atleta = leitura.next();
        System.out.println(">>>> Valor lido:" + atleta);
        
        
        
        Time flamengo = new Time(nome, atleta);
        
        System.out.println(flamengo);
        
        TimeDAO brasileirao = new TimeDAO();
        
        int resultado = brasileirao.inserirTime(flamengo);
        
        System.out.println(resultado);
        
        
        
        
        
        
    }
    
}
