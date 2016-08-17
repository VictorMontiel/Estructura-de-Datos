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
public class BuscadorS {
    static void buscar(int[] array, int n){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==n) {
                System.out.println("Se encontró el número en la posición "+i+" del arreglo, después de "+(i+1)+" intentos");
            }
        }
    }
}
