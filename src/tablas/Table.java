package tablas;

import clases.TableHeader;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

public class Table extends JTable {

    public Table() {
        setShowHorizontalLines(true);           //muestra las lineas horizontales de la tabla
        setAutoscrolls(true);
        //setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        setGridColor(new Color(196,160,125));   //cambia el color 
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                if (i1 >= 15) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });

    }
    //METODO para evitar que las celdas sean editables
    public boolean isCellEditable(int row, int column){ 
        return false;
    }

    //metodo para agregar filas en la tabla
    public void addRow(Object[] row) {
        DefaultTableModel mod = (DefaultTableModel) getModel();
        mod.addRow(row);
    }

}
