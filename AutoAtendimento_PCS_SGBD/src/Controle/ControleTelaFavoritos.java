/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import Model.Prato_Favorito;
import Model.Produto;
import View.TelaAtendente;
import java.util.ArrayList;
import View.TelaBebidas;
import View.TelaInicial;
import View.TelaFavorito;


public class ControleTelaFavoritos{
     private Pedido pedido;
     private TelaFavorito favor;
     private ArrayList<Produto> produtos = new ArrayList();
     private Prato_Favorito pratos = new Prato_Favorito();
     private TelaAtendente atendente;
     
     public ControleTelaFavoritos(TelaFavorito favor, TelaAtendente atendente){
         this.pedido = new Pedido();
         this.atendente = atendente;
         this.favor = favor;
     }
      public void iniciaBebida(){
        
        TelaBebidas bebidas = new TelaBebidas(pedido, atendente);
        favor.setVisible(false);
        bebidas.setVisible(true);
        
    }
     public void inicial(){
        TelaInicial TelaInicial = new TelaInicial(pedido, atendente);
        favor.setVisible(false);
        TelaInicial.setVisible(true);
     }
     public void proximo(String escolha){
         for(int i=0; i<pratos.getFavorito().size() ; i++)
            if(pratos.getFavorito().get(i).getNome().equals(escolha)){
                pedido.getPratos().add(pratos.getFavorito().get(i));
            }
         pedido.setCodigo(1);
         this.iniciaBebida();
     }
     public void voltarFavorito(){
         if((pedido.getPratos().size())%2 != 0){
           pedido.getPratos().remove((pedido.getPratos().size()-1));
       }
         
         this.inicial();
     }
      public String selecao(int i){
         return pratos.getFavorito().get(i).getNome();
     }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public TelaFavorito getFavor() {
        return favor;
    }

    public void setfavorito(TelaFavorito favor) {
        this.favor = favor;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public Prato_Favorito getPratos() {
        return pratos;
    }
    public void setPratos(Prato_Favorito pratos) {
        this.pratos = pratos;
    }
}
