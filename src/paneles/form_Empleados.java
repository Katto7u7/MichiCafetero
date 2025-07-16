package paneles;

import Editores.edtEmpleados;
import clases.Empleados;
import conexiones.EmpleadosConexion;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class form_Empleados extends javax.swing.JPanel {

    static DefaultTableModel modelo = new DefaultTableModel();

    Empleados cl = new Empleados();                           //Clase de encapusulamineto
    EmpleadosConexion emx = new EmpleadosConexion();          //Clase de conexion

    Object[] o = new Object[12];
    static public Object[] ORecibe = new Object[12];

    int filaSelect = -1;
    
    
    public form_Empleados() {
        initComponents();
        LimpiarTabla();
        ListarEmpleados();
    }
    
    //CREAMOS UN METODO PARA LISTAR LA BASE DE DATOS 
    public void ListarEmpleados() {
        List<Empleados> ListarEm = emx.ListarEmpleados(); //Llamamos al metodo para hacer la lista de clientes 
        //Este metodo hace la peticion, y lista los clinetes de los resultados

        modelo = (DefaultTableModel) TableEmpleado.getModel(); //Optenemos el modelo de la tabla
        Object[] obj = new Object[12];   //Creamos un objeto para meter ahi los datos 
        for (int i = 0; i < ListarEm.size(); i++) {
            obj[0] = ListarEm.get(i).getRFC();        //otenemos los valores de cada indice en el objeto
            obj[1] = ListarEm.get(i).getName();
            obj[2] = ListarEm.get(i).getA_pat();
            obj[3] = ListarEm.get(i).getA_mat();
            obj[4] = ListarEm.get(i).getFechaNac().toString();
            obj[5] = ListarEm.get(i).getCorreo();
            obj[6] = ListarEm.get(i).getNumSeguro();
            obj[7] = ListarEm.get(i).getUser();
            obj[8] = ListarEm.get(i).getPassword();
            obj[9] = ListarEm.get(i).getCargo();
            obj[10] = ListarEm.get(i).getHorario();
            obj[11] = ListarEm.get(i).getId_direccion();
            modelo.addRow(obj); //una vez obetenidos agregamos la nueva fila a la tabla 
        }
        TableEmpleado.setModel(modelo); //ahora agregamos el modelo a la tabla 
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

        panelBtn11 = new paneles.PanelBtn1();
        jLabel1 = new javax.swing.JLabel();
        panelBtn12 = new paneles.PanelBtn1();
        btnEditar = new javax.swing.JLabel();
        panelBtn13 = new paneles.PanelBtn1();
        lblDelete = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableEmpleado = new tablas.Table();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 233, 204));

        panelBtn11.setPreferredSize(new java.awt.Dimension(100, 40));

        jLabel1.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 52, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Añadir");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn11Layout = new javax.swing.GroupLayout(panelBtn11);
        panelBtn11.setLayout(panelBtn11Layout);
        panelBtn11Layout.setHorizontalGroup(
            panelBtn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtn11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn11Layout.setVerticalGroup(
            panelBtn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBtn12.setPreferredSize(new java.awt.Dimension(100, 40));

        btnEditar.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(94, 52, 12));
        btnEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn12Layout = new javax.swing.GroupLayout(panelBtn12);
        panelBtn12.setLayout(panelBtn12Layout);
        panelBtn12Layout.setHorizontalGroup(
            panelBtn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtn12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn12Layout.setVerticalGroup(
            panelBtn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelBtn13.setPreferredSize(new java.awt.Dimension(100, 40));

        lblDelete.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        lblDelete.setForeground(new java.awt.Color(94, 52, 12));
        lblDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDelete.setText("Eliminar");
        lblDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn13Layout = new javax.swing.GroupLayout(panelBtn13);
        panelBtn13.setLayout(panelBtn13Layout);
        panelBtn13Layout.setHorizontalGroup(
            panelBtn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtn13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn13Layout.setVerticalGroup(
            panelBtn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        TableEmpleado.setBackground(new java.awt.Color(251, 246, 235));
        TableEmpleado.setForeground(new java.awt.Color(94, 52, 12));
        TableEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RFC", "NOMBRE", "A PATERNO", "A MATERNO", "FECHA DE NAC", "CORREO", "# SEGURO SOCIAL", "USUARIO", "PASSWORD", "CARGO", "HORARIO", "DIRECCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableEmpleado.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TableEmpleado.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        TableEmpleado.setSelectionBackground(new java.awt.Color(133, 79, 39));
        jScrollPane1.setViewportView(TableEmpleado);
        if (TableEmpleado.getColumnModel().getColumnCount() > 0) {
            TableEmpleado.getColumnModel().getColumn(0).setPreferredWidth(150);
            TableEmpleado.getColumnModel().getColumn(1).setPreferredWidth(150);
            TableEmpleado.getColumnModel().getColumn(2).setPreferredWidth(150);
            TableEmpleado.getColumnModel().getColumn(3).setPreferredWidth(150);
            TableEmpleado.getColumnModel().getColumn(4).setPreferredWidth(130);
            TableEmpleado.getColumnModel().getColumn(5).setPreferredWidth(230);
            TableEmpleado.getColumnModel().getColumn(6).setPreferredWidth(150);
            TableEmpleado.getColumnModel().getColumn(7).setPreferredWidth(150);
            TableEmpleado.getColumnModel().getColumn(8).setPreferredWidth(150);
            TableEmpleado.getColumnModel().getColumn(9).setPreferredWidth(75);
            TableEmpleado.getColumnModel().getColumn(10).setPreferredWidth(75);
            TableEmpleado.getColumnModel().getColumn(11).setPreferredWidth(100);
        }

        jLabel2.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(94, 52, 12));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Empleados");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 52, 12)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
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
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(panelBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelBtn13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBtn12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBtn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBtn13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        o[0] = "Ingrese RFC";
        o[1] = "Ingrese Nombre";
        o[2] = "Ingrese A paterno";
        o[3] = "Ingrese A materno";
        o[4] = "Fecha de nacimineto (dd/mm/aa)";
        o[5] = "Ingrese Correo";
        o[6] = "Ingrese Numero de seguro social";
        o[7] = "Ingrese Usuario";
        o[8] = "Ingrese Contraseña";
        o[9] = "Ingrese Cargo";
        o[10] = "Ingrese Horario";
        o[11] = "Ingrese Dirección";
        
        String NombreEvento = "Guardar";
        
        edtEmpleados edC = new edtEmpleados();
        edC.setVisible(true);
        edC.recibirObj(o, NombreEvento);
        filaSelect = -1;
        LimpiarTabla();
        ListarEmpleados();
        
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
      
        filaSelect = TableEmpleado.getSelectedRow();
        if (filaSelect != -1){
            o[0] = TableEmpleado.getValueAt(filaSelect, 0).toString();
            o[1] = TableEmpleado.getValueAt(filaSelect, 1).toString();
            o[2] = TableEmpleado.getValueAt(filaSelect, 2).toString();
            o[3] = TableEmpleado.getValueAt(filaSelect, 3).toString();
            
            String fecha = TableEmpleado.getValueAt(filaSelect, 4).toString();
            String[] nuevoFormato=fecha.split("-");
            String anio =nuevoFormato[0];
            String mes = nuevoFormato[1];
            String dia = nuevoFormato[2];
            dia=dia.substring(0,2);
            
            String re = dia+"/"+mes+"/"+anio;
            o[4] =re;
            
            
            
            o[5] = TableEmpleado.getValueAt(filaSelect, 5).toString();
            o[6] = TableEmpleado.getValueAt(filaSelect, 6).toString();
            o[7] = TableEmpleado.getValueAt(filaSelect, 7).toString();
            o[8] = TableEmpleado.getValueAt(filaSelect, 8).toString();
            o[9] = TableEmpleado.getValueAt(filaSelect, 9).toString();
            o[10] = TableEmpleado.getValueAt(filaSelect, 10).toString();
            o[11] = TableEmpleado.getValueAt(filaSelect, 11).toString();

            String NombreEvento = "Actualizar";

            edtEmpleados edC = new edtEmpleados();
            edC.setVisible(true);
            edC.recibirObj(o, NombreEvento);
            filaSelect = -1;
            LimpiarTabla();
            ListarEmpleados();
        }else{
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        }
        
        LimpiarTabla();
        ListarEmpleados();
    }//GEN-LAST:event_btnEditarMouseClicked

    private void lblDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteMouseClicked
        filaSelect = TableEmpleado.getSelectedRow();
        if (filaSelect != -1){
            o[0] = TableEmpleado.getValueAt(filaSelect, 0).toString();
            o[1] = TableEmpleado.getValueAt(filaSelect, 1).toString();
            o[2] = TableEmpleado.getValueAt(filaSelect, 2).toString();
            o[3] = TableEmpleado.getValueAt(filaSelect, 3).toString();
            o[4] = TableEmpleado.getValueAt(filaSelect, 4).toString();
            o[5] = TableEmpleado.getValueAt(filaSelect, 5).toString();
            o[6] = TableEmpleado.getValueAt(filaSelect, 6).toString();
            o[7] = TableEmpleado.getValueAt(filaSelect, 7).toString();
            o[8] = TableEmpleado.getValueAt(filaSelect, 8).toString();
            o[9] = TableEmpleado.getValueAt(filaSelect, 9).toString();
            o[10] = TableEmpleado.getValueAt(filaSelect, 10).toString();
            o[11] = TableEmpleado.getValueAt(filaSelect, 11).toString();

            int pregunta = JOptionPane.showConfirmDialog(null, "¿Seguro de eliminar el registro del empleado " + o[1].toString() + " " + o[2].toString() + " " + o[3].toString() + " ?");
            if (pregunta == 0) {
                int pregunta2 = JOptionPane.showConfirmDialog(null, "¿Está muy seguro de eliminar el registro del empleado " + o[1].toString() + " " + o[2].toString() + " " + o[3].toString() + " ?");
                if(pregunta2==0){
                    int pregunta3 = JOptionPane.showConfirmDialog(null, "¿Está muy muy seguro de eliminar el registro del empleado " + o[1].toString() + " " + o[2].toString() + " " + o[3].toString() + " ?, recuerda que esta acción no se puede deshacer...");
                    if(pregunta3==0){
                        //JOptionPane.showMessageDialog(null, "No tienes permisos para borrar a otro empleado... :D ");
                        emx.BorrarEmpleado(o[0].toString()); //preguntamos y confirmamos el registro 
                        LimpiarTabla();
                        ListarEmpleados();  
                    }
                }
            }
            
            filaSelect = -1;
            LimpiarTabla();
            ListarEmpleados();
        }else{
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        }
    }//GEN-LAST:event_lblDeleteMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        LimpiarTabla();
        ListarEmpleados();
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tablas.Table TableEmpleado;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDelete;
    private paneles.PanelBtn1 panelBtn11;
    private paneles.PanelBtn1 panelBtn12;
    private paneles.PanelBtn1 panelBtn13;
    // End of variables declaration//GEN-END:variables
}
