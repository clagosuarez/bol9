/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9_6;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author clagosuarez
 */
public class Empresa {
    private int n = 1;
    private float soldo = 1;
    ArrayList<Float> listasoldos = new ArrayList<Float>();
    Scanner teclado = new Scanner(System.in);
    
    public void pedirDatos(){
        while(soldo > 0){
            System.out.println("Teclea un salario o presiona 0 + enter para salir:");
            soldo = Math.abs(teclado.nextInt());
            if(soldo > 0){
                listasoldos.add(soldo);
                n++;
            }
        }
    }
    public void mostrarDatos(){ 
        float traballadoresMenosMil = 0;
        System.out.println("\n\nLos salarios entre 1000€ y 1750€ son: ");
        for (float listasoldos : listasoldos) {
            if (listasoldos >= 1000 && listasoldos <= 1750) {
                System.out.print(listasoldos + "€\n");
            }
            if (listasoldos < 1000) {
                traballadoresMenosMil++;
            }
        }
        System.out.println("\nEl sueldo de trabajadores con salarios menores a 1000€ es " + (traballadoresMenosMil * 100 / listasoldos.size()) + "%");
    }
}

