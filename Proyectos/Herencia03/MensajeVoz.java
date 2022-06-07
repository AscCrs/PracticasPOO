package com.herencia03;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.annotations.SerializedName;
import com.twilio.Twilio; 
import com.twilio.converter.Promoter; 
import com.twilio.rest.api.v2010.account.Message; 
import com.twilio.type.PhoneNumber;

import java.util.Arrays;

import java.net.URI; 
import java.math.BigDecimal; 

import java.io.File;
import javax.sound.sampled.*;

public class MensajeVoz extends Mensaje {
    // * Atributos de la clase
    protected String nombreAudio;
    private String duracionAudio;
    
    // * Variables requeridas por twilio
    public static final String ACCOUNT_SID = "AC678db78944d9e898fd7e4f9db343b3f0"; 
    public static final String AUTH_TOKEN = "a4929a6f1cfc0849507ac6393cb2dcd8"; 

    // * Creacion de los parametros para el audio 
    transient AudioFileFormat.Type aFF_T = AudioFileFormat.Type.WAVE;
    transient AudioFormat aF = new AudioFormat(8000.0F, 16, 1, true, false);
    transient TargetDataLine tD;

    MensajeVoz() { }

    // * Constructor
    public MensajeVoz(String destinatario, String numeroTelefono, String nombreAudio, String duracionAudio) {
        super(destinatario, numeroTelefono);
        this.setNombreAudio(nombreAudio);
        this.setDuracionAudio(duracionAudio);
    }

    public String getNombreAudio() {
        return nombreAudio;
    }

    public String getDuracionAudio() {
        return duracionAudio;
    }

    public void setDuracionAudio(String duracionAudio) {
        this.duracionAudio = duracionAudio;
    }

    public void setNombreAudio(String nombreAudio) {
        this.nombreAudio = nombreAudio;
    }

    public void enviarAudio() {
        try {
            System.out.println("\033[H\033[2J");
            System.out.println("Enviando audio...");
            Thread.sleep(10000);            
            String url = "https://pruebaaudioswtsp.web.app/Audios/" + this.nombreAudio + ".mp3";
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN); 
            Message message = Message.creator( 
                new com.twilio.type.PhoneNumber("whatsapp:+521" + this.numeroTelefono), 
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),  
                "Audio").setMediaUrl(Arrays.asList(URI.create(url)))      
            .create(); 
 
            System.out.println(message.getSid()); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);

            System.out.println("\033[H\033[2J");
            System.out.println("Audio enviado exitosamente!");
        } catch (Exception e) {  }
    }

    public void grabarAudio() {
        try {
            DataLine.Info dLI = new DataLine.Info(TargetDataLine.class, aF);
            tD = (TargetDataLine)AudioSystem.getLine(dLI);
            System.out.println("Iniciando grabacion...");
            Thread.sleep(2000);

            new CapThread().start();
            System.out.println("Grabando Durante " + this.duracionAudio + "...");
            int t = Integer.parseInt(duracionAudio) * 1000;
            Thread.sleep(t);
            tD.close();

            System.out.println("Mensaje grabado correctamente");
            crearJson();
            moverArchivo();
            ejecutarFirebase();
        } catch (Exception e) { e.printStackTrace();}
    }

    
    public void crearJson() {
        MensajeVoz audio = new MensajeVoz(
            this.destinatario, 
            this.numeroTelefono, 
            this.nombreAudio, 
            this.duracionAudio);
        String destino = "RUTA DEL AUDIO";
        String archivo = destino + "infoAudio.json";

        Gson gson = new GsonBuilder().excludeFieldsWithModifiers(Modifier.TRANSIENT, Modifier.STATIC).setPrettyPrinting().create();
        String jsonString = gson.toJson(audio);

        try (PrintWriter pw = new PrintWriter(new File(archivo))) {
            
            pw.write(jsonString);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void moverArchivo() {
        try {
            String ruta = "RUTA DEL AUDIO" + this.nombreAudio + ".mp3";
            File file = new File(ruta);
            String targetDirectory = "Ubicacion a donde se movera el audio";

            file.renameTo(new File(targetDirectory + file.getName()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ejecutarFirebase() {
        try {
            File ruta = new File("Ruta donde se ejecutara el comando");
            // String []values = {"firebase", "deploy"};
            Process p = Runtime.getRuntime().exec("cmd /c firebase deploy", null, ruta);
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String resultsOfExec = null;
            while ((resultsOfExec = br.readLine()) != null) {
                System.out.println(resultsOfExec);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class CapThread extends Thread {
        public void run() {
            File f = new File(nombreAudio + ".mp3");
            try {
                tD.open(aF);
                tD.start();
                AudioSystem.write(new AudioInputStream(tD), aFF_T, f);
            } catch (Exception e) { }
        }
    }
}
