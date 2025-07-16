
package Editores;

import clases.Direcciones;
import conexiones.DireccionesConexion;
import javax.swing.JOptionPane;


public class edtDirecciones extends javax.swing.JFrame {

    Direcciones dir = new Direcciones();
    DireccionesConexion dirX = new DireccionesConexion();
    static String NombreEv;
    public edtDirecciones() {
        initComponents();
        this.setLocationRelativeTo(this);
        dirX.ConsultarEstado(ComboBoxEstado);
    }

    public void recibirObj(Object[] ObjetoRecibido, String NombreEvento) {

        btnActualizar.setText(NombreEvento);
        lblTitulo.setText(NombreEvento);

        lblID.setText(ObjetoRecibido[0].toString());
        lblAlca.setText(ObjetoRecibido[1].toString());
        lblCol.setText(ObjetoRecibido[2].toString());
        lblCP.setText(ObjetoRecibido[3].toString());
        lblCalle.setText(ObjetoRecibido[4].toString());
        lblNE.setText(ObjetoRecibido[5].toString());
        lblNI.setText(ObjetoRecibido[6].toString());

        tfID.setText(ObjetoRecibido[0].toString());
        tfAlca.setText(ObjetoRecibido[1].toString());
        tfCol.setText(ObjetoRecibido[2].toString());
        tfCP.setText(ObjetoRecibido[3].toString());
        tfCalle.setText(ObjetoRecibido[4].toString());
        tfNE.setText(ObjetoRecibido[5].toString());
        tfNI.setText(ObjetoRecibido[6].toString());

        if (NombreEvento == "Guardar") {
            lblTitulo.setText("Ingrese datos del empleado");
            // AddTextField(ObjetoRecibido);
            NombreEv = NombreEvento;
        }
        if (NombreEvento == "Actualizar") {
            lblTitulo.setText("Nuevos datos del empleado");
            NombreEv = NombreEvento;
            String estado = dirX.BuscarEstado(ObjetoRecibido[7].toString());
            ComboBoxEstado.setSelectedItem(estado);
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
        lblAlca = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblCol = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblCP = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblCalle = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lblNE = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        lblNI = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lblEstado = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        tfAlca = new javax.swing.JTextField();
        tfCol = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        tfCP = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        tfCalle = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        tfNE = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        tfNI = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        ComboBoxEstado = new javax.swing.JComboBox<>();
        panelBtn11 = new paneles.PanelBtn1();
        btnActualizar = new javax.swing.JLabel();
        btnCancel = new javax.swing.JLabel();

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

        jSeparator1.setBackground(new java.awt.Color(94, 52, 12));
        jSeparator1.setForeground(new java.awt.Color(94, 52, 12));

        lblAlca.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblAlca.setForeground(new java.awt.Color(94, 52, 12));
        lblAlca.setText("Alcaldia/Municipio");

        jSeparator2.setBackground(new java.awt.Color(94, 52, 12));
        jSeparator2.setForeground(new java.awt.Color(94, 52, 12));

        lblCol.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblCol.setForeground(new java.awt.Color(94, 52, 12));
        lblCol.setText("Colonia");

        jSeparator3.setBackground(new java.awt.Color(94, 52, 12));
        jSeparator3.setForeground(new java.awt.Color(94, 52, 12));

        lblCP.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblCP.setForeground(new java.awt.Color(94, 52, 12));
        lblCP.setText("Codigo Postal");

        jSeparator4.setBackground(new java.awt.Color(94, 52, 12));
        jSeparator4.setForeground(new java.awt.Color(94, 52, 12));

        lblCalle.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblCalle.setForeground(new java.awt.Color(94, 52, 12));
        lblCalle.setText("Calle");

        jSeparator5.setBackground(new java.awt.Color(94, 52, 12));
        jSeparator5.setForeground(new java.awt.Color(94, 52, 12));

        lblNE.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblNE.setForeground(new java.awt.Color(94, 52, 12));
        lblNE.setText("Número exterior");

        jSeparator6.setBackground(new java.awt.Color(94, 52, 12));
        jSeparator6.setForeground(new java.awt.Color(94, 52, 12));

        lblNI.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblNI.setForeground(new java.awt.Color(94, 52, 12));
        lblNI.setText("Número interior");

        jSeparator7.setBackground(new java.awt.Color(94, 52, 12));
        jSeparator7.setForeground(new java.awt.Color(94, 52, 12));

        lblEstado.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(94, 52, 12));
        lblEstado.setText("Estado");

        jSeparator8.setBackground(new java.awt.Color(94, 52, 12));
        jSeparator8.setForeground(new java.awt.Color(94, 52, 12));

        javax.swing.GroupLayout fondosGradienteMinis1Layout = new javax.swing.GroupLayout(fondosGradienteMinis1);
        fondosGradienteMinis1.setLayout(fondosGradienteMinis1Layout);
        fondosGradienteMinis1Layout.setHorizontalGroup(
            fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondosGradienteMinis1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondosGradienteMinis1Layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addGroup(fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAlca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        fondosGradienteMinis1Layout.setVerticalGroup(
            fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondosGradienteMinis1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAlca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCol, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitulo.setFont(new java.awt.Font("Roboto Mono", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(94, 52, 12));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Nueva Dirección");

        tfID.setEditable(false);
        tfID.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        tfID.setForeground(new java.awt.Color(94, 52, 12));
        tfID.setText("ID");
        tfID.setBorder(null);

        tfAlca.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        tfAlca.setForeground(new java.awt.Color(94, 52, 12));
        tfAlca.setText("Alcaldia/Municipio");
        tfAlca.setBorder(null);

        tfCol.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        tfCol.setForeground(new java.awt.Color(94, 52, 12));
        tfCol.setText("Colonia");
        tfCol.setBorder(null);

        tfCP.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        tfCP.setForeground(new java.awt.Color(94, 52, 12));
        tfCP.setText("Codigo Postal");
        tfCP.setBorder(null);

        tfCalle.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        tfCalle.setForeground(new java.awt.Color(94, 52, 12));
        tfCalle.setText("Calle");
        tfCalle.setBorder(null);

        tfNE.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        tfNE.setForeground(new java.awt.Color(94, 52, 12));
        tfNE.setText("Número exterior");
        tfNE.setBorder(null);

        tfNI.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        tfNI.setForeground(new java.awt.Color(94, 52, 12));
        tfNI.setText("Número interior");
        tfNI.setBorder(null);

        ComboBoxEstado.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        ComboBoxEstado.setForeground(new java.awt.Color(94, 52, 12));
        ComboBoxEstado.setBorder(null);

        btnActualizar.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
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
                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn11Layout.setVerticalGroup(
            panelBtn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCancel.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(94, 52, 12));
        btnCancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancel.setText("Cancelar");
        btnCancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 52, 12)));
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
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
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfAlca, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfCol, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfCP, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfNE, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfNI, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondosGradienteMinis1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAlca, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfCol, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfCP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfNE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfNI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBtn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
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

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        
        if (NombreEv == "Guardar") {
            if (!"".equals(tfID.getText())
                    || !"".equals(tfAlca.getText())
                    || !"".equals(tfCol.getText())
                    || !"".equals(tfCP.getText())
                    || !"".equals(tfCalle.getText())
                    || !"".equals(tfNE.getText())
                    || !"".equals(tfNI.getText())) {
                /*
                System.out.println(tfRFC.getText());
                System.out.println(tfNombre.getText());
                System.out.println(tfAP.getText());
                System.out.println(tfAM.getText());
                System.out.println(tfFechaNac.getText());
                System.out.println(tfCorreo.getText());
                System.out.println(tfNSS.getText());
                System.out.println(tfUsuario.getText());
                System.out.println(tfPassword.getText());
                System.out.println(ComboBoxCargo.getSelectedItem().toString());
                System.out.println(ComboBoxHorario.getSelectedItem().toString());
                System.out.println(ComboBoxDireccion.getSelectedItem().toString());*/

                String Estadito;
                Estadito = ComboBoxEstado.getSelectedItem().toString().substring(0, 2);

                
                dir.setIdDir(tfID.getText());
                dir.setAlc_mun(tfAlca.getText());
                dir.setColonia(tfCol.getText());
                dir.setCp(tfCP.getText());
                dir.setCall(tfCalle.getText());
                dir.setExt(tfNE.getText());
                dir.setInte(tfNI.getText());
                dir.setEstado_id(Estadito);
                
                
                dirX.RegistrarDireccion(dir);
                 
                JOptionPane.showMessageDialog(null, "Accion realizada, Nuevo empleado registrado!!");

            } else {
                JOptionPane.showMessageDialog(null, "ERROR!!!\n Los campos no pueden estar vacios");
            }

        }

        if (NombreEv == "Actualizar") {
            if (!"".equals(tfID.getText())
                    || !"".equals(tfAlca.getText())
                    || !"".equals(tfCol.getText())
                    || !"".equals(tfCP.getText())
                    || !"".equals(tfCalle.getText())
                    || !"".equals(tfNE.getText())
                    || !"".equals(tfNI.getText())) {
                /*
                System.out.println(tfRFC.getText());
                System.out.println(tfNombre.getText());
                System.out.println(tfAP.getText());
                System.out.println(tfAM.getText());
                System.out.println(tfFechaNac.getText());
                System.out.println(tfCorreo.getText());
                System.out.println(tfNSS.getText());
                System.out.println(tfUsuario.getText());
                System.out.println(tfPassword.getText());
                System.out.println(ComboBoxCargo.getSelectedItem().toString());
                System.out.println(ComboBoxHorario.getSelectedItem().toString());
                System.out.println(ComboBoxDireccion.getSelectedItem().toString());*/

                String Estadito;
                Estadito = ComboBoxEstado.getSelectedItem().toString().substring(0, 2);

                
                dir.setIdDir(tfID.getText());
                dir.setAlc_mun(tfAlca.getText());
                dir.setColonia(tfCol.getText());
                dir.setCp(tfCP.getText());
                dir.setCall(tfCalle.getText());
                dir.setExt(tfNE.getText());
                dir.setInte(tfNI.getText());
                dir.setEstado_id(Estadito);
                
                
                dirX.ModificarDir(dir);
                 
                JOptionPane.showMessageDialog(null, "Accion realizada, Nuevo empleado registrado!!");

            } else {
                JOptionPane.showMessageDialog(null, "ERROR!!!\n Los campos no pueden estar vacios");
            }

        }

        this.dispose();
    }//GEN-LAST:event_btnActualizarMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxEstado;
    private javax.swing.JLabel btnActualizar;
    private javax.swing.JLabel btnCancel;
    private paneles.FondosGradienteMinis fondosGradienteMinis1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAlca;
    private javax.swing.JLabel lblCP;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblCol;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNE;
    private javax.swing.JLabel lblNI;
    private javax.swing.JLabel lblTitulo;
    private paneles.PanelBtn1 panelBtn11;
    private javax.swing.JTextField tfAlca;
    private javax.swing.JTextField tfCP;
    private javax.swing.JTextField tfCalle;
    private javax.swing.JTextField tfCol;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfNE;
    private javax.swing.JTextField tfNI;
    // End of variables declaration//GEN-END:variables
}
