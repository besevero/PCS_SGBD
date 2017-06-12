/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controle.Arquivos;
import java.util.ArrayList;


public class Prato_Favorito extends Produto{
    
     private ArrayList<Produto> favorito = new ArrayList();
     private Arquivos persistencia = new Arquivos("Favorito.xml", favorito);
    public Prato_Favorito(String nome, int valor, int quantidade, ArrayList<Produto> promoc) {
        super(nome, valor, quantidade);
        this.favorito = favorito;
    
    }
    public Prato_Favorito(){    
        /*favorito.add(new Produto ("Lasanha", 25, 30));
        favorito.add(new Produto ("Penne a Matriciana", 25, 30));
        persistencia.imprimir();*/
        favorito = persistencia.lerXML();
    }
    /**
     * @return the favorito
     */
    public ArrayList<Produto> getFavorito() {
        return favorito;
    }

   
    public void setfavorito(ArrayList<Produto> favorito) {
        this.favorito = favorito;
    }
    
     
}
