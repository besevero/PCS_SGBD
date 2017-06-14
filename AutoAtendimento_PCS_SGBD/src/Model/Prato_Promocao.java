package Model;

import DAO.ProdutoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Prato_Promocao extends Produto{
    
     private ArrayList<Produto> promoc = new ArrayList();
     private ProdutoDAO persistencia = new ProdutoDAO();
    
    public Prato_Promocao(){
         try {
             promoc=persistencia.consultarProdutoTipo("favorito");
                     
                     } catch (ClassNotFoundException ex) {
             Logger.getLogger(Prato_Promocao.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(Prato_Promocao.class.getName()).log(Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             Logger.getLogger(Prato_Promocao.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             Logger.getLogger(Prato_Promocao.class.getName()).log(Level.SEVERE, null, ex);
         }

    }
    
    public Prato_Promocao(String nome, int valor, int quantidade, String tipo) {
        super(nome, valor, quantidade, tipo);
    }
    
    
    /**
     * @return the promoc
     */
    public ArrayList<Produto> getPromoc() {
        return promoc;
    }

    /**
     * @param promoc the promoc to set
     */
    public void setPromoc(ArrayList<Produto> promoc) {
        this.promoc = promoc;
    }
    
     
}
