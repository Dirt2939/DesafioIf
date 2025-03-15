/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Desafio3Exer2 {
    public static void main(String[] args) {
                
        Scanner ler = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        
        System.out.println("Digite um valor: ");
        int valor = ler.nextInt();
        
        if (valor % 2 == 0) {
        
            System.out.println("O número "+valor+" é par");
            
        }
        
        else {
        
            System.out.println("O número "+valor+" é ímpar");
            
        }
        
    }
}
