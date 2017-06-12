/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
}