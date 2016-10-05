/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2.actividad9;

/**
 *
 * @author Paco
 */
public class ListaCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        listaCircularClass lista = new listaCircularClass();
        for (int i = 0; i < 10; i++) {//llenado de lista con ints
            lista.insert(i);
        }
        lista.encontrarDato(1); //se prueban los métodos
        lista.encontrarDato(11);
        lista.mostrar();
        lista.eliminar(3);
        lista.mostrar();
        lista.eliminar(55);
        lista.mostrar();
        for (int i = 10; i >=0; i--) {
            lista.eliminar(i);
            lista.mostrar();
                    
        }
    }
    
}
