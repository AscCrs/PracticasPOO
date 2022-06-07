/**
 * Requerimiento10.- El equipo de desarrollo de Facebook se dio cuenta que cada vez que 
 * implementan un sistema orientado a objetos, siempre implementan un Menu que se imprime
 * desde la terminal. El equipo decide crear una clase o clases para que se pueda reusar
 * el código y adaptar el menú a las nuevas necesidades
 * 
 *      Selección de Opciones         Options               Opciones
 * 1.- Primera Opción               A.- Option 1           I.- Opción 1
 * 2.- Segunda Opción               B.- Option 2           II.- Opción 2
 * 3.- Tercera Opción               C.- Option 3           III.- Opción 3
 * Seleccionar Opción                  Select              Selecciona
 * 
 * Clase: Menu
 * Atributos: Opciones, numeroOpciones, opciónSeleccionada, viñetasOpciones, titulo, selecciónOpcion
 * 
 * Métodos: seleccionarOpción, imprimirMenu, editarOpcion, constructor, lectores
 * 
 */

package Clases.MISCLASES;
import java.util.Scanner;

public class Requerimiento10 {

    public static void crearMenu() {
        Menu miMenu = new Menu();

        miMenu.agregarTitulo("Elige el tipo de comida: ");
        miMenu.agregarOpcion("Sopa de verduras");
        miMenu.agregarOpcion("Arroz a la tumbada");
        miMenu.agregarOpcion("Pizza de pepperonni");
        miMenu.setTipoVineta(1);

        miMenu.agregarInstruccionSeleccion("Que vas a seleccionar?");

        miMenu.imprimir();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        crearMenu();

        // int i = in.nextInt();

        // switch () {
        //     case value:
                
        //         break;
        
        //     default:
        //         break;
        // }

        in.close();
    }
}
