package Clases.CLASEB;

public class Operador {
    private int operando1;
    private int operando2;

    //* Contructor
    Operador(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    //* Metodo Lector
    public int getOperando1() {
        return operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    //* Metodo Modificador
    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }   

    public void setOpernado2(int operando2) {
        this.operando2 = operando2;
    }

    //* Metodo Algoritmico
    public int sumar() {
        int suma = 0;
        suma = operando1 + operando2;

        return suma;
    }

    public int restar() {        
        return operando1 - operando2;
    }

    public int multiplicar() { 
        return operando1 * operando2;
    }

    public int obtenerResiduo() { 
        return operando1 % operando2;
    }
}
