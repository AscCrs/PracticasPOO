/**
 * Requerimientos: El juego de los dados. Dos jugadores pedro y juan quieren
 * jugar a los dados y saber quien tiene más suerte. El juego consiste en que cada
 * jugador va a lanzar un dado y el ganador es el que tenga el numero mayor en esa jugada.
 * Y van a hacerlo 5 veces de tal forma que el ganador del juego sera quien haya ganado más
 * jugadas, también imprimir las estadisticas de cada jugador. Realizar un sistema para resolver el problema:
 * 
 * Clase: Dado
 * Atributos: ValorDado
 * Métodos: Lector, Constructor y generarNumero
 * 
 * Clase: Jugador
 * Atributos: nombre, jugadasGanadas, jugadasPerdidas, jugadasGanadas
 * Métodos: incrementarJugadasGanadas, incrementarJugadasPerdidas, constructor, lanzarDado,
 * incrementarJugadasEmpatadas
 */

package Clases.CLASEB;

public class Clase16 {
    public static void main(String[] args) {
        
        Jugador pedro = new Jugador("Pedro");
        Jugador juan = new Jugador("Juan");

        Dado dadito = new Dado(4);

        int p, j;
        for (int i = 1; i <= 5; i++) {
            p = pedro.lanzarDado(dadito);
            j = juan.lanzarDado(dadito);

            if (p == j) {
                pedro.incrementarJugadasEmpatadas();
                juan.incrementarJugadasEmpatadas();
            } else if (p > j) {
                pedro.incrementarJugadasGanadas();
                juan.incrementarJugadasPerdidas();
            } else {
                juan.incrementarJugadasGanadas();
                pedro.incrementarJugadasPerdidas();
            }
        }

        System.out.println("Estadisticas de Juan: ");
        System.out.println("Jugadas ganadas: " + juan.getJugadasGanadas());
        System.out.println("Jugadas empatadas: " + juan.getJugadasEmpatadas());
        System.out.println("Jugadas perdidas: " + juan.getJugadasPerdidas());

        System.out.println("Estadisticas de Pedro: ");
        System.out.println("Jugadas ganadas: " + pedro.getJugadasGanadas());
        System.out.println("Jugadas empatadas: " + pedro.getJugadasEmpatadas());
        System.out.println("Jugadas perdidas: " + pedro.getJugadasPerdidas());

        System.out.println(juan.determinarGanador(pedro) + " es Ganador!!");
    
        
        /** 
         * Requerimiento: encontrar la distancia entre dos puntos en el plano cartesiano:
         * los datos deben ser introducidos por teclado.
         * Todo el programa debe ser orientado a objetos, sin datos primitivos
         * Evitar las declaraciones de variables de tipos de datos primitivos.
         * 
         * d = sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2)
         */
    }
}
