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
public class Molho extends Produto{
    
     private ArrayList<Produto> molho = new ArrayList();
    private ProdutoDAO persistencia = new ProdutoDAO();
     public Molho(){        
         try {
            molho=persistencia.consultarProdutoTipo("molho");
         } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
             Logger.getLogger(Molho.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
    public Molho(String nome, int valor, int quantidade, String tipo) {
        super(nome, valor, quantidade, tipo);
    }
    public ArrayList<Produto> getMolho() {
        return molho;
    }
    public void setMolho(ArrayList<Produto> molho) {
        this.molho = molho;
    }
    
}
