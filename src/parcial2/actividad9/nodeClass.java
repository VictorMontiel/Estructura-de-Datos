/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2.actividad9;

/**
 *
 * @author Paco
 * @param <G>
 */
public class nodeClass <G>{
   private G data;
   private nodeClass next;
    
    protected G getData(){ //método para obtener el dato
        return this.data;
    }
    protected void setData(G data){//método para darle valor al dato del nodo
        this.data=data;
    }
    protected nodeClass getNext(){ //método para obtener el siguiente nodo
        return this.next;
    }
    protected void setNext(nodeClass node){ //método para apuntar al siguiente nodo
        this.next=node;
    }
}
