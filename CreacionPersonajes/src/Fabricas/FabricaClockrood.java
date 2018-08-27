/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Productos.Arma;
import Productos.ArmaClockrood;
import Productos.Armadura;
import Productos.ArmaduraClockrood;
import Productos.Cuerpo;
import Productos.CuerpoClockrood;
import Productos.Transporte;
import Productos.TransporteClockrood;


/**
 *
 * @author chris
 */
public class FabricaClockrood implements FabricaAbstracta {

    @Override
    public Cuerpo crearCuerpo() {        
        return new CuerpoClockrood();    
    }

    @Override
    public Arma crearArma() {
        return new ArmaClockrood();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraClockrood();
    }

    @Override
    public Transporte crearTransporte() {
        return new TransporteClockrood();
    }
    
}
