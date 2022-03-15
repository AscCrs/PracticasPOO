package Clases.CLASEB;

/**
 *  Un método implementa un comportamiento de un objeto. Un comportamiento 
 *  es una función o tarea que esta realizan un objeto
 * 
 *  un metodo que implementa una acción o función o tarea que realiza
 * 
 *  Método Constructor
 * 
 *  Un método constructor es usado para inicializar los valores de los atributos de
 *  un objeto cuando se crea el objeto
 * 
 *  Características
 * 
 *  1.- El nombre del método constructor es igual al nombre de la clase
 *  2.- El método constructor no retorna ningún tipo de dato y no debe tener
 *      el tipo void
 *  3.- El método constructor puede tener un modificador de acceso: public, private, 
 *      protected, default
 *  4.- Un método constructor puede recibir parametros
 *  
 *  modiciador_Acceso nombre_método(parametro) {
 *      cuerpo del constructor
 *  }
 * 
 *  Implementar una clase llamada cartera con dos atributos, sus métodos
 *  lectores y modificadores, crear una instancia con valores iniciales
 *  para esos dos atributos a la hora de crear el objeto imprimir su estado,
 *  Los valores iniciales deben ser obtenidos por teclado
 */
import java.util.Scanner;

public class Clase08 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de bolsillos");
        int n = sc.nextInt();

        //  Cuando utilizas un nextLine despues de un nextInt o Float, o cualquier otro next
        //  Limpiar el buffer
        System.out.println("Ingrese el tipo de cartera");
        sc.nextLine();
        String tipo = sc.nextLine(); 

        Cartera carterita = new Cartera(n, tipo);

        System.out.println("El estado inicial del objeto carterita es:");

        System.out.println("El valor del atributo color es: " + carterita.getNumeroBolsillos());
        System.out.println("El valor del atributo tamano es: " + carterita.getTipo());

        System.out.println("Ingrese el numero de bolsillos");
        int x = sc.nextInt();

        System.out.println("Ingrese el tipo de cartera");
        sc.nextLine();
        String y = sc.nextLine();

        Cartera carterito = new Cartera(x, y);
        System.out.println("El estado inicial del objeto carterito es:");

        System.out.println("El valor del atributo color es: " + carterito.getNumeroBolsillos());
        System.out.println("El valor del atributo tamano es: " + carterito.getTipo());

        // !Codigo que no sirve 
        // System.out.println("Ingrese el nuevo valor del atributo color: ");
        // int estColor = sc.nextInt();
        // System.out.println("Ingrese el nuevo valor del atributo tipo: ");
        // String estTipo = sc.nextLine();

        sc.close();
    }
}    

