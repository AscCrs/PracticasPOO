/**
 * Problema: Determinar si un auto excede la velocidad permitida de
 * 90km/hr
 * 
 * clase: automovil
 * atributos: velocidad, velocidad maxima  
 * metodos: lectores, modificadores, determinarSiExcede
 * 
 */

package Clases.CLASEB;
import java.util.Scanner;

public class Clase10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Automovil carcachita = new Automovil();

        System.out.print("Ingrese la velocidad del automovil: ");
        float v = input.nextFloat();

        carcachita.setVelocidad(v);

        boolean r = carcachita.determinarSiExcede();

        System.out.println("Carcachita excede velocidad " + r);

        input.close();
    }
}