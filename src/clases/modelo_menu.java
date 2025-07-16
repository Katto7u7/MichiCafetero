
package clases;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class modelo_menu {

    /*String icon, name;
    MenuType type;*/

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public Icon toIcon() {
        return new ImageIcon(getClass().getResource("/img/" + icon + ".png"));
    }

    public modelo_menu(String string, String par) {

    }
    
    private String icon;
    private String name;
    private MenuType type;

    public modelo_menu(String icon, String name, MenuType type) {
        this.icon = icon;
        this.name = name;
        this.type = type;
    }

    public static enum MenuType {
        TITLE, MENU, EMPTY
    }
}
