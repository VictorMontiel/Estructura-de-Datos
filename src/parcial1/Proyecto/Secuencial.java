/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1.Proyecto;

/**
 *
 * @author Paco
 */
public class Secuencial extends Busquedas implements MOrdenamiento {

    public static Integer Busqueda(int[] v, int n) {//método para buscar secuencialmente
        Integer posicion = -1;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == n) {
                posicion = i;
            }

        }
        return posicion;
    }

    @Override
    public void MSeleccion(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {//aregla los arreglos comparando el número de la casilla con los demás
                if (a[j] < a[i]) {
                    int au = a[j];
                    a[j] = a[i];
                    a[i] = au;
                }
            }
        }
    }

    @Override
    public void MBurbuja(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int aux = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = aux;
                }
            }
        }
    }

    @Override
    public int[] MQSort(int[] arreglo, int inicio, int end) {
        if (end > inicio) {//el caso base de esta recursividad es mientras el inicio sea menor que el final
            int i = inicio;
            int k = end;
            int pivot = arreglo[(inicio + end) / 2];
            while (k > i) {
                while (arreglo[i] < pivot) { //obtiene la posición del arreglo el cual no cumple la condicion
                    i++;
                }
                while (arreglo[k] > pivot) {//obtiene la posición del arreglo el cual no cumple la condicion
                    k--;
                }
                if (i < k) { //intercambia los que no cumplen, si es que no era solo 1 el del problema
                    int aux = arreglo[k];
                    arreglo[k] = arreglo[i];
                    arreglo[i] = aux;
                }
            }
            if (i > k) { //se le da la variable de i a k para dividir el rreglo en dos
                int aux = i;
                k = i;
                i = aux;
            }
            MQSort(arreglo, inicio, k);//aqui se ordena la primera mitad

            MQSort(arreglo, i + 1, end);//se le suma 1 para empezar del otro lado del arreglo
        }
        return arreglo;
    }

}
