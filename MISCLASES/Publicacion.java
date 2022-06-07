package Clases.MISCLASES;

public class Publicacion {
    private String titulo;
    private float precio;

    Publicacion () { 
    }

    Publicacion (String titulo, float precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getTitutlo() { return titulo;}
    public float getPrecio() { return precio;}

    public void setTitutlo(String titulo) { this.titulo = titulo;}
    public void setPrecio(float precio) { this.precio = precio; }

    public String toString() {
        return "Estado: \n" + this.titulo + "\n" +  this.precio;
    }
}