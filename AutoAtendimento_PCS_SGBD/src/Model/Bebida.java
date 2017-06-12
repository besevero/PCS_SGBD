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
public class Bebida extends Produto{
    
    private ArrayList<Produto> idBebida = new ArrayList();
    private Arquivos persistencia = new Arquivos("Bebida.xml", idBebida); 
    public Bebida(String nome, int valor,int quantidade) {
        super(nome, valor, quantidade);
        this.idBebida = idBebida;

        
    }
    public Bebida() {        
       /* idBebida.add(new Produto ("Mate", 4, 20));
        idBebida.add(new Produto ("Suco de uva", 5, 20));
        idBebida.add(new Produto ("Suco de laranja", 5, 20));
        idBebida.add(new Produto ("Coca-cola", 4, 20));
        idBebida.add(new Produto ("Ice tea", 4, 20));
        persistencia.imprimir();*/
        idBebida = persistencia.lerXML();
    }

    /**
     * @return the idBebida
     */
    public ArrayList<Produto> getIdBebida() {
        return idBebida;
    }

    /**
     * @param idBebida the idBebida to set
     */
    public void setIdBebida(ArrayList<Produto> idBebida) {
        this.idBebida = idBebida;
    }
    
    
    
}
    

