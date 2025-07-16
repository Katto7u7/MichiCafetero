
package Editores;

import clases.Provedor;
import conexiones.ProvedorConexion;
import javax.swing.JOptionPane;


public class edtProvedor extends javax.swing.JFrame {

    Provedor p= new Provedor();
    ProvedorConexion pX = new ProvedorConexion();
    
    static String NombreEv;
    public edtProvedor() {
        this.setLocationRelativeTo(this);
        initComponents();
    }
    
    public void recibirObj(Object[] ObjetoRecibido, String NombreEvento) {

        btnActualizar.setText(NombreEvento);
        lblTitulo.setText(NombreEvento);

        lblID.setText(ObjetoRecibido[0].toString());
        lblNombre.setText(ObjetoRecibido[1].toString());

        tfID.setText(ObjetoRecibido[0].toString());
        tfNombre.setText(ObjetoRecibido[1].toString());

        if (NombreEvento == "Guardar") {
            lblTitulo.setText("Ingrese datos del Proveedor");
            // AddTextField(ObjetoRecibido);
            NombreEv = NombreEvento;
        }
        if (NombreEvento == "Actualizar") {
            lblTitulo.setText("Nuevos datos del Proveedor");
            
        }

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fondosGradienteMinis1 = new paneles.FondosGradienteMinis();
        jLabel1 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        tfNombre = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        panelBtn11 = new paneles.PanelBtn1();
        btnActualizar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Mono", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 52, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos");

        lblID.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblID.setForeground(new java.awt.Color(94, 52, 12));
        lblID.setText("ID");

        jSeparator1.setForeground(new java.awt.Color(94, 52, 12));

        lblNombre.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(94, 52, 12));
        lblNombre.setText("Proveedor");

        jSeparator2.setForeground(new java.awt.Color(94, 52, 12));

        javax.swing.GroupLayout fondosGradienteMinis1Layout = new javax.swing.GroupLayout(fondosGradienteMinis1);
        fondosGradienteMinis1.setLayout(fondosGradienteMinis1Layout);
        fondosGradienteMinis1Layout.setHorizontalGroup(
            fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondosGradienteMinis1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(fondosGradienteMinis1Layout.createSequentialGroup()
                        .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)))
        );
        fondosGradienteMinis1Layout.setVerticalGroup(
            fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondosGradienteMinis1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitulo.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(94, 52, 12));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Datos del proveedor");

        tfID.setEditable(false);
        tfID.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        tfID.setForeground(new java.awt.Color(94, 52, 12));
        tfID.setText("ID");
        tfID.setBorder(null);

        tfNombre.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        tfNombre.setForeground(new java.awt.Color(94, 52, 12));
        tfNombre.setText("Proveedor");
        tfNombre.setBorder(null);

        btnActualizar.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(94, 52, 12));
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnActualizar.setText("Actualizar");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn11Layout = new javax.swing.GroupLayout(panelBtn11);
        panelBtn11.setLayout(panelBtn11Layout);
        panelBtn11Layout.setHorizontalGroup(
            panelBtn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn11Layout.setVerticalGroup(
            panelBtn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCancelar.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(94, 52, 12));
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 52, 12)));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(fondosGradienteMinis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondosGradienteMinis1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBtn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
       this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        if (NombreEv == "Guardar") {
            if (!"".equals(tfID.getText())
                    || !"".equals(tfNombre.getText())) {

                
                p.setIDPROV(tfID.getText());
                p.setPROV(tfNombre.getText());
                
                pX.RegistrarProvedor(p);
                
                 
                JOptionPane.showMessageDialog(null, "Accion realizada, Nuevo Proveedor registrado!!");

            } else {
                JOptionPane.showMessageDialog(null, "ERROR!!!\n Los campos no pueden estar vacios");
            }
        }
        
        
        
        if(NombreEv == "Actualizar"){
            if (!"".equals(tfID.getText())
                    || !"".equals(tfNombre.getText())) {

                
                p.setIDPROV(tfID.getText());
                p.setPROV(tfNombre.getText());
                
                pX.ModificarProvedor(p);
                
                 
                JOptionPane.showMessageDialog(null, "Accion realizada, proveedor Actualizado!!");

            } else {
                JOptionPane.showMessageDialog(null, "ERROR!!!\n Los campos no pueden estar vacios");
            } 
        }
        this.dispose();
    }//GEN-LAST:event_btnActualizarMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnActualizar;
    private javax.swing.JLabel btnCancelar;
    private paneles.FondosGradienteMinis fondosGradienteMinis1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private paneles.PanelBtn1 panelBtn11;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
