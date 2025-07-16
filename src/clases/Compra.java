package clases;

public class Compra {

    String ID, FECHA_COMPRA, RFC_EMPLEADO, MAT_PRIMA_ID;
    int CANTIDAD;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFECHA_COMPRA() {
        return FECHA_COMPRA;
    }

    public void setFECHA_COMPRA(String FECHA_COMPRA) {
        this.FECHA_COMPRA = FECHA_COMPRA;
    }

    public String getRFC_EMPLEADO() {
        return RFC_EMPLEADO;
    }

    public void setRFC_EMPLEADO(String RFC_EMPLEADO) {
        this.RFC_EMPLEADO = RFC_EMPLEADO;
    }

    public String getMAT_PRIMA_ID() {
        return MAT_PRIMA_ID;
    }

    public void setMAT_PRIMA_ID(String MAT_PRIMA_ID) {
        this.MAT_PRIMA_ID = MAT_PRIMA_ID;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public Compra() {
    }

    public Compra(String ID, String FECHA_COMPRA, String RFC_EMPLEADO, String MAT_PRIMA_ID, int CANTIDAD) {
        this.ID = ID;
        this.FECHA_COMPRA = FECHA_COMPRA;
        this.RFC_EMPLEADO = RFC_EMPLEADO;
        this.MAT_PRIMA_ID = MAT_PRIMA_ID;
        this.CANTIDAD = CANTIDAD;
    }
    
    
    
}
