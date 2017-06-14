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
public class Produto_Ingrediente extends Produto{
  
     private ArrayList<Produto> idIngrediente = new ArrayList();
     private Arquivos persistencia = new Arquivos("Ingrediente.xml", idIngrediente);
    
     public Produto_Ingrediente(){
      /*  idIngrediente.add(new Produto ("Alcaparra", 0, 100));
        idIngrediente.add(new Produto ("Alho", 0, 100));
        idIngrediente.add(new Produto ("Alho Poró", 0, 100));
        idIngrediente.add(new Produto ("Azeitona Preta", 0, 100));
        idIngrediente.add(new Produto ("Bacon", 0, 100));
        idIngrediente.add(new Produto ("Brócolis", 0, 100));
        idIngrediente.add(new Produto ("Camarão", 0, 100));
        idIngrediente.add(new Produto ("Carne de Sol", 0, 100));
        idIngrediente.add(new Produto ("Cenoura", 0, 100));
        idIngrediente.add(new Produto ("Champignon", 0, 100));
        idIngrediente.add(new Produto ("Cebola", 0, 100));
        idIngrediente.add(new Produto ("Ervilha", 0, 100));
        idIngrediente.add(new Produto ("Frango", 0, 100));
        idIngrediente.add(new Produto ("Gorgonzola", 0, 100));
        idIngrediente.add(new Produto ("Linguiça Calabresa", 0, 100));
        idIngrediente.add(new Produto ("Milho", 0, 100));
        idIngrediente.add(new Produto ("Ovo de Codorna", 0, 100));
        idIngrediente.add(new Produto ("Palmito", 0, 100));
        idIngrediente.add(new Produto ("Passas", 0, 100));
        idIngrediente.add(new Produto ("Peito de Peru", 0, 100));
        idIngrediente.add(new Produto ("Queijo Coalho", 0, 100));
        idIngrediente.add(new Produto ("Queijo Minas", 0, 100));
        idIngrediente.add(new Produto ("Presunto", 0, 100));
        idIngrediente.add(new Produto ("Salmão", 0, 100));
        idIngrediente.add(new Produto ("Tomate", 0, 100));
        idIngrediente.add(new Produto ("Tomate Seco", 0, 100));
        idIngrediente.add(new Produto ("Mussarela", 0, 100));
        idIngrediente.add(new Produto ("Ervilha", 0, 100));
        persistencia.imprimir();*/
        idIngrediente = persistencia.lerXML();
    }
     
    public Produto_Ingrediente(String nome, int valor,
                               String Tipo_Ingrediente,int quantidade, String tipo) {
        super(nome, valor, quantidade, tipo);
    }

    /**
     * @return the idIngrediente
     */
    public ArrayList<Produto> getIdIngrediente() {
        return idIngrediente;
    }

    /**
     * @param idIngrediente the idIngrediente to set
     */
    public void setIdIngrediente(ArrayList<Produto> idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    
    }
    
