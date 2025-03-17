/*
 * Leia um número fornecido pelo usuário. Se esse número for positivo, calcule a
 * raiz quadrada do número. Se o número for negativo, mostre uma mensagem
 * dizendo que o número é inválido.
 */
package Desafio3_1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Desafio3_1Exer1 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        
        System.out.println("Digite um número: ");
        double num = ler.nextInt();
        
        if (num > 0) {
            
            double raiz = Math.sqrt(num);
            
            System.out.println("A raiz quadrada é: "+decimal.format(raiz));
            
        }
        
        else if (num < 0) {
        
            System.out.println("O número é inválido!");
            
        }
        
    }
}
