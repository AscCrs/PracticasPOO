package PracticasHerencia;
public class Empleado extends Persona{
    private double sueldoBruto;
    private String puesto;
    private int diasTrabajo;  
    
    public Empleado() {
        
    }

    public Empleado(double sueldoBruto, String puesto, int diasTrabajo, String nombre, String apellido, int edad, double peso, double altura) {
        super(nombre, apellido, edad, peso, altura);
        this.sueldoBruto = sueldoBruto;
        this.puesto = puesto;
        this. diasTrabajo = diasTrabajo;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public String getPuesto() {
        return puesto;
    }

    public int getDiasTrabajo() {
        return diasTrabajo;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public void setDiasTrabajo(int diasTrabajo) {
        this.diasTrabajo = diasTrabajo;
    }

    public String toStringEmpleado() {
        return "\nDesde Empleado: {" + this.sueldoBruto + this.puesto + this.diasTrabajo + "}" + super.toString();
    }

    // Metodo de clase 

    public double calcularQuincena() {
        return 0;
    }

    public double calcularMensualidad() {
        return 0;
    }
}
