/**
 * Una compañia editorial produce tanto libros impresos como 
 * audio-libros en discos compactos. DIseñe una clase denomidada 
 * publicación que almacene el título (cadena) y el precio 
 * (númerico real) de una públicación. A paritr de esta clase, 
 * derive dos clases:
 * 
 * Libro a la cual le agregue el número de páginas (entero) y CD, 
 * a la cual le agregue el tiempo de reproducción en minutos 
 * (numérico real).
 */
package Clases.MISCLASES;
import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese el titulo: ");
        String titulo = in.nextLine();
        
        System.out.println("Ingrese el precio: ");
        float precio = in.nextFloat();

        Publicacion pub = new Publicacion(titulo, precio);
        System.out.println(pub.toString());

        
        in.close();
    }
}
