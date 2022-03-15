package Clases.CLASEB;

/**
 * Atributos de la clase autobus:
 * Color del autobus, marca del autobus
 * 
 */

public class Autobus {
    private String marca;
    private int numeroAsientos;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroAsientos() { 
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }
}
