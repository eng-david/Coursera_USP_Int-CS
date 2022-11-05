// Escreva um programa que receba um número inteiro na entrada, calcule e imprima a soma dos dígitos deste número na saída


package semana4;

import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero inteiro positivo: ");
        Integer i = Integer.parseInt(scan.nextLine());
        
        Integer soma = i % 10;
        while (i > 10) {
            i /= 10;
            soma += (i % 10);
        }
        
        System.out.println(soma);
        scan.close();
    }
}
