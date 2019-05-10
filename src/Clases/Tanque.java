/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Archivos.BinariosPlantilla;
import Vistas.Principal;
import java.io.Serializable;

/**
 *
 * @author julio
 */
public class Tanque extends Vehiculo implements Serializable{
/**
 * 
 * @param nombre hace referencia al constructor padre
 */    
    public Tanque(String nombre) {
        
        super(nombre);
        
        super.setAtaque(10);
        super.setDefensa(6);
        super.setPunteria(60);
        myId = id;
        super.setMyId(myId);
        id++;
        
    }

    public int getMyId() {
        return myId;
    }

    public void setMyId(int myId) {
        this.myId = myId;
    }

    @Override
    public  int getId() {
        return id;
    }
    public void writeTanke(){
        BinariosPlantilla<Vehiculo> write = new BinariosPlantilla<>();
       //Tanque tanque=(Tanque)nuevo;
        write.writeObjectBin(Tanque.this, Principal.mkdirTienda, String.valueOf(getMyId()), ".tank");
    }
    
   private static int id=0;
   private int myId ;
}
