/*
 * A empresa Sacolão do Povo (Fruteira) Vende maçãs a R$ 1,30 cada se forem
 * compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos
 * 12. Escreva um programa que leia a quantidade de maçãs compradas por um
 * cliente, calcule e mostre na tela o custo total da compra.
 */
package desafio3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Desafio3Exer5 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        
        System.out.println("Digite a quantidade de maçãs compradas: ");
        double macas = ler.nextDouble();
        
        if (macas >= 12) {
        
            double totalmacas = macas * 1;
            
            System.out.println("O valor total é de: R$"+decimal.format(totalmacas));
            
        }
        
        else {
        
            double totalmacas = macas * 1.30;
            
            System.out.println("O valor total é de: R$"+decimal.format(totalmacas));
            
        }
        
    }
}
