/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author julio
 */
public class Jugador {
    private String nombre;
    private int cantidadDeJuegos;
    private int id;
    private int nivel;
    private int oro;
    private int experiencia;
    
    private int contadorVehiculos;
    private Vehiculo[] vehiculo;
    private Vehiculo vehiculoActual;
    
    private int usarVehiculo;
    private int juegos;
    private int ganados;
    private int perdidos;
    private int rendido;
    private boolean givenIn;//rendirse
    //private Secciones posicionActual;
    //private Secciones posicionNueva;
    
    private int Fila;
    private int columna;
  
    public Jugador(String nombre, int cantidadDeJuegos, int id) {
        usarVehiculo = 0;
        this.nombre = nombre;
        this.cantidadDeJuegos = cantidadDeJuegos;
        this.id = id;
        init();
        givenIn = false;
        
        vehiculoActual = vehiculo[usarVehiculo];
    }

    public Jugador() {
        init();
    }

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
    
    public Vehiculo getVehiculoActual() {
        return vehiculoActual;
    }

    public void setVehiculoActual(Vehiculo vehiculoActual) {
        this.vehiculoActual = vehiculoActual;
    }
    
    private void init(){
        
        this.nivel = 1;
        
        this.rendido=0;
        this.juegos=0;
        this.ganados=0;
        this.perdidos=0;
        
        this.oro = 0;
        this.experiencia = 1;
        this.contadorVehiculos = 3;
        this.vehiculo = new Vehiculo[4];
        
        
        this.vehiculo[0] = new Tanque("T-34-76");
        this.vehiculo[1]= new Avion("Sukhoi Su-27");
        this.vehiculo[2]= new Tanque("IS-2");
        usarVehiculo = 0;
        this.vehiculoActual = vehiculo[usarVehiculo];
        
                
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
    
    public Vehiculo getIndexVehiculo(int indice){
        return vehiculo[indice];
    }
    public void setIndexVehiculo(int indice, Vehiculo vehiculo){
        this.vehiculo[indice] = vehiculo; 
    }

    public Vehiculo[] getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo[] vehiculo) {
        this.vehiculo = vehiculo;
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
    
    /**
     * muestra un listado de vehiculos que el jugador 
     * posee, para poder elegir uno y usarlo en la batalla
     * @param isPc asi es pc entonces el vehiculo deberia cambiarse solo
     * 
     */
    public void cambiarVehiculo(boolean isPc){
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        if (vehiculo != null) {
            
            for (int i = 0; i < vehiculo.length; i++) {
                if (vehiculo[i] != null) {
                    System.out.println("_____________________________________________________");
                    System.out.println((i+1));
                    System.out.println("Tipo: "+vehiculo[i].getClass().getSimpleName());
                    System.out.println("Nombre: "+vehiculo[i].getNombre());
                    System.out.println("Vida: "+vehiculo[i].getVida());
                    System.out.println("Ataque: "+vehiculo[i].getAtaque());
                    System.out.println("Punteria: "+vehiculo[i].getPunteria());
                }
            }
            System.out.println("_____________________________________________________");
            if (!isPc) {
                
                System.out.println("Ingrese el Numero de Vehiculo a usar");
                usarVehiculo = scanner.nextInt()-1;

            }else{
                Random r = new Random();
                usarVehiculo = r.nextInt(2);
            }
            
            while(usarVehiculo>vehiculo.length-1) {
                System.out.println("Ingrese Un Numero dentro del rango de 1 a"+(vehiculo.length));
                 usarVehiculo = scanner.nextInt()-1;
            }
            vehiculoActual = vehiculo[usarVehiculo];
            System.out.println("El Vehiculo ha sido reemplazado exitosamente");//*****************************************************colocar dentro de un marco***************
            
        }
    }
    /*
    metodos que debe terner el jugador
    Atacar usando alguna de sus armas
    ● Cambiar de vehículo
    ● Utilizar algún objeto comprado en la tienda
    ● Rendirse, terminando la batalla sin ganar oro o experiencia
    */
    public boolean rendirse(){
        
        this.rendido+=1;
        return true;
    }
    
    public void changePosicion(int fila, int columna){
        this.Fila = fila;
        this.columna = columna;
    }
    public  void sumarPuntos(){
        Random r = new Random();
        experiencia +=r.nextInt(nivel+experiencia)+1;
        for (int i = 0; i < vehiculo.length; i++) {
            if (vehiculo[i] != null) {
                if (vehiculo[i].isEnBatalla()) {
                    vehiculo[i].setExperiencia(r.nextInt(nivel+experiencia)+1);
                    vehiculo[i].setNivel(r.nextInt(nivel+experiencia)+1);
                    vehiculo[i].setDefensa(r.nextInt(nivel+experiencia)+1);
                }
            }
            
        }
    }

    /**
     * 
     * @return String que muestra algunos detalles/caracteristicas  del jugador
     * metodo para usar en el reporte
     */
    public String dataGeneral() {
        return    id+". "+nombre + ", cantidadDeJuegos: " + cantidadDeJuegos   + ", nivel: " + nivel + ", oro: " + oro + ", experiencia: " + experiencia + ",Cantidad de vehiculos: " + vehiculo.length  + ", juegos: " + juegos + ", ganados: " + ganados + ", perdidos: " + perdidos + ", rendido: " + rendido ;
    }
    public void insertarVehiculo(Vehiculo comprado){
        Manejador<Vehiculo> manejador = new Manejador<Vehiculo>();
        vehiculo = manejador.createObject("Verificar Compra", contadorVehiculos, vehiculo, Vehiculo.class);
        vehiculo[contadorVehiculos] = comprado;
        contadorVehiculos++;
    }
   

    @Override
    public String toString() {
        return   nombre + ", nivel: " + nivel + " Vida: "+vehiculoActual.getVida()+", experiencia:" + experiencia + ", Posicion:(" + (Fila+1) + "," + (columna+1)+")" ;
    }
    
    
}
