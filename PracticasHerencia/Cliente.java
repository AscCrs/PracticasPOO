package PracticasHerencia;
public class Cliente extends Persona{
    
    private String telefonoContacto;
    private String ciudad;

    public Cliente() {

    }

    public Cliente(String telefonoContacto, String ciudad, String nombre, String apellido, int edad, double peso, double altura) {
        super(nombre, apellido, edad, peso, altura);
        this.telefonoContacto = telefonoContacto;
        this.ciudad = ciudad;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String toStringCliente() {
        return "\nDesde Cliente: {" + this.telefonoContacto + this.ciudad + "}" + super.toString();
    }

    public void info() {
        System.out.println("El cliente es de la ciudad " + this.ciudad);
    }
}
