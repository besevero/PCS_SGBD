/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author PPGI
 */
public class Venda {
    private double valorVenda;
    private String maisVendido;
    
    public Venda(){}
    public Venda(double valorVenda, String maisVendido) {
        this.valorVenda = valorVenda;
        this.maisVendido = maisVendido;
    }

    public String getMaisVendido() {
        return maisVendido;
    }

    public void setMaisVendido(String maisVendido) {
        this.maisVendido = maisVendido;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }
    
    
}
