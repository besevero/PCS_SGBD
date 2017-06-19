/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Pedido;
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
    public void insert_prato(Pedido p){
        PreparedStatement stmt_componente = null;
            
        ResultSet rs = null;
        
        try{
          infra.abrirConexao();
          
            String sql_componente = "INSERT INTO componentes(senha_componente, nome_componente) VALUES(?, ?);";
            
                        
            for(int i = 0; i<=p.getPratos().size();i++){
                
                    stmt_componente = infra.getConn().prepareStatement(sql_componente);
                    stmt_componente.setInt(1,p.getSenha());
                    stmt_componente.setString(2,p.getPratos().get(i).getNome());
                    rs = stmt_componente.executeQuery();
            }
                        
            insert_pedido(p);
                
            rs.close();
            stmt_componente.close();
            
            infra.fecharConexao();
            
        }catch(SQLException e){}
               
    }
     public void insert_pedido(Pedido p) throws SQLException{
          PreparedStatement stmt_pedido = null;
          ResultSet rs = null;
          String sql_pedido = "INSERT INTO pedido(senha_pedido, preco) VALUES(?, ?);";
          try{
            stmt_pedido = infra.getConn().prepareStatement(sql_pedido);
            stmt_pedido.setInt(1, p.getSenha());
            stmt_pedido.setDouble(2, p.getPreco());
            rs = stmt_pedido.executeQuery();
          }
          catch(SQLException e){}
          rs.close();
          stmt_pedido.close();
     }
}
