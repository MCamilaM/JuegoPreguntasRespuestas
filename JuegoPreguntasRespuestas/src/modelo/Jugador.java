/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Camila Morales
 */
public class Jugador {
    
    /**
     * Atributos
     */
    private int idJugador;
    private String nombre;
    private int puntaje;

    /**
     * Constructor vacio
     */
    public Jugador() {
    }

    /**
     * Constructor
     * @param nombre
     * @param puntaje 
     */
    public Jugador(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    /**
     * Constructor
     * @param idJugador
     * @param nombre
     * @param puntaje 
     */
    public Jugador(int idJugador, String nombre, int puntaje) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    /**
     * 
     * @return idJugador
     */
    public int getIdJugador() {
        return idJugador;
    }

    /**
     * 
     * @param idJugador 
     */
    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    /**
     * 
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * 
     * @param puntaje 
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    
}
