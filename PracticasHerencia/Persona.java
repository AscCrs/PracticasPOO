package PracticasHerencia;
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private double altura;

    public Persona() {

    }

    public Persona(String nombre, String apellido, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;        
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toString() {
        return "\nDesde Persona: {" + this.nombre + this.apellido + this.edad + this.peso + this.altura + "}";
    }

    //Metodos de clase 

    public String calcularIndiceDeMasaCorporal() {
        double indice = this.peso / this.altura;

        if (indice > 0.5 && indice < 0.7) {
            return "Estas bien de salud";
        } else {
            return "Estas mal de salud";
        }
    }
}
