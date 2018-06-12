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
public class Orden {
    private final int idOrden;
    private final Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int maxComputadoras=10;
    
    public Orden(){
       idOrden= ++contadorOrdenes; 
       computadoras = new Computadora[maxComputadoras];
    }
    public void agregarComputadora(Computadora computadora){
        if(contadorComputadoras<maxComputadoras)
        {
            computadoras[contadorComputadoras++]= computadora;
        }
        else
        {
            System.out.println("la canitdad es mayor a: "+maxComputadoras);
        }
    }
    
    public void mostrarOrden()
    {
        System.out.println("Orden #:"+idOrden);
        System.out.println("Productos de la orden #:"+contadorComputadoras+":");
        for(int i=0;i<contadorComputadoras;i++)
        {
           System.out.println(computadoras[i]);
        }
    }
    
    
}
