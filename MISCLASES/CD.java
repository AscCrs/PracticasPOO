package Clases.MISCLASES;

public class CD extends Publicacion{
    private float minutos;

    CD() { }

    CD(String titulo, float precio, float minutos) {
        super(titulo, precio);
        this.minutos = minutos;
    }

    public float getMinutos() { return minutos;}

    public void setMinutos(float minutos) { this.minutos = minutos;}

    public String toString() {
        return super.toString() + "\n" + this.minutos;
    }
}