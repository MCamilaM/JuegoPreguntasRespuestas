/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Camila Morales
 */
public class Respuesta {
    private int idRespuesta;
    private String descripcion;
    private boolean esCorrecta;
    private int idPregunta;

    public Respuesta() {
    }

    public Respuesta(String descripcion, boolean esCorrecta, int idPregunta) {
        this.descripcion = descripcion;
        this.esCorrecta = esCorrecta;
        this.idPregunta = idPregunta;
    }

    public Respuesta(int idRespuesta, String descripcion, boolean esCorrecta, int idPregunta) {
        this.idRespuesta = idRespuesta;
        this.descripcion = descripcion;
        this.esCorrecta = esCorrecta;
        this.idPregunta = idPregunta;
    }

    /**
     * 
     * @return idRespuesta
     */
    public int getIdRespuesta() {
        return idRespuesta;
    }

    /**
     * 
     * @param idRespuesta 
     */
    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
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
     * @return true or false
     */
    public boolean isEsCorrecta() {
        return esCorrecta;
    }

    /**
     * 
     * @param esCorrecta 
     */
    public void setEsCorrecta(boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
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

    
    
}
