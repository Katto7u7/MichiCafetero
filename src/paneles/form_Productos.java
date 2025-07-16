package paneles;

import Editores.edtProductos;
import clases.Productos;
import conexiones.ProductoConexion;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class form_Productos extends javax.swing.JPanel {

    static DefaultTableModel modelo = new DefaultTableModel();

    Productos cl = new Productos();                           //Clase de encapusulamineto
    ProductoConexion clx = new ProductoConexion();          //Clase de conexion

    Object[] o = new Object[8];
    static public Object[] ORecibe = new Object[8];///**SE AGREGÓ STOCK 15/12/2022

    int filaSelect = -1;

    
    public form_Productos() {
        initComponents();
        LimpiarTabla();
        ListarProductos();
    }
    
    public void ListarProductos() {
        List<Productos> ListarCl = clx.ListarProductos(); //Llamamos al metodo para hacer la lista de clientes 
        //Este metodo hace la peticion, y lista los clinetes de los resultados

        modelo = (DefaultTableModel) TableProductos.getModel(); //Optenemos el modelo de la tabla
        Object[] obj = new Object[8];   //Creamos un objeto para meter ahi los datos 
        for (int i = 0; i < ListarCl.size(); i++) {
            obj[0] = ListarCl.get(i).getID();        //otenemos los valores de cada indice en el objeto
            obj[1] = ListarCl.get(i).getNOMBRE();
            obj[2] = ListarCl.get(i).getPRECIO();
            obj[3] = ListarCl.get(i).getPRESENTACION();
            obj[4] = ListarCl.get(i).getCALORIAS();
            obj[5] = ListarCl.get(i).getDESCRIPCCION();
            obj[6] = ListarCl.get(i).getCLASIFICACION();
            obj[7] = ListarCl.get(i).getSTOCK(); ///**SE AGREGÓ STOCK 15/12/2022
            modelo.addRow(obj); //una vez obetenidos agregamos la nueva fila a la tabla 
        }
        TableProductos.setModel(modelo); //ahora agregamos el modelo a la tabla 
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
        TableProductos = new tablas.Table();
        panelBtn11 = new paneles.PanelBtn1();
        btndelete = new javax.swing.JLabel();
        panelBtn12 = new paneles.PanelBtn1();
        btnEtd = new javax.swing.JLabel();
        panelBtn13 = new paneles.PanelBtn1();
        btnAdd = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 233, 204));

        TableProductos.setBackground(new java.awt.Color(251, 246, 235));
        TableProductos.setForeground(new java.awt.Color(94, 52, 12));
        TableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "PRECIO", "PRESENTACION", "CALORIAS", "DESCRIPCION", "CLASIFICACION", "STOCK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableProductos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TableProductos.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        TableProductos.setSelectionBackground(new java.awt.Color(133, 79, 39));
        jScrollPane1.setViewportView(TableProductos);
        if (TableProductos.getColumnModel().getColumnCount() > 0) {
            TableProductos.getColumnModel().getColumn(0).setPreferredWidth(150);
            TableProductos.getColumnModel().getColumn(1).setPreferredWidth(150);
            TableProductos.getColumnModel().getColumn(2).setPreferredWidth(120);
            TableProductos.getColumnModel().getColumn(3).setPreferredWidth(75);
            TableProductos.getColumnModel().getColumn(4).setPreferredWidth(100);
            TableProductos.getColumnModel().getColumn(5).setPreferredWidth(400);
            TableProductos.getColumnModel().getColumn(6).setPreferredWidth(75);
            TableProductos.getColumnModel().getColumn(7).setPreferredWidth(75);
        }

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

        btnEtd.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        btnEtd.setForeground(new java.awt.Color(94, 52, 12));
        btnEtd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEtd.setText("Editar");
        btnEtd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEtd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEtdMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn12Layout = new javax.swing.GroupLayout(panelBtn12);
        panelBtn12.setLayout(panelBtn12Layout);
        panelBtn12Layout.setHorizontalGroup(
            panelBtn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEtd, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn12Layout.setVerticalGroup(
            panelBtn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEtd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAdd.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(94, 52, 12));
        btnAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdd.setText("Añadir");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn13Layout = new javax.swing.GroupLayout(panelBtn13);
        panelBtn13.setLayout(panelBtn13Layout);
        panelBtn13Layout.setHorizontalGroup(
            panelBtn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn13Layout.setVerticalGroup(
            panelBtn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 52, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Productos");
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

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        int numerornd = (int) (Math.random() * 999 + 1);

        String id = "P"+numerornd;
        o[0] = id;
        o[1] = "Ingrese Nombre";
        o[2] = "Ingrese Precio";
        o[3] = "Ingrese Presentacion";
        o[4] = "Ingrese Calorias";
        o[5] = "Ingrese Descripcion";
        o[6] = "Ingrese Clasificacion";
        o[7] = "Ingrese Stock";
        
        String NombreEvento = "Guardar";
        
        edtProductos edC = new edtProductos();
        edC.setVisible(true);
        edC.recibirObj(o, NombreEvento);
        filaSelect = -1;
        LimpiarTabla();
        ListarProductos();
        
        
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnEtdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEtdMouseClicked
       
        filaSelect = TableProductos.getSelectedRow();
        if (filaSelect != -1){
            o[0] = TableProductos.getValueAt(filaSelect, 0).toString();
            o[1] = TableProductos.getValueAt(filaSelect, 1).toString();
            o[2] = TableProductos.getValueAt(filaSelect, 2).toString();
            o[3] = TableProductos.getValueAt(filaSelect, 3).toString();
            o[4] = TableProductos.getValueAt(filaSelect, 4).toString();
            o[5] = TableProductos.getValueAt(filaSelect, 5).toString();
            o[6] = TableProductos.getValueAt(filaSelect, 6).toString();
            o[7] = TableProductos.getValueAt(filaSelect, 7).toString();
            

            String NombreEvento = "Actualizar";

            edtProductos edC = new edtProductos();
            edC.setVisible(true);
            edC.recibirObj(o, NombreEvento);
            filaSelect = -1;
            LimpiarTabla();
            ListarProductos();
        }else{
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        }
        
    }//GEN-LAST:event_btnEtdMouseClicked

    private void btndeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeleteMouseClicked
       
        filaSelect = TableProductos.getSelectedRow();
        if (filaSelect != -1){
            o[0] = TableProductos.getValueAt(filaSelect, 0).toString();
            o[1] = TableProductos.getValueAt(filaSelect, 1).toString();
            o[2] = TableProductos.getValueAt(filaSelect, 2).toString();
            o[3] = TableProductos.getValueAt(filaSelect, 3).toString();
            o[4] = TableProductos.getValueAt(filaSelect, 4).toString();
            o[5] = TableProductos.getValueAt(filaSelect, 5).toString();
            o[6] = TableProductos.getValueAt(filaSelect, 6).toString();
            o[7] = TableProductos.getValueAt(filaSelect, 7).toString();

            int pregunta = JOptionPane.showConfirmDialog(null, "¿Seguro de eliminar el producto " + o[2].toString()+" ?");
            if (pregunta == 0) {

                
                clx.BorrarProductos(o[0].toString()); //preguntamos y confirmamos el registro 
                JOptionPane.showMessageDialog(null, "Producto eliminado... :D ");
                LimpiarTabla();
                ListarProductos();
                
            }
            
            filaSelect = -1;
            LimpiarTabla();
            ListarProductos();
        }else{
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        }
        
        
        
    }//GEN-LAST:event_btndeleteMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        LimpiarTabla();
            ListarProductos();
    }//GEN-LAST:event_jLabel1MouseClicked

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tablas.Table TableProductos;
    private javax.swing.JLabel btnAdd;
    private javax.swing.JLabel btnEtd;
    private javax.swing.JLabel btndelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private paneles.PanelBtn1 panelBtn11;
    private paneles.PanelBtn1 panelBtn12;
    private paneles.PanelBtn1 panelBtn13;
    // End of variables declaration//GEN-END:variables
}
