package DAO;

import Model.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bernardo
 */
public class ProdutoDAO {
    
    private Infra con = new Infra();
    
    /*
    * Pesquisa no banco de dados e retorna os itens com determinado nome
    */
    public List consultarProdutoNome(String nome) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List listaProduto = new ArrayList<>();
        Produto produto = null;
        
        try{
            con.abrirConexao();
  
            String sql = "SELECT * FROM produto WHERE nome = ?;";
            stmt = con.getConn().prepareStatement(sql);
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
            con.fecharConexao();
            
        }catch(SQLException e){}
        return listaProduto;
    }
    /*
    * Pesquisa no banco de dados e retorna os itens com determinado tipo
    */
      public List consultarProdutoTipo(String tipo) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List listaProduto = new ArrayList<>();
        Produto produto = null;
        
        try{
            con.abrirConexao();
  
            String sql = "SELECT * FROM produto WHERE tipo = ?;";
            stmt = con.getConn().prepareStatement(sql);
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
            con.fecharConexao();
            
        }catch(SQLException e){}
        return listaProduto;
    }
    /*
      *Atualiza a quantidade de itens disponível de determinado produto
      */
   public void atualizarQuantidadeProduto(String nomeAlterar){
        PreparedStatement stmt = null;
        ResultSet rs = null;
                
        try{
            con.abrirConexao();
            String sql = "UPDATE produto SET quantidade = 50 WHERE nome = ?";
            stmt = con.getConn().prepareStatement(sql);
            stmt.setString(1, nomeAlterar);
            rs = stmt.executeQuery();
            rs.close();
            stmt.close();
            con.fecharConexao();
        }catch(SQLException e){}
    }

}
