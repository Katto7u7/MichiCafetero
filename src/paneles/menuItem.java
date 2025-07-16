
package paneles;
import clases.modelo_menu;
import clases.modelo_menu.MenuType;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
public class menuItem extends javax.swing.JPanel {
   
    private boolean selected;
    private boolean over;
    
    public menuItem(modelo_menu data) {
        initComponents();
        setOpaque(false);
        if (data.getType() == MenuType.MENU) {
            lblIcon.setIcon(data.toIcon());
            lblName.setText(data.getName());
        } else if (data.getType() == modelo_menu.MenuType.TITLE) {
            lblIcon.setText(data.getName());
            lblIcon.setFont(new Font("sansserif", 1, 12));
            lblName.setVisible(false);
        } else {
            lblName.setText(" ");
        }
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }
    
    public void setOver(boolean over){
        this.over=over;
        repaint();
    }

    protected void paintComponent(Graphics grphcs) {

        if (selected || over) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if (selected) {
                g2.setColor(new Color(255, 255, 255, 80));
            } else {
                g2.setColor(new Color(255, 255, 255, 20));
            }
            g2.fillRoundRect(10, 0, getWidth() - 20, getHeight(), 5, 5);
        }
        super.paintComponent(grphcs);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcon = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(400, 35));

        lblIcon.setBackground(new java.awt.Color(214, 217, 223));
        lblIcon.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblIcon.setForeground(new java.awt.Color(94, 52, 12));

        lblName.setBackground(new java.awt.Color(214, 217, 223));
        lblName.setFont(new java.awt.Font("Roboto Mono", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(94, 52, 12));
        lblName.setText("itemName");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblName)
                .addContainerGap(280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
