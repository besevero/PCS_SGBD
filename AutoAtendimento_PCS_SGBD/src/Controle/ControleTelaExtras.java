/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import Model.Produto_Extra;
import View.TelaAtendente;
import View.TelaExtras;
import View.TelaIngredientes;
import View.TelaInicial;
import View.TelaMolhos;

/**
 *
 * @author Bernardo
 */
public class ControleTelaExtras {
    private Pedido pedido;
    private TelaExtras TelaExtras;
    private Produto_Extra extra = new Produto_Extra();
    private TelaAtendente atendente;
    
    public ControleTelaExtras(TelaExtras TelaExtras, TelaAtendente atendente){
        this.pedido = new Pedido();
        this.atendente = atendente;
        this.TelaExtras = TelaExtras;
    }
    public void proximo(String escolha){
        for(int i = 0; i < extra.getProdExtra().size() ; i++){
            if(getExtra().getProdExtra().get(i).getNome().equals(escolha)){
                    getPedido().getPratos().add(getExtra().getProdExtra().get(i));
            }
        }
        TelaMolhos TelaMolhos = new TelaMolhos(pedido, atendente);
        TelaMolhos.setVisible(true);
        TelaExtras.setVisible(false);
    }
    public void voltar(){
            getPedido().getPratos().remove((getPedido().getPratos().size()-1));
            TelaIngredientes TelaIngredientes = new TelaIngredientes(pedido, atendente);
            TelaIngredientes.setVisible(true);
            TelaExtras.setVisible(false);
    }
    public void apagaPedido(){
            pedido.getPratos().clear();
    }
     public void cancelar(){
      apagaPedido();
      TelaInicial TelaInicial = new TelaInicial(pedido, atendente);
      TelaInicial.setVisible(true);
      TelaExtras.setVisible(false);
      
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
     * @return the TelaExtras
     */
    public TelaExtras getTelaExtras() {
        return TelaExtras;
    }

    /**
     * @param TelaExtras the TelaExtras to set
     */
    public void setTelaExtras(TelaExtras TelaExtras) {
        this.TelaExtras = TelaExtras;
    }

    /**
     * @return the extra
     */
    public Produto_Extra getExtra() {
        return extra;
    }

    /**
     * @param extra the extra to set
     */
    public void setExtra(Produto_Extra extra) {
        this.extra = extra;
    }
    
    
}
