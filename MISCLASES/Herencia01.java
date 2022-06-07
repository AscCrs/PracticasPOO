package Clases.MISCLASES;

public class Herencia01 {
    public static void main(String[] args) {
        Asalariado pedro = new Asalariado();

        pedro.setNombre("Pedro Martinez Sanchez");
        pedro.setDni(123456789);
        pedro.setDiasVacaciones(14);

        System.out.println("Nombre: " + pedro.getNombre());
        System.out.println("Dni: " + pedro.getDni());
        System.out.println("Dias de vacaciones: " + pedro.getDiasVacaciones());
    }
}
