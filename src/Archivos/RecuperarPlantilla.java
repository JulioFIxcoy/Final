/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author julio
 */
public class RecuperarPlantilla <T> {
    
    public T recuperar(String path,String nombre, String extension){
        
        try {
            ObjectInputStream recibirObjeto = new ObjectInputStream(new 
            FileInputStream(path+nombre+extension));
             T parametro = (T) recibirObjeto.readObject();
           
           recibirObjeto.close();
           return parametro;
        } catch (IOException e) {
            System.out.println(extension);
            e.printStackTrace();
        }catch(ClassNotFoundException cnfe){
            System.out.println(extension);
            cnfe.printStackTrace();
            
        }
        
        return null;
    }
   public T recuperar(String absolutePath){
        
        try {
            ObjectInputStream recibirObjeto = new ObjectInputStream(new 
            FileInputStream(absolutePath));
             T parametro = (T) recibirObjeto.readObject();
           
           recibirObjeto.close();
           return parametro;
        } catch (IOException e) {
            //System.out.println(extension);
            e.printStackTrace();
        }catch(ClassNotFoundException cnfe){
           // System.out.println(extension);
            cnfe.printStackTrace();
            
        }
        
        return null;
    }
}
