/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_2;

/**
 *
 * @author clagosuarez
 */
public class Numero {
    private int suma;
    private double producto = 1;

    public String sumaProducto(){
        for(int num = 10; num<91; num++){
            suma = suma + num;
            producto = producto * num;
        }
        return ("\nSuma: "+suma+"\nProducto"+producto);
    }
}
