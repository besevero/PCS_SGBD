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
public class Produto_Massa extends Produto{

        private ArrayList<Produto> IdMassa = new ArrayList();
        private ProdutoDAO persistencia = new ProdutoDAO();
    public Produto_Massa(){
            try {
                IdMassa = persistencia.consultarProdutoTipo("massa");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Produto_Massa.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Produto_Massa.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(Produto_Massa.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Produto_Massa.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public Produto_Massa(String nome, int valor, int quantidade, String tipo) {
        super(nome, valor, quantidade, tipo);
    }
    
    /**
     * @return the IdMassa
     */
    public ArrayList<Produto> getIdMassa() {
        return IdMassa;
    }

    /**
     * @param IdMassa the IdMassa to set
     */
    public void setIdMassa(ArrayList<Produto> IdMassa) {
        this.IdMassa = IdMassa;
    }
    
}
