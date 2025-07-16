
package paneles;

import clases.modelo_menu;
import eventos.EventMenuSelected;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

public class PanelMenu extends javax.swing.JPanel {
    
    private EventMenuSelected event;
    
    public void addEventMenuSelected(EventMenuSelected event){
        this.event=event;
        listMenu2.addEventMenuSelected(event);
    }
    
    public PanelMenu() {
        initComponents();
        setOpaque(false);
        listMenu2.setOpaque(false);
        init();
    }
    private void init(){
        //Lista de todos los items del menu que corresponden a los tableros disponibles en la db 
        listMenu2.addItem(new modelo_menu("1","Inicio",modelo_menu.MenuType.MENU));
        listMenu2.addItem(new modelo_menu("2","Empleados",modelo_menu.MenuType.MENU));
        listMenu2.addItem(new modelo_menu("6","Clientes",modelo_menu.MenuType.MENU));
        listMenu2.addItem(new modelo_menu("3","Ventas",modelo_menu.MenuType.MENU));
        listMenu2.addItem(new modelo_menu("5","Productos",modelo_menu.MenuType.MENU));
        listMenu2.addItem(new modelo_menu("6","MatPrima",modelo_menu.MenuType.MENU));
        listMenu2.addItem(new modelo_menu(""," ",modelo_menu.MenuType.EMPTY));
        listMenu2.addItem(new modelo_menu("","DATOS",modelo_menu.MenuType.TITLE));
        listMenu2.addItem(new modelo_menu("9","Provedores",modelo_menu.MenuType.MENU));
        listMenu2.addItem(new modelo_menu("10","Direcciones",modelo_menu.MenuType.MENU));
        listMenu2.addItem(new modelo_menu("6","Contactos",modelo_menu.MenuType.MENU));
        listMenu2.addItem(new modelo_menu("7","Información",modelo_menu.MenuType.MENU));
        
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMovimiento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listMenu2 = new clases.ListMenu<>();

        PanelMovimiento.setOpaque(false);
        PanelMovimiento.setPreferredSize(new java.awt.Dimension(215, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/El michi Caffetero31.png"))); // NOI18N

        listMenu2.setBorder(null);
        listMenu2.setOpaque(false);

        javax.swing.GroupLayout PanelMovimientoLayout = new javax.swing.GroupLayout(PanelMovimiento);
        PanelMovimiento.setLayout(PanelMovimientoLayout);
        PanelMovimientoLayout.setHorizontalGroup(
            PanelMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMovimientoLayout.createSequentialGroup()
                .addGroup(PanelMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMovimientoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(listMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMovimientoLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        PanelMovimientoLayout.setVerticalGroup(
            PanelMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMovimientoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(listMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    protected void paintChildren(Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g=new GradientPaint(0,0,Color.decode("#DDAF67"),0,getHeight(), Color.decode("#FFD194"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth()-20,0,  getWidth(),  getHeight());
        super.paintChildren(grphcs);
    }
    
    private int x;
    private int y;

    public void initMoving(JFrame fram) {
        PanelMovimiento.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }

        });
        PanelMovimiento.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent me) {
                fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMovimiento;
    private javax.swing.JLabel jLabel1;
    private clases.ListMenu<String> listMenu2;
    // End of variables declaration//GEN-END:variables
}
