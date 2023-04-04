/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author jbferraz
 */
public class Conexao {

    //cria uma constante com endereço do BD/Schema
    private static String url = "jdbc:mysql://localhost:3306/livraria";
    //cria uma constante  um user do BD
    private static String user = "root";
    //cria uma constante com a senha do BD
    private static String pass = "";

    public static Connection getConexao() {
        //Inicia conexão nula, ainda não estabelecida
        Connection c = null;
        //tenta estabelecer conexão
        try {
            c = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            //caso haja erro na conexão do banco
            System.out.println("Erro ao conectar banco!\n"
                    + e.getMessage());
        }
        return c;
    }
}
