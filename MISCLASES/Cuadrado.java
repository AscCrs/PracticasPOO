package Clases.MISCLASES;

public class Cuadrado implements Figura{
    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float calcularArea() {
        return lado * lado;
    }

    public float calcularPerimetro() {
        return 4*lado;
    }
}
