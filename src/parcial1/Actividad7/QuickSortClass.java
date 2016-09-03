/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1.Actividad7;

/**
 *
 * @author Paco
 */
public class QuickSortClass {

    public static int[] quickSort(int[] arreglo, int inicio, int end) {
        if (end > inicio) {//el caso base de esta recursividad es mientras el inicio sea menor que el final
            int i = inicio;
            int k = end;
            int pivot = arreglo[(inicio + end)/2];
            while (k > i) {
                while (arreglo[i]<pivot){ //obtiene la posición del arreglo el cual no cumple la condicion
                    i++;
                }
                while (arreglo[k]>pivot){//obtiene la posición del arreglo el cual no cumple la condicion
                    k--;
                }
                if (i<k) { //intercambia los que no cumplen, si es que no era solo 1 el del problema
                    int aux= arreglo[k];
                    arreglo[k]=arreglo[i];
                    arreglo[i]=aux;
                }
            }
            if (i>k) { //se le da la variable de i a k para dividir el rreglo en dos
                int aux =i;
                k=i;
                i=aux;
            }
            quickSort(arreglo, inicio, k);//aqui se ordena la primera mitad

            quickSort(arreglo, i+1, end);//se le suma 1 para empezar del otro lado del arreglo
        }
        return arreglo;
    }
}
