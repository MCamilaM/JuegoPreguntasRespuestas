/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

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
    private String descripción;
    private String nivelDificultad;
    private List<Pregunta> preguntas;

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
    public Categoria(String descripción, String nivelDificultad) {
        this.descripción = descripción;
        this.nivelDificultad = nivelDificultad;
    }
    
    /**
     * Constructor 
     * @param idCategoria
     * @param descripción
     * @param nivelDificultad 
     */
    public Categoria(int idCategoria, String descripción, String nivelDificultad) {
        this.idCategoria = idCategoria;
        this.descripción = descripción;
        this.nivelDificultad = nivelDificultad;
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
     * @return descripcion
     */
    public String getDescripción() {
        return descripción;
    }

    /**
     * 
     * @param descripción 
     */
    public void setDescripción(String descripción) {
        this.descripción = descripción;
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

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
    
    
    
}
