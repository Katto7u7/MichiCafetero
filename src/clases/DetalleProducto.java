package clases;

public class DetalleProducto {

    String ID_MAT_PRIMA, ID_PRODUCTO;
    int CANTIDAD;

    public String getID_MAT_PRIMA() {
        return ID_MAT_PRIMA;
    }

    public void setID_MAT_PRIMA(String ID_MAT_PRIMA) {
        this.ID_MAT_PRIMA = ID_MAT_PRIMA;
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

    public DetalleProducto() {
    }

    public DetalleProducto(String ID_MAT_PRIMA, String ID_PRODUCTO, int CANTIDAD) {
        this.ID_MAT_PRIMA = ID_MAT_PRIMA;
        this.ID_PRODUCTO = ID_PRODUCTO;
        this.CANTIDAD = CANTIDAD;
    }

}
