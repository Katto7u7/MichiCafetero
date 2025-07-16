package clases;

public class Estado {

    String ID, NOMBRE;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public Estado() {
    }

    public Estado(String ID, String NOMBRE) {
        this.ID = ID;
        this.NOMBRE = NOMBRE;
    }

}
