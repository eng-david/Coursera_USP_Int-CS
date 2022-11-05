// Escreva um programa que receba um número natural n na entrada e imprima n! (fatorial) na saída.

package semana4;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um inteiro n: ");
        Integer i = Integer.parseInt(scan.nextLine());

        Integer fatorial = 1;

        while (i > 0) {
            fatorial *= i;
            i -= 1;
        }

        System.out.println(fatorial);

        scan.close();
    }
}
