/**
 * Realizar una clase para crear una linea horizontal de asteriscos de longitud
 * l. Por ejemplo si l  = 4 entonces:
 *  * * * *
 * 
 * Y crear una linea vertical de asteriscos de longitud l, por ejemplo,
 * si l = 3
 * 
 * *
 * *
 * *
 * 
 * Y crear una l de logitud l. Ejemplo si l = 4
 * 
 * *
 * *
 * *
 * * * * *
 * 
 * Nota: la longitud debe ser introducida por teclado
 * 
 * Clase: FormaAsteriscos
 * Atributos: longitud
 * Metodos: constructor, modificadores, lectores, 3 metodos algoritmicos 
 */
package Clases.CLASEB;
import java.util.Scanner;

public class Clase11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FormaAsteriscos figurita = new FormaAsteriscos();

        System.out.print("Ingrese la longitud: ");
        int l = in.nextInt();

        figurita.setLongitud(l);

        System.out.println(figurita.crearLineaHorizontal(l));

        System.out.println(figurita.crearLineaVertical());

        System.out.println(figurita.crearL());

        // * Forma de crear la L sin crear un metodo en la clase FormaAsteriscos.
        // figurita.setLongitud(l-1);
        // System.out.println(figurita.crearLineaVertical() + figurita.crearLineaHorizontal());

        in.close();
    }
}
