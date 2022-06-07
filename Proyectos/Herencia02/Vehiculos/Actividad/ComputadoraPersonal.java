/**
 * !Clase padre: Computadora Personal 
 * Atributos: String marca Procesador, Float Velocidad Procesador, Cantidad de ram
 * metodos: iniciar sistema, apagar sistema
 * 
 * ?Clase Hija: Laptop
 * Atributos: 
 * *Hereda de PC
 * String ResolucionPantalla, capacidadBateria,
 * Metodos: Boolean, conectadoCorriente 
 */
package Actividad;

public class ComputadoraPersonal {
    private String marcaProcesador;
    private float velocidadProcesador;
    private int cantidadRam;

    public boolean iniciarSistema() {
        return false;
    }

    public boolean apagarSistema() {
        return true;
    }
}
