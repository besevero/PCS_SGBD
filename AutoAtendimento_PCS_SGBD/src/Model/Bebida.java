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
public class Bebida extends Produto{
    
    private ArrayList<Produto> idBebida = new ArrayList();
    private ProdutoDAO persistencia = new ProdutoDAO();
    public Bebida(String nome, int valor,int quantidade, String tipo) {
        super(nome, valor, quantidade, tipo);
        this.idBebida = idBebida;

        
    }
    public Bebida() {        
        try {
            /* idBebida.add(new Produto ("Mate", 4, 20));
            idBebida.add(new Produto ("Suco de uva", 5, 20));
            idBebida.add(new Produto ("Suco de laranja", 5, 20));
            idBebida.add(new Produto ("Coca-cola", 4, 20));
            idBebida.add(new Produto ("Ice tea", 4, 20));
            persistencia.imprimir();*/
            idBebida = persistencia.consultarProdutoTipo("bebida");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bebida.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Bebida.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Bebida.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Bebida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the idBebida
     */
    public ArrayList<Produto> getIdBebida() {
        return idBebida;
    }

    /**
     * @param idBebida the idBebida to set
     */
    public void setIdBebida(ArrayList<Produto> idBebida) {
        this.idBebida = idBebida;
    }
    
    
    
}
    

