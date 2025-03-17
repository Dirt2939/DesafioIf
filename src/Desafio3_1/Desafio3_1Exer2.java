/*
 * Leia um número fracionário. Se o número for positivo imprima a raiz 
 * quadrada. Do contrário, imprima o numero ao quadrado.
 */
package Desafio3_1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Desafio3_1Exer2 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        
        System.out.println("Insira um número: ");
        double num  = ler.nextDouble();
        
        if (num > 0) {
            
            double raiz = Math.sqrt(num);
            
            System.out.println("A raiz quadrada é: "+decimal.format(raiz));
            
        }
        
        else if (num < 0) {
            
            double numAoQuadrado = Math.pow(num, 2);
            
            System.out.println("Ao quadrado fica: "+decimal.format(numAoQuadrado));
            
        }
        
    }
}
