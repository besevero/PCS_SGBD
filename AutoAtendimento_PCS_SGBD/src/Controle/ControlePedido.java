/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import View.TelaAtendente;
import View.TelaInicial;
import View.TelaPagamento;
import View.TelaPedido;
import javax.swing.DefaultListModel;

/**
 *
 * @author Bernardo
 */
public class ControlePedido {
    
   private Pedido pedido;
    private TelaPedido TelaPedido;
   private TelaAtendente atendente;
    
    public ControlePedido(TelaPedido TelaPedido, TelaAtendente atendente){
        this.pedido = new Pedido();
        this.atendente = atendente;
        this.TelaPedido = TelaPedido;
    }
    
    public void insereLista(DefaultListModel modeloPedido){
        for(int i = 0; i<getPedido().getPratos().size();i++){
            modeloPedido.addElement((getPedido().getPratos().get(i).getNome() 
                    + " ------- " + (double)getPedido().getPratos().get(i).getPreco()));
        }
    }
    public void inicial(){
        TelaInicial TelaInicial = new TelaInicial(getPedido(), atendente);
        getTelaPedido().setVisible(false);
        TelaInicial.setVisible(true);
    }
    public void gerarPedido(){
        TelaPagamento TelaPagamento = new TelaPagamento(getPedido(), atendente);
        getTelaPedido().setVisible(false);
        TelaPagamento.setVisible(true);
    }

    /**
     * @return the pedido
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    /**
     * @return the TelaPedido
     */
    public TelaPedido getTelaPedido() {
        return TelaPedido;
    }

    /**
     * @param TelaPedido the TelaPedido to set
     */
    public void setTelaPedido(TelaPedido TelaPedido) {
        this.TelaPedido = TelaPedido;
    }
}
