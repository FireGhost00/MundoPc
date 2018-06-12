/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc;

import com.gm.mundopc.*;

/**
 *
 * @author fireghst
 */
public class MundoPc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     DispositivoEntrada d1 = new DispositivoEntrada("Monitor", "Asus");
     Monitor m1 = new Monitor("Asus", 20);
     
     Teclado t1 = new Teclado("directa", "hp");
     Raton r1 = new Raton("directa", "asus");
     Computadora c1 = new Computadora("Dell", m1, t1, r1);
     
     Orden o1 = new Orden();
     
     
     o1.agregarComputadora(c1);
     o1.mostrarOrden();
    }
    
}
