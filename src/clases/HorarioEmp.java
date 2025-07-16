
package clases;


public class HorarioEmp {
    String ID,HORA;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getHORA() {
        return HORA;
    }

    public void setHORA(String HORA) {
        this.HORA = HORA;
    }

    public HorarioEmp() {
    }

    public HorarioEmp(String ID, String HORA) {
        this.ID = ID;
        this.HORA = HORA;
    }
    
}
