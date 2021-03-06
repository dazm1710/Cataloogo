/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author duvis
 */
//Reproducir un MP3 en Java 

import java.io.BufferedInputStream; 
import java.io.FileInputStream; 
import javazoom.jl.player.Player; 

//esta el clase para reproducior MP3 (ponerla en un archivo solo) 

public class MP3 { 
    private String filename; 
    private Player player; 

    // constructor que tom ael nombre el arhivo MP3 
    public MP3(String filename) { 
        this.filename = filename; 
    } 

    public void close() { if (player != null) player.close(); } 

    // reproduce le mp3 en la tarjeta de sonido predterminada 
    public void play() { 
        try { 
            FileInputStream fis = new FileInputStream(filename); 
            BufferedInputStream bis = new BufferedInputStream(fis); 
            player = new Player(bis); 
        }catch (Exception e) { 
            System.out.println("Problem playing file " + filename); 
            System.out.println(e); 
        }
        // correo el proceso en un nuevo hilo para deterner la ejecucion del programa 
        new Thread() {
            public void run() { 
                try { player.play(); } 
                catch (Exception e) { System.out.println(e); } 
            } 
        }.start(); 


    }
}
