
package clases;


public class Ventas {
    private String ID,FECHA,CLIENTEID,RFCEMPLEADO;
    private int METODO;


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFECHA() {
        return FECHA;
    }

    public void setFECHA(String FECHA) {
        this.FECHA = FECHA;
    }

    public String getCLIENTEID() {
        return CLIENTEID;
    }

    public void setCLIENTEID(String CLIENTEID) {
        this.CLIENTEID = CLIENTEID;
    }

    public String getRFCEMPLEADO() {
        return RFCEMPLEADO;
    }

    public void setRFCEMPLEADO(String RFCEMPLEADO) {
        this.RFCEMPLEADO = RFCEMPLEADO;
    }

    public int getMETODO() {
        return METODO;
    }

    public void setMETODO(int METODO) {
        this.METODO = METODO;
    }

    public Ventas() {
    }

    
    public Ventas(String ID, String FECHA, int METODO, String CLIENTEID, String RFCEMPLEADO) {
        this.ID = ID;
        this.FECHA = FECHA;
        this.CLIENTEID = CLIENTEID;
        this.RFCEMPLEADO = RFCEMPLEADO;
        this.METODO = METODO;
    }
}
