
package paneles;

import Editores.edtDirecciones;
import clases.Direcciones;
import conexiones.DireccionesConexion;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class form_direccion extends javax.swing.JPanel {


    static DefaultTableModel modelo = new DefaultTableModel();

    Direcciones dr = new Direcciones();                           //Clase de encapusulamineto
    DireccionesConexion dirx = new DireccionesConexion();          //Clase de conexion

    Object[] o = new Object[8];
    static public Object[] ORecibe = new Object[4];

    int filaSelect = -1;

    
    public form_direccion() {
        initComponents();
        LimpiarTabla();
        ListarDir();
    }

    public void ListarDir() {
        List<Direcciones> ListarDir = dirx.ListarDirecciones(); //Llamamos al metodo para hacer la lista de clientes 
        //Este metodo hace la peticion, y lista los clinetes de los resultados

        modelo = (DefaultTableModel) TableDir.getModel(); //Optenemos el modelo de la tabla
        Object[] obj = new Object[8];   //Creamos un objeto para meter ahi los datos 
        for (int i = 0; i < ListarDir.size(); i++) {
            obj[0] = ListarDir.get(i).getIdDir();        //otenemos los valores de cada indice en el objeto
            obj[1] = ListarDir.get(i).getAlc_mun();
            obj[2] = ListarDir.get(i).getColonia();
            obj[3] = ListarDir.get(i).getCp();
            obj[4] = ListarDir.get(i).getCall();
            obj[5] = ListarDir.get(i).getExt();
            obj[6] = ListarDir.get(i).getInte();
            obj[7] = ListarDir.get(i).getEstado_id();
            modelo.addRow(obj); //una vez obetenidos agregamos la nueva fila a la tabla 
        }
        TableDir.setModel(modelo); //ahora agregamos el modelo a la tabla 
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
        TableDir = new tablas.Table();
        panelBtn11 = new paneles.PanelBtn1();
        btnEdt = new javax.swing.JLabel();
        panelBtn13 = new paneles.PanelBtn1();
        btnDelete = new javax.swing.JLabel();
        panelBtn18 = new paneles.PanelBtn1();
        btnAdd = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 233, 204));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setName(""); // NOI18N

        TableDir.setBackground(new java.awt.Color(251, 246, 235));
        TableDir.setForeground(new java.awt.Color(94, 52, 12));
        TableDir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Alc/Mun", "Colonia", "CP", "Calle", "#Exterior", "#Interior", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableDir.setAlignmentX(2.0F);
        TableDir.setAlignmentY(2.0F);
        TableDir.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TableDir.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        TableDir.setSelectionBackground(new java.awt.Color(133, 79, 39));
        jScrollPane1.setViewportView(TableDir);
        if (TableDir.getColumnModel().getColumnCount() > 0) {
            TableDir.getColumnModel().getColumn(0).setPreferredWidth(100);
            TableDir.getColumnModel().getColumn(1).setPreferredWidth(200);
            TableDir.getColumnModel().getColumn(2).setPreferredWidth(220);
            TableDir.getColumnModel().getColumn(3).setPreferredWidth(150);
            TableDir.getColumnModel().getColumn(4).setPreferredWidth(300);
            TableDir.getColumnModel().getColumn(5).setPreferredWidth(75);
            TableDir.getColumnModel().getColumn(6).setPreferredWidth(75);
            TableDir.getColumnModel().getColumn(7).setPreferredWidth(75);
        }

        btnEdt.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        btnEdt.setForeground(new java.awt.Color(94, 52, 12));
        btnEdt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEdt.setText("Editar");
        btnEdt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEdtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn11Layout = new javax.swing.GroupLayout(panelBtn11);
        panelBtn11.setLayout(panelBtn11Layout);
        panelBtn11Layout.setHorizontalGroup(
            panelBtn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEdt, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn11Layout.setVerticalGroup(
            panelBtn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEdt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnDelete.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(94, 52, 12));
        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDelete.setText("Eliminar");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn13Layout = new javax.swing.GroupLayout(panelBtn13);
        panelBtn13.setLayout(panelBtn13Layout);
        panelBtn13Layout.setHorizontalGroup(
            panelBtn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn13Layout.setVerticalGroup(
            panelBtn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
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

        javax.swing.GroupLayout panelBtn18Layout = new javax.swing.GroupLayout(panelBtn18);
        panelBtn18.setLayout(panelBtn18Layout);
        panelBtn18Layout.setHorizontalGroup(
            panelBtn18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn18Layout.setVerticalGroup(
            panelBtn18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 52, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Direcciones");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 52, 12)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
                        .addComponent(panelBtn18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelBtn13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBtn13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBtn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBtn18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        int numerornd = (int) (Math.random() * 99 + 1);

        
        String id = "DE"+numerornd;
        o[0] = id;
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
        filaSelect = -1;
        LimpiarTabla();
        ListarDir();
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnEdtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEdtMouseClicked
        
        filaSelect = TableDir.getSelectedRow();
        if (filaSelect != -1){
            o[0] = TableDir.getValueAt(filaSelect, 0).toString();
            o[1] = TableDir.getValueAt(filaSelect, 1).toString();
            o[2] = TableDir.getValueAt(filaSelect, 2).toString();
            o[3] = TableDir.getValueAt(filaSelect, 3).toString();
            o[4] = TableDir.getValueAt(filaSelect, 4).toString();
            o[5] = TableDir.getValueAt(filaSelect, 5).toString();
            o[6] = TableDir.getValueAt(filaSelect, 6).toString();
            o[7] = TableDir.getValueAt(filaSelect, 7).toString();
            

            String NombreEvento = "Actualizar";

            edtDirecciones edC = new edtDirecciones();
            edC.setVisible(true);
            edC.recibirObj(o, NombreEvento);
            filaSelect = -1;
            LimpiarTabla();
            ListarDir();
        }else{
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        }
        
        
    }//GEN-LAST:event_btnEdtMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        
        filaSelect = TableDir.getSelectedRow();
        if (filaSelect != -1){
            o[0] = TableDir.getValueAt(filaSelect, 0).toString();
            o[1] = TableDir.getValueAt(filaSelect, 1).toString();
            o[2] = TableDir.getValueAt(filaSelect, 2).toString();
            o[3] = TableDir.getValueAt(filaSelect, 3).toString();
            o[4] = TableDir.getValueAt(filaSelect, 4).toString();
            o[5] = TableDir.getValueAt(filaSelect, 5).toString();
            o[6] = TableDir.getValueAt(filaSelect, 6).toString();
            o[7] = TableDir.getValueAt(filaSelect, 7).toString();

            int pregunta = JOptionPane.showConfirmDialog(null, "¿Seguro de eliminar el registro esta dirección " + o[1].toString() + " " + o[2].toString() + " " + o[3].toString() + " ?");
            if (pregunta == 0) {
                int pregunta2 = JOptionPane.showConfirmDialog(null, "¿Está muy seguro de eliminar el registro esta dirección " + o[1].toString() + " " + o[2].toString() + " " + o[3].toString() + " ?");
                if(pregunta2==0){
                    int pregunta3 = JOptionPane.showConfirmDialog(null, "¿Está muy muy seguro de eliminar el registro esta dirección " + o[1].toString() + " " + o[2].toString() + " " + o[3].toString() + " ?, recuerda que esta acción no se puede deshacer...");
                    if(pregunta3==0){
                       // JOptionPane.showMessageDialog(null, "No tienes permisos para borrar direcciones... :D ");
                        dirx.BorrarDir(o[0].toString()); //preguntamos y confirmamos el registro 
                        LimpiarTabla();
                        ListarDir();  
                    }
                }
            }
            
            filaSelect = -1;
            LimpiarTabla();
            ListarDir();
        }else{
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        }
        
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        LimpiarTabla();
            ListarDir();
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tablas.Table TableDir;
    private javax.swing.JLabel btnAdd;
    private javax.swing.JLabel btnDelete;
    private javax.swing.JLabel btnEdt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private paneles.PanelBtn1 panelBtn11;
    private paneles.PanelBtn1 panelBtn13;
    private paneles.PanelBtn1 panelBtn18;
    // End of variables declaration//GEN-END:variables
}
