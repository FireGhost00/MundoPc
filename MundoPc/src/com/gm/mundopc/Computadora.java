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
public class Computadora {
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadora;
    private Computadora(){
      idComputadora= ++contadorComputadora;
    }
   public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
       this();
       this.nombre= nombre;
       this.monitor=monitor;
       this.teclado= teclado;
       this.raton=raton;
   }

    public int getIdComputadora() {
        return idComputadora;
    }

    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public static int getContadorComputadora() {
        return contadorComputadora;
    }

    public static void setContadorComputadora(int contadorComputadora) {
        Computadora.contadorComputadora = contadorComputadora;
    }
     @Override
    public String toString(){
        return "{"+" idComputadora"+idComputadora+", Nombre="+nombre+", Monitor="+monitor+", Teclado="+teclado+", Raton="+raton+'}';
    }
    
}
