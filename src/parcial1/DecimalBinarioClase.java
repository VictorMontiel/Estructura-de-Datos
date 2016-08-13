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
public class DecimalBinarioClase {
   static int binario =0;//el número binario
   static int ex =1;//el exponente que va ir multiplicandose por 10 para darle los valores al número binario
    public static int decimalaBinario (int n){
        if (n==0){//el caso base es cuando el número sea 0
            return binario;
            
        }else{ //realiza la operación de ir agregando los residuos al número binario, multiplicándolos por el exponente
            binario+= (n%2)*ex;
            ex=ex*10;
            return decimalaBinario(Math.floorDiv(n, 2));
        }
    }
   
}


