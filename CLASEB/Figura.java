package Clases.CLASEB;

public class Figura {

    public static void metodoNoEstatico() {

    }
    
    public static float calcularAreaTriangulo(float base, float altura) {
        float area = (base * altura) / 2;

        metodoNoEstatico();

        return area;
    }

    public static float calcularAreaCirculo(float radio) {
        
        return (float)(Math.PI * Math.pow(radio, 2));
    }

    public static float calcularAreaRectangulo(float base, float altura) {
        float area = base * altura;

        return area;
    }

    public static float calcularAreaCuadrado(float lado) {
        
        return (float)Math.pow(lado, 2);
    }

    public static float calcularAreaPentagono(float lado, float apotema) {
        
        return (5 * lado * apotema) / 2;
    }
}
