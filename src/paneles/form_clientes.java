package paneles;

import Editores.edtCliente;
import clases.Clientes;
import conexiones.ClientesConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class form_clientes extends javax.swing.JPanel {
    
    static DefaultTableModel modelo = new DefaultTableModel();

    Clientes cl = new Clientes();                           //Clase de encapusulamineto
    ClientesConexion clx = new ClientesConexion();          //Clase de conexion

    Object[] o = new Object[4];
    static public Object[] ORecibe = new Object[4];

    int filaSelect = -1;

    public form_clientes() {
        initComponents();
        //initTablaClientes();
        //TableClientes.setModel(modelo);
        LimpiarTabla(); //Se limpia la tabla para evitar que se concatenen más veces las consultas
        ListarCliente();
    }

    //10/12/22
    //CREAMOS UN METODO PARA LISTAR LA BASE DE DATOS 
    public void ListarCliente() {
        List<Clientes> ListarCl = clx.ListarClientes(); //Llamamos al metodo para hacer la lista de clientes 
        //Este metodo hace la peticion, y lista los clinetes de los resultados

        modelo = (DefaultTableModel) TableClientes.getModel(); //Optenemos el modelo de la tabla
        Object[] obj = new Object[4];   //Creamos un objeto para meter ahi los datos 
        for (int i = 0; i < ListarCl.size(); i++) {
            obj[0] = ListarCl.get(i).getId();        //otenemos los valores de cada indice en el objeto
            obj[1] = ListarCl.get(i).getNameCliente();
            obj[2] = ListarCl.get(i).getAP_Cliente();
            obj[3] = ListarCl.get(i).getAM_Cliente();
            modelo.addRow(obj); //una vez obetenidos agregamos la nueva fila a la tabla 
        }
        TableClientes.setModel(modelo); //ahora agregamos el modelo a la tabla 
    }

    public void LimpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TableClientes = new tablas.Table();
        panelBtn11 = new paneles.PanelBtn1();
        BtnAdd = new javax.swing.JLabel();
        panelBtn12 = new paneles.PanelBtn1();
        btnEditarDatos = new javax.swing.JLabel();
        panelBtn13 = new paneles.PanelBtn1();
        BtnDelete = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 233, 204));

        TableClientes.setBackground(new java.awt.Color(251, 246, 235));
        TableClientes.setForeground(new java.awt.Color(94, 52, 12));
        TableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CLIENTE", "NOMBRE", "A PATERNO", "A MATERNO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableClientes.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        TableClientes.setSelectionBackground(new java.awt.Color(133, 79, 39));
        jScrollPane2.setViewportView(TableClientes);

        panelBtn11.setPreferredSize(new java.awt.Dimension(100, 40));

        BtnAdd.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        BtnAdd.setForeground(new java.awt.Color(94, 52, 12));
        BtnAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnAdd.setText("Añadir");
        BtnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn11Layout = new javax.swing.GroupLayout(panelBtn11);
        panelBtn11.setLayout(panelBtn11Layout);
        panelBtn11Layout.setHorizontalGroup(
            panelBtn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        panelBtn11Layout.setVerticalGroup(
            panelBtn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn11Layout.createSequentialGroup()
                .addComponent(BtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelBtn12.setPreferredSize(new java.awt.Dimension(100, 40));

        btnEditarDatos.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        btnEditarDatos.setForeground(new java.awt.Color(94, 52, 12));
        btnEditarDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditarDatos.setText("Editar");
        btnEditarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarDatosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn12Layout = new javax.swing.GroupLayout(panelBtn12);
        panelBtn12.setLayout(panelBtn12Layout);
        panelBtn12Layout.setHorizontalGroup(
            panelBtn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBtn12Layout.setVerticalGroup(
            panelBtn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelBtn13.setPreferredSize(new java.awt.Dimension(100, 40));

        BtnDelete.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        BtnDelete.setForeground(new java.awt.Color(94, 52, 12));
        BtnDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnDelete.setText("Eliminar");
        BtnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDeleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn13Layout = new javax.swing.GroupLayout(panelBtn13);
        panelBtn13.setLayout(panelBtn13Layout);
        panelBtn13Layout.setHorizontalGroup(
            panelBtn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBtn13Layout.setVerticalGroup(
            panelBtn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtn13Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 52, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clientes");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 52, 12)));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(panelBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelBtn13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelBtn12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBtn13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBtn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAddMouseClicked
        
        int numerornd = (int) (Math.random() * 1000000 + 1);
        String IDcls = "C"+numerornd;
        o[0] = IDcls;
        o[1] = "Ingrese Nombre";
        o[2] = "Ingrese A paterno";
        o[3] = "Ingrese A materno";
        //modelo.addRow(o);
        String NombreEvento = "Añadir Registro";
        //Invocar a la ventana y actualizar los datos desde ahí
        edtCliente edC = new edtCliente();
        edC.setVisible(true);
        edC.recibirObj(o, NombreEvento);
        filaSelect = -1;
        LimpiarTabla();
        ListarCliente();

    }//GEN-LAST:event_BtnAddMouseClicked

    private void btnEditarDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarDatosMouseClicked
        filaSelect = TableClientes.getSelectedRow();
        if (filaSelect != -1) {
            for (int i = 0; i <= o.length - 1; i++) {
                o[i] = TableClientes.getValueAt(filaSelect, i).toString();
            }
            /*  o[0] = TableClientes.getValueAt(filaSelect, 0).toString();
            o[1] = TableClientes.getValueAt(filaSelect, 1).toString();
            o[2] = TableClientes.getValueAt(filaSelect, 2).toString();
            o[3] = TableClientes.getValueAt(filaSelect, 3).toString();*/
            String NombreEvento = "Actualizar";
            //Invocar a la ventana y actualizar los datos desde ahí
            edtCliente edC = new edtCliente();           //Instancia del formulario 2
            //Mandar a llamar a la funcion de la instancia para pasarle los datos 
            edC.setVisible(true);                       //hacer visible la ventana
            edC.recibirObj(o, NombreEvento);
            LimpiarTabla();
            ListarCliente();
            filaSelect = -1;

        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        }
    }//GEN-LAST:event_btnEditarDatosMouseClicked

    private void BtnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDeleteMouseClicked

        filaSelect = TableClientes.getSelectedRow(); //optenemos la fila seleccionada 

        if (filaSelect != -1) {
            o[0] = TableClientes.getValueAt(filaSelect, 0).toString(); //pasamos los datos del la fila a nuestro objeto
            o[1] = TableClientes.getValueAt(filaSelect, 1).toString();
            o[2] = TableClientes.getValueAt(filaSelect, 2).toString();
            o[3] = TableClientes.getValueAt(filaSelect, 3).toString();

            int pregunta = JOptionPane.showConfirmDialog(null, "¿Seguro de eliminar el registro del cliente " + o[1].toString() + " " + o[2].toString() + " " + o[3].toString() + " ?");
            if (pregunta == 0) {
                clx.BorrarCliente(o[0].toString()); //preguntamos y confirmamos el registro 
                LimpiarTabla();
                ListarCliente();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        }
    }//GEN-LAST:event_BtnDeleteMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        LimpiarTabla();
        ListarCliente();
    }//GEN-LAST:event_jLabel1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnAdd;
    private javax.swing.JLabel BtnDelete;
    private tablas.Table TableClientes;
    private javax.swing.JLabel btnEditarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private paneles.PanelBtn1 panelBtn11;
    private paneles.PanelBtn1 panelBtn12;
    private paneles.PanelBtn1 panelBtn13;
    // End of variables declaration//GEN-END:variables
}
