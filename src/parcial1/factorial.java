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
public class factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(""+factoria(65));
        
    }
   public static long factoria(long n){
   
       if (n==0){
            return 1;
        }else{
            return (n*factoria(n-1));
        }
        
    }
}
