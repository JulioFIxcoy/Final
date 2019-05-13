/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julio
 */
public class BinariosPlantilla <T>{

    public BinariosPlantilla() {
     
    }
    
    /**
     * 
     * @param t
     * @param path ruta donde se aloja el archivo
     * @param nombre nombre del archivo
     * @param extension ...
     */
    public void writeObjectBin(T t, String path,String nombre,String extension){
        ObjectOutputStream writeObject = null;
        try {

             writeObject = new ObjectOutputStream(new 
            FileOutputStream(path+nombre+extension));
             
            writeObject.writeObject(t);
           
            writeObject.close();
           
           
       } catch (IOException ioe) {
            System.out.println("Binarios Plantilla"+path);
            ioe.getLocalizedMessage();
                    System.out.println("ioe.getLocalizedMessage() = " + ioe.getLocalizedMessage());
           ioe.printStackTrace();
       }finally{
            try {
                writeObject.close();
            } catch (IOException ex) {
                Logger.getLogger(BinariosPlantilla.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
