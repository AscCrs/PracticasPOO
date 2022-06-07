/**
 * Requerimiento: Simular el comportamiento de un caballo o varios caballos. Uno de sus comportamientos
 * es avanzar y retroceder. El caballo debe ser representado por unos caracteres definidos por el usuario.
 * Por ejemplo si el usuario determina que un caballo "C" o "Ca" y su comportamiento debe ser mostrado en
 * pantalla. Para avanzar seria a la derecha n pasos y retroceder seria avanzar pero hacia la izquierda. Un
 * paso representa un espacio en blanco, 
 * 
 * Si defino un caballo C-01
 * 
 * Avanza 3 pasos(Aleatoriamente = 1 a 3 pasos)
 * Avanza 4 pasos(Aleatoriamente)
 * retroceder 2 pasos(Aleatoriamente)
 * 
 *      C-01
 * 
 * El avanzar y retroceder puede ser aleatoria o definida por el usuario.
 * 
 * *Nota: No avanzar hasta que llega al fin
 * 
 * clase: Caballo
 * Atributos: pasos actuales,
 *            nombre
 *            figura
 * Métodos: constructor, lectores, avanzar, retroceder, dibujar
 * 
 * Requerimiento: Juego de caballos, realizar un sistema orientado a objetos para realizar la carrera de 3 caballos
 * todos inician al principio de pantalla y los caballos deben avanzar de forma aleatoria, se debe imprimir su avance
 * hasta que el caballo llegue a la derecha de al pantalla
 * 
 * Caballo 1 tendra la figrua C1
 * Caballo 2 tendra la figura C2
 * Caballo 3 tendra la figura C3
 * 
 * 
 */

package Clases.CLASEB;
import java.util.Scanner;

public class Clase18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dame el nombre del caballo: ");
        String n = in.nextLine();
        System.out.println("Dame la figura del caballo: ");
        String f = in.nextLine();
        Caballo miCaballo = new Caballo(n, f);

        String salida = miCaballo.avanzar();
        System.out.println(salida);

        salida = miCaballo.avanzar(3);
        System.out.println(salida);

        salida = miCaballo.retroceder();
        System.out.println(salida);

        salida = miCaballo.retroceder(1);
        System.out.println(salida);

        in.close();
    }
}
