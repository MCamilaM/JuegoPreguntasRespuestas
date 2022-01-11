/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.*;
import vista.VistaPreguntaRespuesta;

/**
 *
 * @author Camila Morales
 */
public class ControladorPregunta implements ActionListener {

    private static final String SQL_SELECT_CATEGORIA = "SELECT id_categoria, nivel_dificultad FROM categoria WHERE id_categoria=?";
    private static final String SQL_SELECT_PREGUNTA = "SELECT id_pregunta, descripcion, id_categoria FROM pregunta WHERE id_categoria=?";
    private static final String SQL_INSERT = "INSERT  INTO persona(nombre, apellido, email, telefono) VALUES(?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE persona SET NOMBRE =?, APELLIDO=?, EMAIL=?, TELEFONO=? WHERE ID_PERSONA=?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";
    private static final String SQL_INSERT_JUGADOR = "INSERT INTO jugador(nombre) VALUES(?)";

    private static int ronda = 1;

    private VistaPreguntaRespuesta vistaPR;
    private Pregunta pregunta;
    private Jugador jugador;

    public ControladorPregunta() {
    }

    public ControladorPregunta(VistaPreguntaRespuesta vistaPR) {
        this.vistaPR = vistaPR;
        this.vistaPR.setVisible(true);
        agregarEventos();
        vistaLogin();
        jugador = new Jugador();

    }

    private void agregarEventos() {
        this.vistaPR.getBtnJugar().addActionListener(this);

    }

    private void vistaLogin() {
        vistaPR.getPanelLogin().setVisible(true);
        vistaPR.getPanelPreguntas().setVisible(false);
    }

    private void vistaPreguntas() {
        if (validarCampo()) {
            vistaPR.getPanelLogin().setVisible(false);
            vistaPR.getPanelPreguntas().setVisible(true);
        }

    }

    private boolean validarCampo() {
        boolean bandera = false;
        String nombre = vistaPR.getTxtNombreJugador().getText();
        if ("".equals(nombre)) {
            JOptionPane.showMessageDialog(null, "Debe ingresar su nombre");
            bandera = false;
        } else {
            bandera = true;
            jugador.setNombre(nombre);
            insertarJugador();
            iniciarRonda();
        }
        return bandera;
    }

    private void iniciarRonda() {
        Categoria categoria = listarCategoria(ronda);
        List<Pregunta> preguntas = listarPreguntas(categoria);
        Pregunta pregunta = seleccionarPregunta(preguntas);
        mostrarPregunta(pregunta);
    }

    private void insertarJugador() {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT_JUGADOR);
            stmt.setString(1, jugador.getNombre());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

    }

    private Categoria listarCategoria(int ronda) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Categoria categoria = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_CATEGORIA);
            stmt.setInt(1, ronda);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idCategoria = rs.getInt("id_categoria");
                String nivelDificultad = rs.getString("nivel_dificultad");
                categoria = new Categoria(idCategoria, nivelDificultad);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return categoria;
    }

    private void imprimirCategoria(Categoria categoria) {
        System.out.println("categoria = " + categoria);

    }

    private List<Pregunta> listarPreguntas(Categoria categoria) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Pregunta> preguntas = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_PREGUNTA);
            //rs = stmt.executeQuery();
            stmt.setInt(1, categoria.getIdCategoria());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idPregunta = rs.getInt("id_pregunta");
                String descripcion = rs.getString("descripcion");
                int idCategoria = rs.getInt("id_categoria");
                pregunta = new Pregunta(idPregunta, descripcion, idCategoria);
                preguntas.add(pregunta);
            }
            //seleccionarPregunta(preguntas);
        } catch (SQLException ex) {

            ex.printStackTrace(System.out);

        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return preguntas;
    }

    public Pregunta seleccionarPregunta(List<Pregunta> preguntas) {
        int min_val = 0;
        int max_val = preguntas.size() - 1;
        int randomNum = (int) (Math.random() * (max_val - min_val));
        Pregunta pregunta = preguntas.get(randomNum);
        return pregunta;

    }

    public void mostrarPregunta(Pregunta pregunta) {
        vistaPR.getLblPregunta().setText(pregunta.getDescripcion());
    }
    
    /*public void mostrarRespuestas(Pregunta pregunta){
        
    }*/

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == vistaPR.getBtnJugar()) {
            vistaPreguntas();
        }
    }

}
