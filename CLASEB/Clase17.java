package Clases.CLASEB;
import java.util.Scanner;

public class Clase17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Datos del primer punto: ");
        System.out.println("Dame el valor de x: ");
        Float x1 = entrada.nextFloat();

        System.out.println("Dame el valor de y: ");
        Float y1 = entrada.nextFloat();

        PuntoCartesiano p1 = new PuntoCartesiano(x1, y1);        
        
        System.out.println("Datos del segundo punto: ");
        System.out.println("Dame el valor de x: ");
        Float x2 = entrada.nextFloat();

        System.out.println("Dame el valor de y: ");
        Float y2 = entrada.nextFloat();

        PuntoCartesiano p2 = new PuntoCartesiano(x2, y2);

        System.out.println("La distancia es: " + p1.calcularDistancia(p2));

        entrada.close();
    }
}
