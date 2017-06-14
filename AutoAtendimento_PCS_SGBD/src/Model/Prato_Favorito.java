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


public class Prato_Favorito extends Produto{
    
     private ArrayList<Produto> favorito = new ArrayList();
     private ProdutoDAO persistencia = ProdutoDAO();
    public Prato_Favorito(String nome, int valor, int quantidade, ArrayList<Produto> promoc,
            String tipo) {
        super(nome, valor, quantidade, tipo);
        this.favorito = favorito;
    
    }
    public Prato_Favorito(){    
         try {
             favorito = persistencia.consultarProdutoTipo("favorito");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Prato_Favorito.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(Prato_Favorito.class.getName()).log(Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             Logger.getLogger(Prato_Favorito.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             Logger.getLogger(Prato_Favorito.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    /**
     * @return the favorito
     */
    public ArrayList<Produto> getFavorito() {
        return favorito;
    }

   
    public void setfavorito(ArrayList<Produto> favorito) {
        this.favorito = favorito;
    }

    private ProdutoDAO ProdutoDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     
}
