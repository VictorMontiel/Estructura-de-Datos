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
public class BusquedaBinaria extends Busquedas {

    public static Integer buscar(int[] v, int n) {//método para buscar binariamente
        Integer posicion = -1;
        int in = 0;
        int fin = v.length - 1;
        
        while (in <= fin) {
            int centro = (fin + in) / 2;
            if (v[centro] == n) {

                posicion = centro;
                break;
            }
            if (v[centro] < n) {
                in = centro + 1;

            }
            if (v[centro] > n) {
                fin = centro - 1;

            }
        }
        return posicion;
    }

}
