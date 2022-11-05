package semana3;

import java.util.Scanner;

// Receba um número inteiro na entrada e imprima Buzz se o número for divisível por 5. Caso contrário, imprima o mesmo número que foi dado na entrada.

public class FizzBuzzP2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer i = Integer.parseInt(scanner.nextLine());
        if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }

        scanner.close();
    }
}
