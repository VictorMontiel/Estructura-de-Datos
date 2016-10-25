/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2.Actividad11;

import clases.*;

/**
 *
 * @author Paco
 * @param <G>
 */
public class dequeue<G> {

    nodeDL first;
    nodeDL last;
    int tamaño = 0;

    public dequeue() {

    }

    public boolean eList() {
        return first == null && last == null;
    }

    public void insertInFront(G data) {
        nodeDL nodo = new nodeDL();
        nodo.setData(data);
        if (eList()) {
            first = nodo;
            last = nodo;
            tamaño++;
        } else {
            nodo.setNext(first);
            first.setPrevious(nodo);
            first = nodo;
            tamaño++;
        }

    }

    public void insertBack(G data) {
        nodeDL nodo = new nodeDL();
        nodo.setData(data);
        if (eList()) {
            first = nodo;
            last = nodo;
            tamaño++;
        } else {
            nodo.setPrevious(last);
            last.setNext(nodo);
            last = nodo;
            tamaño++;
        }

    }

    public void eFirst() {
        if (first.getNext() == null) {
            emptyQueue();
        } else {
            first = first.getNext();
            first.setPrevious(null);
            tamaño--;
        }

    }

    public void eLast() {
        if (last.getPrevious() == null) {
            emptyQueue();
        } else {
            last = last.getPrevious();
            last.setNext(null);
            tamaño--;
        }

    }

    public nodeDL getFirst() {
            return first;
    }

    public nodeDL getLast() {
            return last;
    }

    public void emptyQueue() {
        last = null;
        first = null;
        tamaño = 0;
    }

    public int sizeQueue() {
        return tamaño;
    }
}
