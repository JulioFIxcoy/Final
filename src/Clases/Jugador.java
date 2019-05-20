/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author julio
 */
public class Jugador implements Serializable{
   
    private static int id=0;
    
    private String nombre;
    
    private int cantidadDeJuegos;
    private int nivel;
    private int oro;
    private int experiencia;
    private int contadorVehiculos;
    private int usarVehiculo;
    private int juegos;
    private int ganados;
    private int perdidos;
    private int rendido;
    private int kitGrande;
    private int kitSmall;
    
    private Icon icon;
   
    private Vehiculo currentVehicle;
   
    private boolean givenIn;//rendirse
    //private Secciones posicionActual;
    //private Secciones posicionNueva;
    
    private int Fila;
    private int columna;
    private int myId;
    private Bots bot;
    private String pathImg;
    /**
     * constructor de jugador
     * no aumenta el id
     * @param nombre 
     */
    public Jugador(String nombre) {
        
        usarVehiculo = 0;
        this.nombre = nombre;
        this.cantidadDeJuegos = 0;
      
        
        System.out.println(id);
        init();
        givenIn = false;
       // this.pathImg = pathImg;
      
    }
    
    public String getPathImg() {
        return pathImg;
    }

    public void setPathImg(String pathImg) {
        this.pathImg = pathImg;
    }
    
    public Jugador( ) {
        
       // this.nombre = pathImg;
        init();
    }
    /**
     * regresa un objeto de tipo Bots
     * @return 
     */
    public Bots getBot() {
        return bot;
    }
/**
 * establece el objeto de tipo bot
 * @param bot 
 */
    public void setBot(Bots bot) {
        this.bot = bot;
    }
    /**
     * establece el vehiculo que se usuara en la batalla
     * este vehiculo se guarda en el archivo binario de jugador 
     * y no en un archivo aparte
     * @param usarVehiculo 
     */
    public void setUsarVehiculo(int usarVehiculo) {
        this.usarVehiculo = usarVehiculo;
    }
    
    public int getJuegos() {
        return juegos;
    }

    public void setJuegos(int juegos) {
        this.juegos = juegos;
    }

    public boolean isGivenIn() {
        return givenIn;
    }

    public void setGivenIn(boolean givenIn) {
        this.givenIn = givenIn;
    }
    
    public Vehiculo getCurrentVehicle() {
        return currentVehicle;
    }

    public void setCurrentVehicle(Vehiculo currentVehicle) {
        this.currentVehicle = currentVehicle;
    }
    /**
     * inicializo las variables con valores predeterminados
     */
    private void init(){
        
        icon = null;
          this.id ++;
        this.pathImg="";
        this.nivel = 1;
        
        this.rendido=0;
        this.juegos=0;
        this.ganados=0;
        this.perdidos=0;
        
        this.oro = 0;
        this.experiencia = 1;
        this.contadorVehiculos = 3;
//        this.vehiculo = new Vehiculo[4];
        kitGrande = 0; 
        kitSmall = 0;
        
        usarVehiculo = 0;
  //      this.currentVehicle = vehiculo[usarVehiculo];
        myId =id;
        this.pathImg = pathImg;
                
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }
    
    public int getKitGrande() {
        return kitGrande;
    }

    public void setKitGrande(int kitGrande) {
        this.kitGrande = kitGrande;
    }

    public int getKitSmall() {
        return kitSmall;
    }

    public void setKitSmall(int kitSmall) {
        this.kitSmall = kitSmall;
    }
    
    public int getMyId() {
        return myId;
    }

    public void setMyId(int myId) {
        this.myId = myId;
    }
    
    public int getContadorVehiculos() {
        return contadorVehiculos;
    }

    public void setContadorVehiculos(int contadorVehiculos) {
        this.contadorVehiculos = contadorVehiculos;
    }
    

    public int getFila() {
        return Fila;
    }

    public void setFila(int Fila) {
        this.Fila = Fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    

    public int getRendido() {
        return rendido;
    }

    public void setRendido(int rendido) {
        this.rendido += rendido;
    }

    
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getUsarVehiculo() {
        return usarVehiculo;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public int getPerdidos() {
        return perdidos;
    }

    public void setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDeJuegos() {
        return cantidadDeJuegos;
    }

    public void setCantidadDeJuegos(int cantidadDeJuegos) {
        this.cantidadDeJuegos += cantidadDeJuegos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
   
    public boolean rendirse(){
        
        this.rendido+=1;
        return true;
    }
    
    public void changePosicion(int fila, int columna){
        this.Fila = fila;
        this.columna = columna;
    }
    /**
     * 
     * @return String que muestra algunos detalles/caracteristicas  del jugador
     * metodo para usar en el reporte
     */
    public String dataGeneral() {
        return    id+". "+nombre + ", cantidadDeJuegos: "  + ", juegos: " + juegos + ", ganados: " + ganados + ", perdidos: " + perdidos + ", rendido: " + rendido+"pathinmg"+pathImg ;
    }
//    public void insertarVehiculo(Vehiculo comprado){
//        Manejador<Vehiculo> manejador = new Manejador<Vehiculo>();
//        vehiculo = manejador.createObject("Verificar Compra", contadorVehiculos, vehiculo, Vehiculo.class);
//        vehiculo[contadorVehiculos] = comprado;
//        contadorVehiculos++;
//    }
   

    @Override
    public String toString() {
        return  "img"+pathImg;
    }
    
    
}
