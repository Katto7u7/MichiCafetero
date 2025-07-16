
package clases;


public class MateriaPrima {
    private String IdMatPrima, NombreMatP, FechaCad, tipoMatP;
    private float precio;
    private int existencias,ClasMatP;

    public String getIdMatPrima() {
        return IdMatPrima;
    }

    public void setIdMatPrima(String IdMatPrima) {
        this.IdMatPrima = IdMatPrima;
    }

    public String getNombreMatP() {
        return NombreMatP;
    }

    public void setNombreMatP(String NombreMatP) {
        this.NombreMatP = NombreMatP;
    }

    public String getFechaCad() {
        return FechaCad;
    }

    public void setFechaCad(String FechaCad) {
        this.FechaCad = FechaCad;
    }

    public String getTipoMatP() {
        return tipoMatP;
    }

    public void setTipoMatP(String tipoMatP) {
        this.tipoMatP = tipoMatP;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public int getClasMatP() {
        return ClasMatP;
    }

    public void setClasMatP(int ClasMatP) {
        this.ClasMatP = ClasMatP;
    }

    
    
    public MateriaPrima(String IdMatPrima, String NombreMatP, String FechaCad, String tipoMatP, float precio, int existencias, int ClasMatP) {
        this.IdMatPrima = IdMatPrima;
        this.NombreMatP = NombreMatP;
        this.FechaCad = FechaCad;
        this.tipoMatP = tipoMatP;
        this.precio = precio;
        this.existencias = existencias;
        this.ClasMatP = ClasMatP;
    }

    public MateriaPrima() {
    }

    
    

    
}
