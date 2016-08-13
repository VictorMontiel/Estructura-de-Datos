/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

/**
 *
 * @author Paco
 */
public class EscaleraClass {
     public static int bajarEscaleras (int n){
        if (n==0){//el caso base de cuando ya no hay más escalones que descender
            System.out.println("Ya acabaste de bajar las escaleras hermanx");
            return 0;
        }else{
            System.out.println("Escalon: "+n); //muestra el escalón actual
            return bajarEscaleras(n-1);
        }
    }
}
