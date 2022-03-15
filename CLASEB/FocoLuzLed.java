package Clases.CLASEB;

/**
 * Tres atributos y metodos modificadores y lectores
 * Atributos: lumenes, consumoElectrico, tipoLuz, marca, cantidadLeds.
 */
public class FocoLuzLed {
    
    private float lumenes;
    private float consumoElectrico;
    private String tipoLuz;
    private String marca;
    private int cantidadLeds;

    public float getLumenes() {
        return lumenes;
    }

    public void setLumenes(float lumenes) {
        this.lumenes = lumenes;
    }

    public float consumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(float consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidadLeds() {
        return cantidadLeds;
    }

    public void setCantidadLeds(int cantidadLeds) {
        this.cantidadLeds = cantidadLeds;
    } 
}
