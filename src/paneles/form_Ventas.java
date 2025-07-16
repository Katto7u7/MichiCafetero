
package paneles;

import clases.Ventas;
import conexiones.VentaConexion;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import static paneles.form_clientes.modelo;



public class form_Ventas extends javax.swing.JPanel {

    static DefaultTableModel modelo = new DefaultTableModel();

    Ventas cl = new Ventas();                           //Clase de encapusulamineto
    VentaConexion clx = new VentaConexion();          //Clase de conexion

    Object[] o = new Object[4];
    static public Object[] ORecibe = new Object[4];

    int filaSelect = -1;
    
    public form_Ventas() {
        initComponents();
        LimpiarTabla(); 
        ListarVentas();
    }

    public void ListarVentas() {
        List<Ventas> ListarCl = clx.ListarVentas(); //Llamamos al metodo para hacer la lista de clientes 
        //Este metodo hace la peticion, y lista los clinetes de los resultados

        modelo = (DefaultTableModel) TableVentas.getModel(); //Optenemos el modelo de la tabla
        Object[] obj = new Object[5];   //Creamos un objeto para meter ahi los datos 
        for (int i = 0; i < ListarCl.size(); i++) {
            obj[0] = ListarCl.get(i).getID();        //otenemos los valores de cada indice en el objeto
            obj[1] = ListarCl.get(i).getFECHA();
            obj[2] = ListarCl.get(i).getMETODO();
            obj[3] = ListarCl.get(i).getCLIENTEID();
            obj[4] = ListarCl.get(i).getRFCEMPLEADO();
            modelo.addRow(obj); //una vez obetenidos agregamos la nueva fila a la tabla 
        }
        TableVentas.setModel(modelo); //ahora agregamos el modelo a la tabla 
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
        TableVentas = new tablas.Table();

        setBackground(new java.awt.Color(245, 233, 204));

        TableVentas.setBackground(new java.awt.Color(251, 246, 235));
        TableVentas.setForeground(new java.awt.Color(94, 52, 12));
        TableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FECHA DE VENTA", "METODO DE PAGO", "CLIENTE", "EMPLEADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableVentas.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        TableVentas.setSelectionBackground(new java.awt.Color(133, 79, 39));
        jScrollPane1.setViewportView(TableVentas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tablas.Table TableVentas;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
