package Clases.CLASEB;
import java.lang.Math;

public class FormaAsteriscos {
    private int longitud;

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    } 

    public String crearLineaHorizontal(int longitud) {
        String horizontal = "";
        for (int i = 1; i <= longitud; i++) {
            horizontal = horizontal + color() + " *";
        }

        return horizontal;
    }

    public String crearLineaVertical() {
        String vertical = "";
        for (int i = 1; i <= longitud; i++) {
            vertical = vertical + color() + "\n*";
        }
        return vertical;
    }

    //*  Este metodo se puede omitir?
    public String crearL() {
        String L = crearLineaVertical() + crearLineaHorizontal(longitud - 1);

        return L;
    }
    
    public String color() {
        String color = "\u001B[3";
        int numAl = (int)(Math.random()*6+2);
        return color + numAl + "m";
    }
}
