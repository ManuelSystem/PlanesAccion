/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUSINESS.Facade;
import DTO.PersonaDTO;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Braro
 */
public class FormIniciarSesion extends javax.swing.JFrame {
    
    private Facade facade;
    private FormPrincipal principal;
    private PersonaDTO person; //PROFESORA:  OJOOO ESTO ES ERRADO NO SE PUEDE 
            //eSTAS ERRANDO EN LOS CONCEPTOS ENTREGADOS.... SOLO LA VISTA INTERACTUA CON EL 
    //NEGOCIO A TRAVES DE FACADE... PERO NADA DE OBJETOS DEL NEGOCIO
    private FormRecuperarPassword pass;
    private FormAdministrador adm;
    private ArrayList<String> dato;
    private ArrayList<String> roles;
    
    /**
     * Creates new form FormIniciarSesion
     */
    public FormIniciarSesion() {
        super("Iniciar Sesion");
     
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        this.facade = new Facade();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panInicioSesion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panOpciones = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        cmbRol = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        panInicioSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/escudoUdes (1).png"))); // NOI18N
        panInicioSesion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 130, 130));

        panOpciones.setBackground(new java.awt.Color(204, 204, 255));
        panOpciones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/user (1).png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/padlock.png"))); // NOI18N

        txtUsuario.setText("Digite su usuario");
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
        });

        txtPassword.setText("jPasswordField1");
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(0, 51, 255));
        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("INGRESAR");
        btnIngresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setText("¿Olvidaste tu Contraseña?");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panOpcionesLayout = new javax.swing.GroupLayout(panOpciones);
        panOpciones.setLayout(panOpcionesLayout);
        panOpcionesLayout.setHorizontalGroup(
            panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOpcionesLayout.createSequentialGroup()
                .addGroup(panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panOpcionesLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsuario)
                                .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                .addComponent(cmbRol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panOpcionesLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panOpcionesLayout.setVerticalGroup(
            panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOpcionesLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsuario))
                .addGap(30, 30, 30)
                .addGroup(panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        panInicioSesion.add(panOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 290, 330));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/error.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        panInicioSesion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 40, 40));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fondoLogin.jpg"))); // NOI18N
        panInicioSesion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        cmbRol.removeAllItems();
        
        roles = cargarRol();
        
        cmbRol.addItem("Seleccione");
        
        for(String campos : roles) {
        cmbRol.addItem(campos.replace("/", ""));
        }
        
    }//GEN-LAST:event_formWindowActivated

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
            Date date = new Date();
            //obtenerhora y fecha y salida por pantalla con formato:
            DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            System.out.println("Hora y fecha: "+hourdateFormat.format(date)); 
            String fecha=hourdateFormat.format(date);
            String info="Inició sesión";
            
        String usu = txtUsuario.getText();
        String pass = txtPassword.getText();
        String rol = cmbRol.getSelectedItem().toString();
               
        if(usu.isEmpty()){
            JOptionPane.showMessageDialog(null, "Completar el campo de Usuario","Información",JOptionPane.INFORMATION_MESSAGE); 
            return;
        } if(pass.isEmpty()){
            JOptionPane.showMessageDialog(null, "Completar el campo de Contraseña","Información",JOptionPane.INFORMATION_MESSAGE); 
            return;
        } 
                  
            dato=iniciarSesion(usu,pass,rol);
            
            if(dato.isEmpty()){
            JOptionPane.showMessageDialog(null,"El usuario no Existe");
            return;
            }
                
                if(rol.equals("Administrador")){
                    llamarAdministrador();
                    return;
                } 
                    llamarPrincipal();
                    this.dispose();
                   
                        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
        this.pass =new FormRecuperarPassword();
        this.dispose();
        pass.setVisible(true);
        pass.setResizable(false);
        pass.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        txtPassword.setText("");
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        txtUsuario.setText("");
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setForeground(Color.red);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setForeground(Color.black);
    }//GEN-LAST:event_jLabel5MouseExited

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
            java.util.logging.Logger.getLogger(FormIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormIniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panInicioSesion;
    private javax.swing.JPanel panOpciones;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

private ArrayList<String> cargarRol(){
    ArrayList<String> rol;
    rol = facade.cargarRoles();
    return rol;
}

private ArrayList<String> iniciarSesion(String usu, String pass, String rol){
    ArrayList<String> privilegios;
    privilegios = facade.iniciarSesion(usu, pass, rol);
    return privilegios;
}

private void llamarPrincipal(){
    this.principal = new FormPrincipal(dato);
    this.principal.setVisible(true);
    this.principal.setLocationRelativeTo(null);
    this.dispose();
}
private void llamarAdministrador(){
    this.adm = new FormAdministrador(dato);
    this.adm.setVisible(true);
    this.adm.setLocationRelativeTo(null);
    this.dispose();
}


}


