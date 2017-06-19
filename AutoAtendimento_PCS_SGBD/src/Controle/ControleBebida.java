/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Bebida;
import Model.Pedido;
import Model.Produto;
import View.TelaAtendente;
import View.TelaBebidas;
import View.TelaFavorito;
import View.TelaInicial;
import View.TelaMolhos;
import View.TelaPedido;
import View.TelaPromo;
import java.util.ArrayList;

/**
 *
 * @author Bernardo
 */
public class ControleBebida {
    
    private Pedido pedido;
     private TelaBebidas TelaBebidas;
     private ArrayList<Produto> produtos = new ArrayList();
     private Bebida bebida = new Bebida();
     private TelaAtendente atendente;
   
     
     public ControleBebida(TelaBebidas TelaBebidas, TelaAtendente atendente){
         this.pedido = new Pedido();
         this.atendente = atendente;
         this.TelaBebidas = TelaBebidas;
     }
     
     public void iniciaPedido(){
        TelaPedido TelaPedido = new TelaPedido(getPedido(), atendente);
        getTelaBebidas().setVisible(false);
        TelaPedido.setVisible(true);
     }
     public void iniciaPromocao(){
        TelaPromo TelaPromo = new TelaPromo(getPedido(), atendente);
        getTelaBebidas().setVisible(false);
        TelaPromo.setVisible(true);
     }
     public void Anterior(){
         if(pedido.getCodigo() == 0){
            TelaPromo TelaPromo = new TelaPromo(getPedido(), atendente);
            getTelaBebidas().setVisible(false);
            TelaPromo.setVisible(true);
         }
         if(pedido.getCodigo() == 1){
            TelaFavorito TelaFavorito = new TelaFavorito(getPedido(), atendente);
            getTelaBebidas().setVisible(false);
            TelaFavorito.setVisible(true);
         }
         if(pedido.getCodigo() == 2){
            TelaMolhos TelaMolhos = new TelaMolhos(getPedido(), atendente);
            getTelaBebidas().setVisible(false);
            TelaMolhos.setVisible(true);
         }
     }
     public void proximoBebida(String escolha){
            for(int i=0; i<getBebida().getIdBebida().size(); i++){
                if(getBebida().getIdBebida().get(i).getNome().equals(escolha)){
                    getPedido().getPratos().add(getBebida().getIdBebida().get(i));
                    
                }
                
            }
            this.iniciaPedido();
     }
     public void voltaBebida(){
         getPedido().getPratos().remove((getPedido().getPratos().size()-1));
        
         this.Anterior();
     }
     public String selecao(int i){
         return getBebida().getIdBebida().get(i).getNome();
     }
    public void apagaPedido(){
            pedido.getPratos().clear();
    }
     public void cancelar(){
      apagaPedido();
      TelaInicial TelaInicial = new TelaInicial(pedido, atendente);
      TelaInicial.setVisible(true);
      TelaBebidas.setVisible(false);
      
     }
     public void pular(){
          this.iniciaPedido();
     }
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public TelaBebidas getTelaBebidas() {
        return TelaBebidas;
    }

    public void setTelaBebidas(TelaBebidas TelaBebidas) {
        this.TelaBebidas = TelaBebidas;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public Bebida getBebida() {
        return bebida;
    }
    
    ArrayList<Produto> getqtdeBebida(){
        return getBebida().getIdBebida();        
    }
    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }
}