/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author HP USER
 */
public class VistaPreguntaRespuesta extends javax.swing.JFrame {

    /**
     * Creates new form VistaPreguntaRespuesta
     */
    public VistaPreguntaRespuesta() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.setSize(1000, 500);
        this.setLocationRelativeTo(null);
        this.setTitle("Preguntas");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombreJugador = new javax.swing.JTextField();
        btnJugar = new javax.swing.JButton();
        panelPreguntas = new javax.swing.JPanel();
        lblPregunta = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnRespuesta1 = new javax.swing.JButton();
        btnRespuesta2 = new javax.swing.JButton();
        btnRespuesta3 = new javax.swing.JButton();
        btnRespuesta4 = new javax.swing.JButton();
        panelRondaPuntaje = new javax.swing.JPanel();
        txtPuntaje = new javax.swing.JTextField();
        txtRonda = new javax.swing.JTextField();
        lblRonda = new javax.swing.JLabel();
        lblPuntaje = new javax.swing.JLabel();
        panelGanarPerder = new javax.swing.JPanel();
        lblTituloGanarPerder = new javax.swing.JLabel();
        btnSiguientePregunta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 500));
        getContentPane().setLayout(null);

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.setPreferredSize(new java.awt.Dimension(1000, 500));

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("¿Cuál es tu nombre?");

        txtNombreJugador.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        btnJugar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnJugar.setText("Jugar");

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(txtNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(462, 462, 462)
                        .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(334, Short.MAX_VALUE))
            .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        getContentPane().add(panelLogin);
        panelLogin.setBounds(0, 0, 1000, 500);

        panelPreguntas.setBackground(new java.awt.Color(255, 255, 255));

        lblPregunta.setBackground(new java.awt.Color(255, 255, 255));
        lblPregunta.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPregunta.setOpaque(true);

        btnRespuesta1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnRespuesta2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnRespuesta3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnRespuesta4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        panelRondaPuntaje.setBackground(new java.awt.Color(255, 255, 255));

        txtPuntaje.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtPuntaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPuntaje.setFocusable(false);

        txtRonda.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtRonda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRonda.setFocusable(false);

        lblRonda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRonda.setText("Ronda #");

        lblPuntaje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPuntaje.setText("Puntaje");

        javax.swing.GroupLayout panelRondaPuntajeLayout = new javax.swing.GroupLayout(panelRondaPuntaje);
        panelRondaPuntaje.setLayout(panelRondaPuntajeLayout);
        panelRondaPuntajeLayout.setHorizontalGroup(
            panelRondaPuntajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRondaPuntajeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRonda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPuntaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        panelRondaPuntajeLayout.setVerticalGroup(
            panelRondaPuntajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRondaPuntajeLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(panelRondaPuntajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRonda)
                    .addComponent(lblPuntaje)
                    .addComponent(txtPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRonda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout panelPreguntasLayout = new javax.swing.GroupLayout(panelPreguntas);
        panelPreguntas.setLayout(panelPreguntasLayout);
        panelPreguntasLayout.setHorizontalGroup(
            panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPreguntasLayout.createSequentialGroup()
                .addGroup(panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPreguntasLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(panelRondaPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPreguntasLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPreguntasLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRespuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRespuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRespuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPreguntasLayout.setVerticalGroup(
            panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPreguntasLayout.createSequentialGroup()
                .addComponent(panelRondaPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRespuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRespuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(panelPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRespuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        getContentPane().add(panelPreguntas);
        panelPreguntas.setBounds(0, 0, 1258, 500);

        panelGanarPerder.setBackground(new java.awt.Color(255, 255, 255));

        lblTituloGanarPerder.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTituloGanarPerder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnSiguientePregunta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSiguientePregunta.setText("Siguiente pregunta");

        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalir.setText("Salir");

        javax.swing.GroupLayout panelGanarPerderLayout = new javax.swing.GroupLayout(panelGanarPerder);
        panelGanarPerder.setLayout(panelGanarPerderLayout);
        panelGanarPerderLayout.setHorizontalGroup(
            panelGanarPerderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTituloGanarPerder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelGanarPerderLayout.createSequentialGroup()
                .addGap(398, 398, 398)
                .addGroup(panelGanarPerderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSiguientePregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(408, Short.MAX_VALUE))
        );
        panelGanarPerderLayout.setVerticalGroup(
            panelGanarPerderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGanarPerderLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblTituloGanarPerder, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(btnSiguientePregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );

        getContentPane().add(panelGanarPerder);
        panelGanarPerder.setBounds(0, 0, 1000, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPreguntaRespuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPreguntaRespuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPreguntaRespuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPreguntaRespuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPreguntaRespuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnRespuesta1;
    private javax.swing.JButton btnRespuesta2;
    private javax.swing.JButton btnRespuesta3;
    private javax.swing.JButton btnRespuesta4;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSiguientePregunta;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblPuntaje;
    private javax.swing.JLabel lblRonda;
    private javax.swing.JLabel lblTituloGanarPerder;
    private javax.swing.JPanel panelGanarPerder;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelPreguntas;
    private javax.swing.JPanel panelRondaPuntaje;
    private javax.swing.JTextField txtNombreJugador;
    private javax.swing.JTextField txtPuntaje;
    private javax.swing.JTextField txtRonda;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnRespuesta1() {
        return btnRespuesta1;
    }

    public void setBtnRespuesta1(JButton btnRespuesta1) {
        this.btnRespuesta1 = btnRespuesta1;
    }

    public JButton getBtnRespuesta2() {
        return btnRespuesta2;
    }

    public void setBtnRespuesta2(JButton btnRespuesta2) {
        this.btnRespuesta2 = btnRespuesta2;
    }

    public JButton getBtnRespuesta3() {
        return btnRespuesta3;
    }

    public void setBtnRespuesta3(JButton btnRespuesta3) {
        this.btnRespuesta3 = btnRespuesta3;
    }

    public JButton getBtnRespuesta4() {
        return btnRespuesta4;
    }

    public void setBtnRespuesta4(JButton btnRespuesta4) {
        this.btnRespuesta4 = btnRespuesta4;
    }

    public JLabel getLblPregunta() {
        return lblPregunta;
    }

    public void setLblPregunta(JLabel lblPregunta) {
        this.lblPregunta = lblPregunta;
    }

    public JPanel getPanelLogin() {
        return panelLogin;
    }

    public void setPanelLogin(JPanel panelLogin) {
        this.panelLogin = panelLogin;
    }

    public JPanel getPanelPreguntas() {
        return panelPreguntas;
    }

    public void setPanelPreguntas(JPanel panelPreguntas) {
        this.panelPreguntas = panelPreguntas;
    }

    public JTextField getTxtNombreJugador() {
        return txtNombreJugador;
    }

    public void setTxtNombreJugador(JTextField txtNombreJugador) {
        this.txtNombreJugador = txtNombreJugador;
    }

    public JTextField getTxtPuntaje() {
        return txtPuntaje;
    }

    public void setTxtPuntaje(JTextField txtPuntaje) {
        this.txtPuntaje = txtPuntaje;
    }

    public JTextField getTxtRonda() {
        return txtRonda;
    }

    public void setTxtRonda(JTextField txtRonda) {
        this.txtRonda = txtRonda;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JLabel getLblPuntaje() {
        return lblPuntaje;
    }

    public void setLblPuntaje(JLabel lblPuntaje) {
        this.lblPuntaje = lblPuntaje;
    }

    public JLabel getLblRonda() {
        return lblRonda;
    }

    public void setLblRonda(JLabel lblRonda) {
        this.lblRonda = lblRonda;
    }

    public JButton getBtnJugar() {
        return btnJugar;
    }

    public void setBtnJugar(JButton btnJugar) {
        this.btnJugar = btnJugar;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JButton getBtnSiguientePregunta() {
        return btnSiguientePregunta;
    }

    public void setBtnSiguientePregunta(JButton btnSiguientePregunta) {
        this.btnSiguientePregunta = btnSiguientePregunta;
    }

    public JLabel getLblTituloGanarPerder() {
        return lblTituloGanarPerder;
    }

    public void setLblTituloGanarPerder(JLabel lblTituloGanarPerder) {
        this.lblTituloGanarPerder = lblTituloGanarPerder;
    }

    public JPanel getPanelGanarPerder() {
        return panelGanarPerder;
    }

    public void setPanelGanarPerder(JPanel panelGanarPerder) {
        this.panelGanarPerder = panelGanarPerder;
    }

    public JPanel getPanelRondaPuntaje() {
        return panelRondaPuntaje;
    }

    public void setPanelRondaPuntaje(JPanel panelRondaPuntaje) {
        this.panelRondaPuntaje = panelRondaPuntaje;
    }

    
    
    

}
