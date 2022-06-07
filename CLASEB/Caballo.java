package Clases.CLASEB;

public class Caballo {
    
    private String nombre;
    private int pasosActuales;
    private String figura;
    private String recorrido;
    private int retroceso;

    public String getNombre() {
        return nombre;
    }

    public Caballo(String nombre, String figura) {
        this.nombre = nombre;
        this.figura = figura;
    }

    // Sobre carga de métodos: es cuando se tiene métodos llamados igual pero 
    // pero tienen diferentes parametros

    public String avanzar() {
       //código de avanzar aleatoriamente

       // Determinar un número aleatorio entre 1 y 3
       // sumar ese número aleatorio con pasos actuales
       // validar que no se pase de la pantalla de
       
       // si se pasa, poner al caballo al final
       // si no solo imprimir la cadena

       // regresar la cadena
        pasosActuales = pasosActuales + (int)(Math.random() * 20 + 1);
        String recorrido = "";

        for (int i = 0; i < pasosActuales; i++) {
            recorrido = recorrido + " ";
        } 

        recorrido = recorrido + figura;
        return recorrido;
    }

    public String avanzar(int pasosActuales) {
        //código de avanzar n pasos definidos por el usuario

        this.pasosActuales = pasosActuales;
        for(int i = 0; i < pasosActuales; i++) {
            recorrido = recorrido + "";
        }
        recorrido = recorrido + figura;

        return figura;
    }

    public String retroceder() {
        // codigo de retroceder aleatoriamente
        pasosActuales = (int)(Math.random() * pasosActuales + 1);
        this.pasosActuales = this.pasosActuales - retroceso;

        recorrido = "";
        for(int i = 0; i < pasosActuales; i++) {
            recorrido = recorrido + " ";
        }

        recorrido = recorrido + figura;

        return recorrido;
    }

    public String retroceder(int pasos) {
        // codigo de retroceder n pasos definidos por el usuario
        this.pasosActuales = this.pasosActuales - pasos;
        recorrido = "";
        for (int i = 0; i < pasosActuales; i++) {
            recorrido = recorrido + " ";
        }
        recorrido = recorrido + figura;
        
        return recorrido;
    }

    public int caminoRecorrido() {
        if (!(this.pasosActuales < 0)) {
            return this.pasosActuales;           
        }
        else {
            return 0;
        }
    }
}
