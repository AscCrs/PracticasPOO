package Clases.CLASEB;

public class AdicionFracciones {

    private int numerador; 
    private int denominador;

    public AdicionFracciones() {
        this.numerador = 0;
        this.denominador = 1;
    }

    public AdicionFracciones(int numerador, int denominador) {
        this. numerador = numerador;
        if (denominador == 0) {
            denominador = 1;
        }
        this.denominador = denominador;
        simplificarFraccion();
    }
    
    public AdicionFracciones(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public AdicionFracciones sumarFracciones(AdicionFracciones f) {
        AdicionFracciones auxiliar = new AdicionFracciones();
        auxiliar.numerador = this.numerador * f.denominador + this.denominador * f.numerador;
        auxiliar.denominador = this.denominador * f.denominador;

        return auxiliar;
    }

    public int maximoComunDivisor() { //Se aplica el algoritmo de Euclides
        int valAbsolutoNum = Math.abs(numerador);
        int valAbsolutoDen = Math.abs(denominador);
        if (valAbsolutoDen == 0) {
            return 0;            
        }
        int r;
        while (valAbsolutoDen != 0) {
            r = valAbsolutoNum % valAbsolutoDen;
            valAbsolutoNum = valAbsolutoDen;
            valAbsolutoDen = r;            
        }

        return valAbsolutoDen;
    }

    public void simplificarFraccion() {
        int n = maximoComunDivisor();
        numerador = numerador / n;
        denominador = denominador / n;
    }
    
    @Override
    public String toString() {
        simplificarFraccion();
        return numerador + "/" + denominador;
    }
}
