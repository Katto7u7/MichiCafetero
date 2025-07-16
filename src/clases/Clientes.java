
package clases;


/*----TENEMOS QUE REPLICAR TODO ESTO PARA CADA UNO DE LAS TABLAS PORQUE ESTAMOS ENCAPSULANDO DATOS */
public class Clientes {
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNameCliente() {
        return nameCliente;
    }

    public void setNameCliente(String nameCliente) {
        this.nameCliente = nameCliente;
    }

    public String getAP_Cliente() {
        return AP_Cliente;
    }

    public void setAP_Cliente(String AP_Cliente) {
        this.AP_Cliente = AP_Cliente;
    }

    public String getAM_Cliente() {
        return AM_Cliente;
    }

    public void setAM_Cliente(String AM_Cliente) {
        this.AM_Cliente = AM_Cliente;
    }

    public Clientes(String Id, String nameCliente, String AP_Cliente, String AM_Cliente) {
        this.Id = Id;
        this.nameCliente = nameCliente;
        this.AP_Cliente = AP_Cliente;
        this.AM_Cliente = AM_Cliente;
    }

    
    
    public Clientes() {
    }
    
    private String Id;
    private String nameCliente;
    private String AP_Cliente;
    private String AM_Cliente;

}
