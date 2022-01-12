/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Jugador;
import vista.VistaHistorico;

/**
 *
 * @author HP USER
 */
public class ControladorHistorico {

    /**
     * sentencias SQL.
     */
    private static final String SQL_SELECT = "SELECT id_historico, id_jugador FROM historico";
    private static final String SQL_SELECT_JUGADOR = "SELECT nombre, puntaje FROM jugador WHERE id_jugador=?";
    private static final String SQL_INSERT = "INSERT  INTO historico(id_jugador) VALUES(?)";


    /**
     * Instancias 
     */
    private VistaHistorico vistaHistorico;
    private DefaultTableModel defaultTableModel;

    /**
     * constructor vacio
     */
    public ControladorHistorico() {
    }

    /**
     * constructor
     * @param vistaHistorico 
     */
    public ControladorHistorico(VistaHistorico vistaHistorico) {
        this.vistaHistorico = vistaHistorico;
        this.vistaHistorico.setVisible(true);
        //actualizarTabla();
    }

    /**
     * metodo para actualizar la tabla de historicos
     */
    public void actualizarTabla() {
        Connection conn = null;
        PreparedStatement stmt = null;
        PreparedStatement stmt2 = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        String[] titulos = new String[]{"Nombre", "Puntaje"};
        defaultTableModel = new DefaultTableModel(titulos, 0);
        boolean registroVacio = true;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            stmt2 = conn.prepareStatement(SQL_SELECT_JUGADOR);
            rs = stmt.executeQuery();

            while (rs.next()) {
                registroVacio = false;
                int idJugador = rs.getInt("id_jugador");
                stmt2.setInt(1, idJugador);
                rs2 = stmt2.executeQuery();
                while (rs2.next()) {
                    String nombre = rs2.getString("nombre");
                    int puntaje = rs2.getInt("puntaje");
                    defaultTableModel.addRow(new Object[]{nombre, puntaje});
                }
            }

            vistaHistorico.getTablaHistorico().setModel(defaultTableModel);
            vistaHistorico.getTablaHistorico().setPreferredSize(new Dimension(350, defaultTableModel.getRowCount() * 16));

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(rs);
                if(!registroVacio){
                    Conexion.close(rs2);
                    Conexion.close(stmt2);
                }                
                Conexion.close(stmt);                
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
                //System.out.println("ocurrio un erros");
            }
        }

    }

    /**
     * metodo para insertar historico
     * @param jugador 
     */
    public void insertarHistorico(Jugador jugador) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, jugador.getIdJugador());
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
}
