
package clases;

public class MetPago {
    int ID;
    String PAGO;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPAGO() {
        return PAGO;
    }

    public void setPAGO(String PAGO) {
        this.PAGO = PAGO;
    }

    public MetPago() {
    }

    public MetPago(int ID, String PAGO) {
        this.ID = ID;
        this.PAGO = PAGO;
    }
    
}
