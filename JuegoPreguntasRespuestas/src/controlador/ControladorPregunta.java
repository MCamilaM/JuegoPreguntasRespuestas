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
import javax.swing.JOptionPane;
import modelo.*;
import vista.*;

/**
 *
 * @author Camila Morales
 */
public class ControladorPregunta implements ActionListener {

    /**
     * sentencia SQL
     */
    private static final String SQL_SELECT_CATEGORIA = "SELECT id_categoria, nivel_dificultad FROM categoria WHERE id_categoria=?";
    private static final String SQL_SELECT_PREGUNTA = "SELECT id_pregunta, descripcion, id_categoria FROM pregunta WHERE id_categoria=?";
    private static final String SQL_SELECT_RESPUESTA = "SELECT id_respuesta, descripcion, es_correcta, id_pregunta FROM respuesta WHERE id_pregunta=?";
    private static final String SQL_INSERT_JUGADOR = "INSERT INTO jugador(nombre) VALUES(?)";
    private static final String SQL_SELECT_JUGADOR = "SELECT id_jugador FROM jugador WHERE nombre=?";
    private static final String SQL_UPDATE_JUGADOR = "UPDATE jugador SET puntaje =? WHERE id_jugador=?";

    private int ronda = 1;
    private VistaPreguntaRespuesta vistaPR;
    private Jugador jugador;
    private Respuesta respuestaCorrecta;
    private int[] listaPremios = {500, 1000, 2000, 4000, 8000};
    private int puntaje = 0;

    /**
     * Constructor vacio.
     */
    public ControladorPregunta() {
    }

    /**
     * Constructor
     *
     * @param vistaPR
     */
    public ControladorPregunta(VistaPreguntaRespuesta vistaPR) {
        this.vistaPR = vistaPR;
        this.vistaPR.setVisible(true);
        agregarEventos();
        vistaLogin();
        jugador = new Jugador();

    }

    /**
     * agrega eventos addActionListener.
     */
    private void agregarEventos() {
        this.vistaPR.getBtnJugar().addActionListener(this);
        this.vistaPR.getBtnRespuesta1().addActionListener(this);
        this.vistaPR.getBtnRespuesta2().addActionListener(this);
        this.vistaPR.getBtnRespuesta3().addActionListener(this);
        this.vistaPR.getBtnRespuesta4().addActionListener(this);
        this.vistaPR.getBtnSiguientePregunta().addActionListener(this);
        this.vistaPR.getBtnSalir().addActionListener(this);
    }

    /**
     * muestra la vista para ingresar nombre.
     */
    private void vistaLogin() {
        vistaPR.getPanelLogin().setVisible(true);
        vistaPR.getPanelPreguntas().setVisible(false);
        vistaPR.getPanelGanarPerder().setVisible(false);
    }

    /**
     * muestra la vista para la preguntas y respuestas.
     */
    private void vistaPreguntas() {

        vistaPR.getPanelGanarPerder().setVisible(false);
        vistaPR.getPanelLogin().setVisible(false);
        vistaPR.getPanelPreguntas().setVisible(true);
        vistaPR.getTxtRonda().setText(String.valueOf(ronda));
        vistaPR.getTxtPuntaje().setText(String.valueOf(puntaje));

    }

    /**
     * muestra vista del resultado de la ronda.
     *
     * @param rtaEsCorrecta
     */
    private void vistaResultado(boolean rtaEsCorrecta) {
        vistaPR.getPanelLogin().setVisible(false);
        vistaPR.getPanelPreguntas().setVisible(false);
        vistaPR.getPanelGanarPerder().setVisible(true);
        vistaPR.getPanelRondaPuntaje().setVisible(true);
        if (ronda < 5) {
            if (rtaEsCorrecta) {
                vistaPR.getLblTituloGanarPerder().setText("Respuesta Correcta");
                vistaPR.getBtnSiguientePregunta().setEnabled(true);
            } else {
                vistaPR.getLblTituloGanarPerder().setText("Respuesta Incorrecta");
                vistaPR.getBtnSiguientePregunta().setEnabled(false);
            }
        } else {
            vistaPR.getBtnSiguientePregunta().setEnabled(false);
        }

    }

