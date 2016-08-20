/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1.tarea1;

/**
 *
 * @author Paco
 */
public class Exponencial {
    
    public static int calcularExponente(int x,int base, int n){
        if (n==1) {
            return x;
        }else{
            return calcularExponente(x*base,base,n-1);
        }
    }
}
