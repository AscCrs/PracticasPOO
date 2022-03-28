package Clases.CLASEB;
// import java.util.Scanner;

public class DistanciaEntrePuntos {
    // Scanner in = new Scanner(System.in);

    // public Float obtenerX(Integer num) {
    //     System.out.print("Ingrese la coordenada para x" + num + ": ");
    //     String x = in.nextLine();
    //     return Float.valueOf(x);
    // }

    // public Float obtenerY(Integer num) {
    //     System.out.print("Ingrese la coordenada para y" + num + ": ");
    //     String y = in.nextLine();
    //     return Float.valueOf(y);
    // }

    // public String calcularDistancia(ObtenerCoordenadas punto1, ObtenerCoordenadas punto2) {
    //     String resultado = String.valueOf((float)(Math.sqrt(Math.pow((punto2.x - punto1.x), 2) + Math.pow((punto2.y - punto1.y), 2))));
    //     return resultado;
    // }

    public static Float distancia(Float x1, Float y1, Float x2, Float y2) {
        return (float)(Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2))));
    }
}
