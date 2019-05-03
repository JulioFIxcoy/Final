/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.lang.reflect.Array;
import java.util.Scanner;


/**
 *Clase generica que sirve para revisar si el arreglo esta lleno
 *esta clase evitara crear un arreglo temporal  en la clase que lo implemeta 
 * 
 * @author julio
 */
public class Manejador <T>{
    /**
     * copiar al vector temporal
     * igualar a null el vector principall, aumentarlo y regresar sus elementos
     * escenarioTemporal = new Escenario[escenarioPrincipal.length];
     * @param textMarco texto que se encerrara en un marco
     * @param contador es la cantidad de objetos en el vector
     * @param principal es el vector en cuestion
     * @param t es la clase del vector a crear
     * @return el vector principal
     */
    public T[] createObject(String textMarco, int contador, T[] principal, Class<T> t){
        

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
       
        if (contador  == principal.length) {
            //copiar al vector temporal
            //igualar a null el vector principall, aumentarlo y regresar sus elementos
            //escenarioTemporal = new Escenario[escenarioPrincipal.length];
        
            T[] temporal = (T[]) Array.newInstance(t, (contador+1));
            for (int i = 0; i < principal.length; i++) {
                temporal[i] = principal[i];
            }
          //  Object[] o = new Object[(genericArray.length)+3];
            principal = null;
            principal = (T[]) Array.newInstance(t, (contador+1)); //new Escenario[(escenarioTemporal.length)+3];
            
            for (int i = 0; i < temporal.length; i++) {
            
                principal[i] = temporal[i];    
                
            }
        
        } 
        
        return principal;
    }
}
