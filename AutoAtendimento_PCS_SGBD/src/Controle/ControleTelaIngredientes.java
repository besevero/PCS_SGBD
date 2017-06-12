/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import Model.Produto_Ingrediente;
import View.TelaAtendente;
import View.TelaExtras;
import View.TelaIngredientes;
import View.TelaInicial;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author Bernardo
 */
public class ControleTelaIngredientes {
    private Pedido pedido;
    private TelaIngredientes TelaIngredientes;
    private Produto_Ingrediente ingredientes = new Produto_Ingrediente();
    private TelaAtendente atendente;
    
    public ControleTelaIngredientes(TelaIngredientes TelaIngredientes, TelaAtendente atendente){
        this.pedido = new Pedido();
        this.atendente = atendente;
        this.TelaIngredientes = TelaIngredientes;
    }
    public void apagaPedido(){
            getPedido().getPratos().clear();
    }
    public void cancelar(){
      apagaPedido();
      TelaInicial TelaInicial = new TelaInicial(getPedido(), atendente);
      TelaInicial.setVisible(true);
        getTelaIngredientes().setVisible(false);
      
     }
    public void proximo(ArrayList<JButton> escolhasIngredientes, ArrayList<JButton> escolhasExtras){
        
        
        for(int i = 0; i<ingredientes.getIdIngrediente().size();i++){
            for(int j = 0; j<escolhasIngredientes.size();j++){
                if(ingredientes.getIdIngrediente().get(i).getNome().equals(escolhasIngredientes.get(j).getText())){
                    pedido.getPratos().add(ingredientes.getIdIngrediente().get(i));
                }
                
            }
        }
        int cont = 0;
        for(int g = 0 ; g < escolhasExtras.size(); g++){
           if(!escolhasExtras.get(g).getText().equals(""))
               cont++;
        }
        if(cont == escolhasExtras.size()){
            
        for(int i = 0; i<ingredientes.getIdIngrediente().size();i++){
            for(int j = 0; j<escolhasExtras.size();j++){
                if(ingredientes.getIdIngrediente().get(i).getNome().equals(escolhasExtras.get(j).getText())){
                    pedido.getPratos().add(ingredientes.getIdIngrediente().get(i));
                }
               
            }
                 }
        }
            /*for(int g = 0; g<pedido.getPratos().size();g++){
                System.out.println(pedido.getPratos().get(g).getNome());
            }*/
     TelaExtras TelaExtras = new TelaExtras(pedido, atendente);
     TelaExtras.setVisible(true);
     getTelaIngredientes().setVisible(false);
    }
    public void voltar(){
        TelaInicial TelaInicial = new TelaInicial(getPedido(), atendente);
        TelaInicial.setVisible(true);
        getTelaIngredientes().setVisible(false);
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
     * @return the TelaIngredientes
     */
    public TelaIngredientes getTelaIngredientes() {
        return TelaIngredientes;
    }

    /**
     * @param TelaIngredientes the TelaIngredientes to set
     */
    public void setTelaIngredientes(TelaIngredientes TelaIngredientes) {
        this.TelaIngredientes = TelaIngredientes;
    }

    /**
     * @return the ingredientes
     */
    public Produto_Ingrediente getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngredientes(Produto_Ingrediente ingredientes) {
        this.ingredientes = ingredientes;
    }
}

