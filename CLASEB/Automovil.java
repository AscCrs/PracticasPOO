package Clases.CLASEB;

public class Automovil {
    
    private float velocidad;
    private float velocidad_Maxima;

    public float getVelocidad() {
        return velocidad;
    }

    public float getVelocidad_Maxima() {
        return velocidad_Maxima;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public void setVelocidad_Maxima(float velocidad_Maxima) {
        this.velocidad_Maxima = velocidad_Maxima;
    }

    public Automovil() {
        velocidad_Maxima = 90;
    }

    public boolean determinarSiExcede() {
        boolean excede;
        if (velocidad > velocidad_Maxima) {
            excede = true;
        } else {
            excede = false;
        }

        return excede;
    }
}
