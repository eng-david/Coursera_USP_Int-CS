package semana3;

import java.util.Scanner;

// Receba um número inteiro na entrada e imprima par quando o número for par ou ímpar quando o número for ímpar.

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer i = Integer.parseInt(scan.nextLine());
        if (i%2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("ímpar");
        }

        scan.close();
    }
}
