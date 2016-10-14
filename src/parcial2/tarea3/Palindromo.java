/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2.tarea3;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner es = new Scanner (System.in);
        boolean pal=true;
        stackStatica stack = new stackStatica();
        System.out.println("Escribe un palíndromo:");
        String palindromo =es.nextLine();
        palindromo=palindromo.replaceAll("\\s", "");
        palindromo=palindromo.toLowerCase();
        stack.setSize(palindromo.length());
        for (int i = 0; i < palindromo.length(); i++) {
            stack.push(palindromo.charAt(i));
        }
        while (!stack.isEmpty() && pal){
            if (!stack.getTop().equals(palindromo.charAt(palindromo.length()-1-stack.getSize()))) {
                pal=!pal;
            }
            stack.pop();
        }
        if (pal) {
            System.out.println("Su frase es palíndroma");
        }else{
            System.out.println("Su frase no es palíndroma");
        }
    }
    
}
