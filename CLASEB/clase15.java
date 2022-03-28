package Clases.CLASEB;
import java.util.ArrayList;

public class clase15 {
    public static void main(String[] args) {
        ArrayList <EmpleadoC15> BD = new ArrayList<EmpleadoC15>();

        //Pregunta los datos del empleado
        float s = 23.4F; //preguntar desde el scanner
        String n = "Alberto"; //Preguntar desde el scanner
        EmpleadoC15 x = new EmpleadoC15(n, s);

        BD.add(x);

        BD.add(new EmpleadoC15("Jesus", 23.4f));
        BD.add(new EmpleadoC15("Enrique", 34.5f));

        System.out.println(BD);

        for (int i = 0; i < BD.size(); i++) {
            EmpleadoC15 z = BD.get(i);

            System.out.println(z.getNombre() + " " + z.getSueldo());
            System.out.println(BD.get(i).getNombre() + " " + BD.get(i).getSueldo());

        }

        for (EmpleadoC15 v : BD) {
            System.out.println(v.getNombre() + " " + v.getSueldo());
        }

        BDEmpleado miBase = new BDEmpleado();

        miBase.agregarEmpleado(new EmpleadoC15("Jaime", 12.3f));
        miBase.agregarEmpleado(new EmpleadoC15("Jose", 789.90f));

        System.out.println(miBase.consultarEmpleados());

    }
}
