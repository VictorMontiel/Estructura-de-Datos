/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1.tarea2;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        linealListClass lista = new linealListClass();
        for (int i = 0; i < 10; i++) {
            lista.insertLast(i);
        }
        lista.showLista();
        lista.eFirst();
        lista.showLista();
        lista.eLast();
        lista.showLista();
        Scanner es = new Scanner (System.in);
        System.out.println("Escriba el número que desea borrar de la lista");
        int x = es.nextInt();
        if (lista.eNode(x)) {
            System.out.println("Se borró el número exitosamente");   
        }else{
            System.out.println("No se encontró el número");
        }
        lista.showLista();
    }
    
}
