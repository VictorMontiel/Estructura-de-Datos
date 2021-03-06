package parcial1.Proyecto;

import java.util.Scanner;

/**
 *
 * @author SortingSolutions
 * "Making it easier to find your solutions"
V�ctor Hugo Montiel G�mez 		A01411295
Luisa Fernanda Pineda Ochoa 		A00513827
Daniel Alexandro Mart�nez Chaverri 	A00513954
Oscar Daniel Nedzelsky Casanova 	A00513376
 */
public class Binaria extends Busquedas implements MOrdenamiento {

    /**
     *
     * @param v el vector de enteros
     * @param n el numero que se busca que se busca
     * @return la posicion del dato en el vector
     */
    public static Integer Busqueda(int[] v, int n) {//Método para buscar binariamente
        Integer posicion = -1; //Se declara -1 en caso que no se encentre el dato
        int in = 0;
        int fin = v.length - 1;

        while (in <= fin) { //Se repite mientras que inicio no sea mayor a fin
            int centro = (fin + in) / 2; //Se declara el centro del array

            if (v[centro] == n) {//Si el centro es igual al doto buscado entonces la posicion se cambia al centro
                posicion = centro;
                break;
            }
            if (v[centro] < n) {//Si el centro es menor que el dato buscado, el inicio sera el una posicion mas adelante que el centro
                in = centro + 1;

            }
            if (v[centro] > n) {//Si el centro es mayor que el dato buscado, el fin sera el una posicion mas adelante que el centro
                fin = centro - 1;

            }
        }
        return posicion;
    }

    /**
     *
     * @param a el vector de enteros que se ordenara con el algoritmo
     * Seleccion-Insercion
     */
    @Override
    public void MSeleccion(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {//Arregla los elementos comparando el número de la casilla con los demás siguientes
                if (a[j] < a[i]) {
                    int au = a[j];
                    a[j] = a[i];
                    a[i] = au;
                }
            }
        }
    }

    /**
     *
     * @param a el vector de enteros que se ordenara con el algortimo Burbuja
     */
    @Override
    public void MBurbuja(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {//Hace que recorra todo el vector
            for (int j = 0; j < a.length - 1; j++) {//Recorre el mismo vector
                if (a[j] > a[j + 1]) {//Compara la posicion que esta enfrente y si es menor, la cambia de posicion
                    int aux = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = aux;
                }
            }
        }
    }

    /**
     *
     * @param arreglo el vector de enteros que ordenamos con el algoritmo
     * Quicksort
     * @param inicio la posicion de inicio del vector
     * @param end la posicion final del vector
     * @return
     */
    @Override
    public int[] MQSort(int[] arreglo, int inicio, int end) {
        if (end > inicio) {//el caso base de esta recursividad es mientras el inicio sea menor que el final
            int i = inicio;
            int k = end;
            int pivot = arreglo[(inicio + end) / 2]; //El pivote sera el dato que esta entre inicio y fin
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
