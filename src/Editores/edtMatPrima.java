
package Editores;

import clases.MateriaPrima;
import conexiones.MateriaPrimaConexion;
import javax.swing.JOptionPane;

public class edtMatPrima extends javax.swing.JFrame {

    MateriaPrima mp = new MateriaPrima();
    MateriaPrimaConexion mpX=new MateriaPrimaConexion();
    
    Object [] o=new Object[7];
    String NombreEv;
    public edtMatPrima() {
        
        initComponents();
        this.setLocationRelativeTo(this);
        mpX.ConvTipoMatPrima(ComboBoxTipo);
        mpX.ConvClasMatPrima(ComboBoxClas);
    }

    public void recibirObj(Object[] ObjetoRecibido, String NombreEvento) {

        btnActualizar.setText(NombreEvento);
        lblTitulo.setText(NombreEvento);

        lblID.setText(ObjetoRecibido[0].toString());
        lblNombre.setText(ObjetoRecibido[1].toString());
        lblPrecio.setText(ObjetoRecibido[2].toString());
        lblExis.setText(ObjetoRecibido[3].toString());
        lblFecha.setText(ObjetoRecibido[4].toString());
        lblTipo.setText(ObjetoRecibido[5].toString());
        lblClas.setText(ObjetoRecibido[6].toString());
        

        tfID.setText(ObjetoRecibido[0].toString());
        tfNombre.setText(ObjetoRecibido[1].toString());
        tfPrecio.setText(ObjetoRecibido[2].toString());
        tfExis.setText(ObjetoRecibido[3].toString());
        tfFecha.setText(ObjetoRecibido[4].toString());
        //tfTipo.setText(ObjetoRecibido[5].toString());
        //tfClas.setText(ObjetoRecibido[6].toString());
        

        if (NombreEvento == "Guardar") {
            lblTitulo.setText("Ingrese datos del empleado");
            // AddTextField(ObjetoRecibido);
            NombreEv = NombreEvento;
        }
        if (NombreEvento == "Actualizar") {
            lblTitulo.setText("Nuevos datos del empleado");
            // EdtTextField(ObjetoRecibido);
            NombreEv = NombreEvento;
            String tipo = mpX.BuscarTipoMatPrima(ObjetoRecibido[5].toString());
            String clas = mpX.BuscarClasMatPrima(ObjetoRecibido[6].toString());
            
            ComboBoxTipo.setSelectedItem(tipo);
            ComboBoxClas.setSelectedItem(clas);
            
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
        lblPrecio = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblExis = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblFecha = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lblTipo = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        lblClas = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        tfNombre = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        tfPrecio = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        tfExis = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        tfFecha = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        panelBtn11 = new paneles.PanelBtn1();
        btnActualizar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        ComboBoxTipo = new javax.swing.JComboBox<>();
        ComboBoxClas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Mono", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 52, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos ");

        lblID.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(94, 52, 12));
        lblID.setText("ID");

        jSeparator1.setForeground(new java.awt.Color(94, 52, 12));

