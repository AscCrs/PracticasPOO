package Clases.MISCLASES;

public class Herencia02 {
    public static void main(String[] args) {
        Asalariado maria = new Asalariado();

        System.out.println("Estado actual de Maria");
        System.out.println("Nombre" + maria.getNombre());
        System.out.println("DNI" + maria.getDni());
        System.out.println("Dias vacaciones: " + maria.getDiasVacaciones());
    
        maria.setNombre("Maria Hernandez Jimenes");
        maria.setDni(123456789);
        maria.setDiasVacaciones(12);

        EmpleadoDistribucion juan = new EmpleadoDistribucion();

        System.out.println("Estado actual de Juan");
        System.out.println("Nombre: " + juan.getNombre());
        System.out.println("DNI: " + juan.getDni());
        System.out.println("Dias vacaciones: " + juan.getDiasVacaciones());
        System.out.println("Zona: " + juan.getZona());

        juan.setNombre("Juan Perez Sanches");
        juan.setDni(12345);
        juan.setDiasVacaciones(18);
        juan.setZona("Veracruz");
    }
}
