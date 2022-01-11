/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Camila Morales
 */
public class Historico {
    /**
     * Atributos
     */
    private int idHistorico;
    private Jugador jugador; // id jugador

    /**
     * Constructor
     */
    public Historico() {
    }

    /**
     * Constructor
     * @param jugador 
     */
    public Historico(Jugador jugador) {
        this.jugador = jugador;
    }

    /**
     * Constructor
     * @param idHistorico
     * @param jugador 
     */
    public Historico(int idHistorico, Jugador jugador) {
        this.idHistorico = idHistorico;
        this.jugador = jugador;
    }

    /**
     * 
     * @return idHistorico
     */
    public int getIdHistorico() {
        return idHistorico;
    }
    /**
     * 
     * @param idHistorico 
     */
    public void setIdHistorico(int idHistorico) {
        this.idHistorico = idHistorico;
    }
    /**
     * 
     * @return jugador
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * 
     * @param jugador 
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    
            
} 
