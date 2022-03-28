package Clases.CLASEB;

public class Empleado {
    private String nombre;
    private float sueldo;

    public String getNombre() {
        return nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public Empleado(String nombre, float sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
}
