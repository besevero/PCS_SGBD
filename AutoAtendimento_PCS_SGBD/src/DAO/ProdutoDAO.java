package DAO;

import Model.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bernardo
 */
public class ProdutoDAO {
  
    private Infra infra = new Infra();
    public ProdutoDAO(){}    
    /*
    * Pesquisa no banco de dados e retorna os itens com determinado nome
    */
    public ArrayList consultarProdutoNome(String nome) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList listaProduto = new ArrayList<>();
        Produto produto = null;
        
        try{
          infra.abrirConexao();
          
            String sql = "SELECT * FROM produto WHERE nome = ?;";
            stmt = infra.getConn().prepareStatement(sql);
            stmt.setString(1,nome);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                produto = new Produto();
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getInt("preco"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setTipo(rs.getString("tipo"));
                listaProduto.add(produto);
            }
            rs.close();
            stmt.close();
            infra.fecharConexao();
            
        }catch(SQLException e){}
        return listaProduto;
    }
    
    
    /*
    * Pesquisa no banco de dados e retorna os itens com determinado tipo
    */
      public ArrayList consultarProdutoTipo(String tipo) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList listaProduto = new ArrayList<>();
        Produto produto = null;
                
        try{
       
            infra.abrirConexao();
         
            String sql = "SELECT * FROM produto WHERE tipo = ?;";
            stmt = infra.getConn().prepareStatement(sql);
            stmt.setString(1,tipo);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                produto = new Produto();
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getInt("preco"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setTipo(rs.getString("tipo"));
                listaProduto.add(produto);
            }
            rs.close();
            stmt.close();
            
            infra.fecharConexao();
            
        }catch(SQLException e){}
        return listaProduto;
    }
    /*
      *Atualiza a quantidade de itens disponível de determinado tipo de produto
      */
   public void atualizarQuantidadeProdutoNome(int quantidade, String nome) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        PreparedStatement stmt = null;
                      
        try{
             infra.abrirConexao();
           
            String sql = "UPDATE produto SET quantidade = ? WHERE nome = ?;";
            stmt = infra.getConn().prepareStatement(sql);
            stmt.setInt(1, quantidade);
            stmt.setString(2, nome);
            stmt.executeQuery();
           
            stmt.close();
            
          infra.fecharConexao();
          
        }catch(SQLException e){}
    }
   public void atualizarQuantidadeProdutoTipo(int quantidade, String tipo) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        PreparedStatement stmt = null;
                      
        try{
             infra.abrirConexao();
           
            String sql = "UPDATE produto SET quantidade = ? WHERE tipo = ?;";
            stmt = infra.getConn().prepareStatement(sql);
            stmt.setInt(1, quantidade);
            stmt.setString(2, tipo);
            stmt.executeQuery();
           
            stmt.close();
            
          infra.fecharConexao();
          
        }catch(SQLException e){}
    }
}
