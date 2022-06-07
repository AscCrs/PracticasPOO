public class Vehiculo {
    private float velocidad;
    private String propulsion;
    private String color;
    private int precio;

    public float getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    public String getPropulsion() {
        return propulsion;
    }
    public String getColor() {
        return color;
    }
    public int getPrecio() {
        return precio;
    }

    public void setPropulsion(String propulsion) {
        this.propulsion = propulsion;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void acelerar() {

    }

    public void frenar() {
        
    }
}