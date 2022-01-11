/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc;

import controlador.ControladorMenu;
import vista.VistaFondoPrincipal;
import vista.VistaMenuPrincipal;

/**
 *
 * @author HP USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        VistaFondoPrincipal vistaFondo = new VistaFondoPrincipal();
        vistaFondo.setVisible(true);
        VistaMenuPrincipal vistaMenu = new VistaMenuPrincipal();
        ControladorMenu controladorMenu = new ControladorMenu(vistaMenu);
    }
    
}
