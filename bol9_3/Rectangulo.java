/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_3;

import java.util.Scanner;

/**
 *
 * @author clagosuarez
 */
public class Rectangulo {
    private float b = -1;
    private float h = -1;
    Scanner teclado = new Scanner(System.in);
    
    public void pedirDatos(){
        while(b<=0){
            System.out.println("Teclea una base positiva:");
            b = teclado.nextInt();
        }
        while(h<=0){
            System.out.println("Teclea una altura positiva:");
            h = teclado.nextInt();
        }

    }
    
    public String calcularArea(){
        float a;
        a = b * h;
        return ("El área del rectángulo es de "+a);
    }
}
