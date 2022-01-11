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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Historico;
import modelo.Jugador;
import vista.VistaHistorico;

/**
 *
 * @author HP USER
 */
public class ControladorHistorico {

    private static final String SQL_SELECT = "SELECT id_historico, id_jugador FROM historico";
    private static final String SQL_SELECT_JUGADOR = "SELECT nombre, puntaje FROM jugador WHERE id_jugador=?";
    private static final String SQL_INSERT = "INSERT  INTO historico(id_jugador) VALUES(?)";
    private static final String SQL_UPDATE = "UPDATE persona SET NOMBRE =?, APELLIDO=?, EMAIL=?, TELEFONO=? WHERE ID_PERSONA=?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";

    private VistaHistorico vistaHistorico;
    private DefaultTableModel defaultTableModel;

    public ControladorHistorico() {
    }

    public ControladorHistorico(VistaHistorico vistaHistorico) {
        this.vistaHistorico = vistaHistorico;
        this.vistaHistorico.setVisible(true);
        actualizarTabla();
    }

    private void actualizarTabla() {
        Connection conn = null;
        PreparedStatement stmt = null;
        PreparedStatement stmt2 = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        String[] titulos = new String[]{"Nombre", "Puntaje"};
        defaultTableModel = new DefaultTableModel(titulos, 0);

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            stmt2 = conn.prepareStatement(SQL_SELECT_JUGADOR);
            rs = stmt.executeQuery();

            while (rs.next()) {
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
                Conexion.close(rs2);
                Conexion.close(stmt);
                Conexion.close(stmt2);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

    }

    private void insertarHistorico(Jugador jugador) {
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
