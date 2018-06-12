/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.mundopc;



/**
 *
 * @author fireghst
 */
public class Raton extends DispositivoEntrada {
    private int idRaton;
    private static int contadorRatones;
    
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada,marca);
        idRaton= ++contadorRatones;
    }

    public int getIdRaton() {
        return idRaton;
    }

    public void setIdRaton(int idRaton) {
        this.idRaton = idRaton;
    }

    public static int getContadorRatones() {
        return contadorRatones;
    }

    public static void setContadorRatones(int contadorRatones) {
        Raton.contadorRatones = contadorRatones;
    }
    
    @Override
    public String toString(){
        return "{"+" idRaton"+idRaton+", tipoEntrada="+getTipoEntrada()+", marca="+getMarca()+'}';
    }
}
