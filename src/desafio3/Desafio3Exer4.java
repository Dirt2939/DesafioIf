/*
 * Ler o nome de 2 times e o número de gols marcados na partida (para cada time). 
 * Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a 
 * palavra EMPATE.
 */
package desafio3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Desafio3Exer4 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        
        System.out.println("Fale o nome de um time: ");
        String time1 = ler.nextLine();
        
        System.out.println("Fale o nome de outro time: ");
        String time2 = ler.nextLine();
        
        System.out.println("Quantos gols o "+time1+" fez? ");
        int time1gols = ler.nextInt();
        
        System.out.println("Qunatos gols o "+time2+" fez? ");
        int time2gols = ler.nextInt();
        
        if (time1gols > time2gols) {
            
            System.out.println("O "+time1+" é o vencedor!");
        
        }
        
        else if (time2gols > time1gols) {
        
            System.out.println("O "+time2+" é o vencedor");
    
        }
        
        else if (time1gols == time2gols) {
        
            System.out.println("O jogo deu EMPATE!");
        
        }
        
    }
}
