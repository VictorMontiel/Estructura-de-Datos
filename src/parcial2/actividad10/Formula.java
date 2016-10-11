/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2.actividad10;

import clases.*;
import java.util.Scanner;

/**
 *
 * @author Paco
 * @param <G>
 */
public class Formula <G>{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        System.out.println("Escriba la formula");
        if (comprobar(es.nextLine())) {//se comprueba la formula y se da el resultado
            System.out.println("Su ecuación está bien escrita");
        } else {
            System.out.println("Su ecuación está mal escrita");
        }
    }

    public static boolean comprobar(String formula) {
        stackClass pila = new stackClass();
        int i = 0;
        boolean flag = true;
        char[] form = formula.toCharArray();//se convierte el texto a un arreglo
        while (i < form.length && flag) {
            switch (form[i]) {//se ponen los casos para determinar que todos los paréntesis esten cerrados
                case '(':
                    pila.push('(');
                    break;
                case '[':
                    pila.push('[');
                    break;
                case '{':
                    pila.push('{');
                    break;
                case ')':
                    if (pila.getTop().getData().equals('(')) {
                        pila.pop();
                    } else {
                        flag = false;
                    }
                    break;
                case ']':
                    if (pila.getTop().getData().equals('[')) {
                        pila.pop();
                    } else {
                        flag = false;
                    }
                    break;
                case '}':
                    if (pila.getTop().getData().equals('{')) {
                        pila.pop();
                    } else {
                        flag = false;
                    }
                    break;
            }
            i++;
        }
        return flag;
    }
}
