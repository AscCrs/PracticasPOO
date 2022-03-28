/**
 * Problema 01: Calcular la suma de dos numeros
 * Problema 02: Calcular la velocidad permitida de un auto
 * Problema 03: Crear figuras con Asteriscos
 * Problema 04: Modelar e implementar en java un dado para jugar
 * 
 * Primer Paso: observar el objeto o los objetos varios dados para
 *              jugar
 * 
 * clase: Dado
 * atributos: valorDado
 * metodos: lector
 *          modificador
 *          generarNumero 
 *  
 */
package Clases.CLASEB;


public class Clase12 {
    public static void main(String[] args) {

        Dado tiro = new Dado(5);
        System.out.println("El valor del tiro es: " + tiro.generarNumero());
    }
}


