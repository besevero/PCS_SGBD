/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Pedido;
import Model.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Bernardo
 */
public class pratosDAO {
    private Infra infra = new Infra();
    
    
    public pratosDAO(){};
    
    public void insert_prato(String nome, int senha) throws SQLException{
        PreparedStatement stmt_componente = null;
        
        try{
                    
           String sql_componente = "INSERT INTO componentes(senha_componente, nome_componente) VALUES(?, ?);";
            
            stmt_componente = infra.getConn().prepareStatement(sql_componente);
            stmt_componente.setInt(1,senha);
            stmt_componente.setString(2,nome);
            stmt_componente.executeQuery();        
            
            
            stmt_componente.close();
                                   
        }catch(SQLException e){}
               
    }
     public void insert_pedido(double preco, int senha) throws SQLException{
            PreparedStatement stmt_pedido = null;
                  

          String sql_pedido = "INSERT INTO pedido(senha_pedido, preco) VALUES(?, ?);";
          try{
            
            stmt_pedido = infra.getConn().prepareStatement(sql_pedido);
            stmt_pedido.setInt(1, senha);
            stmt_pedido.setFloat(2, (float)preco);
            stmt_pedido.executeQuery();
          }

          catch(SQLException e){}
          
          stmt_pedido.close();
     }
      public int retornaSenha(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int senha = 1;
        try{
          infra.abrirConexao();
          
            String sql = "SELECT * FROM pedido ORDER BY senha_pedido DESC LIMIT 1";
            stmt = infra.getConn().prepareStatement(sql);
            rs = stmt.executeQuery();
            senha = rs.getInt("senha_pedido");    
            System.out.println(senha);
            rs.close();
            stmt.close();
            infra.fecharConexao();
            
        }catch(SQLException e){}
        
        return senha;
    }
}
