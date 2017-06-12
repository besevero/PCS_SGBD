/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Bernardo
 */
public class Arquivos {
    private ArrayList escrever;
    private String file;
    public Arquivos(){}
    
    public Arquivos(String file, ArrayList escrever){
        this.file = file;
        this.escrever = escrever;
    }
    public Arquivos(String file){
        this.file = file;
    }
    
    public void imprimir(){        
        
        try{ 
                 XMLEncoder xmlEncoder= null;
        try{ 
            
            xmlEncoder = new XMLEncoder ( new FileOutputStream (getFile()));           
            
            xmlEncoder.writeObject(getEscrever());
        
        }
        finally{
            if(xmlEncoder != null)
                xmlEncoder.close();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
            
        }
    }
    public ArrayList lerXML(){
        ArrayList lido = new ArrayList();
      try{
          XMLDecoder xmlDecoder = null;
          try{
            xmlDecoder = new XMLDecoder(
                    new FileInputStream(getFile()));
            lido = (ArrayList) xmlDecoder.readObject();
            
          }finally{
                    if(xmlDecoder != null)
                        xmlDecoder.close();
                    }
          }catch(IOException e){
              System.out.println(e.getMessage());
          }
      return lido;
      }

    /**
     * @return the escrever
     */
    public ArrayList getEscrever() {
        return escrever;
    }

    /**
     * @param escrever the escrever to set
     */
    public void setEscrever(ArrayList escrever) {
        this.escrever = escrever;
    }

    /**
     * @return the file
     */
    public String getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(String file) {
        this.file = file;
    }
    
}
