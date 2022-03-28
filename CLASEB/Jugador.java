package Clases.CLASEB;

public class Jugador {
    private String nombre;
    private int jugadasGanadas;
    private int jugadasPerdidas;
    private int jugadasEmpatadas;

    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public void incrementarJugadasGanadas() { jugadasGanadas++; }
    public void incrementarJugadasPerdidas() { jugadasPerdidas++; }
    public void incrementarJugadasEmpatadas() { jugadasEmpatadas++; }

    public String getNombre() { return nombre; }
    public int getJugadasGanadas() { return jugadasGanadas; }
    public int getJugadasPerdidas() { return jugadasPerdidas; }
    public int getJugadasEmpatadas() { return jugadasEmpatadas; }

    public int lanzarDado (Dado d) { 
        return d.generarNumero();
    }

    public String determinarGanador(Jugador x) {
        if (jugadasGanadas > x.getJugadasGanadas())
            return nombre;
        else if (x.getJugadasEmpatadas() == jugadasEmpatadas) 
            return null;
        else
            return x.getNombre();
    }
}
