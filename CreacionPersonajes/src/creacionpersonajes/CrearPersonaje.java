/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionpersonajes;

import Fabricas.FabricaAbstracta;
import Fabricas.FabricaClockrood;
import Fabricas.FabricaHumano;
import Fabricas.FabricaPidell;
import Productos.Arma;
import Productos.Armadura;
import Productos.Cuerpo;
import Productos.Transporte;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class CrearPersonaje {
    
    FabricaAbstracta fabrica;
    Cuerpo cuerpo;
    Arma arma;
    Armadura armadura;
    Transporte transporte;
    Scanner escaner;
    int opcion = 0;
    
    public void SeleccionPersonaje() {
        escaner = new Scanner (System.in);
        
        do {
            System.out.println("Selecionar raza: 1)Pidell. 2)Clockrood. 3)Humano");
            opcion = escaner.nextInt();
        } while(opcion != 1 && opcion !=2 && opcion!=3);
        
        switch (opcion) {
            
            case 1: 
                fabrica = new FabricaPidell();
                break;
            case 2: 
                fabrica = new FabricaClockrood();
                break;
            case 3:
                fabrica = new FabricaHumano();
                break;
            
        }
        
        arma = fabrica.crearArma();
        armadura = fabrica.crearArmadura();
        transporte = fabrica.crearTransporte();
        cuerpo = fabrica.crearCuerpo();
        
        System.out.println (arma.operacion());
        System.out.println (armadura.operacion());
        System.out.println (transporte.operacion());
        System.out.println (cuerpo.operacion());
        
        
        
    }
}
    

