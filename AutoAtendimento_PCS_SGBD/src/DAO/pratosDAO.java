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
    
    public void insert_prato(String nome, int codigo, int senha) throws SQLException{
        PreparedStatement stmt_componente = null;
        
        try{
                    
           String sql_componente = "INSERT INTO prato(codigo_prato, senha_pedido,nome) VALUES(?, ?, ?);";
            
            stmt_componente = infra.getConn().prepareStatement(sql_componente);
            stmt_componente.setInt(2,senha);
            stmt_componente.setInt(1,codigo);
            stmt_componente.setString(3,nome);
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
      public int getCodigo(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int codigo = 0;
        String sql = "SELECT * FROM prato ORDER BY codigo_prato DESC LIMIT 1;";
        try{
            infra.abrirConexao();
          
            stmt = infra.getConn().prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                codigo = rs.getInt("codigo_prato");    
            }
            
            rs.close();
            stmt.close();
            infra.fecharConexao();
            
        }catch(SQLException e){}
        
        return codigo+1;
    }
        public int retornaSenha(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int senha = 0;
        String sql = "SELECT * FROM pedido ORDER BY senha_pedido DESC LIMIT 1";
        try{
            infra.abrirConexao();
          
            stmt = infra.getConn().prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                senha = rs.getInt("senha_pedido");    
            }
            
            rs.close();
            stmt.close();
            infra.fecharConexao();
            
        }catch(SQLException e){}
        
        return senha+1;
    }
}
