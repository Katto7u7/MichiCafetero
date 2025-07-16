package Editores;

import clases.Clientes;
import conexiones.ClientesConexion;
import javax.swing.JOptionPane;
import paneles.form_clientes;

public class edtCliente extends javax.swing.JFrame {

    public Object[] env = new Object[4];

    //NECESITAMOS INSTANCIAR LAS CLASES DE CONEXION Y DE ENCAPSULAMIENTO  
    Clientes cl = new Clientes();                         //Clase de encapusulamineto
    ClientesConexion clx = new ClientesConexion();         //Clase de conexion

    static String NombreEv;

    public edtCliente() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    public void recibirObj(Object[] ObjetoRecibido, String NombreEvento) {
        BtnActualizar.setText(NombreEvento);
        lblEditar.setText(NombreEvento);
        IDEdt.setText(ObjetoRecibido[0].toString());
        NombreEdt.setText(ObjetoRecibido[1].toString());
        APEdt1.setText(ObjetoRecibido[2].toString());
        AMEdt2.setText(ObjetoRecibido[3].toString());
        if (NombreEvento == "Añadir Registro") {
            AddTextField(ObjetoRecibido);
            NombreEv = NombreEvento;
        }
        if (NombreEvento == "Actualizar") {
            EdtTextField(ObjetoRecibido);
            NombreEv = NombreEvento;
        }

    }

    public void AddTextField(Object[] Ob) {
        lblEditar.setText("Nuevo Registro");
       // TF_ID.setText("Nuevo ID");
        TF_ID.setText(Ob[0].toString());
        TF_Nom.setText("Nuevo Nombre");
        TF_AP.setText("Nuevo Apellido Paterno");
        TF_AM.setText("Nuevo Apellido Materno");
    }

