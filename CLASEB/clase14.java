/**
 * Solución 1 
 * Clase: Figuras
 * Atributos: los n atributos
 * Método: lectores, modificadores y un método para calcular cada area
 * 
 * Solución 2: 
 * Clase: Figura
 * atributos: los n atributos
 * métodos: lectores, modificadores, calcular cada area de cada figura
 * 
 * Solución 3: 
 * Una clase para cada figura
 * Clase: triangulo 
 * Atributos: base, altura
 * Métodos: lectores, modificadores, calcular area
 * 
 * *Una clase para cada figura
 * 
 * Solución 4: 
 * Usar los métodos estaticos
 * 
 * Solución 5:
 * Utilizar la herencia, interfaz 
 * 
 * *Concepto
 * Un método estatico se declara con la palabra reservada Static
 * 
 * Un método estatico es un método que pertenece a la clase y no al
 * objeto. Eso significa que no debe ser creato un objeto para invocar
 * un método. 
 * 
 * Un método estatico solo puede acceder a datos estaticos
 * 
 * 
 */
package Clases.CLASEB;
import java.util.Scanner;

public class clase14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el lado: ");
        float l = entrada.nextFloat();
        float a = Figura.calcularAreaCuadrado(l);

        System.out.println("El area de un cuadrado es: " + a);

        System.out.print("Area del pentagono: " + Figura.calcularAreaPentagono(20, 30));

        entrada.close();
    }
}
