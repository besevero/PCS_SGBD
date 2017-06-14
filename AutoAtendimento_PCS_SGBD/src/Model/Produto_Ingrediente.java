/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.ProdutoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PPGI
 */
public class Produto_Ingrediente extends Produto{
  
     private ArrayList<Produto> idIngrediente = new ArrayList();
     private ProdutoDAO persistencia = new ProdutoDAO();
    
     public Produto_Ingrediente(){
         try {
             idIngrediente = persistencia.consultarProdutoTipo("ingrediente");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Produto_Ingrediente.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(Produto_Ingrediente.class.getName()).log(Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             Logger.getLogger(Produto_Ingrediente.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             Logger.getLogger(Produto_Ingrediente.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
     
    public Produto_Ingrediente(String nome, int valor,
                               String Tipo_Ingrediente,int quantidade, String tipo) {
        super(nome, valor, quantidade, tipo);
    }

    /**
     * @return the idIngrediente
     */
    public ArrayList<Produto> getIdIngrediente() {
        return idIngrediente;
    }

    /**
     * @param idIngrediente the idIngrediente to set
     */
    public void setIdIngrediente(ArrayList<Produto> idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    
    }
    
