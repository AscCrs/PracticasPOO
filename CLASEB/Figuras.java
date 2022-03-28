package Clases.CLASEB;

public class Figuras {
    private float area;
    private float base;
    private float altura;
    private float baseMenor;
    private float radio;
    
    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public float getBaseMenor() {
        return baseMenor;
    }

    public float getRadio() {
        return radio;
    }

    public float areaRectangulo(float base, float altura) {
        area = base * altura;

        return area;
    }

    public float areaTriangulo(float base, float altura) {
        area = (base * altura)/2;

        return area;
    }

    public float areaTrapecio(float baseMayor, float baseMenor, float altura) {
        this.base = baseMayor;
        area = (base + baseMenor) * altura / 2; 
        
        return area;
    }

    public float areaCirculo(float radio) {
        double pi = 3.1416;
        area = (float) (pi * Math.pow(radio, 2));
        
        return area;
    }

}
