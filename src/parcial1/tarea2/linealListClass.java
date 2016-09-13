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

    public boolean eNode(G n) {
        NodeClass aux = first;
        if(first.data==n){
            eFirst();
            return true;
        }
        if (last.data==n) {
            eLast();
            return true;
        }
        while (aux.next!=null && aux.next.data!=n ){
            aux=aux.next;
        }
        if (aux.next!=null && aux.next.data==n) {
            aux.next=aux.next.next;
            return true;
        }
            return false;
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
