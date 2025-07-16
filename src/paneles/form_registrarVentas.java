
package paneles;

import Editores.edtCliente;
import clases.Clientes;
import clases.DetalleVenta;
import clases.Productos;
import clases.Ventas;
import conexiones.DetalleVentaConexion;
import conexiones.ProductoConexion;
import conexiones.VentaConexion;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class form_registrarVentas extends javax.swing.JPanel {

    static DefaultTableModel modelo = new DefaultTableModel();
    
    Clientes cl = new Clientes();
    
    Ventas venCon = new Ventas();
    VentaConexion clX = new VentaConexion();
    VentaConexion clX2 = new VentaConexion();
    
    DetalleVenta dv = new DetalleVenta();
    DetalleVentaConexion dvX = new DetalleVentaConexion();
    
    Productos probusqueda = new Productos();
    Productos ProBusquedaXNombre = new Productos();
    ProductoConexion prX = new ProductoConexion();
    
    
    int FilaSelect = -1;
    int itemTabla = 0;
    float TOTAL=0;
    
    
    Object[] obVenta = new Object[5];
    
    public form_registrarVentas() {
        initComponents();
        clX.ConsultarClientes(ComboBoxCliente);
        clX.ConsultarEmpleado(ComboBoxEmpleado);
        clX.ConsultarProductos(ComboBoxProducto);
        clX.ConsultarMetodo(ComboBoxMetodo);
    }

    public void TotalAPagar(){
        TOTAL=0;
        int numFila = tableCarrito.getRowCount();
        
        for(int i=0;i<numFila;i++){
            float cal = Float.parseFloat(String.valueOf(tableCarrito.getModel().getValueAt(i, 5)));
            TOTAL = TOTAL+cal;
        }
        lblTotal.setText("$"+String.format("%.2f", TOTAL));
        SpinnerCantidad.setValue(0);
    }
    
    public String FechaActual(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha= new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ComboBoxProducto = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnNuevoCliente = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        SpinnerCantidad = new javax.swing.JSpinner();
        lblStock = new javax.swing.JLabel();
        ComboBoxCliente = new javax.swing.JComboBox<>();
        ComboBoxEmpleado = new javax.swing.JComboBox<>();
        panelBtn11 = new paneles.PanelBtn1();
        lblConfirmarVenta = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JLabel();
        tfDesc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCarrito = new tablas.Table();
        jLabel8 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        addCart = new javax.swing.JLabel();
        ComboBoxMetodo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        btnDeleteCarrito = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 233, 204));

        jPanel1.setBackground(new java.awt.Color(245, 233, 204));

        jLabel4.setFont(new java.awt.Font("Roboto Mono", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(94, 52, 12));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nueva Venta");

        ComboBoxProducto.setBackground(new java.awt.Color(251, 246, 235));
        ComboBoxProducto.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        ComboBoxProducto.setForeground(new java.awt.Color(94, 52, 12));
        ComboBoxProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...." }));
        ComboBoxProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxProductoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(236, 211, 156));

        jLabel1.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 52, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Producto");

        jLabel3.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(94, 52, 12));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Descripcción ");

        jLabel5.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(94, 52, 12));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Precio");

        jLabel6.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(94, 52, 12));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cantidad");

        jLabel7.setFont(new java.awt.Font("Roboto Mono", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(94, 52, 12));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Stock");

        btnNuevoCliente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnNuevoCliente.setForeground(new java.awt.Color(94, 52, 12));
        btnNuevoCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNuevoCliente.setText("Cliente");
        btnNuevoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 52, 12)));
        btnNuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoClienteMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(94, 52, 12));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Empleado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNuevoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblPrecio.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(94, 52, 12));
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio.setText("Precio");
        lblPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 52, 12)));

        SpinnerCantidad.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        SpinnerCantidad.setBorder(null);

        lblStock.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        lblStock.setForeground(new java.awt.Color(94, 52, 12));
        lblStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStock.setText("Stock");
        lblStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 52, 12)));

        ComboBoxCliente.setBackground(new java.awt.Color(251, 246, 235));
        ComboBoxCliente.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        ComboBoxCliente.setForeground(new java.awt.Color(94, 52, 12));
        ComboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".........." }));
        ComboBoxCliente.setBorder(null);

        ComboBoxEmpleado.setBackground(new java.awt.Color(251, 246, 235));
        ComboBoxEmpleado.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        ComboBoxEmpleado.setForeground(new java.awt.Color(94, 52, 12));
        ComboBoxEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".........." }));
        ComboBoxEmpleado.setBorder(null);

        lblConfirmarVenta.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblConfirmarVenta.setForeground(new java.awt.Color(94, 52, 12));
        lblConfirmarVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConfirmarVenta.setText("CONFIRMAR");
        lblConfirmarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConfirmarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConfirmarVentaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn11Layout = new javax.swing.GroupLayout(panelBtn11);
        panelBtn11.setLayout(panelBtn11Layout);
        panelBtn11Layout.setHorizontalGroup(
            panelBtn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConfirmarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn11Layout.setVerticalGroup(
            panelBtn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConfirmarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLimpiar.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(94, 52, 12));
        btnLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 52, 12)));
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        tfDesc.setEditable(false);
        tfDesc.setBackground(new java.awt.Color(251, 246, 235));
        tfDesc.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N

        tableCarrito.setBackground(new java.awt.Color(251, 246, 235));
        tableCarrito.setForeground(new java.awt.Color(94, 52, 12));
        tableCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Producto", "Descipcción", "Precio", "Cantidad", "SubTotal", "Cliente", "Empleado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCarrito.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableCarrito.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        tableCarrito.setSelectionBackground(new java.awt.Color(166, 98, 40));
        jScrollPane1.setViewportView(tableCarrito);
        if (tableCarrito.getColumnModel().getColumnCount() > 0) {
            tableCarrito.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableCarrito.getColumnModel().getColumn(1).setPreferredWidth(150);
            tableCarrito.getColumnModel().getColumn(2).setPreferredWidth(350);
            tableCarrito.getColumnModel().getColumn(3).setPreferredWidth(75);
            tableCarrito.getColumnModel().getColumn(4).setPreferredWidth(100);
            tableCarrito.getColumnModel().getColumn(5).setPreferredWidth(100);
            tableCarrito.getColumnModel().getColumn(6).setPreferredWidth(300);
            tableCarrito.getColumnModel().getColumn(7).setPreferredWidth(320);
        }

        jLabel8.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(94, 52, 12));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Total:");

        lblTotal.setFont(new java.awt.Font("Roboto Mono", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(94, 52, 12));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("Total");

        addCart.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        addCart.setForeground(new java.awt.Color(94, 52, 12));
        addCart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addCart.setText("Añadir al carrito");
        addCart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 52, 12)));
        addCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCartMouseClicked(evt);
            }
        });

        ComboBoxMetodo.setBackground(new java.awt.Color(251, 246, 235));
        ComboBoxMetodo.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        ComboBoxMetodo.setForeground(new java.awt.Color(94, 52, 12));

        jLabel15.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(94, 52, 12));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Método de pago");

        btnDeleteCarrito.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        btnDeleteCarrito.setForeground(new java.awt.Color(94, 52, 12));
        btnDeleteCarrito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDeleteCarrito.setText("Borrar del carrito");
        btnDeleteCarrito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 52, 12)));
        btnDeleteCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteCarritoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDesc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(ComboBoxMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addCart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeleteCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(addCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SpinnerCantidad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComboBoxCliente)
                    .addComponent(ComboBoxEmpleado)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfDesc)
                    .addComponent(ComboBoxProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelBtn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxProductoActionPerformed
        String id;
        id=ComboBoxProducto.getSelectedItem().toString().substring(0,4);
        probusqueda= clX2.BuscarProd(id);
        tfDesc.setText(probusqueda.getDESCRIPCCION());
        lblPrecio.setText("$"+probusqueda.getPRECIO());
        lblStock.setText(probusqueda.getSTOCK()+"");
        /*String desc=clX2.BuscarDescProducto(id);
        int precio= clX2.BuscarPrecioProducto(id);
        
        tfDesc.setText(desc);
        lblPrecio.setText("$"+precio);
        
        int stock = clX2.BuscarStockDelProducto(id);
        lblStock.setText(stock+"");
        *///SE REMPLAZO LAS FUNCIONES POR UNA UNICA FUNCION QUE REGRESA LA CONSULTA ENCAPSUlada
    }//GEN-LAST:event_ComboBoxProductoActionPerformed

    private void addCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCartMouseClicked
       
        String clienteId = ComboBoxCliente.getSelectedItem().toString().substring(0, 9);
        // System.out.println(clienteId);

        String EmpID = ComboBoxEmpleado.getSelectedItem().toString().substring(0, 10);
        //System.out.println(EmpID);
        String prodID = ComboBoxProducto.getSelectedItem().toString().substring(0, 4);
        //System.out.println(prodID);
        probusqueda = clX2.BuscarProd(prodID);
        int metodo = Integer.parseInt(ComboBoxMetodo.getSelectedItem().toString().substring(0, 1));
        if (prodID == "....") {
            JOptionPane.showMessageDialog(null, "ATENCIÓN!! DEBE SELECCIONAR UN PRODUCTO");
        } else {
            if (".........".equals(clienteId)) {
                JOptionPane.showMessageDialog(null, "ATENCIÓN!! DEBE SELECCIONAR UN CLIENTE, si no lo encuentra debe realiza un nuevo registro de cliente...");
            } else {
                if (EmpID == "..........") {
                    JOptionPane.showMessageDialog(null, "ATENCIÓN!! DEBE SELECCIONAR UN EMPLEADO!!! ");
                } else {
                    //AKI SI VA EL CODIGO DESPUES DE HACER LAS COMPROBACIONES DE QUE ESOS CAMPOS NO ESTAN VACIOS
                    //System.out.println("EXITO");
                    String valorSpinner = SpinnerCantidad.getValue().toString();
                    int cantidad = Integer.parseInt(valorSpinner);
                    if (cantidad <= 0) {
                        JOptionPane.showMessageDialog(null, "ATENCIÓN!! DEBE SELECCIONAR MINIMO UNA CANTIDAD DE 1!!!");
                    } else {
                        //COMPROBACION PARA QUE EL SPINNER NO SELECCIONE Más de lo que está en stock 
                        int stok = Integer.parseInt(lblStock.getText());
                        if (cantidad > stok) {
                            JOptionPane.showMessageDialog(null, "ATENCIÓN!! STOCK INSUFICIENTE!!!");
                        } else {
                            float pre = Float.parseFloat(lblPrecio.getText().substring(1));
                        //    System.out.println("Stock " + stok);
                         //   System.out.println("Cantidad: " + cantidad);
                            float subtotal = pre * cantidad;
                            int nuevoStock = stok - cantidad;
                         //   System.out.println("Subtotal: " + subtotal);
                          //  System.out.println("NuevoStock: " + nuevoStock);
                          //  System.out.println("Metodo de pago: " + metodo);
                            
                            String consultaCliente = clX2.BuscarCliente(clienteId);
                            String consultaEmp = clX2.BuscarEmpleado(EmpID);
                            //TODAS LAS COMPROBACIONES HECHAS 
                            itemTabla = itemTabla + 1;
                            modelo = (DefaultTableModel) tableCarrito.getModel();
                            
                            for (int i=0;i<tableCarrito.getRowCount();i++){
                                if(tableCarrito.getValueAt(i, 1).equals(ComboBoxProducto.getSelectedItem().toString())){
                                    JOptionPane.showMessageDialog(null, "Atencion!! Ese producto ya fue agregado al carrito...");
                                    return;
                                }
                            }
                            
                            
                            
                            ArrayList listaVenta = new ArrayList();
                            listaVenta.add(itemTabla);
                            listaVenta.add(probusqueda.getNOMBRE());
                            listaVenta.add(probusqueda.getDESCRIPCCION());
                            listaVenta.add(probusqueda.getPRECIO());
                            listaVenta.add(cantidad);
                            listaVenta.add(subtotal);
                            listaVenta.add(consultaCliente);
                            listaVenta.add(consultaEmp);

                            Object[] objetoTabla = new Object[8];

                            objetoTabla[0] = listaVenta.get(0);
                            objetoTabla[1] = listaVenta.get(1);
                            objetoTabla[2] = listaVenta.get(2);
                            objetoTabla[3] = listaVenta.get(3);
                            objetoTabla[4] = listaVenta.get(4);
                            objetoTabla[5] = listaVenta.get(5);
                            objetoTabla[6] = listaVenta.get(6);
                            objetoTabla[7] = listaVenta.get(7);
                            modelo.addRow(objetoTabla);
                            tableCarrito.setModel(modelo);
                            TotalAPagar();
                        }
                    }
                }
            }
        }
        
    }//GEN-LAST:event_addCartMouseClicked

    private void btnDeleteCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteCarritoMouseClicked
        FilaSelect = tableCarrito.getSelectedRow();
        if (FilaSelect != -1) {
            modelo = (DefaultTableModel) tableCarrito.getModel();
            float rest = Float.parseFloat(String.valueOf(tableCarrito.getModel().getValueAt(FilaSelect, 5)));
            System.out.println(rest);
            TOTAL = TOTAL - rest;
            lblTotal.setText("$" + String.format("%.2f", TOTAL));
            modelo.removeRow(FilaSelect);
            FilaSelect = -1;
        } else {
            JOptionPane.showMessageDialog(null, "ATENCIÓN!!! Debe seleccionar una fila");
        }
        
        
    }//GEN-LAST:event_btnDeleteCarritoMouseClicked

    public void LimpiarDatos(){
        ComboBoxCliente.setSelectedItem("..........");
        ComboBoxEmpleado.setSelectedItem("..........");
        ComboBoxProducto.setSelectedItem("....");
        TOTAL=0;
        lblTotal.setText("$" + String.format("%.2f", TOTAL));
        SpinnerCantidad.setValue(0);
        for (int i=0;i<tableCarrito.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }
    
    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
       
        LimpiarDatos();
        
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnNuevoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoClienteMouseClicked
        Object []o = new Object[4];
        o[0] = "Ingrese ID";
        o[1] = "Ingrese Nombre";
        o[2] = "Ingrese A paterno";
        o[3] = "Ingrese A materno";
        //modelo.addRow(o);
        String NombreEvento = "Añadir Registro";
        //Invocar a la ventana y actualizar los datos desde ahí
        edtCliente edC = new edtCliente();
        edC.setVisible(true);
        edC.recibirObj(o, NombreEvento);
    }//GEN-LAST:event_btnNuevoClienteMouseClicked

    private void lblConfirmarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfirmarVentaMouseClicked
        
        
        //AKI VAMOS A ACOMODAR LOS DATOS ANTES DE LLAMAR A LA FUNCION QUE HACE LA ACTUALIZACION A LA BASE DE DATOS
        /*PARA TABLA VENTA: ID,FECHAVENTA,METPAGO, CLIENTEID, RFC EMPLEADO,23/01/2022*/
        if (tableCarrito.getRowCount() <= 0) {
            JOptionPane.showMessageDialog(null, "Atencion!! Necesita Agregar productos para realizar una venta");
        } else {
            for (int i = 0; i < tableCarrito.getRowCount(); i++) {
                //FOR PARA REALIZAR TODAS LAS OPERACIONES
                int metodo = Integer.parseInt(ComboBoxMetodo.getSelectedItem().toString().substring(0, 1));
                String Fecha = FechaActual();
                String IDCliente = tableCarrito.getValueAt(i, 6).toString().substring(0, 9);
                String RFCem = tableCarrito.getValueAt(i, 7).toString().substring(0, 10);
                int numerornd = (int) (Math.random() * 1000000 + 1);

                String IDVENTA = "V" + numerornd;

                Object[] venta = new Object[5];

                venta[0] = IDVENTA;
                venta[1] = Fecha;
                venta[2] = metodo;
                venta[3] = IDCliente;
                venta[4] = RFCem;
                
                venCon.setID(venta[0].toString());
                venCon.setFECHA(venta[1].toString());
                venCon.setMETODO((int)venta[2]);
                venCon.setCLIENTEID(venta[3].toString());
                venCon.setRFCEMPLEADO(venta[4].toString());

                clX.RegistrarVenta(venCon); //REGISTRAMOS LA VENTA
               /* for (int j = 0; j < venta.length; j++) {
                    System.out.println(venta[j]);
                }*/
               // System.out.println("**********************");
                /*HASTA AQUI DEBEMOS MANDAR EL OBJETO A NUESTRA CONSULTA PARA AGREGAR VENTAS*/ 
                
                
                //PARA MANDAR UPDATE A DETALLE VENTA
                Object [] detalleVenta = new Object[3];
                
                String NombreProd = tableCarrito.getValueAt(i, 1).toString();
                ProBusquedaXNombre = clX2.BuscarProdXNombre(NombreProd);
                int getCantidadProd = (int)tableCarrito.getValueAt(i, 4);
                
                detalleVenta[0] = IDVENTA;
                detalleVenta[1] = ProBusquedaXNombre.getID();
                detalleVenta[2] = getCantidadProd;
                for (int j = 0; j < detalleVenta.length; j++) {
                    System.out.println(detalleVenta[j]);
                }
                dv.setID_VENTA(detalleVenta[0].toString());
                dv.setID_PRODUCTO(detalleVenta[1].toString());
                dv.setCANTIDAD(getCantidadProd);
                int stok = ProBusquedaXNombre.getSTOCK();
                //int cantidad = Integer.parseInt(tableCarrito.getValueAt(i, 4).toString());
                int nuevoStock = stok - getCantidadProd;
                
                //System.out.println(nuevoStock);
                dvX.RegistrarDetalleVenta(dv);
                
                clX.uptadeProductoDespuesDeVenta(nuevoStock,detalleVenta[1].toString());
                
                //HASTA AKI PARA MANDAR OBJETO A NUESTRA CONSULTA AGREGAR DETALLE VENTA
                JOptionPane.showMessageDialog(null, "Venta registrada!!!!");
            }
        }
        
        
        LimpiarDatos();
    }//GEN-LAST:event_lblConfirmarVentaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCliente;
    private javax.swing.JComboBox<String> ComboBoxEmpleado;
    private javax.swing.JComboBox<String> ComboBoxMetodo;
    private javax.swing.JComboBox<String> ComboBoxProducto;
    private javax.swing.JSpinner SpinnerCantidad;
    private javax.swing.JLabel addCart;
    private javax.swing.JLabel btnDeleteCarrito;
    private javax.swing.JLabel btnLimpiar;
    private javax.swing.JLabel btnNuevoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConfirmarVenta;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblTotal;
    private paneles.PanelBtn1 panelBtn11;
    private tablas.Table tableCarrito;
    private javax.swing.JTextField tfDesc;
    // End of variables declaration//GEN-END:variables
}
