
package clases;


public class DetalleCompra {
    String ID_COMPRA,ID_PROV;
    int CANTIDAD;

    public String getID_COMPRA() {
        return ID_COMPRA;
    }

    public void setID_COMPRA(String ID_COMPRA) {
        this.ID_COMPRA = ID_COMPRA;
    }

    public String getID_PROV() {
        return ID_PROV;
    }

    public void setID_PROV(String ID_PROV) {
        this.ID_PROV = ID_PROV;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public DetalleCompra() {
    }

    public DetalleCompra(String ID_COMPRA, String ID_PROV, int CANTIDAD) {
        this.ID_COMPRA = ID_COMPRA;
        this.ID_PROV = ID_PROV;
        this.CANTIDAD = CANTIDAD;
    }
    
}
