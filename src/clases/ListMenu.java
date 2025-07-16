
package clases;

import eventos.EventMenuSelected;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;
import paneles.menuItem;

public class ListMenu<E extends Object> extends JList<E> {

    private final DefaultListModel model;
    private int selectedIndex = -1;
    private int overIndex = -1;
    private EventMenuSelected event;
    
    public void addEventMenuSelected(EventMenuSelected event){
        this.event=event;
    }
    

    public ListMenu() {
        model = new DefaultListModel();
        setModel(model);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    int index = locationToIndex(me.getPoint());
                    Object o = model.getElementAt(index);
                    if (o instanceof modelo_menu) {
                        modelo_menu menu = (modelo_menu) o;
                        if (menu.getType() == modelo_menu.MenuType.MENU) {
                            selectedIndex = index;
                            if(event!=null){
                                event.selected(index);
                            }
                        }
                    } else {
                        selectedIndex = index;
                    }
                    repaint();
                }
            }
        });
        addMouseMotionListener( new MouseMotionAdapter(){
            @Override
            public void mouseMoved(MouseEvent me){
                int index = locationToIndex(me.getPoint());
                if(index != overIndex){
                    Object o = model.getElementAt(index);
                    if(o instanceof modelo_menu){
                        modelo_menu menu = (modelo_menu)o;
                        if(menu.getType()==modelo_menu.MenuType.MENU){
                            overIndex=index;
                        }else{
                            overIndex=-1;
                        }
                        repaint();
                    }
                }
            }
           // @Override
            public void mouseExited(MouseEvent me){
                overIndex=-1;
                repaint();
            }
        });
    }

    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
                modelo_menu data;
                if (o instanceof modelo_menu) {
                    data = (modelo_menu) o;
                } else {
                    data = new modelo_menu("", o + "" + modelo_menu.MenuType.EMPTY);
                }
                menuItem item = new menuItem(data);
                item.setSelected(selectedIndex == index);
                item.setOver(overIndex == index);
                return item;
            }

        };
    }

    public void addItem(modelo_menu data) {
        model.addElement(data);
    }

}
