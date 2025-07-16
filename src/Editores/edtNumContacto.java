
package Editores;

import clases.NumContacto;
import conexiones.NumContactoConexion;
import javax.swing.JOptionPane;

public class edtNumContacto extends javax.swing.JFrame {

    NumContacto nc = new NumContacto();
    NumContactoConexion ncX= new NumContactoConexion();
    
    static String NombreEv;
    Object o = new Object[5];
    public edtNumContacto() {
        initComponents();
        this.setLocationRelativeTo(this);
        ncX.ConsultarNumContacto(ComboBoxEm);
    }

    public void recibirObj(Object[] ObjetoRecibido, String NombreEvento) {

        btnActualizar.setText(NombreEvento);
        lblTitulo.setText(NombreEvento);

        lblID.setText(ObjetoRecibido[0].toString());
        lblLada.setText(ObjetoRecibido[1].toString());
        lblTel.setText(ObjetoRecibido[2].toString());
        lblExt.setText(ObjetoRecibido[3].toString());
        lblEm.setText(ObjetoRecibido[4].toString());
        

        tfID.setText(ObjetoRecibido[0].toString());
        tfLada.setText(ObjetoRecibido[1].toString());
        tfTel.setText(ObjetoRecibido[2].toString());
        tfExt.setText(ObjetoRecibido[3].toString());
        

        if (NombreEvento == "Guardar") {
            lblTitulo.setText("Ingrese datos del empleado");
            // AddTextField(ObjetoRecibido);
            NombreEv = NombreEvento;
        }
        if (NombreEvento == "Actualizar") {
            lblTitulo.setText("Nuevos datos del empleado");
            // EdtTextField(ObjetoRecibido);
            NombreEv = NombreEvento;
            String cargo = ncX.BuscarRFCEm(ObjetoRecibido[4].toString());
            
            ComboBoxEm.setSelectedItem(cargo);
            
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
        lblLada = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblTel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblExt = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblEm = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        tfLada = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        tfTel = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        tfExt = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        panelBtn11 = new paneles.PanelBtn1();
        btnActualizar = new javax.swing.JLabel();
        ComboBoxEm = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Mono", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 52, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos");

        lblID.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(94, 52, 12));
        lblID.setText("ID");

        jSeparator1.setForeground(new java.awt.Color(94, 52, 12));

        lblLada.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        lblLada.setForeground(new java.awt.Color(94, 52, 12));
        lblLada.setText("Lada");

        jSeparator2.setForeground(new java.awt.Color(94, 52, 12));

        lblTel.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        lblTel.setForeground(new java.awt.Color(94, 52, 12));
        lblTel.setText("Telefono");

        jSeparator3.setForeground(new java.awt.Color(94, 52, 12));

        lblExt.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        lblExt.setForeground(new java.awt.Color(94, 52, 12));
        lblExt.setText("Extension");

        jSeparator4.setForeground(new java.awt.Color(94, 52, 12));

        lblEm.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        lblEm.setForeground(new java.awt.Color(94, 52, 12));
        lblEm.setText("Empleado");

        jSeparator5.setForeground(new java.awt.Color(94, 52, 12));

        javax.swing.GroupLayout fondosGradienteMinis1Layout = new javax.swing.GroupLayout(fondosGradienteMinis1);
        fondosGradienteMinis1.setLayout(fondosGradienteMinis1Layout);
        fondosGradienteMinis1Layout.setHorizontalGroup(
            fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondosGradienteMinis1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondosGradienteMinis1Layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addGroup(fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addComponent(jSeparator1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblLada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblExt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblEm, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        fondosGradienteMinis1Layout.setVerticalGroup(
            fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondosGradienteMinis1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLada, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitulo.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(94, 52, 12));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Actualizar datos");

        tfID.setEditable(false);
        tfID.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        tfID.setForeground(new java.awt.Color(94, 52, 12));
        tfID.setText("ID");
        tfID.setBorder(null);

        tfLada.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        tfLada.setForeground(new java.awt.Color(94, 52, 12));
        tfLada.setText("Lada");
        tfLada.setBorder(null);

        tfTel.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        tfTel.setForeground(new java.awt.Color(94, 52, 12));
        tfTel.setText("Telefono");
        tfTel.setBorder(null);

        tfExt.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        tfExt.setForeground(new java.awt.Color(94, 52, 12));
        tfExt.setText("Extension");
        tfExt.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(94, 52, 12));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cancelar");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 52, 12)));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(94, 52, 12));
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnActualizar.setText("Actualizar");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        ComboBoxEm.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        ComboBoxEm.setForeground(new java.awt.Color(94, 52, 12));
        ComboBoxEm.setBorder(null);

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfLada, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfTel, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfExt, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ComboBoxEm, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondosGradienteMinis1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfLada, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfExt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxEm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBtn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
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

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        if (NombreEv == "Guardar") {
            if (!"".equals(tfID.getText())
                    || !"".equals(tfLada.getText())
                    || !"".equals(tfTel.getText())
                    || !"".equals(tfExt.getText())) {

                String rfc;
                rfc = ComboBoxEm.getSelectedItem().toString().substring(0, 10);

                
                nc.setID_NUMC(tfID.getText());
                nc.setLADA(tfLada.getText());
                nc.setTEL(tfTel.getText());
                nc.setEXTENSION(tfExt.getText());
                nc.setRFC_EMP(rfc);
                
                ncX.RegistrarNumContacto(nc);
                
                
                 
                JOptionPane.showMessageDialog(null, "Accion realizada, Nuevo empleado registrado!!");

            } else {
                JOptionPane.showMessageDialog(null, "ERROR!!!\n Los campos no pueden estar vacios");
            }

        }

        if (NombreEv == "Actualizar") {
            if (!"".equals(tfID.getText())
                    || !"".equals(tfLada.getText())
                    || !"".equals(tfTel.getText())
                    || !"".equals(tfExt.getText())) {

                String rfc;
                rfc = ComboBoxEm.getSelectedItem().toString().substring(0, 10);

                
                nc.setID_NUMC(tfID.getText());
                nc.setLADA(tfLada.getText());
                nc.setTEL(tfTel.getText());
                nc.setEXTENSION(tfExt.getText());
                nc.setRFC_EMP(rfc);
                
                ncX.ModificarNumContacto(nc);
                
                
                 
                JOptionPane.showMessageDialog(null, "Accion realizada, EmpleadoActualizado!!");

            } else {
                JOptionPane.showMessageDialog(null, "ERROR!!!\n Los campos no pueden estar vacios");
            }

        }

        this.dispose();
    }//GEN-LAST:event_btnActualizarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxEm;
    private javax.swing.JLabel btnActualizar;
    private paneles.FondosGradienteMinis fondosGradienteMinis1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblEm;
    private javax.swing.JLabel lblExt;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLada;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblTitulo;
    private paneles.PanelBtn1 panelBtn11;
    private javax.swing.JTextField tfExt;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfLada;
    private javax.swing.JTextField tfTel;
    // End of variables declaration//GEN-END:variables
}
