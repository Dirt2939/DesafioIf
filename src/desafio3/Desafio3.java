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
public class Desafio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        
        System.out.println("Digite o primmeiro valor: ");
        int num1 = ler.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        int num2 = ler.nextInt();
        
        if (num1 > num2) {
        
            System.out.println("O número "+num1+" é maior que o "+num2);
            
        }
        
        else {
        
            System.out.println("O número "+num2+" é maior que o "+num1);
            
        }
    }
    
}