        lblNombre.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(94, 52, 12));
        lblNombre.setText("Nombre");

        jSeparator2.setForeground(new java.awt.Color(94, 52, 12));

        lblPrecio.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(94, 52, 12));
        lblPrecio.setText("Precio");

        jSeparator3.setForeground(new java.awt.Color(94, 52, 12));

        lblExis.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        lblExis.setForeground(new java.awt.Color(94, 52, 12));
        lblExis.setText("Existencias");

        jSeparator4.setForeground(new java.awt.Color(94, 52, 12));

        lblFecha.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(94, 52, 12));
        lblFecha.setText("Fecha de caduciadad");

        jSeparator5.setForeground(new java.awt.Color(94, 52, 12));

        lblTipo.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(94, 52, 12));
        lblTipo.setText("Tipo");

        jSeparator6.setForeground(new java.awt.Color(94, 52, 12));

        lblClas.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        lblClas.setForeground(new java.awt.Color(94, 52, 12));
        lblClas.setText("Clasificación");

        jSeparator7.setForeground(new java.awt.Color(94, 52, 12));

        javax.swing.GroupLayout fondosGradienteMinis1Layout = new javax.swing.GroupLayout(fondosGradienteMinis1);
        fondosGradienteMinis1.setLayout(fondosGradienteMinis1Layout);
        fondosGradienteMinis1Layout.setHorizontalGroup(
            fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondosGradienteMinis1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondosGradienteMinis1Layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                .addComponent(jSeparator1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblExis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblClas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitulo.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(94, 52, 12));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Nuevos datos");

        tfID.setEditable(false);
        tfID.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        tfID.setForeground(new java.awt.Color(94, 52, 12));
        tfID.setText("ID");
        tfID.setBorder(null);

        tfNombre.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        tfNombre.setForeground(new java.awt.Color(94, 52, 12));
        tfNombre.setText("Nombre");
        tfNombre.setBorder(null);

        tfPrecio.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        tfPrecio.setForeground(new java.awt.Color(94, 52, 12));
        tfPrecio.setText("Precio");
        tfPrecio.setBorder(null);

        tfExis.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        tfExis.setForeground(new java.awt.Color(94, 52, 12));
        tfExis.setText("Existencias");
        tfExis.setBorder(null);

        tfFecha.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        tfFecha.setForeground(new java.awt.Color(94, 52, 12));
        tfFecha.setText("Fecha de caducidad");
        tfFecha.setBorder(null);

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

        ComboBoxTipo.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        ComboBoxTipo.setForeground(new java.awt.Color(94, 52, 12));
        ComboBoxTipo.setBorder(null);

        ComboBoxClas.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        ComboBoxClas.setForeground(new java.awt.Color(94, 52, 12));
        ComboBoxClas.setBorder(null);

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
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboBoxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator9)
                            .addComponent(tfNombre)
                            .addComponent(jSeparator8)
                            .addComponent(tfID)
                            .addComponent(jSeparator10)
                            .addComponent(tfPrecio)
                            .addComponent(jSeparator11)
                            .addComponent(tfExis)
                            .addComponent(jSeparator12)
                            .addComponent(tfFecha)
                            .addComponent(jSeparator13)
                            .addComponent(jSeparator14)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                                .addComponent(panelBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ComboBoxClas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 46, Short.MAX_VALUE)))
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
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfExis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxClas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBtn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
      this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        
        if (NombreEv == "Guardar"){
            if (!"".equals(tfID.getText())
                    || !"".equals(tfNombre.getText())
                    || !"".equals(tfPrecio.getText())
                    || !"".equals(tfExis.getText())
                    || !"".equals(tfFecha.getText())) {
                
                
                String tipo;
                tipo=ComboBoxTipo.getSelectedItem().toString().substring(0,1);
                
                
                String cls=ComboBoxClas.getSelectedItem().toString().substring(0,1);
                int c = Integer.parseInt(cls);
                
                
                mp.setIdMatPrima(tfID.getText());
                mp.setNombreMatP(tfNombre.getText());
                float pre = Float.parseFloat(tfPrecio.getText());
                mp.setPrecio(pre);
                int ex = Integer.parseInt(tfExis.getText());
                mp.setExistencias(ex);
                mp.setFechaCad(tfFecha.getText());
                mp.setTipoMatP(tipo);
                mp.setClasMatP(c);
                
                
                mpX.IngresarMatPrima(mp);
                
                
                
                JOptionPane.showMessageDialog(null, "Accion realizada, Materia prima registrado!!");
                
                
            } else {
                JOptionPane.showMessageDialog(null, "ERROR!!!\n Los campos no pueden estar vacios");
            }
            
            
        }
        
        
        
        if(NombreEv == "Actualizar"){
            if (!"".equals(tfID.getText())
                    || !"".equals(tfNombre.getText())
                    || !"".equals(tfPrecio.getText())
                    || !"".equals(tfExis.getText())
                    || !"".equals(tfFecha.getText())) {
                
                String Tipo;
                Tipo=ComboBoxTipo.getSelectedItem().toString().substring(0,1);
                
                
                String cls=ComboBoxClas.getSelectedItem().toString().substring(0,1);
                int c = Integer.parseInt(cls);
                
                
                
                mp.setIdMatPrima(tfID.getText());
                mp.setNombreMatP(tfNombre.getText());
                float pre = Float.parseFloat(tfPrecio.getText());
                mp.setPrecio(pre);
                int ex = Integer.parseInt(tfExis.getText());
                mp.setExistencias(ex);
                mp.setFechaCad(tfFecha.getText());
                mp.setTipoMatP(Tipo);
                mp.setClasMatP(c);
                
                
                mpX.ModificarMatPrima(mp);
                
                
                
                JOptionPane.showMessageDialog(null, "Accion realizada, Materia Prima Actualizado!!");
                
                
            } else {
                JOptionPane.showMessageDialog(null, "ERROR!!!\n Los campos no pueden estar vacios");
            }
            
            
            
        }
        
        
        
        this.dispose();
    }//GEN-LAST:event_btnActualizarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxClas;
    private javax.swing.JComboBox<String> ComboBoxTipo;
    private javax.swing.JLabel btnActualizar;
    private javax.swing.JLabel btnCancelar;
    private paneles.FondosGradienteMinis fondosGradienteMinis1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblClas;
    private javax.swing.JLabel lblExis;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private paneles.PanelBtn1 panelBtn11;
    private javax.swing.JTextField tfExis;
    private javax.swing.JTextField tfFecha;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPrecio;
    // End of variables declaration//GEN-END:variables
}
