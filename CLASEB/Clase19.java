package Clases.CLASEB;

public class Clase19 {
    public static void main(String[] args) {
        Caballo caballo1 = new Caballo("Caballo1", "C1");
        Caballo caballo2 = new Caballo("Caballo2", "C2");
        Caballo caballo3 = new Caballo("Caballo3", "C3");
        String avance, ganador;
        int fin = 160;

        System.out.println("La carrera comienza...");
        avance = caballo1.avanzar(0);
        System.out.println(avance);
        avance = caballo2.avanzar(0);
        System.out.println(avance);
        avance = caballo3.avanzar(0);
        System.out.println(avance);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("\033[H\033[2J");

        do {
            avance = caballo1.avanzar();
            System.out.println(avance);
            avance = caballo2.avanzar();
            System.out.println(avance);
            avance = caballo3.avanzar();
            System.out.println(avance);

            System.out.println("\nEl caballo1 ha recorrido: " + caballo1.caminoRecorrido() + "\nEl caballo2 ha recorrido: " + caballo2.caminoRecorrido() + "\nEl caballo 3 ha recorrido: " + caballo3.caminoRecorrido());
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            int recorridoC1 = caballo1.caminoRecorrido();
            int recorridoC2 = caballo2.caminoRecorrido();
            int recorridoC3 = caballo3.caminoRecorrido();

            if (!(recorridoC1 >= fin && recorridoC2 < fin && recorridoC3 < fin)) {

                if (!(recorridoC2 >= fin  && recorridoC3 < fin)) {

                    if (!(recorridoC3 >= fin && recorridoC1 < fin)) {

                        if (!(recorridoC1 >= fin && recorridoC2 >= fin && recorridoC3 >= fin)) {

                            if (!(recorridoC1 >= fin && recorridoC2 >= fin)) {

                                if (!(recorridoC1 >= fin && recorridoC3 >= fin)) {

                                    if (!(recorridoC2 >= fin && recorridoC3 >= fin)) {
                                        System.out.println("\033[H\033[2J");
                                    } else {
                                        ganador = "Empate entre Caballo2 y Caballo3";
                                        break;
                                    }
                                } else {
                                    ganador = "Empate entre Caballo1 y Caballo3";
                                    break;
                                }
                            } else {
                                ganador = "Empate entre Caballo1 y Caballo2";
                                break;
                            }
                        } else {
                            ganador = "Empate";
                            break;
                        }
                    } else {
                        ganador = "Caballo 3";
                        break;
                    }
                } else {
                    ganador = "Caballo 2";
                    break;
                }
            } else {
                ganador = "Caballo 1";
                break;
            }
        } while (true);

        System.out.println("El ganador es: " + ganador);
    }
}
