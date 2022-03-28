/**
 * Problema:
 * Un cliente con el siguiente requerimiento:
 * quiere un sistema que gestione la información de sus empleados, 
 * un empleado tiene un nombre y sueldo. El sistema debe mostrar 
 * un menú con las siguientes opciones: 
 * 1.- Dar de alta un empleado con su información. 
 * 2.- consultar la información de Todos los empelados que se 
 * han dado de alta 
 * 3.- imprimir cuantos empleados hay de alta 
 * y 4.- salir del sistema. el sistema debe ser diseñado e 
 * implementado orientado a objetos.
 */
package Clases.CLASEB;
import java.util.Scanner;

public class mainEmpleados {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        OperacionesEmpleados empleados = new OperacionesEmpleados();

        boolean valOp = false;
        int opcion = 0;

        do {
            System.out.println("Menu de operaciones.");
            System.out.println("1. Dar de alta un empleado con su información\n2. Consultar la informacion de todos los empleados que se han dado de alta.");
            System.out.println("3. Imprimir cuantos empleados hay dados de alta\n4. Salir del sistema");
            System.out.print("Ingrese su opcion: ");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = in.next();
                    System.out.print("Ingrese el salario del empleado: ");
                    float sueldo = in.nextFloat();
                    empleados.nuevoEmpleado(nombre, sueldo);

                    break;
                case 2:
                    empleados.imprimirEmpleados();

                    System.out.println("Empleados Registrados:" + empleados.imprimirEmpleados());
                    
                    break;
                case 3:
                    System.out.println("La cantidad de empleados registrados es de: " + empleados.cantidadEmpleados());

                    break;
                case 4:
                    valOp = true;
                    
                    break;
                default:
                System.out.println("La opcion ingresada es incorrecta");
                    break;
            }
            in.nextLine();
            System.out.print("Presione enter para continuar....");
            in.nextLine();
            empleados.limpiarConsola();
        } while (valOp == false);

        in.close();
    }
}
