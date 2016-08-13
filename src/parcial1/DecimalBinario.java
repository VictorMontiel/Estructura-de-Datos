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
public class DecimalBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner es = new Scanner (System.in);
        System.out.println("Escriba el número que desea convertir a binario");
        int dec = es.nextInt();
        System.out.println("Su númmero binario es: "+DecimalBinarioClase.decimalaBinario(dec));//llama al método de conversión
        DecimalBinarioClase.binario=0;//resetea los valores de las variables estáticas por si se quisiera agregar mas llamados al método
        DecimalBinarioClase.ex=0;
    }
    
}
