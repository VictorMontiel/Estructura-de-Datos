/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1.tarea1;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class Expo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner es = new Scanner (System.in);
        System.out.println("Escriba  la base");
        int x=es.nextInt();
        System.out.println("Escriba el exponente");
        int n=es.nextInt();
        if (n==0) {
            System.out.println("El número es 1");
        }else{
            System.out.println("El número es "+Exponencial.calcularExponente(x,x,n));
        }
    }
    
}
