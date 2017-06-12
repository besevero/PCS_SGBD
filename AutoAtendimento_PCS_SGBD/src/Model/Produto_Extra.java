/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controle.Arquivos;
import java.util.ArrayList;

/**
 *
 * @author PPGI
 */
public class Produto_Extra extends Produto{
    
    
    private ArrayList<Produto> prodExtra = new ArrayList();
    private Arquivos persistencia = new Arquivos("Extra.xml", prodExtra);
    public Produto_Extra(){       
       /* prodExtra.add(new Produto ("Almôndega", 6, 35));
        prodExtra.add(new Produto ("Frango à Parmegiana", 7, 35));
        prodExtra.add(new Produto ("Frango Dourado", 5, 35));
        prodExtra.add(new Produto ("Peito de Peru", 4, 35));
        prodExtra.add(new Produto ("Polpetone", 8, 35));
        persistencia.imprimir();*/
        prodExtra=persistencia.lerXML();
    }
    public Produto_Extra(String nome, int valor, int quantidade) {
        super(nome, valor, quantidade);
        

    }

    /**
     * @return the prodExtra
     */
    public ArrayList<Produto> getProdExtra() {
        return prodExtra;
    }

    /**
     * @param prodExtra the prodExtra to set
     */
    public void setProdExtra(ArrayList<Produto> prodExtra) {
        this.prodExtra = prodExtra;
    }
    
}
