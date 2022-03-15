/**
 * Simular un ambiente de trabajo de una empresa desarrolladora de software
 * 
 * Crear una clase llamada teclado con dos atributos, sus metodos
 * lectores y metodos modificadores.
 * 
 * Crear una instancia de la clase teclado y despues imprimir 
 * su estado y modificar su estado y nuevamente imprimir su estado
 * 
 * Los valores de los atributos deben ser introducidos por teclado
 * 
 */
package Clases.CLASEB;

import java.util.Scanner;

public class Clase07 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Teclado Tecladito = new Teclado();

        System.out.println("El estado actual del objeto es:");
        System.out.println("El valor del atributo color de Teclado es: " + Tecladito.getColor());
    
        System.out.println("El valor del atributo numeroTeclas de Tecladito es: " + Tecladito.getNumeroTeclas());
    
        System.out.println("Ingrese los valores que tomara el objeto en el atributo color: ");
        String b = sc.nextLine(); 
        Tecladito.setColor(b);

        System.out.println("Ingrese los valores que tomara el objeto en el atributo numeroTeclas: ");
        int c = sc.nextInt();
        Tecladito.setNumeroTeclas(c);

        System.out.println("El nuevo estado del objeto es:");
        System.out.println("El valor del atributo color de Teclado es: " + Tecladito.getColor());

        System.out.println("El valor del atributo numeroTeclas de Tecladito es: " + Tecladito.getNumeroTeclas());

        sc.close();
    }
}