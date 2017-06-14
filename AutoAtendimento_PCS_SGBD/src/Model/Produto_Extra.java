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
public class Produto_Extra extends Produto{
    
    
    private ArrayList<Produto> prodExtra = new ArrayList();
    private ProdutoDAO persistencia = new ProdutoDAO();
    public Produto_Extra(){       
        try {
            prodExtra=persistencia.consultarProdutoTipo("extra");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Produto_Extra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Produto_Extra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Produto_Extra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Produto_Extra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Produto_Extra(String nome, int valor, int quantidade, String tipo) {
        super(nome, valor, quantidade, tipo);
        

    }

    /**
     * @return the prodExtra
     */
    public ArrayList<Produto> getProdExtra() {
        return prodExtra;
    }

    /**
     * @param prodExtra the prodExtra to set
     */
    public void setProdExtra(ArrayList<Produto> prodExtra) {
        this.prodExtra = prodExtra;
    }
    
}
