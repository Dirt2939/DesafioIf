/*
 * Faça um algoritmo que calcule a média ponderada das notas de 3 provas. A primeira e
 * a segunda prova têm peso 1 e a terceira tem peso 2. Ao final, mostrar a média do
 * aluno e indicar se o aluno foi aprovado ou reprovado. A nota para aprovação deve ser
 * igual ou superior a 70 pontos.
 */
package Desafio3_1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Desafio3_1Exer5 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        
        System.out.println("Digite a nota da sua primeira prova: ");
        double nota1 = ler.nextDouble();
        
        System.out.println("Digite a nota da sua segunda prova: ");
        double nota2 = ler.nextDouble();
        
        System.out.println("Digite a nota da sua terceira prova: ");
        double nota3 = ler.nextDouble();
        
        double mediaPonderada = (nota1 + nota2 + (nota3 * 2)) / 4;
        
        if (mediaPonderada >= 70) {
        
            System.out.println("Você tirou: "+decimal.format(mediaPonderada));
            System.out.println("Você foi aprovado.");
            
        }
        
        else {
        
            System.out.println("Você tirou: "+decimal.format(mediaPonderada));
            System.out.println("Você foi reprovado.");
            
        }
        
    }
}
