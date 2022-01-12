/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camila Morales
 */
public class Categoria {
    /**
     * Atributos
     */
    private int idCategoria;
    private String nivelDificultad;

    /**
     * Constructor vacío
     */
    public Categoria() {
    }

    /**
     * Constructor 
     * @param descripción
     * @param nivelDificultad 
     */
    public Categoria(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
       // this.preguntas = new ArrayList<>();
    }
    
    /**
     * Constructor 
     * @param idCategoria
     * @param descripción
     * @param nivelDificultad 
     */
    public Categoria(int idCategoria,  String nivelDificultad) {
        this.idCategoria = idCategoria;
        this.nivelDificultad = nivelDificultad;
        //this.preguntas = new ArrayList<>();
    }

    /**
     * 
     * @return idCategoria
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * 
     * @param idCategoria 
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * 
     * @return nivelDificultad
     */
    public String getNivelDificultad() {
        return nivelDificultad;
    }

    /**
     * 
     * @param nivelDificultad 
     */
    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    @Override
    public String toString() {
        return "Categoria{" + "idCategoria=" + idCategoria + ", nivelDificultad=" + nivelDificultad + '}';
    }
    
    
    
}
