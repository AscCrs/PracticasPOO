/**
 *  Metodos algoritmicos: Es un metodo que implementa una accion o tarea de un objeto para 
 *  resolver un problema.
 * 
 ** Problema: Calcular la suma de dos numeros
 *  clase: conjunto, suma, operacion
 *  atributos: operando1, operando2
 *  metodo: getOperando1, getOperando2, setOperando1, setOperando2, Operador, sumar
 * 
 */

package Clases.CLASEB;

import java.util.Scanner;

public class Clase09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el dato1: ");
        int x = entrada.nextInt();

        System.out.print("Ingresa el dato2: ");
        int y = entrada.nextInt();

        Operador operacion = new Operador(x, y);

        int s = operacion.sumar();
        System.out.println("La suma es: " + s);

        s = operacion.restar();
        System.out.println("La resta es: " + s);

        s = operacion.obtenerResiduo();
        System.out.println("El residuo es: " + s);

        entrada.close();
    }
}