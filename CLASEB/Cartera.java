package Clases.CLASEB;

public class Cartera {
    
    private int numeroBolsillos;
    private String tipo;

    public int getNumeroBolsillos() {
        return numeroBolsillos;
    }

    public void setNumeroBolsillos(int numeroBolsillos) {
        this.numeroBolsillos = numeroBolsillos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cartera(int numeroBolsillos, String Tipo) {
        this.numeroBolsillos = numeroBolsillos;
        tipo = Tipo;
    }
}
