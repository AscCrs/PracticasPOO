/**
 * Solucion 1:
 * 
 * Clase: Fracción
 * Atributos: 
 *  numerador1, numerador2, denominador1, denominador2
 *  numerador3, denominador3, numerador4. denominador 4
 * métodos: constructor (total de parametros del contructor: 8)
 *          lector (8)
 *          sima    (métodos en total: 10)
 * 
 * Aplicar adecuadamente los conceptos de POO
 * 
 * Solución 2: 
 * 
 * Clae: Fracciones 
 * Atributos> numerador, denominador
 * Metodos: Constructor(parametros: 2)
 *          lector (2 metodos lectores)
 *          sumar (como parametro tendra un objeto fraccion
 *                  regresa el objeto que representa la suma)
 * 
 * Crear un objeto para la primera fraccion
 * Crear otro objeto para representar la otra fraccion
 * 
 * Como sumar las fracciones y como aumentar despues mas de dos fracciones?
 * 
 * 
 * 
 */

package Clases.CLASEB;

public class Clase13 {
    public static void main(String[] args) {
        Fraccion m = new Fraccion(4, 5);
        Fraccion n = new Fraccion(2, 3);
        Fraccion s = null;

        s = m.sumar(n);

        System.out.println("numerador: " + s.getNumerador());
        System.out.print("denominador: " + s.getDenominador());
    
        //* Realizar un diseño e implementación orientado a objetos para calcular
        //*  el area de un rectangulo, triangulo, trapecio, circulo
    }
}
