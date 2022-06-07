package com.herencia03;
import java.util.Scanner;
/**
 * TODO: Enviar un mensaje de Whatsapp
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        
        //! Pruebas de texto

        //System.out.println("Mensaje 1");
        //MensajeTexto mAlberto = new MensajeTexto("Alberto Mendez", "2291613333", "Soy su alumno Cristopher Eduardo Ascencio Cruz");
        //mAlberto.enviarMensaje();
    
        //!Pruebas de audio

        // MensajeTexto tAlberto = new MensajeTexto("Alberto", "2291613333", "Prueba de audio:\nPor Cristopher Ascencio");
        // tAlberto.enviarMensaje();
        // MensajeVoz mAlberto = new MensajeVoz("Alberto Mendez", "2291613333", "prueba01", "2");
        // mAlberto.enviarAudio();

        MensajeVoz mPrueba2 = new MensajeVoz("Cristopher", "2297806951", "Hola", "3");
        mPrueba2.grabarAudio();
        mPrueba2.enviarAudio();

        in.close();
    }
}
