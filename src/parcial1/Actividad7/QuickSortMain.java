/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1.Actividad7;

import java.util.Arrays;

/**
 *
 * @author Paco
 */
public class QuickSortMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo={4,2,5,6,7,1,10,3,22,34,16};//no sirve con números repetidos
        System.out.println(""+Arrays.toString(arreglo));
        System.out.println(""+Arrays.toString(QuickSortClass.quickSort(arreglo, 0, arreglo.length-1)));
        
    }
    
}
