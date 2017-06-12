/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import Model.Produto;
import View.TelaBebidas;
import View.TelaEstoque;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Ricardo
 */
public class ControleEstoque {
    private Pedido pedido; 
    private TelaEstoque TelaEstoque;
    private ArrayList<Produto> produtos = new ArrayList();
    private ControleTelaMassas ControleTelaMassas;
    private ControleBebida ControleBebida;
    public ControleEstoque(TelaEstoque TelaEstoque) {
        this.pedido = new Pedido();
        this.TelaEstoque = TelaEstoque;
    }     
  
    public int visualizarEstoqueProduto(Produto p){
     
     return p.getQuantidade();
 }
 
    
    public int acrescentarQtdeProduto (Produto p, int quantidade){
        int novaQuantidade=0;
        novaQuantidade = p.getQuantidade() + quantidade;
        return novaQuantidade;
 
    }
    
    public int diminuirEstoque (Produto p, int qtde){
        int novaQuantidade=0;
        novaQuantidade = p.getQuantidade() - qtde;
        return novaQuantidade;
    }
   
   public ArrayList<Produto> visualizaEstoqueBebida(){
     ArrayList<Produto> bebidas = ControleBebida.getqtdeBebida();
     return bebidas; 
  }

    public void insereLista(DefaultListModel modeloEstoque) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   
}
