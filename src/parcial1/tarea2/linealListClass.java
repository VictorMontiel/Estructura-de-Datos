/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1.tarea2;

/**
 *
 * @author Paco
 * @param <G>
 */
public class linealListClass<G> {

    private NodeClass first;
    private NodeClass last;

    public void insertFirst(G n) {
        NodeClass node = new NodeClass(n);
        if (eList()) {
            first = node;
            last = node;
        } else {
            node.next = first;
            first = node;

        }
    }

    public void insertLast(G n) {
        NodeClass node = new NodeClass(n);
        if (eList()) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    private boolean eList() {
        return first == null;
    }

    public void showLista() {
        if (!eList()) {
            NodeClass aux;
            aux = first;
            while (aux != null) {
                System.out.print("" + aux.data);
                aux = aux.next;
            }
            System.out.println("");
        } else {
            System.out.println("Está vacia");
        }
    }

    public void eNode(int n) {
        int i = 1;
        if (n != 1) {
            NodeClass aux = first;
            while (i != n - 1) {
                aux = aux.next;
                i++;
            }
            if (aux.next.next != null) {
                aux.next = aux.next.next;
            } else {
                System.out.println("Si desea eliminar el último escoja otra función");
            }

        } else {
            System.out.println("Si desea eliminar el primero escoja otra función");
        }
    }
    public void eFirst (){
        first=first.next;
        
    }
    public void eLast (){
        NodeClass aux=first;
        while (aux.next.next!=null){
            aux=aux.next;
        }
        aux.next=null;
        last=aux;
    }
}
