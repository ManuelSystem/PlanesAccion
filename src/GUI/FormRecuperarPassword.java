/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUSINESS.Facade;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Braro
 */
public class FormRecuperarPassword extends javax.swing.JFrame {

    private Facade facade;
    private FormIniciarSesion inicio;
    private String idPersona;

    /**
     * Creates new form FormRecuperarPassword
     */
    public FormRecuperarPassword() {
        initComponents();

        this.facade = new Facade();
        this.inicio = new FormIniciarSesion();

        ventanas.setEnabledAt(1, false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanas = new javax.swing.JTabbedPane();
        panelNumero1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        panelNumero2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtContraseña1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtContraseña2 = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Digíte su único código de");

        jLabel2.setText("1. Digite su codigo de Seguridad unico:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("seguridad para la recuperación:");

        btnVerificar.setText("VERIFICAR");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jLabel3.setText("2. Digite su correo electronico:");

        javax.swing.GroupLayout panelNumero1Layout = new javax.swing.GroupLayout(panelNumero1);
        panelNumero1.setLayout(panelNumero1Layout);
        panelNumero1Layout.setHorizontalGroup(
            panelNumero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNumero1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelNumero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelNumero1Layout.createSequentialGroup()
                        .addGroup(panelNumero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelNumero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelNumero1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(btnVerificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNumero1Layout.setVerticalGroup(
            panelNumero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNumero1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnVerificar)
                .addGap(24, 24, 24))
        );

        ventanas.addTab("PASO #1", panelNumero1);

        jLabel8.setText("Listo, digita una nueva contraseña:");

        jLabel9.setText("Repetir nueva contraseña:");

        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNumero2Layout = new javax.swing.GroupLayout(panelNumero2);
        panelNumero2.setLayout(panelNumero2Layout);
        panelNumero2Layout.setHorizontalGroup(
            panelNumero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNumero2Layout.createSequentialGroup()
                .addGroup(panelNumero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNumero2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelNumero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtContraseña2, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addComponent(txtContraseña1)
                            .addComponent(jLabel8)))
                    .addGroup(panelNumero2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btnAceptar)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panelNumero2Layout.setVerticalGroup(
            panelNumero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNumero2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addComponent(txtContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addGap(30, 30, 30)
                .addComponent(txtContraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnAceptar)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        ventanas.addTab("PASO #2", panelNumero2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanas)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed

        String codigo = txtCodigo.getText();
        String email = txtEmail.getText();

        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completar el campo de codigo", "Información", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completar el campo de correo electronico", "Información", JOptionPane.INFORMATION_MESSAGE);
            return;
        } 

            ArrayList<String> dato;
            dato = validarUsuario(codigo, email);
            String pasar = dato.toString().replace("[", "").replace("]", "");
            
           
            if (pasar.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El usuario no Existe");
                return;
            } 
                
                idPersona = pasar;
                ventanas.setSelectedIndex(1);
                ventanas.setEnabledAt(1, true);
                ventanas.setEnabledAt(0, false);

    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        String pass1 = txtContraseña1.getText();
        String pass2 = txtContraseña2.getText();
        String aux = "";

        if (pass1.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completar el campo de contraseña 1", "Información", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (pass2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completar el campo de contraseña 2", "Información", JOptionPane.INFORMATION_MESSAGE);
            return;
        } 

            if (pass1.length() == pass2.length()) {

                for (int i = 0; i < pass1.length(); i++) {

                    //verificamos si el primer caracter de predeterminada
                    //es igual al primero de entrada
                    if (pass1.charAt(i) == pass2.charAt(i)) {
                        //si es asi guardamos ese concatenamos el caracter a la variable aux
                        aux += pass1.charAt(i);
                    }
                }

                //al finalizar el bucle verificamos si la variable aux es
                //igual a la predeterminada
                if (aux.equals(pass1)) {

                    if (actualizarPassword(idPersona, pass2)) {
                        System.out.println("Actuaización exitossa");
                        //siguiente operacion
                        JOptionPane.showMessageDialog(null, "Su cambio de contraseña a sido exitoso", "Información", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                        inicio.setVisible(true);
                        
                        return;
                    } 
                        System.out.println("Ocurrió un error, intentelo de nuevo");
                    
                    return;

                } 
                    JOptionPane.showMessageDialog(null, "No son iguales las contraseñas introducidas", "Información", JOptionPane.WARNING_MESSAGE);

                return;
            } 
            
                JOptionPane.showMessageDialog(null, "No son iguales las contraseñas introducidas", "Información", JOptionPane.WARNING_MESSAGE);
            
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(FormRecuperarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRecuperarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRecuperarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRecuperarPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRecuperarPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelNumero1;
    private javax.swing.JPanel panelNumero2;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtContraseña1;
    private javax.swing.JTextField txtContraseña2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTabbedPane ventanas;
    // End of variables declaration//GEN-END:variables

    private ArrayList<String> validarUsuario(String codigo, String email) {
        ArrayList<String> validar;
        validar = facade.validarUsuario(codigo, email);
        return validar;
    }

    private boolean actualizarPassword(String id, String pass) {
        return facade.actualizarPassword(id, pass);
    }

}