    public void EdtTextField(Object[] ObjetoRecibido) {
        lblEditar.setText("Editar Datos");
        TF_ID.setText(ObjetoRecibido[0].toString());
        TF_Nom.setText(ObjetoRecibido[1].toString());
        TF_AP.setText(ObjetoRecibido[2].toString());
        TF_AM.setText(ObjetoRecibido[3].toString());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        fondosGradienteMinis1 = new paneles.FondosGradienteMinis();
        jLabel1 = new javax.swing.JLabel();
        IDEdt = new javax.swing.JLabel();
        NombreEdt = new javax.swing.JLabel();
        APEdt1 = new javax.swing.JLabel();
        AMEdt2 = new javax.swing.JLabel();
        TF_AM = new javax.swing.JTextField();
        TF_ID = new javax.swing.JTextField();
        TF_Nom = new javax.swing.JTextField();
        TF_AP = new javax.swing.JTextField();
        panelBtn12 = new paneles.PanelBtn1();
        BtnActualizar = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        BtnCancelar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 233, 204));
        setUndecorated(true);

        panel1.setBackground(new java.awt.Color(245, 233, 204));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 52, 12));
        jLabel1.setText("Datos");

        IDEdt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IDEdt.setForeground(new java.awt.Color(94, 52, 12));
        IDEdt.setText("Nombre");

        NombreEdt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NombreEdt.setForeground(new java.awt.Color(94, 52, 12));
        NombreEdt.setText("Nombre");

        APEdt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        APEdt1.setForeground(new java.awt.Color(94, 52, 12));
        APEdt1.setText("Nombre");

        AMEdt2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AMEdt2.setForeground(new java.awt.Color(94, 52, 12));
        AMEdt2.setText("Nombre");

        javax.swing.GroupLayout fondosGradienteMinis1Layout = new javax.swing.GroupLayout(fondosGradienteMinis1);
        fondosGradienteMinis1.setLayout(fondosGradienteMinis1Layout);
        fondosGradienteMinis1Layout.setHorizontalGroup(
            fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondosGradienteMinis1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(fondosGradienteMinis1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(APEdt1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AMEdt2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        fondosGradienteMinis1Layout.setVerticalGroup(
            fondosGradienteMinis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondosGradienteMinis1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IDEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NombreEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(APEdt1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AMEdt2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        panel1.add(fondosGradienteMinis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 500));

        TF_AM.setBackground(new java.awt.Color(251, 246, 235));
        TF_AM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TF_AM.setForeground(new java.awt.Color(94, 52, 12));
        TF_AM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_AM.setText("Nuevo  A Materno");
        TF_AM.setBorder(null);
        panel1.add(TF_AM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 330, 40));

        TF_ID.setEditable(false);
        TF_ID.setBackground(new java.awt.Color(251, 246, 235));
        TF_ID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TF_ID.setForeground(new java.awt.Color(94, 52, 12));
        TF_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_ID.setText("Nuevo ID");
        TF_ID.setBorder(null);
        panel1.add(TF_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 330, 40));

        TF_Nom.setBackground(new java.awt.Color(251, 246, 235));
        TF_Nom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TF_Nom.setForeground(new java.awt.Color(94, 52, 12));
        TF_Nom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_Nom.setText("Nuevo Nombre");
        TF_Nom.setBorder(null);
        panel1.add(TF_Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 330, 40));

        TF_AP.setBackground(new java.awt.Color(251, 246, 235));
        TF_AP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TF_AP.setForeground(new java.awt.Color(94, 52, 12));
        TF_AP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_AP.setText("Nuevo A Paterno");
        TF_AP.setBorder(null);
        panel1.add(TF_AP, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 330, 40));

        BtnActualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnActualizar.setForeground(new java.awt.Color(94, 52, 12));
        BtnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnActualizar.setText("Actualizar");
        BtnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnActualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn12Layout = new javax.swing.GroupLayout(panelBtn12);
        panelBtn12.setLayout(panelBtn12Layout);
        panelBtn12Layout.setHorizontalGroup(
            panelBtn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panelBtn12Layout.setVerticalGroup(
            panelBtn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtn12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel1.add(panelBtn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 160, 60));

        lblEditar.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblEditar.setForeground(new java.awt.Color(94, 52, 12));
        lblEditar.setText("Editar");
        panel1.add(lblEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 270, 60));

        BtnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnCancelar.setForeground(new java.awt.Color(94, 52, 12));
        BtnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnCancelar.setText("Cancelar");
        BtnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 52, 12)));
        BtnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCancelarMouseClicked(evt);
            }
        });
        panel1.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 160, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_BtnCancelarMouseClicked

    private void BtnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnActualizarMouseClicked

        //IF para cuando se quiere añadir un registro
        if (NombreEv == "Añadir Registro") {
            //Se deben enviar primero las variables a encapsulamiento 
            //por lo tanto primero comprobamos que los campos de aqui no estan vacios
            if (!"".equals(TF_ID.getText()) || !"".equals(TF_Nom.getText()) || !"".equals(TF_AP.getText()) || !"".equals(TF_AM.getText())) {
                cl.setId(TF_ID.getText());
                cl.setNameCliente(TF_Nom.getText());
                cl.setAP_Cliente(TF_AP.getText());
                cl.setAM_Cliente(TF_AM.getText());
                //ahora vamos a la conexion para el registro
                //Llamamos al metodo para registrar al clinete y le pasamos el contructor de nuestro encapsulamiento que ya contiene los campos 
                //que vamos a mandarle
                clx.RegistrarCliente(cl);
                JOptionPane.showMessageDialog(null, "Accion realizada!!");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR!!!\n Los campos no pueden estar vacios");
            }
        }

        //IF para cuando se quiere modificar un cliente
        if (NombreEv == "Actualizar") {
            if (!"".equals(TF_ID.getText()) || !"".equals(TF_Nom.getText()) || !"".equals(TF_AP.getText()) || !"".equals(TF_AM.getText())) {
                cl.setId(TF_ID.getText());
                cl.setNameCliente(TF_Nom.getText());
                cl.setAP_Cliente(TF_AP.getText());
                cl.setAM_Cliente(TF_AM.getText());
                clx.ModificarCliente(cl);
            } else {
                JOptionPane.showMessageDialog(null, "ERROR!!!\n Los campos no pueden estar vacios");
            }
        }
        JOptionPane.showMessageDialog(null, "Accion realizada!!");
        this.dispose();
    }//GEN-LAST:event_BtnActualizarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel AMEdt2;
    public javax.swing.JLabel APEdt1;
    private javax.swing.JLabel BtnActualizar;
    private javax.swing.JLabel BtnCancelar;
    public javax.swing.JLabel IDEdt;
    public javax.swing.JLabel NombreEdt;
    private javax.swing.JTextField TF_AM;
    private javax.swing.JTextField TF_AP;
    private javax.swing.JTextField TF_ID;
    private javax.swing.JTextField TF_Nom;
    private paneles.FondosGradienteMinis fondosGradienteMinis1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEditar;
    private java.awt.Panel panel1;
    private paneles.PanelBtn1 panelBtn12;
    // End of variables declaration//GEN-END:variables
}
