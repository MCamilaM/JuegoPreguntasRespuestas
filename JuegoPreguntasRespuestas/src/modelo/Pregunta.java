/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Camila Morales
 */
public class Pregunta {
    /**
     * Atributos
     */
    private int idPregunta;
    private String descripcion;
    private int idCategoria;

    /**
     * Constructor vacío
     */
    public Pregunta() {
    }

    /**
     * Constructor
     * @param descripcion
     * @param idCategoria 
     */
    public Pregunta(String descripcion, int idCategoria) {
        this.descripcion = descripcion;
        this.idCategoria = idCategoria;
    }    
    
    /**
     * Constructor
     * @param idPregunta
     * @param descripcion
     * @param idCategoria 
     */
    public Pregunta(int idPregunta, String descripcion, int idCategoria) {
        this.idPregunta = idPregunta;
        this.descripcion = descripcion;
        this.idCategoria = idCategoria;
    }

    /**
     * 
     * @return idPregunta
     */
    public int getIdPregunta() {
        return idPregunta;
    }

    /**
     * 
     * @param idPregunta 
     */
    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    /**
     * 
     * @return descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * 
     * @param descripcion 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    
    
}
