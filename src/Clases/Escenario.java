/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Archivos.BinariosPlantilla;
import Archivos.RecuperarPlantilla;
import Vistas.Juego;
import Vistas.Principal;
import static Vistas.Principal.dos;
import static Vistas.Principal.idioma;
import static Vistas.Principal.uno;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.Serializable;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.Popup;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author julio
 */
public class Escenario 
     //   extends Thread
        implements Serializable {
    
 

    /**
     * 
     * @param filas row que tendra la matriz escenario
     * @param columnas columnas que tendra la matriz escenario 
     */
    public Escenario(int filas, int columnas) {
        
        this.row = filas;
        this.columnas = columnas;
        
         playerDos = new StringBuffer();
        playerUno = new StringBuffer();
        
         pop = new JPopupMenu(idioma.getProperty("opcionesJuego"));
        opciones = new JMenuItem[5];
        opciones[0] = new JMenuItem(idioma.getProperty("atacar"));
        opciones[1] = new JMenuItem(idioma.getProperty("colocarBot"));
        opciones[2] = new JMenuItem(idioma.getProperty("moverVehiculo"));
        opciones[3] = new JMenuItem(idioma.getProperty("cambiarVehiculo"));
        opciones[4] = new JMenuItem(idioma.getProperty("usarArticulo"));
//        acciones();
        action();
        for (JMenuItem opcione : opciones) {
            opcione.setVisible(true);
            pop.add(opcione);
        }
       
        customBtn(opciones);
        pop.setSize(150, 250);
        
       
    }
    
    
    private void customBtn(JMenuItem[] item){
            Border line = new LineBorder(Color.DARK_GRAY);
            Border margin = new EmptyBorder(5, 10, 5, 10);
            Border compound = new CompoundBorder(line, margin);
            // item.setBorder(compound);
            for (JMenuItem each : item) {
                 each.setBorder(compound);
            }
        }         
         

    public Escenario() {
    }
    /**
     * 
     * @param fila
     * @param columna
     * @return  una seccion especifica
     */
    public Casilla getCasilla(int fila , int columna){
        return  escenario[fila][columna];
    }
    /**
     * 
     * @param fila
     * @param columna
     * @param seccion modifica una seccion especifica
     */
    public void setSeccion(int fila, int columna, TipoTerreno seccion){
        this.escenario[fila][columna]=seccion;
    }
    /**
     * 
     * @return cantidad de row de la matriz escenario que es del tipo seccion
     */

    public int getRow() {
        return row;
    }
    /**
     * 
     * @param row modifica la cantidad de row que tiene la matriz
     */
    public void setRow(int row) {
        this.row = row;
    }
    /**
     * 
     * @return la cantidad de columnas que tiene la matriz del tipo seccion
     */
    public int getColumnas() {
        return columnas;
    }
    /**
     * 
     * @param columnas modifica la cantidad de columnas que tiene la matriz del tipo seccion
     */
    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
    /**
     * 
     * @return devuelve la matriz de tipo seccion
     */
    public Casilla[][] getEscenario() {
        return escenario;
    }
    /**
     * modifica el esceneario completo pasandole un escenario 
     * @param escenario matriz del tipo seccion
     */
    public void setEscenario(TipoTerreno[][] escenario) {
        this.escenario = escenario;
    }

    public int getCantidadDeMontanas() {
        return cantidadDeMontanas;
    }

    public void setCantidadDeMontanas(int cantidadDeMontanas) {
        this.cantidadDeMontanas = cantidadDeMontanas;
    }

    public int getCantidadDeAgua() {
        return cantidadDeAgua;
    }

    public void setCantidadDeAgua(int cantidadDeAgua) {
        this.cantidadDeAgua = cantidadDeAgua;
    }

    public Jugador[] getEnemigos() {
        return enemigos;
    }

    public void setEnemigos(Jugador[] enemigos) {
        this.enemigos = enemigos;
    }
    public Jugador getEnemigoIndice(int indice){
         return  this.enemigos[indice];
    }
    public void setEnemigoIndice(int indice, Jugador j){
        this.enemigos[indice] =  j;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
//
//    public Jugador getPlayer() {
//        return jugador;
//    }
//
//    public void setJugador(Jugador jugador) {
//        this.jugador = jugador;
//    }
    
    public Jugador getIndiceEnemigo(int fila , int columna){
        
//        if (escenario[fila][columna].getObject() instanceof Jugador) {
//            return (Jugador) escenario[fila][columna].getObject();
//        }
        return null;
    }
    /**
     * modifica el tipo de terreno
     * @param fila 
     * @param columna
     * @param tipoDeTerreno 1 tierra, 2 montaña ,3  agua 
     */
    public void setIndiceMatriz(int fila, int columna, int tipoDeTerreno){
        
        
    }
  
  
     /**
      * ubica a un enemigo en la posicion indicada
      * @param fila
      * @param columna
      * @param jugador 
      */
    public void ubicarEnemigos(int fila, int columna, int jugador,boolean isEnemigo){
        Random r = new Random();
                
    }
  
  
    
    

  //agregar metodo que ubique a los vehiculoss del jugador y enemigo 
    
     public StringBuffer getPlayerUno() {
        return playerUno;
    }

    public void setPlayerUno(String eleccionPop, Jugador inTurn, Jugador onHold ) {
        if (this.playerUno.length()>0) {
            this.playerUno.setLength(0);
            this.playerUno.append(eleccionPop);
        }else
            this.playerUno.append(eleccionPop);

            if (eleccionPop.equalsIgnoreCase(idioma.getProperty("moverVehiculo"))) {
                
                int x = inTurn.getCurrentVehicle().getPosicionX();
                int y = inTurn.getCurrentVehicle().getPosicionY();
               
                
                
                
                
                //revisar si es tanque o avion
                //si es tanque no puede eestar en los lagos 
                //revisar la casilla en la que llego para ver si es comodin
                
                do{
                    inTurn.getCurrentVehicle().moveVehicle(row, columnas);
                }while(escenario[inTurn.getCurrentVehicle().getPosicionX()][inTurn.getCurrentVehicle().getPosicionX()].getPlayer() != null);
                
                escenario[x][y].setJugador(null);
                escenario[x][y].setIcon(null);
                escenario[x][y].setText(x+","+y);
                
                        if (inTurn.getCurrentVehicle() instanceof Tanque) {
                        
                            if (escenario[inTurn.getCurrentVehicle().getPosicionX()][inTurn.getCurrentVehicle().getPosicionX()].getClass().getCanonicalName().contains("Lago")) {
                            
                                inTurn.getCurrentVehicle().moveVehicle(row, columnas);
                            
                            }else if (escenario[inTurn.getCurrentVehicle().getPosicionX()][inTurn.getCurrentVehicle().getPosicionX()].getClass().getCanonicalName().contains("Comodin")) {
                            
                                JOptionPane.showMessageDialog(null, "Vehiculo Llego a Un Comodin, Listo Para lanzar El Dado", "Comodin", JOptionPane.INFORMATION_MESSAGE);
                                Random r = new Random();
                                
                                opcionesComodin(r.nextInt(3), inTurn);
                            }
                        }else{
                            //avion
                            if (escenario[inTurn.getCurrentVehicle().getPosicionX()][inTurn.getCurrentVehicle().getPosicionX()].getClass().getCanonicalName().contains("Lago")) {
                            
                               // System.out.println("move");
                                inTurn.getCurrentVehicle().moveVehicle(row, columnas);
                            
                            }else if (escenario[inTurn.getCurrentVehicle().getPosicionX()][inTurn.getCurrentVehicle().getPosicionX()].getClass().getCanonicalName().contains("Comodin")) {
                            
                                JOptionPane.showMessageDialog(null, "Vehiculo Llego a Un Comodin, Listo Para lanzar El Dado", "Comodin", JOptionPane.INFORMATION_MESSAGE);
                                Random r = new Random();
                                
                                opcionesComodin(r.nextInt(3), inTurn);
                                
                            }else if (escenario[inTurn.getCurrentVehicle().getPosicionX()][inTurn.getCurrentVehicle().getPosicionX()].getClass().getCanonicalName().contains("Mountain")) {
                            
                               /// JOptionPane.showMessageDialog(null, "Vehiculo Llego a Un Comodin, Listo Para lanzar El Dado", "Comodin", JOptionPane.INFORMATION_MESSAGE);
                                Random r = new Random();
                                inTurn.getCurrentVehicle().moveVehicle(row, columnas);
                            }
                            
                        }
                    
                
                
                JOptionPane.showMessageDialog(null, idioma.getProperty("moveLlegoA")+inTurn.getCurrentVehicle().getPosicionX()+inTurn.getCurrentVehicle().getPosicionY(), "moverVehiculo", JOptionPane.INFORMATION_MESSAGE);
                escenario[inTurn.getCurrentVehicle().getPosicionX()][inTurn.getCurrentVehicle().getPosicionX()].setJugador(inTurn);
                System.out.println("pos"+inTurn.getCurrentVehicle().getPosicionX()+inTurn.getCurrentVehicle().getPosicionY());
                escenario[inTurn.getCurrentVehicle().getPosicionX()][inTurn.getCurrentVehicle().getPosicionY()].imgJugador(inTurn);
                
            
            }else if (eleccionPop.equalsIgnoreCase(idioma.getProperty("atacar"))) {
                
                Random random = new Random();
                int xFila = random.nextInt(row);
                int yColumn = random.nextInt(columnas);
                 JOptionPane.showMessageDialog(null, idioma.getProperty("ataqueLLegoA")+"("+xFila+","+yColumn+")", idioma.getProperty("atacar"), JOptionPane.INFORMATION_MESSAGE);
                
                if (escenario[xFila][yColumn].isDestruible()) {
                    
                    int danger = inTurn.getCurrentVehicle().getAtaque();
                    
                    if (danger > escenario[xFila][yColumn].getIntDestruible()) {
                        
                        escenario[xFila][yColumn] = null;
                        escenario[xFila][yColumn] = new Normal(false, 0);
                        
                    }else{
                        escenario[xFila][yColumn].setIntDestruible(escenario[xFila][yColumn].getIntDestruible()-danger);
                        
                    }
                            
                }else if (escenario[xFila][yColumn].getPlayer() != null) {
                    
                
                        int attack = inTurn.getCurrentVehicle().attack();


                        if (escenario[xFila][yColumn].getPlayer().getCurrentVehicle().getDefensa()< attack) {

                            int danger = attack - escenario[xFila][yColumn].getPlayer().getCurrentVehicle().getDefensa();

                            escenario[xFila][yColumn].getPlayer().getCurrentVehicle().setVida(escenario[xFila][yColumn].getPlayer().getCurrentVehicle().getVida()-danger);
                            
                        }
                }

            }else if (eleccionPop.equalsIgnoreCase(idioma.getProperty("colocarBot"))) {
                
                btn.setBot(inTurn.getBot());
            
            }else if (eleccionPop.equalsIgnoreCase(idioma.getProperty("cambiarVehiculo"))) {
                //Dialog.DEFAULT_MODALITY_TYPE
                    Dialog forTable = new Dialog(null, idioma.getProperty("vehicle"), Dialog.DEFAULT_MODALITY_TYPE, btn.getGraphicsConfiguration());
                    JFrame test = new JFrame("Cambiar Vehiculo");
                    String[] columnNames ={
                        "Id ","Tipo","Nombre Vehiculo","Ataque","Defensa","Vida"
                    } ;
                    
                    RecuperarPlantilla<Vehiculo> recuperar = new RecuperarPlantilla<>();
                    File file = new File(Principal.mkdirPlayerPlayer+inTurn.getMyId());
                      
                    //DefaultTableModel model =(DefaultTableModel) nueva.getModel();
                    Object [][] object=new Object[file.list().length][6]; 
                    int indice =0;
                    for (String string : file.list()) {
                        System.out.println(string);
                            Vehiculo r=recuperar.recuperar(Principal.mkdirPlayerPlayer+inTurn.getMyId()+File.separatorChar, string, "");
                           
                           object[indice][0] = r.getMyId();
                           object[indice][2] = r.getNombre();
                           object[indice][3] = r.getAtaque();
                           object[indice][4] = r.getDefensa();
                           object[indice][5] = r.getVida();
                           if (string.contains(".air")) {
                               System.out.println(string+"avion");
                             object[indice][1] = "Avion";
                        }else{
                                object[indice][1] = "Tanque";
                           }
                               
                           
                           
                           indice++;
                           
                    }
                   JTable nueva = new JTable(object, columnNames);
                   nueva.setSize(250, 100);
                   JButton btn = new JButton("Aceptar");
                   btn.setSize(30, 25);
                        test.setLayout(new GridLayout());
                        test.add(new JScrollPane(nueva),BorderLayout.NORTH);
                        test.setSize(350, 250);
                        test.setLocationRelativeTo(null);
                        test.add(btn,BorderLayout.SOUTH);
                        test.setVisible(true);
                        
                    btn.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                          Object o=nueva.getValueAt(nueva.getSelectedRow(), 0);
                          BinariosPlantilla<Vehiculo> guardar = new BinariosPlantilla<>();
//                            if (inTurn.getCurrentVehicle().getClass().getCanonicalName().contains("Tanque")) {
//
//                                 guardar.writeObjectBin(inTurn.getCurrentVehicle(), Principal.mkdirPlayerPlayer+inTurn.getMyId()+File.separatorChar, String.valueOf(inTurn.getCurrentVehicle().getMyId()), ".tank");
//                            }else {
//                                guardar.writeObjectBin(inTurn.getCurrentVehicle(), Principal.mkdirPlayerPlayer+inTurn.getMyId()+File.separatorChar, String.valueOf(inTurn.getCurrentVehicle().getMyId()), ".air");
//                            }
                                RecuperarPlantilla<Vehiculo> paraCambiar = new RecuperarPlantilla<>();
                                int id=(int) o;
                                System.out.println("id id id "+id);
                                String tipo =  (String) nueva.getValueAt(nueva.getSelectedRow(), 1);
                                
                                if (nueva.getValueAt(nueva.getSelectedRow(), 1).equals("Tanque")) {
                                    Vehiculo cambiar = paraCambiar.recuperar(Principal.mkdirPlayerPlayer+inTurn.getMyId()+File.separatorChar, String.valueOf(id),".tank");
                                    inTurn.setCurrentVehicle(cambiar);
                                }else{
                                    Vehiculo cambiar = paraCambiar.recuperar(Principal.mkdirPlayerPlayer+inTurn.getMyId()+File.separatorChar, String.valueOf(id),".air");
                                    inTurn.setCurrentVehicle(cambiar);
                                    
                                }
                                
                                
                                JOptionPane.showMessageDialog(null, idioma.getProperty("cambiarVehiculoExitoso"), idioma.getProperty("inf"), JOptionPane.INFORMATION_MESSAGE);
                        }
                    });
           // selectedItem(nueva, inTurn,forTable);
                
            }else if (eleccionPop.equalsIgnoreCase(idioma.getProperty("usarArticulo"))) {
            
            }else  {
                System.out.println("Ocurrio algun error");
            }
            
            
    }
    public void selectedItem(JTable nueva, Jugador inTurn, Dialog dialogo){
       // DefaultTableModel model = (DefaultTableModel) nueva.getModel();
       Object path;
        nueva.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
              Object o=nueva.getValueAt(nueva.getSelectedRow(), 4);
                BinariosPlantilla<Vehiculo> guardar = new BinariosPlantilla<>();
                if (inTurn.getCurrentVehicle().getClass().getCanonicalName().contains("Tanque")) {
                    
                guardar.writeObjectBin(inTurn.getCurrentVehicle(), Principal.mkdirPlayerPlayer+inTurn.getMyId()+File.separatorChar, String.valueOf(inTurn.getCurrentVehicle().getMyId()), ".tank");
                }else {
                    guardar.writeObjectBin(inTurn.getCurrentVehicle(), Principal.mkdirPlayerPlayer+inTurn.getMyId()+File.separatorChar, String.valueOf(inTurn.getCurrentVehicle().getMyId()), ".air");
                }
              RecuperarPlantilla<Vehiculo> paraCambiar = new RecuperarPlantilla<>();
              Vehiculo cambiar = paraCambiar.recuperar(Principal.mkdirPlayerPlayer+inTurn.getId(), (String) o,"");
              inTurn.setCurrentVehicle(cambiar);
                JOptionPane.showMessageDialog(null, idioma.getProperty("cambiarVehiculoExitoso"), idioma.getProperty("inf"), JOptionPane.INFORMATION_MESSAGE);
            }

            @Override
            public void mousePressed(MouseEvent e) {
             changeVehicle(inTurn, nueva);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                changeVehicle(inTurn, nueva);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                changeVehicle(inTurn, nueva);//                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

            }

            @Override
            public void mouseExited(MouseEvent e) {
                changeVehicle(inTurn, nueva);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        nueva.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
               dialogo.dispose();
            }

            @Override
            public void keyPressed(KeyEvent e) {
               dialogo.dispose();
            }

            @Override
            public void keyReleased(KeyEvent e) {
               dialogo.dispose();
            }
        });
    }
    public void changeVehicle(Jugador inTurn, JTable nueva){
                      Object o=nueva.getValueAt(nueva.getSelectedRow(), 4);
                BinariosPlantilla<Vehiculo> guardar = new BinariosPlantilla<>();
                if (inTurn.getCurrentVehicle().getClass().getCanonicalName().contains("Tanque")) {
                    
                guardar.writeObjectBin(inTurn.getCurrentVehicle(), Principal.mkdirPlayerPlayer+inTurn.getMyId()+File.separatorChar, String.valueOf(inTurn.getCurrentVehicle().getMyId()), ".tank");
                }else {
                    guardar.writeObjectBin(inTurn.getCurrentVehicle(), Principal.mkdirPlayerPlayer+inTurn.getMyId()+File.separatorChar, String.valueOf(inTurn.getCurrentVehicle().getMyId()), ".air");
                }
              RecuperarPlantilla<Vehiculo> paraCambiar = new RecuperarPlantilla<>();
              Vehiculo cambiar = paraCambiar.recuperar(Principal.mkdirPlayerPlayer+inTurn.getId(), (String) o,"");
              inTurn.setCurrentVehicle(cambiar);
                JOptionPane.showMessageDialog(null, idioma.getProperty("cambiarVehiculoExitoso"), idioma.getProperty("inf"), JOptionPane.INFORMATION_MESSAGE);
            

    }
    public void opcionesComodin(int r, Jugador inTurn){
        
        switch (r) {
            case 0:
                JOptionPane.showMessageDialog(null, "Premio: 25% de vida mas", "Comodin", JOptionPane.INFORMATION_MESSAGE);
                int vidaPlus = (25 * inTurn.getCurrentVehicle().getVida())/100;
                inTurn.getCurrentVehicle().setVida((inTurn.getCurrentVehicle().getVida()+vidaPlus));
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Premio: 50% de Ataque mas", "Comodin", JOptionPane.INFORMATION_MESSAGE);
                int ataquePlus = (50 * inTurn.getCurrentVehicle().getAtaque())/100;
                inTurn.getCurrentVehicle().setAtaque((inTurn.getCurrentVehicle().getAtaque()+ataquePlus));
                break;
            case 2:
                 JOptionPane.showMessageDialog(null, "Mejor Suerte para la Proxima", "Comodin", JOptionPane.INFORMATION_MESSAGE);
                break;

            default:
                 JOptionPane.showMessageDialog(null, "Mejor Suerte para la Proxima", "Comodin", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public StringBuffer getPlayerDos() {
        return playerDos;
    }

    public void setPlayerDos(String playerDos) {
        if (this.playerDos.length()>0) {
            this.playerDos.setLength(0);
            this.playerDos.append(playerUno);
        }else
        this.playerDos.append(playerDos);
       
    }
    

    
   /**
     * inicializa la matriz que es del tipo seccion
     * inicializa las instancias secciones que se encuentran en la matriz
     * @param contenedor
     */
    public void initMatrizEscenario(Juego contenedor){
       contenedor.removeAll();
         int xButton = (contenedor.getWidth()/columnas);
        int yButton = (contenedor.getHeight()/row);
        this.escenario = new Casilla[this.row][this.columnas];
        
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.columnas; j++) {
                this.escenario[i][j] = new Normal(false, 0);//(false,0);
                this.escenario[i][j].setPosicionX(i);
                this.escenario[i][j].setPosicionY(j);
                escenario[i][j].setBounds(xButton*j,yButton*i,xButton, yButton);
                
                escenario[i][j].setVisible(true);
                x = i; 
                y = j;
                escenario[i][j].addMouseListener(click);
             //   escenario[i][j].add(pop);
                escenario[i][j].setText("("+i+","+j+")");
                contenedor.add(escenario[i][j]);
                
                contenedor.setVisible(true);
                contenedor.repaint();
            }
            
        }
        
        Random r = new Random();
        int x = 0;
        while (x<10) {
            aleatoriedadDeTerrenos(contenedor);
            x= r.nextInt(20);
        }
    }
    MouseListener click = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
           
                    popMenu(e);
               
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
          popMenu(e);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        popMenu(e);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
          popMenu(e);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            popMenu(e);
        }
    };
    
    public void action(){
       ;
       //  pop.menuSelectionChanged(true);
         pop.pack();
         btn = (Casilla) pop.getInvoker();
         for (JMenuItem opcione : opciones) {
            
            opcione.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    
                    System.out.println(btn.getPosicionX()+btn.getPosicionY());
                    if (juego.getTurno()==0) {
                            JOptionPane.showMessageDialog(null, "Turno de "+uno.getNombre(), "Turno", JOptionPane.INFORMATION_MESSAGE);
                            setPlayerUno(opcione.getText(),uno,dos);
                            juego.setTurno(1);
                    }else{
                        JOptionPane.showMessageDialog(null, "Turno de "+dos.getNombre(), "Turno", JOptionPane.INFORMATION_MESSAGE);
                            setPlayerUno(opcione.getText(),dos,uno);
                            juego.setTurno(0);
                    }
                }
            });
             
             
            opcione.addMouseListener(new MouseAdapter() {

             @Override
             public void mouseEntered(MouseEvent e){
                 opcione.setBackground(Color.BLUE);
             }
             @Override
             public void mouseExited(MouseEvent e){
                 opcione.setBackground(Color.WHITE);
             }
         });
         
        }
        
         
    }

    public ParametrosJuego getJuego() {
        return juego;
    }

    public void setJuego(ParametrosJuego juego) {
        this.juego = juego;
    }
    public void aleatoriedadDeTerrenos(JPanel contenedor){
        Random random = new Random();
        int x = random.nextInt(row);
        int y = random.nextInt(columnas);
       Rectangle test= escenario[x][y].getBounds();
        Casilla terreno = (Casilla)escenario[x][y];
       
        if (random.nextInt(4)==0) {
            
            Comodin nuevo = new Comodin(true, 100);
            terreno = (Comodin) nuevo;
        }else if (random.nextInt(3)==1) {
       
            Lagos nuevo = new Lagos(true, 100);
              terreno = (Lagos) nuevo;
        }else if (random.nextInt(4)==2) {

                Mountain nuevo = new Mountain(true, 100);
                terreno = (Mountain) nuevo;
        }else {
            terreno = escenario[x][y];
        }
        terreno.setPosicionY(y);
        terreno.setBounds(test);
        terreno.setCasillaColor();
                
        terreno.setVisible(true);

        terreno.addMouseListener(click);
        //terreno.add(popMenu);
        contenedor.remove(escenario[x][y]);
        contenedor.add(terreno);

        contenedor.setVisible(true);
        contenedor.repaint();

    }
    public void popMenu(MouseEvent e){
        if (e.isPopupTrigger()) {

              pop.setLocation(e.getLocationOnScreen());
              btn = (Casilla) e.getSource();
              System.out.println(btn.getPosicionX()+","+btn.getPosicionY());
              pop.setVisible(true);
          }
    }
    private Casilla btn;
    private ParametrosJuego juego;
    private int row;
    private int columnas;
    private Casilla[][] escenario;
    
    private Jugador[] enemigos;
    private int cantidadDeMontanas;
    private int cantidadDeAgua;
    private int posX;
    private int posY;
    private StringBuffer playerUno;
    private StringBuffer playerDos;
    private JPopupMenu pop;
    private JMenuItem[] opciones;
    private int x,y;

}
