
package clases;


public class Provedor {
    private String IDPROV,PROV;

    public String getIDPROV() {
        return IDPROV;
    }

    public void setIDPROV(String IDPROV) {
        this.IDPROV = IDPROV;
    }

    public String getPROV() {
        return PROV;
    }

    public void setPROV(String PROV) {
        this.PROV = PROV;
    }

    public Provedor() {
    }

    
    public Provedor(String IDPROV, String PROV) {
        this.IDPROV = IDPROV;
        this.PROV = PROV;
    }
}
