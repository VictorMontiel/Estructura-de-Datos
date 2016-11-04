/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParcialFinal.tarea4;

/**
 *
 * @author Paco
 */
public class meinarbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        binaryTree arbol = new binaryTree();
        arbol.insertNode(5, arbol.root);
        arbol.insertNode(4, arbol.root);
        arbol.insertNode(7, arbol.root);
        arbol.insertNode(2, arbol.root);
        arbol.insertNode(6, arbol.root);
        arbol.insertNode(10, arbol.root);
        arbol.insertNode(3, arbol.root);
        arbol.insertNode(9, arbol.root);
        arbol.insertNode(8, arbol.root);
        arbol.insertNode(1, arbol.root);

        arbol.recorrerInOrder(arbol.root, false, false);
        System.out.println("");
        arbol.recorrerPostOrder(arbol.root,  false, false);
        System.out.println(",");
        arbol.recorrerPreOrder(arbol.root,  false, false);
        System.out.println("");
        System.out.println(""+arbol.elements+" "+arbol.Height(arbol.root));
        arbol.eNode(8, arbol.root,-1);
        arbol.recorrerInOrder(arbol.root,  false, false);System.out.println("");
        arbol.recorrerPostOrder(arbol.root,  false, false);System.out.println("");
        arbol.recorrerPreOrder(arbol.root,  false, false);System.out.println("");
         System.out.println(""+arbol.elements+" "+arbol.Height(arbol.root));
        arbol.eNode(7, arbol.root,-1);
        arbol.recorrerInOrder(arbol.root,  false, false);System.out.println("");
        arbol.recorrerPostOrder(arbol.root,  false, false);System.out.println("");
        arbol.recorrerPreOrder(arbol.root,  false, false);System.out.println("");
        System.out.println(""+arbol.elements+" "+arbol.Height(arbol.root));
         arbol.eNode(2, arbol.root,-1);
        arbol.recorrerInOrder(arbol.root,  false, false);System.out.println("");
        arbol.recorrerPostOrder(arbol.root,  false, false);System.out.println("");
        arbol.recorrerPreOrder(arbol.root,  false, false);System.out.println("");
        System.out.println(""+arbol.elements+" "+arbol.Height(arbol.root));
    }

}
