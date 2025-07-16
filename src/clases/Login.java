
package clases;


public class Login {
    String user, Nombre, Cargo, pass;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Login() {
    }

    public Login(String user, String Nombre, String Cargo, String pass) {
        this.user = user;
        this.Nombre = Nombre;
        this.Cargo = Cargo;
        this.pass = pass;
    }

    
    
}
