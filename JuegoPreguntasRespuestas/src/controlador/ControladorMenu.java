/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.*;

/**
 *
 * @author Camila Morales
 */
public class ControladorMenu implements ActionListener {
    
    /**
     * instacia de la clase VistaMenuPrincipal.
     */
    private VistaMenuPrincipal vista;

    public ControladorMenu(VistaMenuPrincipal vista) {
        this.vista = vista;
        vista.setVisible(true);
        agregarEventos();
    }
    
    private void agregarEventos(){
        this.vista.getBtnJugar().addActionListener(this);
        this.vista.getBtnHistorico().addActionListener(this);
        this.vista.getBtnInstrucciones().addActionListener(this);
    }
    
    private void iniciarJuego(){ 
        VistaPreguntaRespuesta vistaPR = new VistaPreguntaRespuesta();
        ControladorPregunta ctrlPregunta = new ControladorPregunta(vistaPR);
       // vista.setVisible(false);
        
    }
    
    private void iniciarVentanaHistorico(){
        VistaHistorico vistaHistorico = new VistaHistorico();
        ControladorHistorico ctrlHistorico = new ControladorHistorico(vistaHistorico);
        ctrlHistorico.actualizarTabla();
    }
    
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        
        if(actionEvent.getSource() == vista.getBtnJugar()){
            iniciarJuego();
            
        }
        if(actionEvent.getSource() == vista.getBtnHistorico()){
            iniciarVentanaHistorico();
          
        }
        if(actionEvent.getSource() == vista.getBtnInstrucciones()){
            
        }
    }
    
}
