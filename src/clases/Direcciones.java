
package clases;

public class Direcciones {
    private String idDir, alc_mun, colonia, cp, call, ext, inte, estado_id;

    public String getIdDir() {
        return idDir;
    }

    public void setIdDir(String idDir) {
        this.idDir = idDir;
    }

    public String getAlc_mun() {
        return alc_mun;
    }

    public void setAlc_mun(String alc_mun) {
        this.alc_mun = alc_mun;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getInte() {
        return inte;
    }

    public void setInte(String inte) {
        this.inte = inte;
    }

    public String getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(String estado_id) {
        this.estado_id = estado_id;
    }

    public Direcciones(String idDir, String alc_mun, String colonia, String cp, String call, String ext, String inte, String estado_id) {
        this.idDir = idDir;
        this.alc_mun = alc_mun;
        this.colonia = colonia;
        this.cp = cp;
        this.call = call;
        this.ext = ext;
        this.inte = inte;
        this.estado_id = estado_id;
    }

    
    public Direcciones() {
    }
}
