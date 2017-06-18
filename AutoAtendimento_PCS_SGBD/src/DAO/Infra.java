/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Bernardo
 * Classe para centralizar a conexão com o banco de dados
 */
public class Infra {
    private static String dbURL = "jdbc:postgresql://localhost:5432/AutoAtendimento";
    private static String usuario = "postgres";
    private static String senha = "admin";
    private static Connection conn = null;
    
    Infra(){}
    
    public static void abrirConexao(){
        try{
            Class.forName("org.postgresql.Driver").newInstance();
            conn = DriverManager.getConnection(dbURL, usuario, senha);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void fecharConexao(){
        try{
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
      /**
     * @return the conn
     */
    public static Connection getConn() {
        return conn;
    }

    /**
     * @param aConn the conn to set
     */
    public static void setConn(Connection aConn) {
        conn = aConn;
    }
}
