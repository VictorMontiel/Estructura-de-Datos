/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1.actividad3;

import java.util.Arrays;

/**
 *
 * @author Víctor Hugo Montiel
 */
public class Busqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Víctor Hugo A01411295 - Actividad 4
        BusquedaSecu.setVector();//le doy valor al vector
        System.out.println(""+Arrays.toString(BusquedaSecu.getVector()));//lo imprimo
        int x =BusquedaSecu.solicitarElemento();//guardo el valor que quiere encontrar el usuario en una variable
        BusquedaSecu.mostrarResultado(BusquedaSecu.buscar(BusquedaSecu.vector, x));//se realiza la busqueda secuencial
        BusquedaBinaria.mostrarResultado(BusquedaBinaria.buscar(BusquedaBinaria.vector, x));//se realiza la busqueda binaria
    }
    
}
