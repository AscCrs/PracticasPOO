package PracticasHerencia;
import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Que le gustaria añadir? 1.-Empleado/2.-Cliente");
        int opcion = in.nextInt();

        System.out.println("Ingrese su nombre: ");
        String nombre = in.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = in.nextLine();
        System.out.println("Ingrese su edad");
        int edad = in.nextInt();
        System.out.println("Ingrese su peso: ");
        double peso = in.nextDouble();
        System.out.println("Ingrese su altura: ");
        double altura = in.nextDouble();

        if (opcion == 1) {
            System.out.println("Ingrese su sueldo bruto: ");
            double sueldoBruto = in.nextDouble();
            System.out.println("Ingrese su puesto: ");
            String puesto = in.nextLine();
            System.out.println("Ingrese sus dias de trabajo: ");
            int dias = in.nextInt();

            Empleado empleado = new Empleado();
            empleado.setNombre(nombre);
            empleado.setApellido(apellido);
            empleado.setEdad(edad);
            empleado.setPeso(peso);
            empleado.setAltura(altura);
            empleado.setSueldoBruto(sueldoBruto);
            empleado.setPuesto(puesto);
            empleado.setDiasTrabajo(dias);

            System.out.println("FELICIDADES AGREGASTE UN EMPLEADO!");
            System.out.println(empleado.toString());
            System.out.println("Tu sueldo quincenal sera: " + empleado.calcularQuincena());
        } else {
            System.out.println("Ingrese su telefono de contacto: ");
            String telefonoContacto = in.nextLine();
            System.out.println("Ingrese su ciudad: ");
            String ciudad = in.nextLine();          
            
            Cliente cliente = new Cliente();
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setEdad(edad);
            cliente.setPeso(peso);
            cliente.setAltura(altura);
            cliente.setTelefonoContacto(telefonoContacto);
            cliente.setCiudad(ciudad);

            System.out.println("FELICIDADES AGREGASTE UN CLIENTE!");
            System.out.println(cliente.toString());
        }

        in.close();
    }    
}
