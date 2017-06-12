/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import View.TelaAtendente;
import View.TelaFavorito;
import View.TelaInicial;
import View.TelaMassas;
import View.TelaPromo;

/**
 *
 * @author Bernardo
 */
public class ControleInicial{
    
    private Pedido pedido;
    private TelaInicial inicial;
    private TelaAtendente atendente;

    public ControleInicial(TelaInicial inicial, TelaAtendente atendente){
        this.pedido = new Pedido();
        this.inicial = inicial;
        this.atendente = atendente;
    }
    public void iniciaPromo(){
        TelaPromo promo = new TelaPromo(pedido, atendente);
        inicial.setVisible(false);
        promo.setVisible(true);
    }
    public void telaMassa(){
        TelaMassas TelaMassa = new TelaMassas(pedido, atendente);
        inicial.setVisible(false);
        TelaMassa.setVisible(true);
    }
     public void telaFavorito(){
        TelaFavorito TelaFavorito = new TelaFavorito(pedido, atendente);
        inicial.setVisible(false);
        TelaFavorito.setVisible(true);
    }
  
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public TelaInicial getInicial() {
        return inicial;
    }
    public void setInicial(TelaInicial inicial) {
        this.inicial = inicial;
    }
}
