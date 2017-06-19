/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import View.TelaAtendente;
import View.TelaInicial;
import View.TelaNotaFiscal;

/**
 *
 * @author Bernardo
 */
public class ControleTelaNotaFiscal {
    private Pedido pedido;
    private TelaNotaFiscal TelaNotaFiscal;
    private TelaAtendente atendente;
    
    public ControleTelaNotaFiscal(TelaNotaFiscal TelaNotaFiscal, TelaAtendente atendente){
        this.pedido = new Pedido();
        this.atendente = atendente;
        this.TelaNotaFiscal = TelaNotaFiscal;
    }
    public void finalizar(){
        TelaInicial TelaInicial = new TelaInicial(pedido, atendente);
        TelaNotaFiscal.setVisible(false);
        TelaInicial.setVisible(true);        
        atendente.getControleAtendente().MostrarPedido(pedido);
        pedido.incrementaSenha();
        pedido.getPratos().clear();
        
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public TelaNotaFiscal getTelaNotaFiscal() {
        return TelaNotaFiscal;
    }
    public void setTelaNotaFiscal(TelaNotaFiscal TelaNotaFiscal) {
        this.TelaNotaFiscal = TelaNotaFiscal;
    }
}