package clases;

public class DetalleVenta {

    String ID_VENTA, ID_PRODUCTO;
    int CANTIDAD;

    public String getID_VENTA() {
        return ID_VENTA;
    }

    public void setID_VENTA(String ID_VENTA) {
        this.ID_VENTA = ID_VENTA;
    }

    public String getID_PRODUCTO() {
        return ID_PRODUCTO;
    }

    public void setID_PRODUCTO(String ID_PRODUCTO) {
        this.ID_PRODUCTO = ID_PRODUCTO;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public DetalleVenta() {
    }

    public DetalleVenta(String ID_VENTA, String ID_PRODUCTO, int CANTIDAD) {
        this.ID_VENTA = ID_VENTA;
        this.ID_PRODUCTO = ID_PRODUCTO;
        this.CANTIDAD = CANTIDAD;
    }

}
