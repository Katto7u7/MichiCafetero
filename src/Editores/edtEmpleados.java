
package Editores;

import clases.Empleados;
import conexiones.EmpleadosConexion;
import javax.swing.JOptionPane;

public class edtEmpleados extends javax.swing.JFrame {

    Empleados em = new Empleados();
    EmpleadosConexion emX = new EmpleadosConexion();

    static String NombreEv;

    public edtEmpleados() {
        initComponents();
        this.setLocationRelativeTo(this);
        emX.ConsultarCargoEmpleado(ComboBoxCargo);
        emX.ConsultarHorarioEmpleado(ComboBoxHorario);
        emX.ConsultarDireccionEmpleado(ComboBoxDireccion);
        //btnNewDir.setVisible(false);
        //ComboBoxDireccion.disable();
    }

    public void recibirObj(Object[] ObjetoRecibido, String NombreEvento) {

        btnActualizar.setText(NombreEvento);
        lblTitulo.setText(NombreEvento);

        lblRFC.setText(ObjetoRecibido[0].toString());
        lblNombre.setText(ObjetoRecibido[1].toString());
        lblAP.setText(ObjetoRecibido[2].toString());
        lblAM.setText(ObjetoRecibido[3].toString());
        lblFechaNac.setText(ObjetoRecibido[4].toString());
        lblCorreo.setText(ObjetoRecibido[5].toString());
        lblNSS.setText(ObjetoRecibido[6].toString());
        lblUsuario.setText(ObjetoRecibido[7].toString());
        lblPassword.setText(ObjetoRecibido[8].toString());
        lblCargo.setText(ObjetoRecibido[9].toString());
        lblHorario.setText(ObjetoRecibido[10].toString());
        lblDireccion.setText(ObjetoRecibido[11].toString());

        tfRFC.setText(ObjetoRecibido[0].toString());
        tfNombre.setText(ObjetoRecibido[1].toString());
        tfAP.setText(ObjetoRecibido[2].toString());
        tfAM.setText(ObjetoRecibido[3].toString());
        tfFechaNac.setText(ObjetoRecibido[4].toString());
        tfCorreo.setText(ObjetoRecibido[5].toString());
        tfNSS.setText(ObjetoRecibido[6].toString());
        tfUsuario.setText(ObjetoRecibido[7].toString());
        tfPassword.setText(ObjetoRecibido[8].toString());
        //tfCargo.setText(ObjetoRecibido[9].toString());
        // tfHorario.setText(ObjetoRecibido[10].toString());
        //tfDireccion.setText(ObjetoRecibido[11].toString());

        if (NombreEvento == "Guardar") {
            lblTitulo.setText("Ingrese datos del empleado");
            // AddTextField(ObjetoRecibido);
            NombreEv = NombreEvento;
        }
        if (NombreEvento == "Actualizar") {
            lblTitulo.setText("Nuevos datos del empleado");
            // EdtTextField(ObjetoRecibido);
            NombreEv = NombreEvento;
            String cargo = emX.BuscarCargoRe(ObjetoRecibido[9].toString());
            String hora = emX.BuscarHorarioEm(ObjetoRecibido[10].toString());
            String Dir = emX.BuscarDirEm(ObjetoRecibido[11].toString());
            ComboBoxCargo.setSelectedItem(cargo);
            ComboBoxHorario.setSelectedItem(hora);
            ComboBoxDireccion.setSelectedItem(Dir);
        }

    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fondosGradienteMinis1 = new paneles.FondosGradienteMinis();
        lblNombre = new javax.swing.JLabel();
        lblAP = new javax.swing.JLabel();
        lblAM = new javax.swing.JLabel();
        lblFechaNac = new javax.swing.JLabel();
        lblRFC = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblNSS = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        tfRFC = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        tfNombre = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        tfAP = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        tfAM = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        tfFechaNac = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        tfCorreo = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        tfNSS = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        tfUsuario = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        tfPassword = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        panelBtn11 = new paneles.PanelBtn1();
        btnActualizar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ComboBoxCargo = new javax.swing.JComboBox<>();
        ComboBoxDireccion = new javax.swing.JComboBox<>();
        ComboBoxHorario = new javax.swing.JComboBox<>();
        btnNewDir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblNombre.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(94, 52, 12));
        lblNombre.setText("Nombre");

