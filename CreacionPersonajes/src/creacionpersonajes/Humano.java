/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionpersonajes;

/**
 *
 * @author Estudiantes
 */
public class Humano extends Personaje{
    
    public Humano(){
        this.arma="arma1";
        this.armadura="Armadura";
        this.cuerpo="cuerpo";
        this.transporte="transporte";
    }

    public String getArma() {
        return arma;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public String getArmadura() {
        return armadura;
    }

    public String getTransporte() {
        return transporte;
    }
    
}
