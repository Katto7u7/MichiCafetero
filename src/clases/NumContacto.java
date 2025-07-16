
package clases;


public class NumContacto {
    private String ID_NUMC,LADA,TEL,EXTENSION,RFC_EMP;

    public String getID_NUMC() {
        return ID_NUMC;
    }

    public void setID_NUMC(String ID_NUMC) {
        this.ID_NUMC = ID_NUMC;
    }

    public String getLADA() {
        return LADA;
    }

    public void setLADA(String LADA) {
        this.LADA = LADA;
    }

    public String getTEL() {
        return TEL;
    }

    public void setTEL(String TEL) {
        this.TEL = TEL;
    }

    public String getEXTENSION() {
        return EXTENSION;
    }

    public void setEXTENSION(String EXTENSION) {
        this.EXTENSION = EXTENSION;
    }

    public String getRFC_EMP() {
        return RFC_EMP;
    }

    public void setRFC_EMP(String RFC_EMP) {
        this.RFC_EMP = RFC_EMP;
    }

    public NumContacto() {
    }

    public NumContacto(String ID_NUMC, String LADA, String TEL, String EXTENSION, String RFC_EMP) {
        this.ID_NUMC = ID_NUMC;
        this.LADA = LADA;
        this.TEL = TEL;
        this.EXTENSION = EXTENSION;
        this.RFC_EMP = RFC_EMP;
    }
}