        lblAP.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblAP.setForeground(new java.awt.Color(94, 52, 12));
        lblAP.setText("Apellido Paterno");

        lblAM.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblAM.setForeground(new java.awt.Color(94, 52, 12));
        lblAM.setText("Apellido Materno");

        lblFechaNac.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblFechaNac.setForeground(new java.awt.Color(94, 52, 12));
        lblFechaNac.setText("Fecha de nacimiento");

        lblRFC.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblRFC.setForeground(new java.awt.Color(94, 52, 12));
        lblRFC.setText("RFC");

        lblCorreo.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(94, 52, 12));
        lblCorreo.setText("Correo");

        lblNSS.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblNSS.setForeground(new java.awt.Color(94, 52, 12));
        lblNSS.setText("Numero de seguro social");

        lblUsuario.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(94, 52, 12));
        lblUsuario.setText("Usuario");

        lblPassword.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(94, 52, 12));
        lblPassword.setText("Constraseña");

        lblHorario.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblHorario.setForeground(new java.awt.Color(94, 52, 12));
        lblHorario.setText("Horario");

        lblCargo.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(94, 52, 12));
        lblCargo.setText("Cargo");

        lblDireccion.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(94, 52, 12));
        lblDireccion.setText("Dirección");

        jLabel2.setFont(new java.awt.Font("Roboto Mono", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(94, 52, 12));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Datos del empleado");

        jSeparator13.setForeground(new java.awt.Color(94, 52, 2));

        jSeparator14.setForeground(new java.awt.Color(94, 52, 2));

        jSeparator15.setForeground(new java.awt.Color(94, 52, 2));

        jSeparator16.setForeground(new java.awt.Color(94, 52, 2));

        jSeparator17.setForeground(new java.awt.Color(94, 52, 2));

        jSeparator18.setForeground(new java.awt.Color(94, 52, 2));

        jSeparator19.setForeground(new java.awt.Color(94, 52, 2));

        jSeparator20.setForeground(new java.awt.Color(94, 52, 2));

        jSeparator21.setForeground(new java.awt.Color(94, 52, 2));

        jSeparator22.setForeground(new java.awt.Color(94, 52, 2));

        jSeparator23.setForeground(new java.awt.Color(94, 52, 2));

        jSeparator24.setForeground(new java.awt.Color(94, 52, 2));

        javax.swing.GroupLayout fondosGradienteMinis1Layout = new javax.swing.GroupLayout(fondosGradienteMinis1);
        fondosGradienteMinis1.setLayout(fondosGradienteMinis1Layout);
        fondosGradienteMinis1Layout.setHorizontalGroup(
            fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondosGradienteMinis1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondosGradienteMinis1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(lblAM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(lblFechaNac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(lblRFC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(lblCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(lblNSS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(lblCargo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(lblDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(jSeparator13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHorario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(jSeparator15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator19, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator21)
                            .addComponent(jSeparator22)
                            .addComponent(jSeparator23)
                            .addComponent(jSeparator24))))
                .addContainerGap())
        );
        fondosGradienteMinis1Layout.setVerticalGroup(
            fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondosGradienteMinis1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNSS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitulo.setFont(new java.awt.Font("Roboto Mono", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(94, 52, 12));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Nuevos datos del empleado");

        tfRFC.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        tfRFC.setForeground(new java.awt.Color(94, 52, 12));
        tfRFC.setText("RFC");
        tfRFC.setBorder(null);
        tfRFC.setMargin(new java.awt.Insets(10, 10, 10, 6));

        tfNombre.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        tfNombre.setForeground(new java.awt.Color(94, 52, 12));
        tfNombre.setText("Nombre");
        tfNombre.setBorder(null);
        tfNombre.setMargin(new java.awt.Insets(10, 10, 10, 6));

        tfAP.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        tfAP.setForeground(new java.awt.Color(94, 52, 12));
        tfAP.setText("Apellido Paterno");
        tfAP.setBorder(null);
        tfAP.setMargin(new java.awt.Insets(10, 10, 10, 6));

        tfAM.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        tfAM.setForeground(new java.awt.Color(94, 52, 12));
        tfAM.setText("Apellido Materno");
        tfAM.setBorder(null);
        tfAM.setMargin(new java.awt.Insets(10, 10, 10, 6));

        tfFechaNac.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        tfFechaNac.setForeground(new java.awt.Color(94, 52, 12));
        tfFechaNac.setText("Fecha de nacimiento");
        tfFechaNac.setBorder(null);
        tfFechaNac.setMargin(new java.awt.Insets(10, 10, 10, 6));

        tfCorreo.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        tfCorreo.setForeground(new java.awt.Color(94, 52, 12));
        tfCorreo.setText("Correo");
        tfCorreo.setBorder(null);
        tfCorreo.setMargin(new java.awt.Insets(10, 10, 10, 6));

        tfNSS.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        tfNSS.setForeground(new java.awt.Color(94, 52, 12));
        tfNSS.setText("Numero de seguro social");
        tfNSS.setBorder(null);
        tfNSS.setMargin(new java.awt.Insets(10, 10, 10, 6));

        tfUsuario.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        tfUsuario.setForeground(new java.awt.Color(94, 52, 12));
        tfUsuario.setText("Usuario");
        tfUsuario.setBorder(null);
        tfUsuario.setMargin(new java.awt.Insets(10, 10, 10, 6));

        tfPassword.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        tfPassword.setForeground(new java.awt.Color(94, 52, 12));
        tfPassword.setText("Contraseña");
        tfPassword.setBorder(null);
        tfPassword.setMargin(new java.awt.Insets(10, 10, 10, 6));

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
                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(94, 52, 12));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cancelar");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        ComboBoxCargo.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        ComboBoxCargo.setForeground(new java.awt.Color(94, 52, 12));
        ComboBoxCargo.setBorder(null);

        ComboBoxDireccion.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        ComboBoxDireccion.setForeground(new java.awt.Color(94, 52, 12));
        ComboBoxDireccion.setBorder(null);
        ComboBoxDireccion.setMaximumSize(new java.awt.Dimension(500, 500));

        ComboBoxHorario.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        ComboBoxHorario.setForeground(new java.awt.Color(94, 52, 12));
        ComboBoxHorario.setBorder(null);

        btnNewDir.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        btnNewDir.setForeground(new java.awt.Color(94, 52, 12));
        btnNewDir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNewDir.setText("Nueva Dirección");
        btnNewDir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 52, 12)));
        btnNewDir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNewDir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewDirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(fondosGradienteMinis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 61, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfAP, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfAM, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfNSS, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(354, 354, 354)
                                    .addComponent(panelBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ComboBoxCargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(ComboBoxDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnNewDir, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(ComboBoxHorario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondosGradienteMinis1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNSS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboBoxDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnNewDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBtn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(56, Short.MAX_VALUE))
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

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        
        if (NombreEv == "Guardar"){
            if (!"".equals(tfRFC.getText()) ||
                !"".equals(tfNombre.getText()) ||
                !"".equals(tfAP.getText()) ||
                !"".equals(tfAM.getText()) ||
                !"".equals(tfAM.getText()) ||
                !"".equals(tfFechaNac.getText()) ||
                !"".equals(tfCorreo.getText()) ||
                !"".equals(tfNSS.getText()) ||
                !"".equals(tfUsuario.getText()) ||
                !"".equals(tfPassword.getText()) ||
                !"".equals(ComboBoxCargo.getSelectedItem().toString()) ||
                !"".equals(ComboBoxHorario.getSelectedItem().toString()) ||
                !"".equals(ComboBoxDireccion.getSelectedItem().toString())    
                ) {
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
                
                String Carguito;
                Carguito=ComboBoxCargo.getSelectedItem().toString().substring(0,2);
                //System.out.println(Carguito);
                
                String horario=ComboBoxHorario.getSelectedItem().toString().substring(0,2);
                //System.out.println(horario);
                String dir = ComboBoxDireccion.getSelectedItem().toString().substring(0,4);
               // System.out.println(dir);
                
                
                em.setRFC(tfRFC.getText());
                em.setName(tfNombre.getText());
                em.setA_pat(tfAP.getText());
                em.setA_mat(tfAM.getText());
                em.setFechaNac(tfFechaNac.getText());
                em.setCorreo(tfCorreo.getText());
                em.setNumSeguro(tfNSS.getText());
                em.setUser(tfUsuario.getText());
                em.setPassword(tfPassword.getText());
                em.setCargo(Carguito);
                em.setHorario(horario);
                em.setId_direccion(dir);
                
                emX.RegistrarEmpleado(em);
                
                
                
                JOptionPane.showMessageDialog(null, "Accion realizada, Nuevo empleado registrado!!");
                
                
            } else {
                JOptionPane.showMessageDialog(null, "ERROR!!!\n Los campos no pueden estar vacios");
            }
            
            
        }
        
        
        
        if(NombreEv == "Actualizar"){
            if (!"".equals(tfRFC.getText()) ||
                !"".equals(tfNombre.getText()) ||
                !"".equals(tfAP.getText()) ||
                !"".equals(tfAM.getText()) ||
                !"".equals(tfAM.getText()) ||
                !"".equals(tfFechaNac.getText()) ||
                !"".equals(tfCorreo.getText()) ||
                !"".equals(tfNSS.getText()) ||
                !"".equals(tfUsuario.getText()) ||
                !"".equals(tfPassword.getText()) ||
                !"".equals(ComboBoxCargo.getSelectedItem().toString()) ||
                !"".equals(ComboBoxHorario.getSelectedItem().toString()) ||
                !"".equals(ComboBoxDireccion.getSelectedItem().toString())    
                ) {
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
                
                String Carguito;
                Carguito=ComboBoxCargo.getSelectedItem().toString().substring(0,2);
                //System.out.println(Carguito);
                
                String horario=ComboBoxHorario.getSelectedItem().toString().substring(0,2);
                //System.out.println(horario);
                String dir = ComboBoxDireccion.getSelectedItem().toString().substring(0,4);
                //System.out.println(dir);
                
                
                em.setRFC(tfRFC.getText());
                em.setName(tfNombre.getText());
                em.setA_pat(tfAP.getText());
                em.setA_mat(tfAM.getText());
                em.setFechaNac(tfFechaNac.getText());
                em.setCorreo(tfCorreo.getText());
                em.setNumSeguro(tfNSS.getText());
                em.setUser(tfUsuario.getText());
                em.setPassword(tfPassword.getText());
                em.setCargo(Carguito);
                em.setHorario(horario);
                em.setId_direccion(dir);
                
                emX.ModificarEmpleado(em);
                
                
                
                JOptionPane.showMessageDialog(null, "Accion realizada, EmpleadoActualizado!!");
                
                
            } else {
                JOptionPane.showMessageDialog(null, "ERROR!!!\n Los campos no pueden estar vacios");
            }
            
            
            
        }
        
        
        
        this.dispose();
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnNewDirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewDirMouseClicked
       Object[] o = new Object[8];
        o[0] = "Ingrese ID";
        o[1] = "Ingrese Alca/MUN";
        o[2] = "Ingrese Colonia";
        o[3] = "Ingrese Codigo postal";
        o[4] = "Ingrese Calle";
        o[5] = "Ingrese Número exterior";
        o[6] = "Ingrese Numero interior (N/A)";
        o[7] = "Ingrese Estado";
        
        String NombreEvento = "Guardar";
        
        edtDirecciones edC = new edtDirecciones();
        edC.setVisible(true);
        edC.recibirObj(o, NombreEvento);
        
        
        
    }//GEN-LAST:event_btnNewDirMouseClicked

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCargo;
    private javax.swing.JComboBox<String> ComboBoxDireccion;
    private javax.swing.JComboBox<String> ComboBoxHorario;
    private javax.swing.JLabel btnActualizar;
    private javax.swing.JLabel btnNewDir;
    private paneles.FondosGradienteMinis fondosGradienteMinis1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAM;
    private javax.swing.JLabel lblAP;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFechaNac;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblNSS;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private paneles.PanelBtn1 panelBtn11;
    private javax.swing.JTextField tfAM;
    private javax.swing.JTextField tfAP;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfFechaNac;
    private javax.swing.JTextField tfNSS;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfRFC;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
