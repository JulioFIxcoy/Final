/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author Julio
 */
public class Lagos extends TipoTerreno implements Serializable{
/**
 * constructo de la calse lago 
 * inicializa los valores de un lago
 * @param destruible
 * @param intDestruible 
 */
    public Lagos(boolean destruible, int intDestruible) {
        super(destruible, intDestruible);
        setForeground(Color.BLACK);
        setBackground(Color.BLUE);
        Border line = new LineBorder(Color.BLACK);
        Border margin = new EmptyBorder(5, 15, 5, 15);
        Border compound = new CompoundBorder(line, margin);
        setBorder(compound);
        
        
    }

    @Override
    void setCasillaColor() {
       setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agua.jpeg")));
        System.out.println("lago");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
