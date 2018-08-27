/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Productos.Arma;
import Productos.Armadura;
import Productos.Cuerpo;
import Productos.Transporte;

/**
 *
 * @author chris
 */
public interface FabricaAbstracta {
    
    public Cuerpo crearCuerpo();
    
    public Arma crearArma();
    
    public Armadura crearArmadura();
    
    public Transporte crearTransporte();
    
    
}
