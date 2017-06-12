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
public class Produto_Massa extends Produto{

        private ArrayList<Produto> IdMassa = new ArrayList();
        private Arquivos persistencia = new Arquivos("Massa.xml", IdMassa);
    public Produto_Massa(){
        /*IdMassa.add(new Produto ("Farfalle", 18, 100));
        IdMassa.add(new Produto ("Fettuccine", 18, 100));
        IdMassa.add(new Produto ("Spaghetti", 17, 100));
        IdMassa.add(new Produto ("Penne", 17, 100));
        IdMassa.add(new Produto ("Ravioli de Queijo com Presunto", 24, 100));
        IdMassa.add(new Produto ("Ravioli de Ricota", 22, 100));
        IdMassa.add(new Produto ("Ravioli de Tomate Seco", 24, 100));
        IdMassa.add(new Produto ("Ravioli de Gorgonzola", 25, 100));
        IdMassa.add(new Produto ("Gnocchi", 20, 100));
        IdMassa.add(new Produto ("Cappelletti de Carne", 20, 100));
        IdMassa.add(new Produto ("Cappelletti de Frango", 20, 100));
        persistencia.imprimir();*/
        IdMassa = persistencia.lerXML();
    }
    
    public Produto_Massa(String nome, int valor, int quantidade) {
        super(nome, valor, quantidade);
    }
    
    /**
     * @return the IdMassa
     */
    public ArrayList<Produto> getIdMassa() {
        return IdMassa;
    }

    /**
     * @param IdMassa the IdMassa to set
     */
    public void setIdMassa(ArrayList<Produto> IdMassa) {
        this.IdMassa = IdMassa;
    }
    
}
