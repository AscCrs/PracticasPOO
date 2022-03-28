/**
 * Realizar un diseño e implementación orientado a objetos para calcular
 * el area de un rectangulo, triangulo, trapecio, circulo
 * Clase: Figuras
 */
package Clases.CLASEB;
import java.util.Scanner;

public class MainCalculos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Figuras calculos = new Figuras();

        int opcion = 0;
        boolean validacion;
        float b = 0;
        float h = 0;
        float area = 0;

        do {
            System.out.print("\n1. Rectangulo\n2. Triangulo\n3. Trapecio\n4. Circulo\nIngrese la opcion a calcular su area:");
            opcion = in.nextInt();
            if (!(opcion > 0 && opcion <= 4)) {
                System.out.println("Opcion invalida!");
                validacion = false;
            } else validacion = true;
        } while (validacion == false);

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el valor de la base: ");
                b = in.nextFloat();
                System.out.print("Ingrese el valor de la altura: ");
                h = in.nextFloat();

                area = calculos.areaRectangulo(b, h);
                break;
            case 2:
                System.out.print("Ingrese el valor de la base: ");
                b = in.nextFloat();
                System.out.print("Ingrese el valor de la altura: ");
                h = in.nextFloat();

                area = calculos.areaTriangulo(b, h);
                break;
            case 3:
                System.out.print("Ingrese el valor de la base Mayor: ");
                b = in.nextFloat();
                System.out.print("Ingrese el valor de la mase menor: ");
                float baseM = in.nextFloat();
                System.out.print("Ingrese e l valor de la altura: ");
                h = in.nextFloat();

                area = calculos.areaTrapecio(b, baseM, h);
                break;
            case 4:
                System.out.print("Ingrese el valor del radio: ");
                float radio = in.nextFloat();

                area = calculos.areaCirculo(radio);
                break;
            default:
                break;
        }

        System.out.print("El area de la figura es: " + area);

        in.close();
    }
}
