/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_4;

import java.util.Scanner;

/**
 *
 * @author clagosuarez
 */
public class Tabla {
    private int num;
    Scanner teclado = new Scanner(System.in);
    
    public int pedirDatos(){
        System.out.println("Teclea un número:");
        num = teclado.nextInt();
        return num;
    }
    
    public void tablaMultiplicar(){
        num = pedirDatos();
        for (int i = 0; i < 11; i++) {
            System.out.println(num+" * "+i+" es "+num*i);
        }
    }
}
