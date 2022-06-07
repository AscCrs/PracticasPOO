package Clases.MISCLASES;

public class EmpleadoDistribucion extends Asalariado{
    // private String nombre;
    // private long dni;
    // private int diasVacaciones;
    private String zona;

    public EmpleadoDistribucion() { }

    public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, String zona) {
        super(nombre, dni, diasVacaciones);
        this.zona = zona;
    }

    // public String getNombre() { return nombre;}
    // public long getDni() { return dni;}
    // public int getDiasVacaciones() { return diasVacaciones;}
    public String getZona() { return zona;}

    // public void setNombre(String nombre) { this.nombre = nombre;}
    // public void setDni(long dni) { this.dni = dni;}
    // public void setDiasVacaciones(int diasVacaciones) { this.diasVacaciones = diasVacaciones;}
    public void setZona(String zona) { this.zona = zona;}
    
}