    /**
     * valida si se ingreso un nombre antes de iniciar el juego.
     */
    private void validarCampo() {
        String nombre = vistaPR.getTxtNombreJugador().getText();
        if ("".equals(nombre)) {
            JOptionPane.showMessageDialog(null, "Debe ingresar su nombre");

        } else {
            jugador.setNombre(nombre);
            insertarJugador();
            iniciarRonda();
        }
    }

    /**
     * prepara y muestra la pregunta y respuestas correspondientes segun la
     * ronda.
     */
    private void iniciarRonda() {
        Categoria categoria = listarCategoria(ronda);
        List<Pregunta> preguntas = listarPreguntas(categoria);
        Pregunta pregunta = seleccionarPregunta(preguntas);
        List<Respuesta> respuestas = listarRespuestas(pregunta);
        mostrarPregunta(pregunta);
        mostrarRespuestas(respuestas);
        vistaPreguntas();
    }

    /**
     * metodo para agregar un jugador a la base de datos.
     */
    private void insertarJugador() {
        Connection conn = null;
        PreparedStatement stmt = null;
        PreparedStatement stmt2 = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT_JUGADOR);
            stmt2 = conn.prepareStatement(SQL_SELECT_JUGADOR);
            stmt.setString(1, jugador.getNombre());
            stmt2.setString(1, jugador.getNombre());
            stmt.executeUpdate();
            rs = stmt2.executeQuery();
            while (rs.next()) {
                int idJugador = rs.getInt("id_jugador");
                jugador.setIdJugador(idJugador);
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

    }

    /**
     * metodo para traer la categoria segun la ronda.
     *
     * @param ronda
     * @return categoria
     */
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

