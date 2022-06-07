package Clases.MISCLASES;

import Practicas.Circulo;

public class Interfaz01 {
    public static void main(String[] args) {
        Circulo m = new Circulo(3.4f);
        System.out.println("El area es: " + m.calcularArea());

        Cuadrado c = new Cuadrado(5.6f);
        System.out.println("El area es: " + c.calcularArea());
    }
}
