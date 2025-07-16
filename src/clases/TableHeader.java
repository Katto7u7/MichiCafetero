
package clases;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class TableHeader extends JLabel {
    
    public TableHeader(String text){
        super(text);
        setOpaque(true);
        //setBackground(new Color(234,220,190));                    //cambia del color de la cabecera de la tabla
        setBackground(new Color(236,211,156));                      //cambia del color de la cabecera de la tabla
        setFont(new Font("Roboto Mono", 1, 14));                    //Cambia la funete de la cabecera de la tabla 
        setForeground(new Color(94,52,12));                         //Cambia el primer plano de la cabecera de la tabla
        setBorder( new EmptyBorder(10,5,10,5));                     //Cambia los bordes de la tabla 
    }
    
    protected void paintComponent (Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(236, 211, 156));
        g2.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
        super.paintComponent(grphcs);
    }
    
}
