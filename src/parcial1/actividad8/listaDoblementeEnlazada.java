/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1.actividad8;

/**
 *
 * @author Paco
 * @param <T>
 */
public class listaDoblementeEnlazada <T>{
    nodeDL first;
    nodeDL last;

public void insertFirst (T data){
nodeDL node = new nodeDL (data);
    if (eList()) {
        first=node;
        last = node;
    }else{
        node.next=first;
        first.previous=node;
        first=node;
    }
}
public void insertLast (T data){
    nodeDL node = new nodeDL(data);
    if (eList()) {
        first=node;
        last=node;
    }else{
        last.next=node;
        node.previous=last;
        last=node;
    }
        
    
}
public boolean eList(){
    return first == null && last == null;
}
public void eFirst (){
   first=first.next;
   first.previous=null;
}
public void eLast (){
    last=last.previous;
    last.next=null;
}
public boolean eNode(T data) {
        nodeDL aux=searchNode(data);
        if (aux==null) {
            System.out.println("No se encontró el dato "+data);
        return false;
    }
        if (aux==first) {
        eFirst();
            System.out.println("Se borró exitosamente el dato "+data);
        return true;
    }
        if (aux==last) {
        eLast();
            System.out.println("Se borró exitosamente el dato "+data);
        return true;
    }
        System.out.println("Se borró exitosamente el dato "+data);
        aux.previous.next=aux.next;
        aux.next.previous=aux.previous;
        return true;
    }
public nodeDL searchNode(T data){
    nodeDL aux;
    if (eList()) {
        return null;
    }
    aux=first;
    while (aux.data!=data && aux!=last){
        aux=aux.next;
    }
    if (aux.data==data) {
        return aux;
    }
return null;
}
public void showListaadelante() {
        if (!eList()) {
            nodeDL aux;
            aux = first;
            while (aux != null) {
                if (aux==first) {
                    System.out.print("["+aux.data+"|->");
                    aux = aux.next;
                }else{
                System.out.print("" + aux.data+"|->");
                aux = aux.next;
                }
            }
            System.out.println("☠]");
        } else {
            System.out.println("Está vacia");
        }
    }
public void showListaatras() {
        if (!eList()) {
            nodeDL aux;
            aux = last;
            while (aux != null) {
                if (aux==last) {
                    System.out.print("["+aux.data+"|->");
                    aux = aux.previous;
                }else{
                System.out.print("" + aux.data+"|->");
                aux = aux.previous;
                }
            }
            System.out.println("☠]");
        } else {
            System.out.println("Está vacia");
        }
    }
}
