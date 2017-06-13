package DAO;

import Model.Produto;
import Infra;
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
    
    Infra con = new Infra();
    
    public List consultarAutor(String nome) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List listaProduto = new ArrayList<>();
        Produto produto = null;
        
        try{
            con.abrirConexao();
  
            String sql = "SELECT * FROM autores WHERE nome = ?;";
            stmt = con.prepareStatement(sql);
            stmt.setString(1,nome);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                autor = new Autor();
                autor.setId(rs.getInt("id"));
                autor.setNome(rs.getString("nome"));
                autor.setNome_de_citacao(rs.getString("nome_de_citacao"));
                autor.setCpf(rs.getInt("cpf"));
                listaAutor.add(autor);
            }
            rs.close();
            stmt.close();
            conn.fecharConexao();
        }catch(SQLException e){}
        return listaAutor;
    }
    public void inserirAutor(Autor autor){
        PreparedStatement stmt = null;
        ResultSet rs = null;
                
        try{
            abrirConexao();
  
            String sql = "INSERT INTO autores(nome, nome_de_citacao, cpf)VALUES(?,?,?);";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,autor.getNome());
            stmt.setString(2,autor.getNome_de_citacao());
            stmt.setInt(3,autor.getCpf());
            rs = stmt.executeQuery();
            
            rs.close();
            stmt.close();
            
            fecharConexao();
            
        }catch(SQLException e){}
    }
    public void atualizarAutor(Autor autor, String nomeAlterar){
        PreparedStatement stmt = null;
        ResultSet rs = null;
                
        try{
            abrirConexao();
            String sql = "UPDATE autores SET nome = ?, nome_de_citacao = ?, cpf = ? WHERE nome = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,autor.getNome());
            stmt.setString(2,autor.getNome_de_citacao());
            stmt.setInt(3,autor.getCpf());
            stmt.setString(4,nomeAlterar);
            rs = stmt.executeQuery();
            rs.close();
            stmt.close();
            fecharConexao();
        }catch(SQLException e){}
    }
    public void excluirAutor(String nome){
        PreparedStatement stmt = null;
        ResultSet rs = null;
                
        try{
            abrirConexao();
            String sql = "DELETE FROM autores WHERE nome = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,nome);
            rs = stmt.executeQuery();
            rs.close();
            stmt.close();
            fecharConexao();
        }catch(SQLException e){}
    }

}
