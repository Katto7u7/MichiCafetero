
package paneles;

import clases.*;
import conexiones.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class form_informacion extends javax.swing.JPanel {

    //DefaultTableModel modelo = new DefaultTableModel();
    
    
    CargoEmpleado CargoEmp = new CargoEmpleado();
    CargoEmpleadoConexion CargoEmpx = new CargoEmpleadoConexion();
    
    ClasMatPrima ClasMatPrima = new ClasMatPrima();
    ClasMatPrimaConexion ClasMatPrimaX = new ClasMatPrimaConexion();
    
    ClasProducto ClasProd = new ClasProducto();
    ClasProductoConexion ClasProdX = new ClasProductoConexion();
    
    Compra Com = new Compra();
    CompraConexion ComX = new CompraConexion();
    
    DetalleCompra DetalleCom = new DetalleCompra();
    DetalleCompraConexion DetalleComX = new DetalleCompraConexion();
    
    DetalleProducto DetallePro = new DetalleProducto();
    DetalleProductoConexion DetalleProX = new DetalleProductoConexion();
    
    DetalleVenta DetalleVen = new DetalleVenta();
    DetalleVentaConexion DetalleVenX = new DetalleVentaConexion();
    
    Estado Es = new Estado();
    EstadoConexion EsX= new EstadoConexion();
    
    HorarioEmp Horario = new HorarioEmp();
    HorarioEmpConexion HorarioX = new HorarioEmpConexion();
    
    MetPago MetodoPago = new MetPago();
    MetPagoConexion MetodoPagoX = new MetPagoConexion();
    
    TipoMatPrima TipoMatPri= new TipoMatPrima();
    TipoMatPrimaConexion TipoMatPriX = new TipoMatPrimaConexion();

    public form_informacion() {
        initComponents();
        LimpiarTabla();
    }

    public void LimpiarTabla() {
        /*for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            modelo.removeTableModelListener(TableInfo);
            TableInfo.removeAll();
            TableInfo.removeColumn(TableInfo.getColumnModel().getColumn(i));
            i = i - 1;
        }*/
    }
    public void ListarCargoEmpleado(){
        DefaultTableModel modelo = new DefaultTableModel();
         List<CargoEmpleado> Listar = CargoEmpx.ListarCargoEmpleado();
        //modelo = (DefaultTableModel) TableInfo.getModel(); //Optenemos el modelo de la tabla
        Object[] obj = new Object[2];   //Creamos un objeto para meter ahi los datos 
        for(int i=0;i<2;i++){
            switch(i){
                         case 0:
                             modelo.addColumn("ID");
                         break;    
                         case 1:
                             modelo.addColumn("Cargo ");
                         break;  
                         default:
                             modelo.addColumn("N/A");
                         break;
                     }
        }
        for (int i = 0; i < Listar.size(); i++) {
            obj[0] = Listar.get(i).getID();
            obj[1] = Listar.get(i).getCARGO();
            modelo.addRow(obj); //una vez obetenidos agregamos la nueva fila a la tabla 
        }
        TableInfo.setModel(modelo); //ahora agregamos el modelo a la tabla 
    }
    
    public void ListarClasMatPrima(){
        DefaultTableModel modelo = new DefaultTableModel();
        List<ClasMatPrima> Listar = ClasMatPrimaX.ListarClasMatPrima();
        //modelo = (DefaultTableModel) TableInfo.getModel(); //Optenemos el modelo de la tabla
        Object[] obj = new Object[2];   //Creamos un objeto para meter ahi los datos 
        for(int i=0;i<2;i++){
            switch(i){
                         case 0:
                             modelo.addColumn("ID");
                         break;    
                         case 1:
                             modelo.addColumn("Clasificación");
                         break;
                         default:
                             modelo.addColumn("N/A");
                         break;
                     }
        }
        for (int i = 0; i < Listar.size(); i++) {
            obj[0] = Listar.get(i).getID();
            obj[1] = Listar.get(i).getCLASIFICACION();
            modelo.addRow(obj); //una vez obetenidos agregamos la nueva fila a la tabla 
        }
        TableInfo.setModel(modelo);
    }
    
    public void ListarClasProducto(){
        DefaultTableModel modelo = new DefaultTableModel();
        List<ClasProducto> Listar = ClasProdX.ListarClasProducto();
        //modelo = (DefaultTableModel) TableInfo.getModel(); //Optenemos el modelo de la tabla
        for(int i=0;i<2;i++){
            switch(i){
                         case 0:
                             modelo.addColumn("ID");
                         break;    
                         case 1:
                             modelo.addColumn("Clasificacion producto");
                         break;
                         default:
                             modelo.addColumn("N/A");
                         break;
                     }
        }
        Object[] obj = new Object[2];   //Creamos un objeto para meter ahi los datos 
        for (int i = 0; i < Listar.size(); i++) {
            obj[0] = Listar.get(i).getID();
            obj[1] = Listar.get(i).getCLAS_P();
            modelo.addRow(obj); //una vez obetenidos agregamos la nueva fila a la tabla 
        }
        TableInfo.setModel(modelo);
    }
    
    public void ListarCompra(){
        DefaultTableModel modelo = new DefaultTableModel();
        List<Compra> Listar = ComX.ListarCompra();
        //modelo = (DefaultTableModel) TableInfo.getModel(); //Optenemos el modelo de la tabla
        Object[] obj = new Object[5];   //Creamos un objeto para meter ahi los datos 
        
        for(int i=0;i<5;i++){
            switch(i){
                         case 0:
                             modelo.addColumn("ID");
                         break;    
                         case 1:
                             modelo.addColumn("Fecha Compra");
                         break;
                         case 2:
                             modelo.addColumn("Cantidad");
                         break;
                         case 3:
                             modelo.addColumn("Materia Prima");
                         break;
                         case 4:
                             modelo.addColumn("Empleado");    
                         break;
                         default:
                             modelo.addColumn("N/A");
                         break;
                     }
        }
        
        for (int i = 0; i < Listar.size(); i++) {
            obj[0] = Listar.get(i).getID();
            obj[1] = Listar.get(i).getFECHA_COMPRA();
            obj[2] = Listar.get(i).getCANTIDAD();
            obj[3] = Listar.get(i).getMAT_PRIMA_ID();
            obj[4] = Listar.get(i).getRFC_EMPLEADO();
            modelo.addRow(obj); //una vez obetenidos agregamos la nueva fila a la tabla 
        }
        TableInfo.setModel(modelo);
    }
    
    public void ListarDetalleCompra(){
        DefaultTableModel modelo = new DefaultTableModel();
        List<DetalleCompra> Listar = DetalleComX.ListarDetalleCompra();
        //modelo = (DefaultTableModel) TableInfo.getModel(); //Optenemos el modelo de la tabla
        Object[] obj = new Object[3];   //Creamos un objeto para meter ahi los datos 
        
        for(int i=0;i<3;i++){
            switch(i){
                         case 0:
                             modelo.addColumn("ID Compra");
                         break;    
                         case 1:
                             modelo.addColumn("Provedor");
                         break;       
                         case 2:
                             modelo.addColumn("Cantidad");
                         break;
                         default:
                             modelo.addColumn("N/A");
                         break;
                     }
        }
        
        for (int i = 0; i < Listar.size(); i++) {
            obj[0] = Listar.get(i).getID_COMPRA();
            obj[1] = Listar.get(i).getID_PROV();
            obj[2] = Listar.get(i).getCANTIDAD();
            
            modelo.addRow(obj); //una vez obetenidos agregamos la nueva fila a la tabla 
        }
        TableInfo.setModel(modelo);
    }
    
    public void ListarDetalleProducto(){
        DefaultTableModel modelo = new DefaultTableModel();
        List<DetalleProducto> Listar = DetalleProX.ListarDetalleProducto();
        //modelo = (DefaultTableModel) TableInfo.getModel(); //Optenemos el modelo de la tabla
        Object[] obj = new Object[3];   //Creamos un objeto para meter ahi los datos 
        
        for(int i=0;i<3;i++){
            switch(i){
                         case 0:
                             modelo.addColumn("ID Materia Prima");
                         break;    
                         case 1:
                             modelo.addColumn("Producto");
                         break;       
                         case 2:
                             modelo.addColumn("Cantidad");
                         break;
                         default:
                             modelo.addColumn("N/A");
                         break;
                     }
        }
        
        for (int i = 0; i < Listar.size(); i++) {
            obj[0] = Listar.get(i).getID_MAT_PRIMA();
            obj[1] = Listar.get(i).getID_PRODUCTO();
            obj[2] = Listar.get(i).getCANTIDAD();
            
            modelo.addRow(obj); //una vez obetenidos agregamos la nueva fila a la tabla 
        }
        TableInfo.setModel(modelo);
    }
    
    public void ListarDetalleVenta(){
        DefaultTableModel modelo = new DefaultTableModel();
        List<DetalleVenta> Listar = DetalleVenX.ListarDetalleVenta();
        Object[] obj = new Object[3];   //Creamos un objeto para meter ahi los datos 
        
        for(int i=0;i<3;i++){
            switch(i){
                         case 0:
                             modelo.addColumn("Venta");
                         break;    
                         case 1:
                             modelo.addColumn("Producto");
                         break;       
                         case 2:
                             modelo.addColumn("Cantidad");
                         break;
                         default:
                             modelo.addColumn("N/A");
                         break;
                     }
        }
        
        for (int i = 0; i < Listar.size(); i++) {
            obj[0] = Listar.get(i).getID_VENTA();
            obj[1] = Listar.get(i).getID_PRODUCTO();
            obj[2] = Listar.get(i).getCANTIDAD();
            
            modelo.addRow(obj); //una vez obetenidos agregamos la nueva fila a la tabla 
        }
        TableInfo.setModel(modelo);
    }
    
    public void ListarEstado(){
        DefaultTableModel modelo = new DefaultTableModel();
        List<Estado> Listar = EsX.ListarEstado();
        //modelo = (DefaultTableModel) TableInfo.getModel(); //Optenemos el modelo de la tabla
        Object[] obj = new Object[2];   //Creamos un objeto para meter ahi los datos 
        
        for(int i=0;i<2;i++){
            switch(i){
                         case 0:
                             modelo.addColumn("ID");
                         break;    
                         case 1:
                             modelo.addColumn("ESTADO");
                         break;
                         default:
                             modelo.addColumn("N/A");
                         break;
                     }
        }
        
        for (int i = 0; i < Listar.size(); i++) {
            obj[0] = Listar.get(i).getID();
            obj[1] = Listar.get(i).getNOMBRE();
            modelo.addRow(obj); //una vez obetenidos agregamos la nueva fila a la tabla 
        }
        TableInfo.setModel(modelo);
    }
    
    public void ListarHorarioEmp(){
        DefaultTableModel modelo = new DefaultTableModel();
        List<HorarioEmp> Listar = HorarioX.ListarHorarioEmp();
        //modelo = (DefaultTableModel) TableInfo.getModel(); //Optenemos el modelo de la tabla
        Object[] obj = new Object[2];   //Creamos un objeto para meter ahi los datos 
        
        for(int i=0;i<2;i++){
            switch(i){
                         case 0:
                             modelo.addColumn("ID");
                         break;    
                         case 1:
                             modelo.addColumn("Horario");
                         break;
                         default:
                             modelo.addColumn("N/A");
                         break;
                     }
        }
        
        for (int i = 0; i < Listar.size(); i++) {
            obj[0] = Listar.get(i).getID();
            obj[1] = Listar.get(i).getHORA();
            
            modelo.addRow(obj); //una vez obetenidos agregamos la nueva fila a la tabla 
        }
        TableInfo.setModel(modelo);
    }
    
    public void ListarMetodoPago(){
        DefaultTableModel modelo = new DefaultTableModel();
        List<MetPago> Listar = MetodoPagoX.ListarMetPago();
        //modelo = (DefaultTableModel) TableInfo.getModel(); //Optenemos el modelo de la tabla
        Object[] obj = new Object[2];   //Creamos un objeto para meter ahi los datos 
        
        for(int i=0;i<2;i++){
            switch(i){
                         case 0:
                             modelo.addColumn("ID");
                         break;    
                         case 1:
                             modelo.addColumn("Método");
                         break;
                         default:
                             modelo.addColumn("N/A");
                         break;
                     }
        }
        
        for (int i = 0; i < Listar.size(); i++) {
            obj[0] = Listar.get(i).getID();
            obj[1] = Listar.get(i).getPAGO();
            modelo.addRow(obj); //una vez obetenidos agregamos la nueva fila a la tabla 
        }
        TableInfo.setModel(modelo);
    }
    
    public void ListarTipoMatPrima(){
        DefaultTableModel modelo = new DefaultTableModel();
        List<TipoMatPrima> Listar = TipoMatPriX.ListarTipoMatPrima();
        //modelo = (DefaultTableModel) TableInfo.getModel(); //Optenemos el modelo de la tabla
        Object[] obj = new Object[2];   //Creamos un objeto para meter ahi los datos 
        
        for(int i=0;i<2;i++){
            switch(i){
                         case 0:
                             modelo.addColumn("ID");
                         break;    
                         case 1:
                             modelo.addColumn("Tipo");
                         break;
                         default:
                             modelo.addColumn("N/A");
                         break;
                     }
        }
        
        for (int i = 0; i < Listar.size(); i++) {
            obj[0] = Listar.get(i).getID();
            obj[1] = Listar.get(i).getTIPO();
            modelo.addRow(obj); //una vez obetenidos agregamos la nueva fila a la tabla 
        }
        TableInfo.setModel(modelo);
    }
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableInfo = new tablas.Table();
        panelBtn11 = new paneles.PanelBtn1();
        BtnEmpleado = new javax.swing.JLabel();
        panelBtn12 = new paneles.PanelBtn1();
        BtnClasMatPrima = new javax.swing.JLabel();
        panelBtn13 = new paneles.PanelBtn1();
        BtnClasProducto = new javax.swing.JLabel();
        panelBtn15 = new paneles.PanelBtn1();
        BtnCompra = new javax.swing.JLabel();
        panelBtn16 = new paneles.PanelBtn1();
        BtnDetalleCompra = new javax.swing.JLabel();
        panelBtn19 = new paneles.PanelBtn1();
        BtnDetalleProducto = new javax.swing.JLabel();
        panelBtn18 = new paneles.PanelBtn1();
        BtnEstado = new javax.swing.JLabel();
        panelBtn20 = new paneles.PanelBtn1();
        BtnDetalleVenta = new javax.swing.JLabel();
        panelBtn21 = new paneles.PanelBtn1();
        BtnHorarios = new javax.swing.JLabel();
        panelBtn22 = new paneles.PanelBtn1();
        BtnMetodoPago = new javax.swing.JLabel();
        panelBtn23 = new paneles.PanelBtn1();
        BtnTipoMatPrima = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 233, 204));

        TableInfo.setBackground(new java.awt.Color(251, 246, 235));
        TableInfo.setForeground(new java.awt.Color(94, 52, 12));
        TableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cargo", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableInfo.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        TableInfo.setSelectionBackground(new java.awt.Color(133, 79, 39));
        jScrollPane1.setViewportView(TableInfo);

        panelBtn11.setPreferredSize(new java.awt.Dimension(150, 50));

        BtnEmpleado.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        BtnEmpleado.setForeground(new java.awt.Color(94, 52, 12));
        BtnEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnEmpleado.setText("Cargo Empleado");
        BtnEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEmpleadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn11Layout = new javax.swing.GroupLayout(panelBtn11);
        panelBtn11.setLayout(panelBtn11Layout);
        panelBtn11Layout.setHorizontalGroup(
            panelBtn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn11Layout.setVerticalGroup(
            panelBtn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBtn12.setPreferredSize(new java.awt.Dimension(150, 50));

        BtnClasMatPrima.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        BtnClasMatPrima.setForeground(new java.awt.Color(94, 52, 12));
        BtnClasMatPrima.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnClasMatPrima.setText("Clas MatPrima");
        BtnClasMatPrima.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnClasMatPrima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnClasMatPrimaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn12Layout = new javax.swing.GroupLayout(panelBtn12);
        panelBtn12.setLayout(panelBtn12Layout);
        panelBtn12Layout.setHorizontalGroup(
            panelBtn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnClasMatPrima, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn12Layout.setVerticalGroup(
            panelBtn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnClasMatPrima, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        panelBtn13.setPreferredSize(new java.awt.Dimension(150, 50));

        BtnClasProducto.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        BtnClasProducto.setForeground(new java.awt.Color(94, 52, 12));
        BtnClasProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnClasProducto.setText("Clas Producto");
        BtnClasProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnClasProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnClasProductoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn13Layout = new javax.swing.GroupLayout(panelBtn13);
        panelBtn13.setLayout(panelBtn13Layout);
        panelBtn13Layout.setHorizontalGroup(
            panelBtn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnClasProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn13Layout.setVerticalGroup(
            panelBtn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnClasProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        panelBtn15.setPreferredSize(new java.awt.Dimension(150, 50));

        BtnCompra.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        BtnCompra.setForeground(new java.awt.Color(94, 52, 12));
        BtnCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnCompra.setText("Compra");
        BtnCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCompraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn15Layout = new javax.swing.GroupLayout(panelBtn15);
        panelBtn15.setLayout(panelBtn15Layout);
        panelBtn15Layout.setHorizontalGroup(
            panelBtn15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn15Layout.setVerticalGroup(
            panelBtn15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBtn16.setPreferredSize(new java.awt.Dimension(150, 50));

        BtnDetalleCompra.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        BtnDetalleCompra.setForeground(new java.awt.Color(94, 52, 12));
        BtnDetalleCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnDetalleCompra.setText("Detalle Compra");
        BtnDetalleCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDetalleCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDetalleCompraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn16Layout = new javax.swing.GroupLayout(panelBtn16);
        panelBtn16.setLayout(panelBtn16Layout);
        panelBtn16Layout.setHorizontalGroup(
            panelBtn16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnDetalleCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn16Layout.setVerticalGroup(
            panelBtn16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnDetalleCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBtn19.setPreferredSize(new java.awt.Dimension(150, 50));

        BtnDetalleProducto.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        BtnDetalleProducto.setForeground(new java.awt.Color(94, 52, 12));
        BtnDetalleProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnDetalleProducto.setText("Detalle Prod");
        BtnDetalleProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDetalleProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDetalleProductoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn19Layout = new javax.swing.GroupLayout(panelBtn19);
        panelBtn19.setLayout(panelBtn19Layout);
        panelBtn19Layout.setHorizontalGroup(
            panelBtn19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnDetalleProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn19Layout.setVerticalGroup(
            panelBtn19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnDetalleProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBtn18.setPreferredSize(new java.awt.Dimension(150, 50));

        BtnEstado.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        BtnEstado.setForeground(new java.awt.Color(94, 52, 12));
        BtnEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnEstado.setText("Estado");
        BtnEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEstadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn18Layout = new javax.swing.GroupLayout(panelBtn18);
        panelBtn18.setLayout(panelBtn18Layout);
        panelBtn18Layout.setHorizontalGroup(
            panelBtn18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn18Layout.setVerticalGroup(
            panelBtn18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBtn20.setPreferredSize(new java.awt.Dimension(150, 50));

        BtnDetalleVenta.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        BtnDetalleVenta.setForeground(new java.awt.Color(94, 52, 12));
        BtnDetalleVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnDetalleVenta.setText("Detalle Vent");
        BtnDetalleVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDetalleVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDetalleVentaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn20Layout = new javax.swing.GroupLayout(panelBtn20);
        panelBtn20.setLayout(panelBtn20Layout);
        panelBtn20Layout.setHorizontalGroup(
            panelBtn20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnDetalleVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn20Layout.setVerticalGroup(
            panelBtn20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnDetalleVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBtn21.setPreferredSize(new java.awt.Dimension(150, 50));

        BtnHorarios.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        BtnHorarios.setForeground(new java.awt.Color(94, 52, 12));
        BtnHorarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnHorarios.setText("Horarios");
        BtnHorarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnHorarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnHorariosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn21Layout = new javax.swing.GroupLayout(panelBtn21);
        panelBtn21.setLayout(panelBtn21Layout);
        panelBtn21Layout.setHorizontalGroup(
            panelBtn21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnHorarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn21Layout.setVerticalGroup(
            panelBtn21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnHorarios, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBtn22.setPreferredSize(new java.awt.Dimension(150, 50));

        BtnMetodoPago.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        BtnMetodoPago.setForeground(new java.awt.Color(94, 52, 12));
        BtnMetodoPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnMetodoPago.setText("Método de pago");
        BtnMetodoPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMetodoPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMetodoPagoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn22Layout = new javax.swing.GroupLayout(panelBtn22);
        panelBtn22.setLayout(panelBtn22Layout);
        panelBtn22Layout.setHorizontalGroup(
            panelBtn22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnMetodoPago, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn22Layout.setVerticalGroup(
            panelBtn22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnMetodoPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBtn23.setPreferredSize(new java.awt.Dimension(150, 50));

        BtnTipoMatPrima.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        BtnTipoMatPrima.setForeground(new java.awt.Color(94, 52, 12));
        BtnTipoMatPrima.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnTipoMatPrima.setText("Tipo Mat Prima");
        BtnTipoMatPrima.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnTipoMatPrima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTipoMatPrimaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBtn23Layout = new javax.swing.GroupLayout(panelBtn23);
        panelBtn23.setLayout(panelBtn23Layout);
        panelBtn23Layout.setHorizontalGroup(
            panelBtn23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnTipoMatPrima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBtn23Layout.setVerticalGroup(
            panelBtn23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtn23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnTipoMatPrima, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelBtn20, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelBtn18, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelBtn21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(panelBtn13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelBtn15, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(panelBtn22, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelBtn16, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(panelBtn23, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBtn19, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBtn20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBtn16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBtn13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBtn15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBtn12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBtn19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelBtn18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBtn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBtn21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBtn22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelBtn23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEmpleadoMouseClicked
        LimpiarTabla();
        ListarCargoEmpleado();
    }//GEN-LAST:event_BtnEmpleadoMouseClicked

    private void BtnClasMatPrimaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClasMatPrimaMouseClicked
        LimpiarTabla();
        ListarClasMatPrima();
    }//GEN-LAST:event_BtnClasMatPrimaMouseClicked

    private void BtnClasProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClasProductoMouseClicked
        LimpiarTabla();
        ListarClasProducto();
    }//GEN-LAST:event_BtnClasProductoMouseClicked

    private void BtnCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCompraMouseClicked
         LimpiarTabla();
         ListarCompra();
    }//GEN-LAST:event_BtnCompraMouseClicked

    private void BtnDetalleCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDetalleCompraMouseClicked
        LimpiarTabla();
        ListarDetalleCompra();
    }//GEN-LAST:event_BtnDetalleCompraMouseClicked

    private void BtnDetalleProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDetalleProductoMouseClicked
       LimpiarTabla();
       ListarDetalleProducto();
    }//GEN-LAST:event_BtnDetalleProductoMouseClicked

    private void BtnDetalleVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDetalleVentaMouseClicked
       LimpiarTabla();
       ListarDetalleVenta();
    }//GEN-LAST:event_BtnDetalleVentaMouseClicked

    private void BtnEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEstadoMouseClicked
        LimpiarTabla();
        ListarEstado();
    }//GEN-LAST:event_BtnEstadoMouseClicked

    private void BtnHorariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHorariosMouseClicked
        LimpiarTabla();
        ListarHorarioEmp();
    }//GEN-LAST:event_BtnHorariosMouseClicked

    private void BtnMetodoPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMetodoPagoMouseClicked
        LimpiarTabla();
        ListarMetodoPago();
    }//GEN-LAST:event_BtnMetodoPagoMouseClicked

    private void BtnTipoMatPrimaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTipoMatPrimaMouseClicked
        LimpiarTabla();
        ListarTipoMatPrima();
    }//GEN-LAST:event_BtnTipoMatPrimaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnClasMatPrima;
    private javax.swing.JLabel BtnClasProducto;
    private javax.swing.JLabel BtnCompra;
    private javax.swing.JLabel BtnDetalleCompra;
    private javax.swing.JLabel BtnDetalleProducto;
    private javax.swing.JLabel BtnDetalleVenta;
    private javax.swing.JLabel BtnEmpleado;
    private javax.swing.JLabel BtnEstado;
    private javax.swing.JLabel BtnHorarios;
    private javax.swing.JLabel BtnMetodoPago;
    private javax.swing.JLabel BtnTipoMatPrima;
    private tablas.Table TableInfo;
    private javax.swing.JScrollPane jScrollPane1;
    private paneles.PanelBtn1 panelBtn11;
    private paneles.PanelBtn1 panelBtn12;
    private paneles.PanelBtn1 panelBtn13;
    private paneles.PanelBtn1 panelBtn15;
    private paneles.PanelBtn1 panelBtn16;
    private paneles.PanelBtn1 panelBtn18;
    private paneles.PanelBtn1 panelBtn19;
    private paneles.PanelBtn1 panelBtn20;
    private paneles.PanelBtn1 panelBtn21;
    private paneles.PanelBtn1 panelBtn22;
    private paneles.PanelBtn1 panelBtn23;
    // End of variables declaration//GEN-END:variables
}
