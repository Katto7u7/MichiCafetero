
package com.michicafetero;

import eventos.EventMenuSelected;
import java.awt.Color;
import javax.swing.JComponent;
import paneles.*;


public class InterfazCafe extends javax.swing.JFrame {

   
    public InterfazCafe() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        panelMenu1.initMoving(InterfazCafe.this);
       // header2.setVisible(false);
        init();
        //SE NECESITAN DECLARAR PARA NO MANDAR A LLAMAR UNO NUEVO CADA QUE SE HACE EL CAMBIO ENTRE PANELES
        JComponent formClientes = new form_clientes();
        JComponent formNumCon = new form_NumContacto();
        JComponent formProductos = new form_Productos();
        JComponent formProvedor = new form_Provedor();
        JComponent formVentas = new form_Ventas();
        JComponent formDireccion = new form_direccion();
        JComponent formMatPrima = new form_materiaPrima();
        JComponent formEmpleados = new form_home();
        JComponent formEmp = new form_Empleados();
        JComponent main = new Form1();
        JComponent NuevaVenta = new form_NuevaVenta();
        JComponent RegistroNuevaVenta = new form_registrarVentas();
        panelMenu1.addEventMenuSelected(new EventMenuSelected(){
            @Override
            public void selected(int index){
                switch(index){
                    case 0:
                        setForm(RegistroNuevaVenta);
                    break;
                    case 1:
                        setForm(formEmp);
                    break;
                    case 2:
                        setForm(new form_clientes());
                    break;
                    case 3:
                        setForm(formVentas);
                    break;
                    case 4:
                        setForm(formProductos);
                    break;
                    case 5:
                        setForm(formMatPrima);
                    break;
                    case 8:
                        setForm(formProvedor);
                    break;
                    case 9:
                        setForm(formDireccion);
                    break;
                    case 10:
                        setForm(formNumCon);
                    break;
                    case 11:
                        setForm(main);
                    break;
                    
                }
                /*if (index == 0) {
                   setForm(new form_home());
                } else if (index == 1) {
                    setForm(new MainForm());
                } else if (index == 2) {
                    setForm(new Form1());
                }
                */
            }
        });
        setForm(new form_home());
    }
    
    private void  setForm(JComponent com){
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    private void init(){
        
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new paneles.PanelBorder();
        panelMenu1 = new paneles.PanelMenu();
        lblCerrarIC = new javax.swing.JLabel();
        lblminIC = new javax.swing.JLabel();
        header2 = new paneles.header();
        panelAvatar1 = new paneles.PanelAvatar();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(245, 233, 204));

        lblCerrarIC.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        lblCerrarIC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrarIC.setText("X");
        lblCerrarIC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrarIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarICMouseClicked(evt);
            }
        });

        lblminIC.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        lblminIC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblminIC.setText("-");
        lblminIC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblminIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminICMouseClicked(evt);
            }
        });

        header2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(panelMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(header2, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblminIC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCerrarIC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCerrarIC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblminIC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelAvatar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(header2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(608, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblminICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminICMouseClicked

        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblminICMouseClicked

    private void lblCerrarICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarICMouseClicked

        System.exit(0);
    }//GEN-LAST:event_lblCerrarICMouseClicked

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
            java.util.logging.Logger.getLogger(InterfazCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCafe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private paneles.header header2;
    private javax.swing.JLabel lblCerrarIC;
    private javax.swing.JLabel lblminIC;
    private javax.swing.JPanel mainPanel;
    private paneles.PanelAvatar panelAvatar1;
    private paneles.PanelBorder panelBorder1;
    private paneles.PanelMenu panelMenu1;
    // End of variables declaration//GEN-END:variables
}
