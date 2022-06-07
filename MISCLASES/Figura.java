/**
 * Que es una interfaz ?
 * Una interfaz es una entidad abstracta que se declara con la palabra
 * reservada interface. No es una clase
 * 
 * Se puede instanciar una interfaz? No
 * 
 * *Una interfaz tiene solo metodos abstractos
 * 
 * Que es un metodo abstracto?
 * Es un metodo que solo se define, no tiene implementacion
 * 
 * Como saber que es un metodo abstracto?
 * Porque esta declarado con la palabra reservada abstract y no tiene implementacion.
 * 
 * Una clase puede tener un metodo abstrascto pero esa clase se llamaria abstracta.
 * 
 * Pero en una interfaz se puede omitir la palabra abstract en un metodo asbstracto
 */

package Clases.MISCLASES;

public interface Figura {
    //La interdaz solo son atributos publicos y estaticos
    
    public abstract float calcularArea(); // Es un metodo abstracto
    public float calcularPerimetro(); // Esto es un metodo abstracto

    //todas las figuras se debe calcular area y calcularPerimetro
    //pero de manera diferente se puede usar la interfaz
}
