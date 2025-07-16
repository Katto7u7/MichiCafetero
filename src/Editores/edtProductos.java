
package Editores;

import clases.Productos;
import conexiones.ProductoConexion;
import javax.swing.JOptionPane;


public class edtProductos extends javax.swing.JFrame {

    Productos pro = new Productos();
    ProductoConexion proX = new ProductoConexion();
    static String NombreEv;

    public edtProductos() {
        initComponents();
        this.setLocationRelativeTo(this);
        proX.ConsultarClasProd(ComboBoxClas);
    }

    public void recibirObj(Object[] ObjetoRecibido, String NombreEvento) {

        btnActualizar.setText(NombreEvento);
        lblTitulo.setText(NombreEvento);

        lblID.setText(ObjetoRecibido[0].toString());
        lblNombre.setText(ObjetoRecibido[1].toString());
        lblPrecio.setText(ObjetoRecibido[2].toString());
        lblPres.setText(ObjetoRecibido[3].toString());
        lblCalorias.setText(ObjetoRecibido[4].toString());
        lblDesc.setText(ObjetoRecibido[5].toString());
        lblClas.setText(ObjetoRecibido[6].toString());
        

        tfID.setText(ObjetoRecibido[0].toString());
        tfNombre.setText(ObjetoRecibido[1].toString());
        tfPrecio.setText(ObjetoRecibido[2].toString());
        tfPres.setText(ObjetoRecibido[3].toString());
        tfCal.setText(ObjetoRecibido[4].toString());
        tfDesc.setText(ObjetoRecibido[5].toString());
        //tfClas.setText(ObjetoRecibido[6].toString());
        tfStock.setText(ObjetoRecibido[7].toString());
        

        if (NombreEvento == "Guardar") {
            lblTitulo.setText("Ingrese datos del Producto");
            // AddTextField(ObjetoRecibido);
            NombreEv = NombreEvento;
        }
        if (NombreEvento == "Actualizar") {
            lblTitulo.setText("Nuevos datos del prducto");
            // EdtTextField(ObjetoRecibido);
            NombreEv = NombreEvento;
            //String cargo = proX.BuscarCargoRe(ObjetoRecibido[3].toString());
            String hora = proX.BuscarClas(ObjetoRecibido[6].toString());
            
            //ComboBoxPres.setSelectedItem(cargo);
            ComboBoxClas.setSelectedItem(hora);
            
        }

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fondosGradienteMinis2 = new paneles.FondosGradienteMinis();
        jLabel1 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblPrecio = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblPres = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblCalorias = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lblDesc = new javax.swing.JLabel();
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
        jSeparator11 = new javax.swing.JSeparator();
        tfCal = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        tfDesc = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        panelBtn11 = new paneles.PanelBtn1();
        btnActualizar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ComboBoxClas = new javax.swing.JComboBox<>();
        tfPres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfStock = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 52, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos del producto");

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

        lblPres.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        lblPres.setForeground(new java.awt.Color(94, 52, 12));
        lblPres.setText("Presentación");

        jSeparator4.setForeground(new java.awt.Color(94, 52, 12));

        lblCalorias.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        lblCalorias.setForeground(new java.awt.Color(94, 52, 12));
        lblCalorias.setText("Calorias");

        jSeparator5.setForeground(new java.awt.Color(94, 52, 12));

        lblDesc.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        lblDesc.setForeground(new java.awt.Color(94, 52, 12));
        lblDesc.setText("Descripcción");

        jSeparator6.setForeground(new java.awt.Color(94, 52, 12));

        lblClas.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        lblClas.setForeground(new java.awt.Color(94, 52, 12));
        lblClas.setText("Clasificación");

        jSeparator7.setForeground(new java.awt.Color(94, 52, 12));

        javax.swing.GroupLayout fondosGradienteMinis2Layout = new javax.swing.GroupLayout(fondosGradienteMinis2);
        fondosGradienteMinis2.setLayout(fondosGradienteMinis2Layout);
        fondosGradienteMinis2Layout.setHorizontalGroup(
            fondosGradienteMinis2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondosGradienteMinis2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondosGradienteMinis2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondosGradienteMinis2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(fondosGradienteMinis2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCalorias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDesc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblClas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        fondosGradienteMinis2Layout.setVerticalGroup(
            fondosGradienteMinis2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondosGradienteMinis2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPres, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitulo.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(94, 52, 12));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Ingrese datos");

        tfID.setEditable(false);
        tfID.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        tfID.setForeground(new java.awt.Color(94, 52, 12));
        tfID.setText("ID");
        tfID.setBorder(null);

        tfNombre.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        tfNombre.setForeground(new java.awt.Color(94, 52, 12));
        tfNombre.setText("ID");
        tfNombre.setBorder(null);

        tfPrecio.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        tfPrecio.setForeground(new java.awt.Color(94, 52, 12));
        tfPrecio.setText("ID");
        tfPrecio.setBorder(null);

        tfCal.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        tfCal.setForeground(new java.awt.Color(94, 52, 12));
        tfCal.setText("ID");
        tfCal.setBorder(null);

        tfDesc.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        tfDesc.setForeground(new java.awt.Color(94, 52, 12));
        tfDesc.setText("ID");
        tfDesc.setBorder(null);

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

        jLabel10.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(94, 52, 12));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cancelar");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 52, 12)));
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        ComboBoxClas.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        ComboBoxClas.setForeground(new java.awt.Color(94, 52, 12));

        tfPres.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        tfPres.setForeground(new java.awt.Color(94, 52, 12));
        tfPres.setText("Presentacion");
        tfPres.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(94, 52, 12));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Stock:");

        tfStock.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        tfStock.setForeground(new java.awt.Color(94, 52, 12));
        tfStock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfStock.setText("0");
        tfStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 52, 12)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(fondosGradienteMinis2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPres)
                            .addComponent(jSeparator9)
                            .addComponent(tfNombre)
                            .addComponent(jSeparator8)
                            .addComponent(tfID)
                            .addComponent(jSeparator10)
                            .addComponent(tfPrecio)
                            .addComponent(jSeparator11)
                            .addComponent(jSeparator12)
                            .addComponent(tfCal)
                            .addComponent(jSeparator13)
                            .addComponent(tfDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator14)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ComboBoxClas, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfStock)))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondosGradienteMinis2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPres, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboBoxClas, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfStock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBtn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
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

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
       this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
       if (NombreEv == "Guardar"){
            if (!"".equals(tfID.getText()) ||
                !"".equals(tfNombre.getText()) ||
                !"".equals(tfPrecio.getText()) ||
                !"".equals(tfCal.getText()) ||
                !"".equals(tfDesc.getText())   
                ) {
               
                
               // String Pres;
               // Pres=ComboBoxPres.getSelectedItem().toString().substring(0,2);
                //System.out.println(Carguito);
                
                String clas=ComboBoxClas.getSelectedItem().toString().substring(0,3);
                
                
               
                pro.setID(tfID.getText());
                pro.setNOMBRE(tfNombre.getText());
                float prec = Float.parseFloat(tfPrecio.getText());
                pro.setPRECIO(prec);
                pro.setPRESENTACION(tfPres.getText());
                int cal= Integer.parseInt(tfCal.getText());
                pro.setCALORIAS(cal);
                pro.setDESCRIPCCION(tfDesc.getText());
                pro.setCLASIFICACION(clas);
                int stock = Integer.parseInt(tfStock.getText());
                pro.setSTOCK(stock);///**SE AGREGÓ STOCK 15/12/2022
                
                proX.RegistrarProducto(pro);
                
                
                
                JOptionPane.showMessageDialog(null, "Accion realizada, Nuevo producto registrado!!");
                
                
            } else {
                JOptionPane.showMessageDialog(null, "ERROR!!!\n Los campos no pueden estar vacios");
            }
            
            
        }
        
        
        
        if(NombreEv == "Actualizar"){
            if (!"".equals(tfID.getText()) ||
                !"".equals(tfNombre.getText()) ||
                !"".equals(tfPrecio.getText()) ||
                !"".equals(tfCal.getText()) ||
                !"".equals(tfDesc.getText())   
                ) {
               
                
                
                
                String clas=ComboBoxClas.getSelectedItem().toString().substring(0,3);
                
                
                pro.setID(tfID.getText());
                pro.setNOMBRE(tfNombre.getText());
                float prec = Float.parseFloat(tfPrecio.getText());
                pro.setPRECIO(prec);
                pro.setPRESENTACION(tfPres.getText());
                int cal= Integer.parseInt(tfCal.getText());
                //System.out.println(cal);
                pro.setCALORIAS(cal);
                pro.setDESCRIPCCION(tfDesc.getText());
                pro.setCLASIFICACION(clas);
                int stock = Integer.parseInt(tfStock.getText());
                pro.setSTOCK(stock);///**SE AGREGÓ STOCK 15/12/2022
                
                proX.ModificarProducto(pro);
                
                
                JOptionPane.showMessageDialog(null, "Accion realizada, Producto Actualizado!!");
                
                
            } else {
                JOptionPane.showMessageDialog(null, "ERROR!!!\n Los campos no pueden estar vacios");
            }
            
            
            
        }
        
        
        
        this.dispose();
    }//GEN-LAST:event_btnActualizarMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxClas;
    private javax.swing.JLabel btnActualizar;
    private paneles.FondosGradienteMinis fondosGradienteMinis2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel lblCalorias;
    private javax.swing.JLabel lblClas;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPres;
    private javax.swing.JLabel lblTitulo;
    private paneles.PanelBtn1 panelBtn11;
    private javax.swing.JTextField tfCal;
    private javax.swing.JTextField tfDesc;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPrecio;
    private javax.swing.JTextField tfPres;
    private javax.swing.JTextField tfStock;
    // End of variables declaration//GEN-END:variables
}
