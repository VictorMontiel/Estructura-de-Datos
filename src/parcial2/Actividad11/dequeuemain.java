/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2.Actividad11;

/**
 *
 * @author Paco
 */
public class dequeuemain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dequeue fila = new dequeue();
        for (int i = 0; i < 10; i++) {
            fila.insertBack(i);
        }
        System.out.println("tamaño: " + fila.sizeQueue());
        System.out.println("Primero: " + fila.getFirst().getData());
        System.out.println("Último: " + fila.getLast().getData());
        while (!fila.eList()) {
            fila.eFirst();
            fila.eLast();
            System.out.println("número actual de componentes: " + fila.sizeQueue());
            if (!fila.eList()) {
                System.out.println("Primero: " + fila.getFirst().getData());
                System.out.println("Último: " + fila.getLast().getData());
            }
            else{
                System.out.println("No hay primero");
                System.out.println("No hay último");
            }

        }

    }

}
