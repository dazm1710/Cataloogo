/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author duvis
 */
public class SeleccionRaza extends JFrame{
    
    public static final Color BACKGROUND = new Color(210,210,240);
    private JPanel panelTitulo, panelMedio, panelFinal;
    private JButton botonHumano, botonPidell, botonClockrood, botonSalir;
    private JLabel titulo,tituloH,tituloP,tituloC, descripcionH, descripcionP, descripcionC;
    private  String rutaImagenH, rutaImagenP,rutaImagenD;
    private  Icon iconoH, iconoP, iconoD;
    
    public SeleccionRaza(){
        super("Seleccion Raza");
        
        panelSuperior();
        panelMedio();
        panelFinal();
        
        add(panelFinal, BorderLayout.PAGE_END);
        add(panelMedio);
        add(panelTitulo, BorderLayout.PAGE_START);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());//Obtener el tamaño máximo de pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void panelFinal(){
        panelFinal = new JPanel();
        botonSalir = new JButton ("Salir");
        botonSalir.setActionCommand("Salir");
        panelFinal.add(botonSalir);
    }
    
    public void panelMedio(){
        panelMedio= new JPanel();
        panelMedio.setLayout(null);
        
        tituloH = new JLabel ();
        tituloH.setText("Humanos");
        tituloH.setFont(new java.awt.Font("Arial", Font.BOLD, 20));//Personalizar letra
        tituloH.setForeground(Color.black);
        tituloP = new JLabel ();
        tituloP.setText("Pidell");
        tituloP.setFont(new java.awt.Font("Arial", Font.BOLD, 20));//Personalizar letra
        tituloP.setForeground(Color.black);
        tituloC = new JLabel ();
        tituloC.setText("Crockrood");
        tituloC.setFont(new java.awt.Font("Arial", Font.BOLD, 20));//Personalizar letra
        tituloC.setForeground(Color.black);
        
        descripcionH=new JLabel();
        descripcionH.setText("Descripcion Humanoooooooooooooooooooooooooooo");
        descripcionH.setFont(new java.awt.Font("Arial", Font.BOLD, 12));//Personalizar letra
        descripcionH.setForeground(Color.black);
        
        descripcionP=new JLabel();
        descripcionP.setText("DescripcionPidelllllllllllllllllllllllllll");
        descripcionP.setFont(new java.awt.Font("Arial", Font.BOLD, 12));//Personalizar letra
        descripcionP.setForeground(Color.black);
        
        descripcionC=new JLabel();
        descripcionC.setText("DescripcionCrockrooddddddddddddddddddddd");
        descripcionC.setFont(new java.awt.Font("Arial", Font.BOLD, 12));//Personalizar letra
        descripcionC.setForeground(Color.black);
        
        
        botonHumano = new JButton("humano");
        botonHumano.setActionCommand("humano");
        
        botonPidell = new JButton("pidell");
        botonPidell.setActionCommand("pidell");
        
        botonClockrood = new JButton("clockrood");
        botonClockrood.setActionCommand("clockrood");
        
        rutaImagenH="./src/Imagenes/humano.png";
        ImageIcon imagenH = new ImageIcon(rutaImagenH);
        
        rutaImagenP="./src/Imagenes/clockrood.jpg";
        ImageIcon imagenP = new ImageIcon(rutaImagenP);
        
        rutaImagenD="./src/Imagenes/pidell1.jpg";
        ImageIcon imagenD = new ImageIcon(rutaImagenD);
        
        iconoH = new ImageIcon(imagenH.getImage().getScaledInstance(250,300, Image.SCALE_DEFAULT));
        iconoP = new ImageIcon(imagenP.getImage().getScaledInstance(250,300, Image.SCALE_DEFAULT));
        iconoD = new ImageIcon(imagenD.getImage().getScaledInstance(250,300, Image.SCALE_DEFAULT));
        
        botonHumano = new JButton(iconoH);
        botonPidell = new JButton(iconoP);
        botonClockrood = new JButton(iconoD);
        botonHumano.setSize(250, 300);
        botonHumano.setContentAreaFilled(false);//Fondo Transparente
        botonHumano.setBorder(null);//Sin bordes
        
        botonPidell.setSize(250, 300);
        botonPidell.setContentAreaFilled(false);
        botonPidell.setBorder(null);
        
        
        botonClockrood.setSize(250, 300);
        botonClockrood.setContentAreaFilled(false);
        botonClockrood.setBorder(null);
        

        tituloH.setBounds(0, 0, 100, 20);
        tituloC.setBounds(0, 0, 100, 20);
        tituloP.setBounds(0, 0, 100, 20);
        
        descripcionH.setBounds(0, 0, 250, 20);
        descripcionC.setBounds(0, 0, 250, 20);
        descripcionP.setBounds(0, 0, 250, 20);
        
        

        panelMedio.add(descripcionC).setLocation(30,350);
        panelMedio.add(descripcionP).setLocation(480,350);
        panelMedio.add(descripcionH).setLocation(930,350);
        
        panelMedio.add(tituloC).setLocation(530,0);
        panelMedio.add(tituloP).setLocation(1020,0);
        panelMedio.add(tituloH).setLocation(130,0);
        
        panelMedio.add(botonHumano).setLocation(30,40);
        panelMedio.add(botonPidell).setLocation(480, 40);
        panelMedio.add(botonClockrood).setLocation(930, 40);
        
        panelMedio.setBackground(Color.GREEN);
    }
    
    public void panelSuperior(){
        panelTitulo= new JPanel();
        
        titulo = new JLabel ();
        titulo.setText("Escoge Tu Raza Favorita");
        titulo.setFont(new java.awt.Font("Arial", Font.BOLD, 40));//Personalizar letra
//        titulo.setBounds(100,80, 180, 25);//Tamaño y posicion
        titulo.setForeground(Color.black);
        panelTitulo.add(titulo);
    }
    
    //Para que los botones puedan "oir"
    public void setActionListener(ActionListener actionListener){
        botonSalir.addActionListener(actionListener);
        botonHumano.addActionListener(actionListener);
        botonPidell.addActionListener(actionListener);
        botonClockrood.addActionListener(actionListener);
    }
}

    
