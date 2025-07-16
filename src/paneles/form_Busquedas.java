
package paneles;

import clases.VentasPorEmpleado;
import conexiones.EmpleadosConexion;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class form_Busquedas extends javax.swing.JPanel {

    EmpleadosConexion emX = new EmpleadosConexion();
    VentasPorEmpleado vpe = new VentasPorEmpleado();
    public form_Busquedas() {
        initComponents();
        emX.ConsultarEmpleado(ComboBoxEmp);
    }

   public void ListarCargoEmpleado(String RFC){
        DefaultTableModel modelo = new DefaultTableModel();
         List<VentasPorEmpleado> Listar = emX.ListarVentasPorEmpleado(vpe, RFC);
        //modelo = (DefaultTableModel) TableInfo.getModel(); //Optenemos el modelo de la tabla
        Object[] obj = new Object[8];   //Creamos un objeto para meter ahi los datos 
        for(int i=0;i<8;i++){
            switch(i){
                         case 0:
                             modelo.addColumn("RFC");
                         break;    
                         case 1:
                             modelo.addColumn("NOMBRE EMPLEADO");
                         break;
                         case 2:
                             modelo.addColumn("APELLIDO PAT");
                         break;
                         case 3:
                             modelo.addColumn("APELLIDO MAT");
                         break;
                         case 4:
                             modelo.addColumn("ID VENTA");
                         break;
                         case 5:
                             modelo.addColumn("FECHA VENTA");
                         break;
                         case 6:
                             modelo.addColumn("PRODUCTO");
                         break;
                         case 7:
                             modelo.addColumn("CANTIDAD");
                         break;
                         default:
                             modelo.addColumn("N/A");
                         break;
                     }
        }
        for (int i = 0; i < Listar.size(); i++) {
            obj[0] = Listar.get(i).getRFC();
            obj[1] = Listar.get(i).getNOMBREEMP();
            obj[2] = Listar.get(i).getAPELLIDOPAT();
            obj[3] = Listar.get(i).getAPELLIDOMAT();
            obj[4] = Listar.get(i).getIDVENTA();
            obj[5] = Listar.get(i).getFECHAVENTA();
            obj[6] = Listar.get(i).getNOMBREPROD();
            obj[7] = Listar.get(i).getCANTIDAD();
            modelo.addRow(obj); //una vez obetenidos agregamos la nueva fila a la tabla 
        }
        table1.setModel(modelo); //ahora agregamos el modelo a la tabla 
    }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ComboBoxEmp = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnComprasEmpleado = new javax.swing.JLabel();
        btnVentasEmp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new tablas.Table();

        jPanel1.setBackground(new java.awt.Color(245, 233, 204));

        jLabel1.setFont(new java.awt.Font("Roboto Mono", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 52, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultar información");

        ComboBoxEmp.setBackground(new java.awt.Color(251, 246, 235));
        ComboBoxEmp.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        ComboBoxEmp.setForeground(new java.awt.Color(94, 52, 12));
        ComboBoxEmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".........." }));
        ComboBoxEmp.setBorder(null);
        ComboBoxEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxEmpActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(94, 52, 12));
        jLabel2.setText("Seleccione Empleado");

        jLabel3.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(94, 52, 12));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Información Disponible");

        btnComprasEmpleado.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        btnComprasEmpleado.setForeground(new java.awt.Color(94, 52, 12));
        btnComprasEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnComprasEmpleado.setText("Consultar compras del empleado");
        btnComprasEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 52, 12)));
        btnComprasEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnVentasEmp.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        btnVentasEmp.setForeground(new java.awt.Color(94, 52, 12));
        btnVentasEmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVentasEmp.setText("Consultar ventas del empleado");
        btnVentasEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 52, 12)));
        btnVentasEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        table1.setBackground(new java.awt.Color(251, 246, 235));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVentasEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnComprasEmpleado))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVentasEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btnComprasEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxEmpActionPerformed
        String RFC=ComboBoxEmp.getSelectedItem().toString().substring(0,10);
        ListarCargoEmpleado(RFC);
    }//GEN-LAST:event_ComboBoxEmpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxEmp;
    private javax.swing.JLabel btnComprasEmpleado;
    private javax.swing.JLabel btnVentasEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private tablas.Table table1;
    // End of variables declaration//GEN-END:variables
}
