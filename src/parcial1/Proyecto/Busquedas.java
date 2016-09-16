/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1.Proyecto;


import java.util.Scanner;

/**
 *
 * @author Paco
 */
public abstract class Busquedas {
    
    private static int[] vector;
    public static int[] CrearVector(){//método para darle valores al vector
        Scanner es= new Scanner(System.in);
        System.out.println("¿Cuál es el tamaño del vector?");
        int t=es.nextInt();
        vector=new int[t];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Inserte el valor de la posición "+i+" del arreglo");
            vector[i]=es.nextInt();
        }
        return vector;
    }
    public static void SetVector (int [] a){
        vector=a;
    }
    public static int[] GetVector(){///método para obtener el vector de vuelta
        return vector;
    }
    public static int solicitarElemento(){//pide el valor a buscar
        System.out.println("¿Qué elemento desea buscar?");
        Scanner es= new Scanner(System.in);
        return es.nextInt();
    }
    public static void MostrarVector(int[] a){
         if (a==null) {
             System.out.println("null");
        }
        if (a.length==-1) {
            System.out.println("[]");
        }
        StringBuilder b = new StringBuilder();//se construye un StringBuilder para agregar los números y corchetes
        b.append('|');
        for (int i = 0; i < a.length; i++) {
            b.append(a[i]);
            
            b.append("|");
        }
        System.out.println(""+b);
    }
    public static int QueBusco(){
        System.out.println("¿Qué número busca?");
        Scanner es =  new Scanner (System.in);
        
        return es.nextInt();
    }
    public static Integer Busqueda (int[]v, int n){//el método que heredaran las clases para cada una regresar un interger dependiendo
                                                 //de su tipo de búsqueda, pero ambos regresan integers y necesitan un arreglo y lo que buscarán
        Integer posicion=null;
        return posicion;
    }
    public static void MostrarResultado (Integer r){//muestra el resultado, si el método de busqueda regresó un -1 significa que no está el numero
        if (r==-1) {
            System.out.println("No se encontró el número en el arreglo");
        }else{
            System.out.println("Su número está en la posición "+r);
        }
    }
}
