/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2.tarea3;

import java.util.ArrayList;

/**
 *
 * @author Paco
 * @param <G>
 */
public class stackStatica <G>{
    private ArrayList <G> stack;
    private int top=-1;
    public void setSize(int n){
        this.stack=new ArrayList<>(n);
    }
    public G getTop(){
        return stack.get(top);
    }
    public int getSize(){
        return top;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void push(G data){
        top++;
        stack.add(top, data);
        
    }
    public void pop(){
        if (isEmpty()) {
            System.out.println("La lista está vacia");
        }else{
            stack.remove(top);
            top--;
        }
    }
    public void vaciarPila(){
        stack.clear();
        top=0;
    }
    
}
