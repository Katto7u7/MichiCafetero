
package clases;


public class Empleados {
    private String RFC,name, A_pat,A_mat, fechaNac,correo, numSeguro, user,password, cargo,horario,Id_direccion;
    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getA_pat() {
        return A_pat;
    }

    public void setA_pat(String A_pat) {
        this.A_pat = A_pat;
    }

    public String getA_mat() {
        return A_mat;
    }

    public void setA_mat(String A_mat) {
        this.A_mat = A_mat;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumSeguro() {
        return numSeguro;
    }

    public void setNumSeguro(String numSeguro) {
        this.numSeguro = numSeguro;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getId_direccion() {
        return Id_direccion;
    }

    public void setId_direccion(String Id_direccion) {
        this.Id_direccion = Id_direccion;
    }

    public Empleados(String RFC, String name, String A_pat, String A_mat, String fechaNac, String correo, String numSeguro, String user, String password, String cargo, String horario, String Id_direccion) {
        this.RFC = RFC;
        this.name = name;
        this.A_pat = A_pat;
        this.A_mat = A_mat;
        this.fechaNac = fechaNac;
        this.correo = correo;
        this.numSeguro = numSeguro;
        this.user = user;
        this.password = password;
        this.cargo = cargo;
        this.horario = horario;
        this.Id_direccion = Id_direccion;
    }

    public Empleados() {
        
    }
}
