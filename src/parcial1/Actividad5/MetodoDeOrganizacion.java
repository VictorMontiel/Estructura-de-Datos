/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1.Actividad5;


import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class MetodoDeOrganizacion {
    public static int[] setVector(){//método para darle valores al vector
        Scanner es= new Scanner(System.in);
        System.out.println("¿Cuál es el tamaño del vector?");
        int t=es.nextInt();
        int[] vector=new int[t];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Inserte el valor de la posición "+i+" del arreglo");
            vector[i]=es.nextInt();
        }
        System.out.println("Vector original: "+mostrar(vector));
        return vector;
    }
    public static void seleccion(int[] arreglo){
        for (int i = 0; i < arreglo.length-1; i++) {
            int m=i;
            for (int j = i+1; j < arreglo.length; j++) {
                if (arreglo[j]<arreglo[m]) {
                    int au=arreglo[j];
                    arreglo[j]=arreglo[m];
                    arreglo[m]=au;
                }
            }
        }
        System.out.println("Vector ordenado: "+mostrar(arreglo));
        
    }
    public static String mostrar(int[] a){
        if (a==null) {
            return null;
        }
        if (a.length==-1) {
            return "[]";
        }
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; i < a.length; i++) {
            b.append(a[i]);
            if (i==a.length-1) {
               return b.append(']').toString();
            }
            b.append("][");
        }
        return "-";
    }

    
    
}
