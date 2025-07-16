
package com.michicafetero;

import clases.Login;
import conexiones.LoginConexion;
import java.awt.Color;
import java.awt.Image;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import paneles.PanelAvatar;

public class MichiCafeteroLogin extends javax.swing.JFrame {

    Login lg = new Login();
    LoginConexion lgX = new LoginConexion();

    int xMouse, yMouse;

    public MichiCafeteroLogin() {
        initComponents();
        this.setLocationRelativeTo(this);

        //SetImageLabel(btn_iniciar1,"img/Captura1.png");
    }

    public void Validar() {
        String user = User_Login.getText();
        String pass = String.valueOf(Password_Login.getPassword());
        if (!"".equals(user) || !"".equals(pass)) {

            lg = lgX.log(user, pass);
            if (lg.getUser() != null && lg.getPass() != null) {
                InterfazCafe ic = new InterfazCafe();
                ic.setVisible(true);
                PanelAvatar pa=new PanelAvatar();
                pa.Iniciar(user, "---");
                this.dispose();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_minimizar = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JLabel();
        btn_iniciar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        registroLogin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        User_Login = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Password_Login = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        panelBackground.setBackground(new java.awt.Color(255, 255, 255));
        panelBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelBackground.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        panelBackground.setEnabled(false);
        panelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/El michi Caffetero3-1.png"))); // NOI18N
        panelBackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, 80));

        btn_minimizar.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
        btn_minimizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_minimizar.setText("-");
        btn_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minimizarMouseClicked(evt);
            }
        });
        panelBackground.add(btn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 40, 40));

        btn_cerrar.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        btn_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cerrar.setText("X");
        btn_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cerrar.setFocusable(false);
        btn_cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btn_cerrarMouseDragged(evt);
            }
        });
        btn_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cerrarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_cerrarMousePressed(evt);
            }
        });
        panelBackground.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 40, 40));

        btn_iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_iniciarHOVER.png"))); // NOI18N
        btn_iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iniciarMouseClicked(evt);
            }
        });
        panelBackground.add(btn_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 180, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/a.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(490, 500));
        panelBackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 440, 500));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(150, 97, 56));
        jLabel3.setText("INICIAR SESIÓN");
        panelBackground.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 300, 50));

        registroLogin.setFont(new java.awt.Font("Roboto Mono", 0, 12)); // NOI18N
        registroLogin.setForeground(new java.awt.Color(150, 97, 56));
        registroLogin.setText("Registro");
        registroLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registroLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registroLoginMouseClicked(evt);
            }
        });
        panelBackground.add(registroLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Mono", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(150, 97, 56));
        jLabel4.setText("No tiene cuenta?");
        panelBackground.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(150, 97, 56));
        jLabel5.setText("Contraseña");
        panelBackground.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 100, 30));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(150, 97, 56));
        jLabel6.setText("Usuario");
        panelBackground.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 70, 30));

        User_Login.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        User_Login.setForeground(new java.awt.Color(204, 204, 204));
        User_Login.setText("Ingrese su usuario");
        User_Login.setBorder(null);
        User_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        User_Login.setOpaque(true);
        User_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                User_LoginMousePressed(evt);
            }
        });
        User_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_LoginActionPerformed(evt);
            }
        });
        panelBackground.add(User_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 360, 40));
        panelBackground.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 360, 10));
        panelBackground.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 360, 10));

        Password_Login.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Password_Login.setText("jPasswordField1");
        Password_Login.setBorder(null);
        Password_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Password_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Password_LoginMousePressed(evt);
            }
        });
        panelBackground.add(Password_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 360, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void User_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_User_LoginActionPerformed

    private void User_LoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_User_LoginMousePressed
        User_Login.setText("");
        User_Login.setForeground(Color.BLACK);
    }//GEN-LAST:event_User_LoginMousePressed

    private void btn_cerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMousePressed
       
    }//GEN-LAST:event_btn_cerrarMousePressed

    private void btn_cerrarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseDragged
       
    }//GEN-LAST:event_btn_cerrarMouseDragged

    private void btn_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarMouseClicked

    private void btn_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btn_minimizarMouseClicked

    private void btn_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseEntered
        btn_cerrar.setBackground(Color.red);
        btn_cerrar.setForeground(Color.white);
    }//GEN-LAST:event_btn_cerrarMouseEntered

    private void Password_LoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Password_LoginMousePressed
        Password_Login.setText("");
        Password_Login.setForeground(Color.BLACK);
    }//GEN-LAST:event_Password_LoginMousePressed

    private void btn_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciarMouseClicked
        Validar();
        
    }//GEN-LAST:event_btn_iniciarMouseClicked

    private void registroLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroLoginMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Llamar al panel del registro");
    }//GEN-LAST:event_registroLoginMouseClicked

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
            java.util.logging.Logger.getLogger(MichiCafeteroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MichiCafeteroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MichiCafeteroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MichiCafeteroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MichiCafeteroLogin().setVisible(true);
            }
        });
    }
    public void SetImageLabel(JLabel nombreLabel, String rutaImagen){
        ImageIcon imagen = new ImageIcon(rutaImagen);
        Icon icon =  new ImageIcon(imagen.getImage().getScaledInstance(nombreLabel.getWidth(),nombreLabel.getHeight(), Image.SCALE_DEFAULT));        
           nombreLabel.setIcon(icon);
           this.repaint();
           //MichiCafeteroLogin
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password_Login;
    private javax.swing.JTextField User_Login;
    private javax.swing.JLabel btn_cerrar;
    private javax.swing.JLabel btn_iniciar;
    private javax.swing.JLabel btn_minimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JLabel registroLogin;
    // End of variables declaration//GEN-END:variables
}
