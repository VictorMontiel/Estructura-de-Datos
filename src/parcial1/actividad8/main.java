/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1.actividad8;

/**
 *
 * @author Paco
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        listaDoblementeEnlazada lista = new listaDoblementeEnlazada();
        for (int i = 0; i < 10; i++) {
            lista.insertLast(i);
        }
        lista.showListaatras();
        lista.showListaadelante();
        lista.eNode(11);
        lista.eNode(1);
        lista.showListaatras();
        lista.showListaadelante();
    }
    
    
}
