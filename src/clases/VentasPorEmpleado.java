
package clases;


public class VentasPorEmpleado {
    String RFC,NOMBREEMP,APELLIDOPAT,APELLIDOMAT,IDVENTA,FECHAVENTA,NOMBREPROD;
    int CANTIDAD;

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getNOMBREEMP() {
        return NOMBREEMP;
    }

    public void setNOMBREEMP(String NOMBREEMP) {
        this.NOMBREEMP = NOMBREEMP;
    }

    public String getAPELLIDOPAT() {
        return APELLIDOPAT;
    }

    public void setAPELLIDOPAT(String APELLIDOPAT) {
        this.APELLIDOPAT = APELLIDOPAT;
    }

    public String getAPELLIDOMAT() {
        return APELLIDOMAT;
    }

    public void setAPELLIDOMAT(String APELLIDOMAT) {
        this.APELLIDOMAT = APELLIDOMAT;
    }

    public String getIDVENTA() {
        return IDVENTA;
    }

    public void setIDVENTA(String IDVENTA) {
        this.IDVENTA = IDVENTA;
    }

    public String getFECHAVENTA() {
        return FECHAVENTA;
    }

    public void setFECHAVENTA(String FECHAVENTA) {
        this.FECHAVENTA = FECHAVENTA;
    }

    public String getNOMBREPROD() {
        return NOMBREPROD;
    }

    public void setNOMBREPROD(String NOMBREPROD) {
        this.NOMBREPROD = NOMBREPROD;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public VentasPorEmpleado() {
    }

    public VentasPorEmpleado(String RFC, String NOMBREEMP, String APELLIDOPAT, String APELLIDOMAT, String IDVENTA, String FECHAVENTA, String NOMBREPROD, int CANTIDAD) {
        this.RFC = RFC;
        this.NOMBREEMP = NOMBREEMP;
        this.APELLIDOPAT = APELLIDOPAT;
        this.APELLIDOMAT = APELLIDOMAT;
        this.IDVENTA = IDVENTA;
        this.FECHAVENTA = FECHAVENTA;
        this.NOMBREPROD = NOMBREPROD;
        this.CANTIDAD = CANTIDAD;
    }
    
}
