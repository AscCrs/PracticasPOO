package Clases.MISCLASES;
import java.util.ArrayList;
 
public class Menu {
    private ArrayList <String> opciones;
    // private  int numeroOpciones;
    // private String opcionSeleccionada;
    private String vinetas [][];
    private String titulo;
    private String instruccionSeleccion;
    private int tipoVineta;
 
    public Menu (){
        opciones = new ArrayList <String> ();
        String vinetasA[][] = {               
                    {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
                    {"I", "II", "III", "IV", "V", "VI", "VII", "VII", "IX", "X"},
                    {"A", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"}
        };
            // Arabigos, letras mayusculas, letras minusculas, romanos minusculas

        this.vinetas = vinetasA;
    }
 
    public void agregarTitulo(String titulo){
        this.titulo = titulo;
    } 
    
    public void agregarOpcion(String opcion){
        opciones.add(opcion);    
        //Agregar la opcion en el array list
    }
    public void agregarInstruccionSeleccion(String instruccionSeleccion ){
        this.instruccionSeleccion = instruccionSeleccion;
    }

    public void setTipoVineta(int tipoVineta){
        this.tipoVineta = tipoVineta;
    }
 
    public void imprimir(){
        System.out.println(this.titulo);
        for (int i=0; i < opciones.size(); i++) {
            System.out.println(vinetas[tipoVineta][i] + " " + opciones.get(i));
        }

        System.out.println(this.instruccionSeleccion);
        //Codigo para imprimir
    }
 
    public String selecionarOpción(){
 
        //código para seleccionar opcion
        return "";
    }   
}
