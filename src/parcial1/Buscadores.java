/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class Buscadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner es = new Scanner (System.in);
        int [] vector = new int[50];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=i+1;
        }
        System.out.println("¿Qué número desea buscar en el arreglo?");
        int n=es.nextInt();
        BuscadorS.buscar(vector, n);
        BuscadorB.buscar(vector, n);
    }
    
}
