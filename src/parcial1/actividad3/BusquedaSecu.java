/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1.actividad3;

/**
 *
 * @author Paco
 */
public class BusquedaSecu extends Busquedas {

    
    public static Integer buscar(int[] v, int n) {//método para buscar secuencialmente
        Integer posicion = -1;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == n) {
                posicion = i;
            }

        }
        return posicion;
    }

}
