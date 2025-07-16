
package paneles;

import Editores.edtProvedor;
import clases.Provedor;
import conexiones.ProvedorConexion;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class form_Provedor extends javax.swing.JPanel {

    
    static DefaultTableModel modelo = new DefaultTableModel();

    Provedor cl = new Provedor();                           //Clase de encapusulamineto
    ProvedorConexion clx = new ProvedorConexion();          //Clase de conexion

    Object[] o = new Object[2];
    static public Object[] ORecibe = new Object[4];

    int filaSelect = -1;

    public form_Provedor() {
        initComponents();
        LimpiarTabla();
        ListarProvedores();
        
    }
    
    public void ListarProvedores() {
        List<Provedor> ListarCl = clx.ListarProvedores(); //Llamamos al metodo para hacer la lista de clientes 
        //Este metodo hace la peticion, y lista los clinetes de los resultados

        modelo = (DefaultTableModel) TableProv.getModel(); //Optenemos el modelo de la tabla
        Object[] obj = new Object[2];   //Creamos un objeto para meter ahi los datos 
        for (int i = 0; i < ListarCl.size(); i++) {
            obj[0] = ListarCl.get(i).getIDPROV();       //otenemos los valores de cada indice en el objeto
            obj[1] = ListarCl.get(i).getPROV();
            modelo.addRow(obj); //una vez obetenidos agregamos la nueva fila a la tabla 
        }
        TableProv.setModel(modelo); //ahora agregamos el modelo a la tabla 
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TableProv = new tablas.Table();
        panelBtn11 = new paneles.PanelBtn1();
        btndelete = new javax.swing.JLabel();
        panelBtn12 = new paneles.PanelBtn1();
        btnedt = new javax.swing.JLabel();
        panelBtn13 = new paneles.PanelBtn1();
        btnadd = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 233, 204));

        TableProv.setBackground(new java.awt.Color(251, 246, 235));
        TableProv.setForeground(new java.awt.Color(94, 52, 12));
        TableProv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE PROVEEDOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableProv.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        TableProv.setSelectionBackground(new java.awt.Color(133, 79, 39));
        jScrollPane1.setViewportView(TableProv);

        btndelete.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(94, 52, 12));
        btndelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btndelete.setText("Eliminar");
        btndelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndeleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn11Layout = new javax.swing.GroupLayout(panelBtn11);
        panelBtn11.setLayout(panelBtn11Layout);
        panelBtn11Layout.setHorizontalGroup(
            panelBtn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn11Layout.setVerticalGroup(
            panelBtn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnedt.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        btnedt.setForeground(new java.awt.Color(94, 52, 12));
        btnedt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnedt.setText("Editar");
        btnedt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnedt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnedtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn12Layout = new javax.swing.GroupLayout(panelBtn12);
        panelBtn12.setLayout(panelBtn12Layout);
        panelBtn12Layout.setHorizontalGroup(
            panelBtn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnedt, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn12Layout.setVerticalGroup(
            panelBtn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnedt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnadd.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(94, 52, 12));
        btnadd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnadd.setText("Añadir");
        btnadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnaddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn13Layout = new javax.swing.GroupLayout(panelBtn13);
        panelBtn13.setLayout(panelBtn13Layout);
        panelBtn13Layout.setHorizontalGroup(
            panelBtn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn13Layout.setVerticalGroup(
            panelBtn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 52, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Proveedores");
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBtn13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBtn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBtn12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBtn13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaddMouseClicked
        int numerornd = (int) (Math.random() * 99+ 1);

        String id="PV"+numerornd;
        o[0] = id;
        
        o[1] = "Nombre del provedor";
        
        String NombreEvento = "Guardar";
        
        edtProvedor edC = new edtProvedor();
        edC.setVisible(true);
        edC.recibirObj(o, NombreEvento);
        filaSelect = -1;
        LimpiarTabla();
        ListarProvedores();
        
    }//GEN-LAST:event_btnaddMouseClicked

    private void btnedtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnedtMouseClicked
        filaSelect = TableProv.getSelectedRow();
        if (filaSelect != -1) {
            o[0] = TableProv.getValueAt(filaSelect, 0).toString();
            o[1] = TableProv.getValueAt(filaSelect, 1).toString();

            String NombreEvento = "Actualizar";

            edtProvedor edC = new edtProvedor();
            edC.setVisible(true);
            edC.recibirObj(o, NombreEvento);
            filaSelect = -1;
            LimpiarTabla();
            ListarProvedores();
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        }
    }//GEN-LAST:event_btnedtMouseClicked

    private void btndeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeleteMouseClicked
        filaSelect = TableProv.getSelectedRow();
        if (filaSelect != -1){
            o[0] = TableProv.getValueAt(filaSelect, 0).toString();
            o[1] = TableProv.getValueAt(filaSelect, 1).toString();


            int pregunta = JOptionPane.showConfirmDialog(null, "¿Seguro de eliminar el registro del Proveedor " + o[1].toString() + " ?");
            if (pregunta == 0) {

               // JOptionPane.showMessageDialog(null, "No tienes permisos para borrar a otro empleado... :D ");
                clx.BorrarProvedor(o[0].toString()); //preguntamos y confirmamos el registro 
                LimpiarTabla();
                ListarProvedores();

            }
            
            filaSelect = -1;
            LimpiarTabla();
            ListarProvedores();
        }else{
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        }
        
        
    }//GEN-LAST:event_btndeleteMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        LimpiarTabla();
            ListarProvedores();
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tablas.Table TableProv;
    private javax.swing.JLabel btnadd;
    private javax.swing.JLabel btndelete;
    private javax.swing.JLabel btnedt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private paneles.PanelBtn1 panelBtn11;
    private paneles.PanelBtn1 panelBtn12;
    private paneles.PanelBtn1 panelBtn13;
    // End of variables declaration//GEN-END:variables
}
