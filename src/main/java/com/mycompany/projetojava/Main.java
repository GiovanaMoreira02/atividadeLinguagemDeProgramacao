/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetojava;
import java.util.Scanner;
/**
 *
 * @author Giovana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tabuada = new Scanner(System.in);
        
        System.out.println("Digite um número qualquer para exibir a tabuada: ");
        int numero = tabuada.nextInt();
        
        for(int i = 0; i < 11; i++)
        {
            System.out.println(numero + "x" + i + "=" + numero*i);
        }
    }
    
}
