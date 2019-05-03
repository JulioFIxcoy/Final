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
public class Avion extends Vehiculo{
    private int velocidad;
    /**
     * Constructor que hace referencia al constructor padre
     * @param nombre 
     */
    public Avion(String nombre) {
        super(nombre);
        
        super.setAtaque(7);
        super.setDefensa(3);
        super.setPunteria(70);
        
        this.velocidad = 10;
    }

  

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad += velocidad;
    }

    @Override
    public String toString() {
        return "Avion" + super.toString()+"velocidad=" + velocidad ;
    }
   
    
    
}
