/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import java.io.IOException;
import java.io.Serializable;
import java.util.Properties;
/**
 *
 * @author Julio
 */
public class Idioma extends Properties implements Serializable{

    private static final long serialVersionUID = 1L;
/**
 * estable el archivo que va a leer 
 * 
 * @param idioma 
 */
    public Idioma(String idioma){

        //Modificar si quieres añadir mas idiomas
        //Cambia el nombre de los ficheros o añade los necesarios
    	switch(idioma){
	    	case "1":
                    getProperties("espanol.properties");
                    break;
	    	case "2":
                    getProperties("ingles.properties");
                    break;
	    	default:
                    getProperties("espanol.properties");
	   	}

    }
/**
 * busca el texto que se envia en el archivo que se eligio al instanciar la clase
 * @param idioma 
 */
    private void getProperties(String idioma) {
        try {
            this.load( getClass().getResourceAsStream(idioma) );
        } catch (IOException ex) {

        }
   }
}