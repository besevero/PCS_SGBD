/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controle.Arquivos;
import java.util.ArrayList;


public class Prato_Promocao extends Produto{
    
     private ArrayList<Produto> promoc = new ArrayList();
     private Arquivos persistencia = new Arquivos("Promocao.xml", promoc);
    
    public Prato_Promocao(){
      /*promoc.add(new Produto ("Penne a Carbonara", 15, 30));
      promoc.add(new Produto ("Spaghetti alho e oleo", 15, 30));
      
      persistencia.imprimir();*/
      promoc=persistencia.lerXML();

    }
    
    public Prato_Promocao(String nome, int valor, int quantidade) {
        super(nome, valor, quantidade);
    }
    
    
    /**
     * @return the promoc
     */
    public ArrayList<Produto> getPromoc() {
        return promoc;
    }

    /**
     * @param promoc the promoc to set
     */
    public void setPromoc(ArrayList<Produto> promoc) {
        this.promoc = promoc;
    }
    
     
}
