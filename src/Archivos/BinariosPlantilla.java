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
        ObjectOutputStream escribirObjeto = null;
        try {

             escribirObjeto = new ObjectOutputStream(new 
            FileOutputStream(path+nombre+extension));
             System.out.println("file"+path+nombre+extension);
            escribirObjeto.writeObject(t);
            escribirObjeto.close();
           
           
       } catch (IOException ioe) {
            System.out.println("Binarios Plantilla"+path);
           ioe.printStackTrace();
       }finally{
            try {
                escribirObjeto.close();
            } catch (IOException ex) {
                Logger.getLogger(BinariosPlantilla.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}