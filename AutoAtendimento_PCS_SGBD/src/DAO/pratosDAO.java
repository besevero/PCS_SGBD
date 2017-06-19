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
        PreparedStatement stmt_pedido = null;
        
        ResultSet rs = null;
        
        try{
          infra.abrirConexao();
          
            String sql_componente = "INSERT INTO componentes(senha_pedido, nome_componente) VALUES(?, ?);";
                        
            for(int i = 0; i<=p.getPratos().size();i++){
                for(int j = 0; i<=p.getPratos().size();j++){
                    stmt_componente = infra.getConn().prepareStatement(sql_componente);
                    stmt_componente.setString(1,p.getPratos().get(j).getNome());
                    stmt_componente.setInt(2,p.getSenha());
                    rs = stmt_componente.executeQuery();
                }
            }
            
            String sql_pedido = "INSERT INTO pedido(senha_pedido, preco) VALUES(?, ?);";
            stmt_pedido = infra.getConn().prepareStatement(sql_pedido);
            stmt_pedido.setInt(1,p.getSenha());
            stmt_pedido.setFloat(1, (float)p.getPreco());
            rs = stmt_pedido.executeQuery();
                
            rs.close();
            stmt_componente.close();
            stmt_pedido.close();
            infra.fecharConexao();
            
        }catch(SQLException e){}
               
    }
}
