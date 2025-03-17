/*
 * Faça um programa que receba a altura e o sexo de uma pessoa e calcule e mostre
 * seu peso ideal, utilizando as seguintes fórmulas (onde h corresponde à altura): 
 * Homens: (72,7 * h) - 58  Mulheres: (62,1 * h) – 44,7. */
package Desafio3_1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Desafio3_1Exer4 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        
        System.out.println("Qual seu sexo biológico? [1]feminino [2]masculino");
        int sexo = ler.nextInt();
        
        System.out.println("Qual sua altura? ");
        double altura = ler.nextDouble();
        
        if (sexo == 1) {
            
            double imc = (62.1 * altura) - 44.7;
            
            System.out.println("Seu peso ideal é: "+decimal.format(imc));
            
        }
        
        else if (sexo == 2) {
        
            double imc = (72.7 * altura) - 58;
            
            System.out.println("Seu peso ideal é: "+decimal.format(imc));
            
        }
        
        else {
        
            System.out.println("ERRO!");
            System.out.println("Usuário não inseriu a opção certa em sexo.");
            
        }
        
    }
}
