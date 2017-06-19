package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author PPGI
 */
public class Pedido implements Serializable{

 
      private ArrayList<Produto> pratos = new ArrayList();
      private int senha;
      private int codigo = 0;
      private double preco = 0.0;
      
    public Pedido() {
        this.senha = 1;
        
    }
    public int incrementaSenha(){
        return senha++;
    }
    public String converteSenha(){
        return Integer.toString(senha);
    }

    void incluirProdPed(Produto p){
            getPratos().add(p);
    }
        
    ArrayList<Produto> mostrarPedido(){
        return getPratos();
    }

    public ArrayList<Produto> getPratos() {
        return pratos;
    }

    public void setPratos(ArrayList<Produto> pratos) {
        this.pratos = pratos;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }          

    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
       /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
}