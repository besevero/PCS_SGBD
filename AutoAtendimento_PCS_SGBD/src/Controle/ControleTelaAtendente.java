/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import View.TelaAtendente;

/**
 *
 * @author labccet
 */
public class ControleTelaAtendente {
    
    private TelaAtendente TelaAtendente;
    private Arquivos arquivo = new Arquivos("relatorio.xml");
    
    public ControleTelaAtendente(TelaAtendente TelaAtendente){
        this.TelaAtendente = TelaAtendente;
    }
    
    public void MostrarPedido(Pedido pedido){
        TelaAtendente.AdicionarPedidos(pedido);
    }
    public Arquivos getArquivo(){
        return arquivo;
    }
}
