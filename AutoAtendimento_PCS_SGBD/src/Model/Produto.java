/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author PPGI
 */
public class Produto implements Serializable{
    private String nome;
    private int preco;
    private int quantidade;
    String tipo;
    
    public Produto(){
        
    }
    
    public Produto(String nome, int valor, int quantidade, String tipo) {
        this.nome = nome;
        this.preco = valor;
        this.quantidade= quantidade;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPreco() {
        return preco;
    }
    public void setPreco(int valor) {
        this.preco = valor;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}