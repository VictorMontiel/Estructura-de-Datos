/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2.tarea3;

/**
 *
 * @author Paco
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackClass pila = new StackClass();
        for (int i = 0; i < 10; i++) {
            pila.push(i);
        }
        pila.showStack();
    }
    
}
