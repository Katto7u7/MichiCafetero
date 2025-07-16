package clases;

public class ClasProducto {

    String ID, CLAS_P;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCLAS_P() {
        return CLAS_P;
    }

    public void setCLAS_P(String CLAS_P) {
        this.CLAS_P = CLAS_P;
    }

    public ClasProducto() {
    }

    public ClasProducto(String ID, String CLAS_P) {
        this.ID = ID;
        this.CLAS_P = CLAS_P;
    }

}
