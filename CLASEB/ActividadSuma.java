/**
 * Tarea: 
 * Modelar e implementar la suma de dos fracciones basados en objetos
 * 
 * Clase: SumaFracciones, AdicionFracciones
 * Atributos: 
 * 
 * Métodos: 
 */

package Clases.CLASEB;

public class ActividadSuma {
    public static void main(String[] args) {
        AdicionFracciones fraccion1 = new AdicionFracciones(1, 2);
        AdicionFracciones fraccion2 = new AdicionFracciones(3, 4);

        AdicionFracciones suma = fraccion1.sumarFracciones(fraccion2);

        System.out.println("La suma de las fracciones " + fraccion1 + " + " + fraccion2 + " = " + suma);
    }
}
