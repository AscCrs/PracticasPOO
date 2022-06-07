package Clases.MISCLASES;

public class Circulo implements Figura {
    private float radio;

    public Circulo (float radio){
        this.radio = radio;
    }

    public float calcularArea() {
        return 3.1416f * radio * radio;
    }

    public float calcularPerimetro() {
        return 3.1416f * 2 * radio;
    }
}
