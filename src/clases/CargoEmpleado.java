package clases;

public class CargoEmpleado {

    String ID, CARGO;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCARGO() {
        return CARGO;
    }

    public void setCARGO(String CARGO) {
        this.CARGO = CARGO;
    }

    public CargoEmpleado() {
    }

    public CargoEmpleado(String ID, String CARGO) {
        this.ID = ID;
        this.CARGO = CARGO;
    }

}
