/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

/**
 *
 * @author Paco
 */
public class BuscadorB {
    static void buscar (int [] arreglo, int n){
        int in=0;
        int fin=arreglo.length-1;
        int i=0;
        while (in<=fin){
            int centro= (fin+in)/2;
            if (arreglo[centro]==n) {
                i++;
                System.out.println("Se encontró su número en la posición "+centro+" del arreglo, después de "+i+" intentos");
            break;
            }
            if(arreglo[centro]<n){
                in=centro+1;
                i++;
            }
            if (arreglo[centro]>n) {
                fin=centro-1;
                i++;
            }
        }
    }
}
