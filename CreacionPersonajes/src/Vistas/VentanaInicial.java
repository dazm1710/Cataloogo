/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.MP3;
import java.awt.Toolkit;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author duvis
 */
public class VentanaInicial extends JFrame{
    private MP3 mus;
    private SeleccionRaza r;
    public VentanaInicial(){
        r=new SeleccionRaza();
        mus = new MP3("./src/Audios/EpicMusicNerves.mp3");
        mus.play();
        
        r.setVisible(true);
        this.setVisible(false);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());//Obtener el tamaño máximo de pantalla
        //setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
