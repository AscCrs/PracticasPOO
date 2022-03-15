package Clases.CLASEB;
import java.lang.Math;

public class Dado {
    private int valorDado;

    public int getValorDado() {
        return valorDado;
    }

    // public void setValorDado(int valorDado) {
    //     this.valorDado = valorDado;
    // }

    public Dado(int valorDado) {
        this.valorDado = valorDado;
    }

    public int generarNumero() {
        valorDado = (int)(Math.random() *6+1);
        return valorDado;
    }
}
