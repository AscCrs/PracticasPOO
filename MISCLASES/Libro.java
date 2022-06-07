package Clases.MISCLASES;

public class Libro extends Publicacion{
    private int numeroPaginas;
    
    Libro() {}

    Libro(String titulo, float precio, int numPaginas) {
        super(titulo, precio);
        numeroPaginas = numPaginas;
    }

    public int getNumeroPaginas() { return numeroPaginas; }

    public void setNumeroPaginas(int numeroPaginas) { this.numeroPaginas = numeroPaginas; }

    public String toString() {
        return super.toString() + "\n" + this.numeroPaginas;
    }
}