    /**
     * metodo para traer preguntas segun una categoria.
     *
     * @param categoria
     * @return lista de preguntas
     */
    private List<Pregunta> listarPreguntas(Categoria categoria) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Pregunta pregunta = null;
        List<Pregunta> preguntas = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_PREGUNTA);
            stmt.setInt(1, categoria.getIdCategoria());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idPregunta = rs.getInt("id_pregunta");
                String descripcion = rs.getString("descripcion");
                int idCategoria = rs.getInt("id_categoria");
                pregunta = new Pregunta(idPregunta, descripcion, idCategoria);
                preguntas.add(pregunta);
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
        return preguntas;
    }

    /**
     * metodo para seleccionar aleatoriamente una pregunta de una categoria.
     *
     * @param preguntas
     * @return pregunta
     */
    public Pregunta seleccionarPregunta(List<Pregunta> preguntas) {
        int min_val = 0;
        int max_val = preguntas.size() - 1;
        int randomNum = (int) (Math.random() * (max_val - min_val));
        Pregunta pregunta = preguntas.get(randomNum);
        return pregunta;

    }

    /**
     * trae las respuestas que corresponde a una pregunta.
     *
     * @param pregunta
     * @return lista de respuestas
     */
    public List<Respuesta> listarRespuestas(Pregunta pregunta) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Respuesta respuesta = null;
        List<Respuesta> respuestas = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_RESPUESTA);
            stmt.setInt(1, pregunta.getIdPregunta());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idRespuesta = rs.getInt("id_respuesta");
                String descripcion = rs.getString("descripcion");
                boolean esCorrecta = rs.getBoolean("es_correcta");
                int idPregunta = rs.getInt("id_pregunta");
                if (esCorrecta) {
                    respuestaCorrecta = new Respuesta(idRespuesta, descripcion, esCorrecta, idPregunta);
                }
                respuesta = new Respuesta(idRespuesta, descripcion, esCorrecta, idPregunta);
                respuestas.add(respuesta);
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
        return respuestas;

    }

    /**
     * metodo para mostrar pregunta en la vista.
     *
     * @param pregunta
     */
    public void mostrarPregunta(Pregunta pregunta) {
        vistaPR.getLblPregunta().setText(pregunta.getDescripcion());
    }

    /**
     * metodo para mostrar respuestas en la vista.
     *
     * @param respuestas
     */
    public void mostrarRespuestas(List<Respuesta> respuestas) {
        vistaPR.getBtnRespuesta1().setText(respuestas.get(0).getDescripcion());
        vistaPR.getBtnRespuesta2().setText(respuestas.get(1).getDescripcion());
        vistaPR.getBtnRespuesta3().setText(respuestas.get(2).getDescripcion());
        vistaPR.getBtnRespuesta4().setText(respuestas.get(3).getDescripcion());

    }

    /**
     * metodo para verificar si la respuesta escogida es la correcta.
     *
     * @param descripcion
     * @return
     */
    public boolean verificarRespuestaCorrecta(String descripcion) {
        boolean esCorrecta = false;
        if (descripcion.equalsIgnoreCase(respuestaCorrecta.getDescripcion())) {
            esCorrecta = true;
            adicionarPuntaje();
            vistaResultado(true);
            ronda++;
        } else {
            esCorrecta = false;
            vistaResultado(false);
        }
        return esCorrecta;
    }

    /**
     * metodo para acumular el puntaje del jugador.
     */
    private void adicionarPuntaje() {
        int premio = listaPremios[ronda - 1];
        puntaje += premio;
    }

    /**
     * metodo para actulizar el puntaje del jugador en la base de datos.
     */
    private void actualizarPuntaje() {
        jugador.setPuntaje(puntaje);
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE_JUGADOR);
            stmt.setInt(1, jugador.getPuntaje());
            stmt.setInt(2, jugador.getIdJugador());
            //System.out.println(jugador.getPuntaje());
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

    /**
     * metodo para agregar un historico.
     */
    private void insertarHistorico() {
        VistaHistorico vistaHistorico = new VistaHistorico();
        ControladorHistorico ctrlHistorico = new ControladorHistorico(vistaHistorico);
        try {
            ctrlHistorico.insertarHistorico(jugador);
            ctrlHistorico.actualizarTabla();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

    }

    /**
     * metodo para evaluar si se actualiza o no el puntaje del jugador cuando 
     * da clic en el boton salir.
     */
    private void resultadoRonda() {
        if (vistaPR.getLblTituloGanarPerder().getText().equals("Respuesta Correcta")) {
            actualizarPuntaje();
        }
        insertarHistorico();
    }

    /**
     * Eventos
     * @param actionEvent 
     */
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getSource() == vistaPR.getBtnJugar()) {
            validarCampo();
        }
        if (actionEvent.getSource() == vistaPR.getBtnRespuesta1()) {
            verificarRespuestaCorrecta(vistaPR.getBtnRespuesta1().getText());
        }
        if (actionEvent.getSource() == vistaPR.getBtnRespuesta2()) {
            verificarRespuestaCorrecta(vistaPR.getBtnRespuesta2().getText());
        }
        if (actionEvent.getSource() == vistaPR.getBtnRespuesta3()) {
            verificarRespuestaCorrecta(vistaPR.getBtnRespuesta3().getText());
        }
        if (actionEvent.getSource() == vistaPR.getBtnRespuesta4()) {
            verificarRespuestaCorrecta(vistaPR.getBtnRespuesta4().getText());
        }
        if (actionEvent.getSource() == vistaPR.getBtnSalir()) {
            resultadoRonda();
            vistaPR.dispose();
        }
        if (actionEvent.getSource() == vistaPR.getBtnSiguientePregunta()) {
            iniciarRonda();
        }
    }

}
