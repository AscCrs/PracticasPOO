package Clases.CLASEB;

public class PuntoCartesiano {
    private Float x;
    private Float y;

    public Float getX() { return x; }

    public Float getY() { return y; }

    public void setX(Float x) {
        this.x = x;
    }

    PuntoCartesiano(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    public Float calcularDistancia(PuntoCartesiano a) {
        return (float)(Math.sqrt((Math.pow((a.x - x), 2)) + (Math.pow((a.y - y), 2))));
    }

}
