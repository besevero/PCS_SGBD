/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import View.TelaAtendente;
import View.TelaCartao;
import View.TelaNotaFiscal;
import View.TelaPagamento;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bernardo
 */
public class ControleTelaCartao {
    private Pedido pedido;
    private ArrayList<Pedido> pedidos = new ArrayList();
    private TelaCartao TelaCartao;
    private ArrayList<Pedido> pedidoLido;
    private TelaAtendente atendente;
    
    
    public ControleTelaCartao(TelaCartao TelaCartao, TelaAtendente atendente, Pedido pedido){
        this.pedido = pedido;
        this.atendente = atendente;
        this.TelaCartao = TelaCartao;
    }
    public void cancelar(){
        TelaPagamento pagamento = new TelaPagamento(pedido, atendente);
        pagamento.setVisible(true);
        TelaCartao.setVisible(false);
    }
    
    public boolean imprimir(String senha) throws SQLException{
        pedidos.add(pedido);
        if(senha.equals("123")){
            TelaNotaFiscal TelaNotaFiscal = new TelaNotaFiscal(pedido, atendente);
            TelaNotaFiscal.setVisible(true);
            TelaCartao.setVisible(false);    
        
            return true;
        }
        else 
            return false;
        
    }
  
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public TelaCartao getTelaCartao() {
        return TelaCartao;
    }

    public void setTelaCartao(TelaCartao TelaCartao) {
        this.TelaCartao = TelaCartao;
    }
}
