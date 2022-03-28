/** 
    * Requerimiento: encontrar la distancia entre dos puntos en el plano cartesiano:
    * los datos deben ser introducidos por teclado.
    * Todo el programa debe ser orientado a objetos, sin datos primitivos
    * Evitar las declaraciones de variables de tipos de datos primitivos.
    * 
    * d = sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2)
*/
package Clases.CLASEB;
import java.util.Scanner;

public class MainDistanciaDosPuntos {
// import java.util.Scanner;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // DistanciaEntrePuntos distancia = new DistanciaEntrePuntos();

        // String x1 = String.valueOf(distancia.obtenerX(1));
        // String y1 = String.valueOf(distancia.obtenerY(1));
        // String x2 = String.valueOf(distancia.obtenerX(2));
        // String y2 = String.valueOf(distancia.obtenerY(2));

        // ObtenerCoordenadas punto1 = new ObtenerCoordenadas(Float.valueOf(x1), Float.valueOf(y1));
        // ObtenerCoordenadas punto2 = new ObtenerCoordenadas(Float.valueOf(x2), Float.valueOf(y2));
        
        // System.out.println("La distancia entre los puntos es: " + distancia.calcularDistancia(punto1, punto2));

        System.out.print("Ingrese el valor de x1: ");
        String x1 = in.nextLine();
        System.out.print("Ingrese el valor de y1: ");
        String y1 = in.nextLine();
        System.out.print("Ingrese el valor de x2: ");
        String x2 = in.nextLine();
        System.out.print("Ingrese el valor de y2: ");
        String y2 = in.nextLine();
        
        String D = String.valueOf(DistanciaEntrePuntos.distancia(Float.valueOf(x1), Float.valueOf(y1), Float.valueOf(x2), Float.valueOf(y2)));

        System.out.print("La distancia es: " + D);

        in.close();
    }    
}
