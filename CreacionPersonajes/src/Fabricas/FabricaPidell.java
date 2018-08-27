/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Productos.Arma;
import Productos.ArmaPidell;
import Productos.Armadura;
import Productos.ArmaduraPidell;
import Productos.Cuerpo;
import Productos.CuerpoPidell;
import Productos.Transporte;
import Productos.TransportePidell;

/**
 *
 * @author chris
 */
public class FabricaPidell implements FabricaAbstracta {
    
    public Arma crearArma(){
        return new ArmaPidell();
    }
    @Override
    public Armadura crearArmadura(){
        return new ArmaduraPidell();
    }
    @Override
    public Cuerpo crearCuerpo(){
        return new CuerpoPidell();
    }
    @Override
    public Transporte crearTransporte(){
        return new TransportePidell();
    }     
    
    
}
