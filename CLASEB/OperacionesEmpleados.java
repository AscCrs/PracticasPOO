package Clases.CLASEB;
import java.util.ArrayList;

public class OperacionesEmpleados {
    private ArrayList<Empleado>empleado = new ArrayList<Empleado>();

    public void nuevoEmpleado(String nombre, float sueldo) {
        Empleado nuevoEmpleado = new Empleado(nombre, sueldo);
        empleado.add(nuevoEmpleado);
    }

    public String imprimirEmpleados() {
        String c = "";
        for (Empleado em : empleado) {
            c = c + "\nNombre: " + em.getNombre() + " \nSueldo: $" + em.getSueldo();
        }

        return c;
    }

    public int cantidadEmpleados() {
        return empleado.size();
    }

    public void limpiarConsola() {
        System.out.println("\033[H\033[23");
    }
}
