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
public class Molho extends Produto{
    
     private ArrayList<Produto> molho = new ArrayList();
    private Arquivos persistencia = new Arquivos("Molho.xml", molho);
     public Molho(){        
       /* molho.add(new Produto ("bolonhesa", 0, 30));
        molho.add(new Produto ("4 queijos", 0, 30));
        molho.add(new Produto ("sugo", 0, 30));
        molho.add(new Produto ("funghi", 0,30));
        molho.add(new Produto ("branco", 0, 30));
        persistencia.imprimir();*/
        molho=persistencia.lerXML();
     }
    public Molho(String nome, int valor, int quantidade) {
        super(nome, valor, quantidade);
    }
    public ArrayList<Produto> getMolho() {
        return molho;
    }
    public void setMolho(ArrayList<Produto> molho) {
        this.molho = molho;
    }
    
}
