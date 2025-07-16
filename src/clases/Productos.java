
package clases;


public class Productos {
    private String ID,NOMBRE, PRESENTACION, DESCRIPCCION, CLASIFICACION;
    private float PRECIO;
    private int CALORIAS,STOCK;///**SE AGREGÓ STOCK 15/12/2022

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getPRESENTACION() {
        return PRESENTACION;
    }

    public void setPRESENTACION(String PRESENTACION) {
        this.PRESENTACION = PRESENTACION;
    }

    public String getDESCRIPCCION() {
        return DESCRIPCCION;
    }

    public void setDESCRIPCCION(String DESCRIPCCION) {
        this.DESCRIPCCION = DESCRIPCCION;
    }

    public String getCLASIFICACION() {
        return CLASIFICACION;
    }

    public void setCLASIFICACION(String CLASIFICACION) {
        this.CLASIFICACION = CLASIFICACION;
    }

    public float getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(float PRECIO) {
        this.PRECIO = PRECIO;
    }

    public int getCALORIAS() {
        return CALORIAS;
    }

    public void setCALORIAS(int CALORIAS) {
        this.CALORIAS = CALORIAS;
    }

    public int getSTOCK() {
        return STOCK;
    }

    public void setSTOCK(int STOCK) {
        this.STOCK = STOCK;
    }

    public Productos() {
    }

    
    public Productos(String ID, String NOMBRE, String PRESENTACION, String DESCRIPCCION, String CLASIFICACION, float PRECIO, int CALORIAS, int STOCK) {
        this.ID = ID;
        this.NOMBRE = NOMBRE;
        this.PRESENTACION = PRESENTACION;
        this.DESCRIPCCION = DESCRIPCCION;
        this.CLASIFICACION = CLASIFICACION;
        this.PRECIO = PRECIO;
        this.CALORIAS = CALORIAS;
        this.STOCK = STOCK;
    }
    
    
    
}
