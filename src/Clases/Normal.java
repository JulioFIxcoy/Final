/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Color;
import java.io.Serializable;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author Julio
 */
public class Normal extends TipoTerreno implements Serializable{
    
    public Normal(boolean destruible, int intDestruible) {
        super(destruible, intDestruible);
        //setBackground(Color.LIGHT_GRAY);
        setForeground(Color.BLACK);
        setBackground(Color.WHITE);
        Border line = new LineBorder(Color.BLACK);
        Border margin = new EmptyBorder(5, 15, 5, 15);
        Border compound = new CompoundBorder(line, margin);
        setBorder(compound);
        
      //  setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/comodin2.jpg")));
    }
    public int getPosicionXX(){
        return super.getPosicionX();
    }

    @Override
    void setCasillaColor() {
        System.out.println("noraml");

    }
    
    
}
