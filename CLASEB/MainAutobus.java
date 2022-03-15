package Clases.CLASEB;

public class MainAutobus {
    public static void main(String[] args) {
        
        Autobus objAutobus = new Autobus();

        String obMarca = objAutobus.getMarca();
        int obNumeroAsientos = objAutobus.getNumeroAsientos();

        System.out.println("El estado actual del objeto es: ");
        System.out.println("El valor del atributo Marca es: " + obMarca);
        System.out.println("El valor del atributo numeroAsientos es: " + obNumeroAsientos);
    }
}
