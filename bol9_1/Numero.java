/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_1;

import java.util.Scanner;

/**
 *
 * @author clagosuarez
 */
public class Numero {
    private int num;
    private int positivos;
    private int negativos;
    private int ceros;
    
    Scanner teclado = new Scanner(System.in);
    
    public int pedirDatos(){
        System.out.println("Teclea un número:");
        num = teclado.nextInt();
        return num;
    }
    
    public String tipoNumero(){
        for(int i = 0; i < 10; i++){
            num = pedirDatos();
            if (num < 0) {
                negativos++;
            }
            else if (num > 0) {
                positivos++;
            }
            else{
                ceros++;
            }
        }
        return ("\nNegativos: "+negativos+"\nPositivos: "+positivos+"\nCeros: "+ceros);
    }
    
    
}
