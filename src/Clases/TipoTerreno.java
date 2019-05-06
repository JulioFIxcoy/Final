/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.event.ActionEvent;
import java.io.Serializable;

/**
 *
 * @author Julio
 */
public class TipoTerreno extends Casilla implements Serializable{

    public TipoTerreno(boolean destruible, int intDestruible) {
        super(destruible, intDestruible);
    }

    @Override
    void setCasillaColor() {
 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     
    }
    
}
