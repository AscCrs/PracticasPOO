package Clases.CLASEB;

public class Fraccion {

    private int numerador;
    private int denominador;

    Fraccion( int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public Fraccion sumar(Fraccion otra) {
        int n = numerador * otra.getDenominador() + denominador * otra.getNumerador();
        int d = denominador * otra.getDenominador();
        
        Fraccion objetoSuma = new Fraccion(n, d);

        return objetoSuma;
    }
    
}
