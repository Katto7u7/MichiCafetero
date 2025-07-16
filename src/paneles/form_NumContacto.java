
package paneles;

import Editores.edtNumContacto;
import clases.NumContacto;
import conexiones.NumContactoConexion;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class form_NumContacto extends javax.swing.JPanel {

    static DefaultTableModel modelo = new DefaultTableModel();

    NumContacto cl = new NumContacto();                           //Clase de encapusulamineto
    NumContactoConexion clx = new NumContactoConexion();          //Clase de conexion

    Object[] o = new Object[5];
    static public Object[] ORecibe = new Object[5];

    int filaSelect = -1;

    public form_NumContacto() {
        initComponents();
        LimpiarTabla();
        ListarNumContacto();
    }
    
    public void ListarNumContacto() {
        List<NumContacto> ListarNC = clx.ListarNumContacto(); //Llamamos al metodo para hacer la lista de clientes 
        //Este metodo hace la peticion, y lista los clinetes de los resultados

        modelo = (DefaultTableModel) TableNumCont.getModel(); //Optenemos el modelo de la tabla
        Object[] obj = new Object[5];   //Creamos un objeto para meter ahi los datos 
        for (int i = 0; i < ListarNC.size(); i++) {
            obj[0] = ListarNC.get(i).getID_NUMC();        //otenemos los valores de cada indice en el objeto
            obj[1] = ListarNC.get(i).getLADA();
            obj[2] = ListarNC.get(i).getTEL();
            obj[3] = ListarNC.get(i).getEXTENSION();
            obj[4] = ListarNC.get(i).getRFC_EMP();
            modelo.addRow(obj); //una vez obetenidos agregamos la nueva fila a la tabla 
        }
        TableNumCont.setModel(modelo); //ahora agregamos el modelo a la tabla 
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
        TableNumCont = new tablas.Table();
        panelBtn11 = new paneles.PanelBtn1();
        btnDelete = new javax.swing.JLabel();
        panelBtn12 = new paneles.PanelBtn1();
        btnEdt = new javax.swing.JLabel();
        panelBtn13 = new paneles.PanelBtn1();
        btnAdd = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 233, 204));

        TableNumCont.setBackground(new java.awt.Color(251, 246, 235));
        TableNumCont.setForeground(new java.awt.Color(94, 52, 12));
        TableNumCont.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "LADA", "TELEFONO", "EXTENSION", "RFC DE EMPLEADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableNumCont.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        TableNumCont.setSelectionBackground(new java.awt.Color(133, 79, 39));
        jScrollPane1.setViewportView(TableNumCont);
        if (TableNumCont.getColumnModel().getColumnCount() > 0) {
            TableNumCont.getColumnModel().getColumn(0).setPreferredWidth(150);
            TableNumCont.getColumnModel().getColumn(1).setPreferredWidth(100);
            TableNumCont.getColumnModel().getColumn(2).setPreferredWidth(200);
            TableNumCont.getColumnModel().getColumn(3).setPreferredWidth(75);
            TableNumCont.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

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

        javax.swing.GroupLayout panelBtn11Layout = new javax.swing.GroupLayout(panelBtn11);
        panelBtn11.setLayout(panelBtn11Layout);
        panelBtn11Layout.setHorizontalGroup(
            panelBtn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn11Layout.setVerticalGroup(
            panelBtn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        javax.swing.GroupLayout panelBtn12Layout = new javax.swing.GroupLayout(panelBtn12);
        panelBtn12.setLayout(panelBtn12Layout);
        panelBtn12Layout.setHorizontalGroup(
            panelBtn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEdt, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn12Layout.setVerticalGroup(
            panelBtn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEdt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        jLabel1.setText("Contactos");
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        int numerornd = (int) (Math.random() * 99 + 1);
        String id;
        
        if(numerornd<10){
            id =  numerornd+"E";
        }else if(numerornd>10){
            id =  numerornd+"A";
        }else{
            id =  numerornd+"I";
        }        
        o[0] = id;
        o[1] = "Ingrese LADA";
        o[2] = "Ingrese Telefono";
        o[3] = "Ingrese Extension";
        o[4] = "Ingrese RFC Empleado";
        
        String NombreEvento = "Guardar";
        
        edtNumContacto edC = new edtNumContacto();
        edC.setVisible(true);
        edC.recibirObj(o, NombreEvento);
        filaSelect = -1;
        LimpiarTabla();
        ListarNumContacto();
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnEdtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEdtMouseClicked
        filaSelect = TableNumCont.getSelectedRow();
        if (filaSelect != -1){
            o[0] = TableNumCont.getValueAt(filaSelect, 0).toString();
            o[1] = TableNumCont.getValueAt(filaSelect, 1).toString();
            o[2] = TableNumCont.getValueAt(filaSelect, 2).toString();
            o[3] = TableNumCont.getValueAt(filaSelect, 3).toString();
            o[4] = TableNumCont.getValueAt(filaSelect, 4).toString();
            

            String NombreEvento = "Actualizar";

            edtNumContacto edC = new edtNumContacto();
            edC.setVisible(true);
            edC.recibirObj(o, NombreEvento);
            filaSelect = -1;
            LimpiarTabla();
            ListarNumContacto();
        }else{
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        }
    }//GEN-LAST:event_btnEdtMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        filaSelect = TableNumCont.getSelectedRow();
        if (filaSelect != -1) {
            o[0] = TableNumCont.getValueAt(filaSelect, 0).toString();
            o[1] = TableNumCont.getValueAt(filaSelect, 1).toString();
            o[2] = TableNumCont.getValueAt(filaSelect, 2).toString();
            o[3] = TableNumCont.getValueAt(filaSelect, 3).toString();
            o[4] = TableNumCont.getValueAt(filaSelect, 4).toString();

            int pregunta = JOptionPane.showConfirmDialog(null, "¿Seguro de eliminar el registro del empleado " + o[1].toString() + " " + o[2].toString() + " " + o[3].toString() + " ?");
            if (pregunta == 0) {

                //JOptionPane.showMessageDialog(null, "No tienes permisos para borrar a otro empleado... :D ");
                clx.BorrarNumContacto(o[0].toString()); //preguntamos y confirmamos el registro 
                LimpiarTabla();
                ListarNumContacto();

            }

            filaSelect = -1;
            LimpiarTabla();
            ListarNumContacto();
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        LimpiarTabla();
        ListarNumContacto();
    }//GEN-LAST:event_jLabel1MouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tablas.Table TableNumCont;
    private javax.swing.JLabel btnAdd;
    private javax.swing.JLabel btnDelete;
    private javax.swing.JLabel btnEdt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private paneles.PanelBtn1 panelBtn11;
    private paneles.PanelBtn1 panelBtn12;
    private paneles.PanelBtn1 panelBtn13;
    // End of variables declaration//GEN-END:variables
}
