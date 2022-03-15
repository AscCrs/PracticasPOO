package Clases.CLASEB;

public class Motor {
    //! Atributos
    private float potencia;
    private String marca;           
    private int numeroBobinas;

    //! Metodos lectores
    public float getPotencia() {
        return potencia;
    }

    //! Metodos modificadores
    public void setPotencia(float potencia) {   
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca (String marca) {
        this.marca = marca;
    }

    public int getNumeroBobinas() {
        return numeroBobinas;
    }


    public void setNumeroBobinas (int numeroBobinas) {
        this.numeroBobinas = numeroBobinas;
    }
}
