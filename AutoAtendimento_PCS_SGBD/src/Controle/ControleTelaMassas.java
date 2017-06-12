/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import Model.Produto;
import Model.Produto_Massa;
import View.TelaAtendente;
import View.TelaIngredientes;
import View.TelaInicial;
import View.TelaMassas;
import java.util.ArrayList;

/**
 *
 * @author Bernardo
 */
public class ControleTelaMassas {
    
    private Pedido pedido;
    private TelaMassas TelaMassas;
    private ArrayList<Produto> produtos = new ArrayList();
    private Produto_Massa massa = new Produto_Massa();
    private TelaAtendente atendente;
     
    
    public ControleTelaMassas(TelaMassas TelaMassas, TelaAtendente atendente) {
        this.pedido = new Pedido();
        this.atendente = atendente;
        this.TelaMassas = TelaMassas;
    }
    public void proximo(){
        TelaIngredientes TelaIngredientes = new TelaIngredientes(pedido, atendente);
        TelaIngredientes.setVisible(true);
        TelaMassas.setVisible(false);
    }
    public void anterior(){
        TelaInicial TelaInicial = new TelaInicial(pedido, atendente);
        TelaInicial.setVisible(true);
        TelaMassas.setVisible(false);
    }
    
    public void proximoMassa(String escolha){
        for(int i=0; i<massa.getIdMassa().size(); i++){
            if(massa.getIdMassa().get(i).getNome().equals(escolha)){
                    pedido.getPratos().add(massa.getIdMassa().get(i));
            }
     
     }
               this.proximo();
    }
    public void voltaMassa(){
        if((pedido.getPratos().size())%2 != 0){
           pedido.getPratos().remove((pedido.getPratos().size()-1));
       }
            this.anterior();
    }
    public void apagaPedido(){
            pedido.getPratos().clear();
    }
    public void cancelar(){
      apagaPedido();
      anterior();  
    }
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public TelaMassas getTelaMassas() {
        return TelaMassas;
    }

    public void setTelaMassas(TelaMassas TelaMassas) {
        this.TelaMassas = TelaMassas;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public Produto_Massa getMassa() {
        return massa;
    }

    public void setMassa(Produto_Massa massa) {
        this.massa = massa;
    }
    
}
