/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Color;
import java.awt.event.ActionEvent;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.Serializable;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author Julio
 */
public class Comodin extends Casilla implements Serializable{

    public Comodin(boolean destruible, int intDestruible) {
        super(destruible, intDestruible);
        setForeground(Color.BLACK);
        setBackground(Color.DARK_GRAY);
        Border line = new LineBorder(Color.BLACK);
        Border margin = new EmptyBorder(5, 15, 5, 15);
        Border compound = new CompoundBorder(line, margin);
        
        
        setBorder(compound);
        
        
            
      
    }

    @Override
    void setCasillaColor() {
        setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/comodin2.jpg")));
        System.out.println("comodin");
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
}
