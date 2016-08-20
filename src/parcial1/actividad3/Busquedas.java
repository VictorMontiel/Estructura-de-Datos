/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1.actividad3;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public abstract class Busquedas {
    
    protected static int[] vector;
    public static void setVector(){//método para darle valores al vector
        Scanner es= new Scanner(System.in);
        System.out.println("¿Cuál es el tamaño del vector?");
        int t=es.nextInt();
        vector=new int[t];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Inserte el valor de la posición "+i+" del arreglo");
            vector[i]=es.nextInt();
        }
    }
    public static int[] getVector(){///método para obtener el vector de vuelta
        return vector;
    }
    public static int solicitarElemento(){//pide el valor a buscar
        System.out.println("¿Qué elemento desea buscar?");
        Scanner es= new Scanner(System.in);
        return es.nextInt();
    }
    public static Integer buscar (int[]v, int n){//el método que heredaran las clases para cada una regresar un interger dependiendo
                                                 //de su tipo de búsqueda, pero ambos regresan integers y necesitan un arreglo y lo que buscarán
        Integer posicion=null;
        return posicion;
    }
    public static void mostrarResultado (Integer r){//muestra el resultado, si el método de busqueda regresó un -1 significa que no está el numero
        if (r==-1) {
            System.out.println("No se encontró el número en el arreglo");
        }else{
            System.out.println("Su número está en la posición "+r);
        }
    }
}
