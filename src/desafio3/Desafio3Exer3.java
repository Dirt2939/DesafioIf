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
public class Desafio3Exer3 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        
        System.out.println("Digite o primeiro número: ");
        int num1 = ler.nextInt();
        
        System.out.println("Digite o segundo número: ");
        int num2 = ler.nextInt();        
        
        System.out.println("Digite o terceiro número: ");
        int num3 = ler.nextInt();
    
        
        
        if (num1 > num2 && num1 > num3) {
        
            System.out.println("O maior número é: "+num1);
            
        }
        if (num2 > num1 && num2 > num3) {
        
            System.out.println("o maior número é: "+num2);
            
        }
        
        if (num3 > num2 && num3 > num1) {
        
            System.out.println("O maior número é: "+num3);
            
        }
        
    }
}
