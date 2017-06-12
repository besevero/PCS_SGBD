/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author PPGI
 */
public class Estoque {
    private ArrayList<Produto> prod;

    public Estoque(ArrayList<Produto> prod) {
        this.prod = prod;
    }
    public Estoque(){}
    int visualizarEstoqueProduto(Produto p){
     
     return p.getQuantidade();
 }
 
    
    int acrescentarQtdeProduto ( Produto p, int quantidade){
        int novaQuantidade=0;
        novaQuantidade = p.getQuantidade() + quantidade;
        return novaQuantidade;
 
    }
   
    void visualizarTodoEstoque(Produto[] p){
      for ( int i=0; i< p.length; i ++){
          System.out.println(p[i].getNome() + " " + p[i].getQuantidade());
      }
      
  }
    
}
