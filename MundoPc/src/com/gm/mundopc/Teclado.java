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
public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private static int contadorTeclados;
    
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada,marca);
        idTeclado= ++contadorTeclados;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public void setIdTeclado(int idTeclado) {
        this.idTeclado = idTeclado;
    }

    public static int getContadorTeclados() {
        return contadorTeclados;
    }

    public static void setContadorTeclados(int contadorTeclados) {
        Teclado.contadorTeclados = contadorTeclados;
    }
      @Override
    public String toString(){
        return "{"+" idTeclado"+idTeclado+", tipoEntrada="+getTipoEntrada()+", marca="+getMarca()+'}';
    }
}
