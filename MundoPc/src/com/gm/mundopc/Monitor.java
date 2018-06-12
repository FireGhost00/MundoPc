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
public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitor;
    
   public  Monitor(){
        this.idMonitor= ++contadorMonitor;
    }
   
   public Monitor(String marca, double tamaño){
       this();
       this.marca= marca;
       this.tamaño= tamaño;
   }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public static int getContadorMonitor() {
        return contadorMonitor;
    }

    public static void setContadorMonitor(int contadorMonitor) {
        Monitor.contadorMonitor = contadorMonitor;
    }
    
    @Override
    public String toString(){
        return "{"+" idMonitor="+idMonitor+", Marca="+marca+", tamaño="+tamaño+'}' ;
    }
}
