/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author Julio
 */
public class ParametrosJuego implements Serializable {
    private int fila, columna;
    private Jugador playerUno, playerDos;
    private int idPlayerUno, idPlayerDos;
    private int turno;
    private int[] posicion;
    private static int id;

    public ParametrosJuego(int fila, int columna, int idPlayerUno, int idPlayerDos, int turno, int[] posicion) {
        this.fila = fila;
        this.columna = columna;
        this.idPlayerUno = idPlayerUno;
        this.idPlayerDos = idPlayerDos;
        this.turno = turno;
        this.posicion = posicion;
        id++;
    }

    public ParametrosJuego(int fila, int columna, Jugador playerUno, Jugador playerDos, int idPlayerUno, int idPlayerDos) {
        this.fila = fila;
        this.columna = columna;
        this.playerUno = playerUno;
        this.playerDos = playerDos;
        this.idPlayerUno = idPlayerUno;
        this.idPlayerDos = idPlayerDos;
        id++;
    }

    public ParametrosJuego(int fila, int columna, int turno) {
        this.fila = fila;
        this.columna = columna;
        this.turno = turno;
        id++;
    }

    
    
    
    public ParametrosJuego(int fila, int columna, int turno, int[] posicion ) {
        this.fila = fila;
        this.columna = columna;
        this.turno = turno;
        this.posicion = posicion;
        id++;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        ParametrosJuego.id = id;
    }

    public int getIdPlayerUno() {
        return idPlayerUno;
    }

    public void setIdPlayerUno(int idPlayerUno) {
        this.idPlayerUno = idPlayerUno;
    }

    public int getIdPlayerDos() {
        return idPlayerDos;
    }

    public void setIdPlayerDos(int idPlayerDos) {
        this.idPlayerDos = idPlayerDos;
    }

    
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public Jugador getPlayerUno() {
        return playerUno;
    }

    public void setPlayerUno(Jugador playerUno) {
        this.playerUno = playerUno;
    }

    public Jugador getPlayerDos() {
        return playerDos;
    }

    public void setPlayerDos(Jugador playerDos) {
        this.playerDos = playerDos;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int[] getPosicion() {
        return posicion;
    }

    public void setPosicion(int[] posicion) {
        this.posicion = posicion;
    }
    
    
    
    
}
