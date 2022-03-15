package Clases.CLASEB;

/**
 * 
 * Crear una instancia de la clase canica y determinar su estado
 * modificador su estado e imprimir su nuevo estado de esa instancia
 * 
 * ¿Qué es una instancia?
 * Una instancia es un objeto de una clase
 * 
 * ¿Como crear la instancia?
 * 
 * ¿Como crear un objeto de una clase? 
 * Canica miCanica; -----------> Es una variable que reserva el espacio de memoria para guardar 
 *                               la referencia de un objeto
 *                               Se declara o se define el objeto
 * miCanica = new Canica(); --------> Se crea el objeto, se reserva todo el espacio 
 *                                    para guardar la información de un objeto
 * 
 * Canica miCanica = new Canica(); 
 * 
 * ¿Como imprimir el estado de esa instancia?
 * 
 * ¿Como determinar el estado de esa instancia?
 * 
 * ¿Que es el estado de una instancia?
 * 
 */

public class clase06 {
    public static void main(String[] a) {
        
        Canica miCanica = new Canica();

        /**
         * ¿Que es el estado de un objeto?
         * Son los valores que tiene el atributo de un objeto
         * en un momento dado
         */

        String x = miCanica.getTamano();
        float y = miCanica.getPeso();

        System.out.println("El estado actual del objeto es:");
        System.out.println("El valor del atributo tamaño de canica es: " + x);

        System.out.println("El valor del atributo peso de miCanica es: " + y);

        // Como modificar el estado de una instancia u objeto?
        // Con metodos modificadores (Setter)

        String c = "Grande";
        float b = 12.3f;

        // Como invocar el metodo modificador?

        miCanica.setTamano(c);
        miCanica.setPeso(b);

        System.out.println("El nuevo estado del objeto es:");
        System.out.println("El valor del atributo tamaño de canica es: " + miCanica.getTamano());

        System.out.println("El valor del atributo peso de miCanica es: " + miCanica.getPeso());

    }
}

/**
 * Tarea: 
 * Implementar la clase Autobus con dos atributos, sus metodos lectores
 * y modificadores
 * 
 * Crear una instancia de la clase Canica y determinar su estado
 */