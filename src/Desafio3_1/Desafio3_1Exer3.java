/*
 * Faça um programa que leia 2 notas de um aluno, verifique se as notas são
 * válidas exiba na tela a média destas notas. Uma nota válida deve ser,
 * obrigatoriamente, um valor entre 0.0 e 10.0, onde caso a nota não possua um
 * valor válido, este fato deve ser informado ao usuário e o programa termina.
 */
package Desafio3_1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Desafio3_1Exer3 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        
        System.out.println("Insira sua primeira nota: ");
        double nota1 = ler.nextDouble();
        
        System.out.println("Insira sua segunda nota: ");
        double nota2 = ler.nextDouble();
        
        if (nota1 > 0 && nota1 < 10 && nota2  > 0 && nota2 < 10) {
        
            double media = (nota1 + nota2) / 2;
            
            System.out.println("A média é: "+decimal.format(media));
            
        }
        
        else {
        
            System.out.println("A nota é INVÁLIDA!");
            
        }
        
    }
}
