package Clases.CLASEB;
import java.util.ArrayList;

public class BDEmpleado {
    private ArrayList <EmpleadoC15> empleados;

    public BDEmpleado() {
        empleados = new ArrayList<EmpleadoC15>();

    }

    public void agregarEmpleado(EmpleadoC15 x) {
        empleados.add(x);
    }

    public String consultarEmpleados() {
        // código para consultar
        String c = "";
        for (EmpleadoC15 x : empleados) {
            c = c + x.getNombre() + " \nSueldo:" + x.getSueldo();
        }
        return c;
    }

    public int totalEmpleados() {
        return empleados.size();
    }

}
