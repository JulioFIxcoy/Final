/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author julio
 */
public class Tanque extends Vehiculo{
/**
 * 
 * @param nombre hace referencia al constructor padre
 */    
    public Tanque(String nombre) {
        
        super(nombre);
        
        super.setAtaque(10);
        super.setDefensa(6);
        super.setPunteria(60);
    }
   
    
}
