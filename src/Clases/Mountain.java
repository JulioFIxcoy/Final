/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.Random;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author Julio
 */
public class Mountain extends TipoTerreno implements Serializable{

    public Mountain(boolean destruible, int intDestruible) {
        super(destruible, intDestruible);
        setForeground(Color.BLACK);
        setBackground(Color.GREEN);
        Border line = new LineBorder(Color.BLACK);
        Border margin = new EmptyBorder(5, 15, 5, 15);
        Border compound = new CompoundBorder(line, margin);
        setBorder(compound);
        
       
    }
    /**
     * establece una imagen para el vehiculo
     */

    @Override
    void setCasillaColor() {
         Random r = new Random();
        if (r.nextInt(10)<5) {
            setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mont.jpg")));
        }else {
            setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/monta.jpg")));
        }
        System.out.println("monta;a");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
}
