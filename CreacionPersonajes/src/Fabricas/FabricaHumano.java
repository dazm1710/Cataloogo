/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Productos.Arma;
import Productos.ArmaHumano;
import Productos.Armadura;
import Productos.ArmaduraHumano;
import Productos.Cuerpo;
import Productos.CuerpoHumano;
import Productos.Transporte;
import Productos.TransporteHumano;

/**
 *
 * @author chris
 */
public class FabricaHumano implements FabricaAbstracta {
    
     @Override
     public Arma crearArma(){
        return new ArmaHumano();
    }
     @Override
    public Armadura crearArmadura(){
        return new ArmaduraHumano();
    }
     @Override
    public Cuerpo crearCuerpo(){
        return new CuerpoHumano();
    }
     @Override
    public Transporte crearTransporte(){
        return new TransporteHumano();
    } 
}
